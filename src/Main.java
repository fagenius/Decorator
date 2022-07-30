/*
 * Main.java
 */
public class Main {
  
  public static void main(String[] args) {
    // HTMLLogger d�core FileLogger
    ILogger logger = new HTMLLogger(new FileLogger());
    logger.log("Bonjour");
    logger.log("le");
    logger.log("monde");
  }
  
}
