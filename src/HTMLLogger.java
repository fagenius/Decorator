/*
 * HTMLLogger.java
 */

/**
 * Décorateur HTML (ConcreteDecorator)
 *  - Décore les entrées du log par des tags de mise en forme HTML
 */
public class HTMLLogger extends LoggerDecorator {
  
  public HTMLLogger(ILogger logger) {
    super(logger);
  }

  public void log(String msg) {    
    super.log(formatMessage(msg));
  }
  
  private String formatMessage(String msg) {
    return "<p><b>" + System.nanoTime() + ":</b>" + msg + "</p>"; 
  }
}
