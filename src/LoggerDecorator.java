/*
 * HTMLLoggerDecorator.java
 */

/**
 * Interface des décorateurs (AbstractDecorator)
 *  - Implantation par défaut
 */
public abstract class LoggerDecorator implements ILogger {
  private ILogger component;
  
  public LoggerDecorator(ILogger logger) {
    this.component = logger;
  }

  // Implantation par défaut
  public void log(String msg) {
    this.component.log(msg);
  }
  
}
