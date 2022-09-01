package loggerExampleGood;

import java.io.File;

public interface DBLogger extends Logger {

	void openConnection();

	void closeConnection();
}
