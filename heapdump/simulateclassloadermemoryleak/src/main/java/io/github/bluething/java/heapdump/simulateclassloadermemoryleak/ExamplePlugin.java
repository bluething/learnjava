package io.github.bluething.java.heapdump.simulateclassloadermemoryleak;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExamplePlugin implements Plugin {
    public static final long[] LOTS_OF_MEMORY = new long[8 * 1024 * 1024];
    private ExamplePluginLevel level = new ExamplePluginLevel();

    @Override
    public void initialize() {
        Logger.getLogger("ExamplePlugin").log(level, "Hello World!");
    }

    private class ExamplePluginLevel extends Level {
        private ExamplePluginLevel() {
            super("Example Plugin Log Level", 1000);
        }
    }
}
