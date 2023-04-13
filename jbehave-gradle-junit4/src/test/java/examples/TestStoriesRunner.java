package examples;

import org.jbehave.core.ConfigurableEmbedder;
import org.jbehave.core.Embeddable;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.embedder.EmbedderControls;
import org.jbehave.core.embedder.NullEmbedderMonitor;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.reporters.NullStoryReporter;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.Test;
import ru.testit.listener.BaseJbehaveListener;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TestStoriesRunner extends ConfigurableEmbedder {
    public Embedder embedder;

    @Override
    @Test
    public void run() {
        embedder = new Embedder();
        embedder.useEmbedderMonitor(new NullEmbedderMonitor());
        embedder.useEmbedderControls(new EmbedderControls()
                .doGenerateViewAfterStories(false)
                .doFailOnStoryTimeout(false)
                .doBatch(false)
                .doIgnoreFailureInStories(true)
                .doIgnoreFailureInView(true)
                .doVerboseFailures(false)
                .doVerboseFiltering(false)
        );
        embedder.useConfiguration(configuration());
        embedder.useCandidateSteps(stepsFactory().createCandidateSteps());

        File dir = new File("./src/test/resources/stories");
        List<String> stories = new ArrayList<>();

        for (File file : dir.listFiles()) {
            if (file.isFile())
                stories.add("stories/" + file.getName());
        }

        embedder.runStoriesAsPaths(stories);
    }

    public Configuration configuration() {
        final BaseJbehaveListener listener = new BaseJbehaveListener();
        Class<? extends Embeddable> embeddableClass = this.getClass();
        return new MostUsefulConfiguration()
                .useStoryLoader(new LoadFromClasspath(this.getClass()))
                .useStoryReporterBuilder(
                        new StoryReporterBuilder()
                                .withCodeLocation(CodeLocations.codeLocationFromClass(embeddableClass))
                                .withDefaultFormats()
                                .withReporters(listener)
                )
                .useDefaultStoryReporter(new NullStoryReporter());
    }

    public InjectableStepsFactory stepsFactory() {
        List<Object> steps = new ArrayList<>();
        steps.add(new Steps());

        return new InstanceStepsFactory(embedder.configuration(), steps);
    }

    static class TestStoryReporterBuilder extends StoryReporterBuilder {

        private final File outputDirectory;

        TestStoryReporterBuilder(final File outputDirectory) {
            this.outputDirectory = outputDirectory;
        }

        @Override
        public File outputDirectory() {
            return outputDirectory;
        }
    }
}
