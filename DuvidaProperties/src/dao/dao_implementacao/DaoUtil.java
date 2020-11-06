package dao.dao_implementacao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DaoUtil {
	public static Properties readPropertiesFile(String fileName) {
		Properties prop = null;
		try (FileInputStream fis = new FileInputStream(fileName)){
			prop = new Properties();
			prop.load(fis);
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		return prop;
	}
}
