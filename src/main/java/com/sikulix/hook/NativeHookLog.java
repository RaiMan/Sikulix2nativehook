package com.sikulix.hook;

public class NativeHookLog {

  public NativeHookLog() {}

  public NativeHookLog(String clazz) {
    this.clazz = clazz;
  }

  private String clazz = "NativeHook";

  public void info(String msg, Object... args) {
    print("INFO", msg, args);
  }

  public void trace(String msg, Object... args) {
    print("TRACE", msg, args);
  }

  public void error(String msg, Object... args) {
    print("ERROR", msg, args);
  }

  private void print(String type, String msg, Object... args) {
    System.out.println(String.format("%s [%s] " + msg, clazz, type, args));
  }
}
