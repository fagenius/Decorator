/*
 * FileLogger.java
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * Service de log dans un fichier (ConcreteComponent)
 */
public class FileLogger implements ILogger {
  
  public synchronized void log(String msg) {
    try {
      PrintWriter sortie = new PrintWriter(new FileOutputStream("Test.log", true));
      sortie.println(msg);
      sortie.close();
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
  }
  
}
