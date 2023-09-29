package ec.ezamora.designpattern.creational.challenge2;

import lombok.Getter;

abstract class HttpAdapter {

  @Getter
  private String type;

  abstract void get();

  abstract void post();

  abstract void put();

  abstract void delete();

  public HttpAdapter(String type) {
    this.type = type;
  }
}
