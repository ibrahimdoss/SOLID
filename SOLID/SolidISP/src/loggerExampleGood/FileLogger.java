package loggerExampleGood;

import java.io.File;

public interface FileLogger extends Logger {
	
	void openFile(File file, boolean create);

	void closeFile();
}
