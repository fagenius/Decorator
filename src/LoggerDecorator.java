/*
 * HTMLLoggerDecorator.java
 */

/**
 * Interface des d�corateurs (AbstractDecorator)
 *  - Implantation par d�faut
 */
public abstract class LoggerDecorator implements ILogger {
  private ILogger component;
  
  public LoggerDecorator(ILogger logger) {
    this.component = logger;
  }

  // Implantation par d�faut
  public void log(String msg) {
    this.component.log(msg);
  }
  
}
