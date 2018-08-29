/*
 * Copyright (c) 2018 AITIA International Inc.
 *
 * This work is part of the Productive 4.0 innovation project, which receives grants from the
 * European Commissions H2020 research and innovation programme, ECSEL Joint Undertaking
 * (project no. 737459), the free state of Saxony, the German Federal Ministry of Education and
 * national funding authorities from involved countries.
 */

package eu.arrowhead.BasicConsumer.model;

import java.util.ArrayList;// An ordered collection (also known as a sequence). (Interface rather than a class)
import java.util.List;  // The Properties class represents a persistent set of properties.

//SenML format - expected response from the Provider client
public class TemperatureReadout {

  private String bn;
  private double bt;
  private String bu;
  private int ver;
  private List<MeasurementEntry> e = new ArrayList<>();

  public TemperatureReadout() {
  }

  public TemperatureReadout(String bn, double bt, String bu, int ver) {
    this.bn = bn;
    this.bt = bt;
    this.bu = bu;
    this.ver = ver;
  }

  public TemperatureReadout(String bn, double bt, String bu, int ver, List<MeasurementEntry> e) {
    super();
    this.bn = bn;
    this.bt = bt;
    this.bu = bu;
    this.ver = ver;
    this.e = e;
  }

  public String getBn() {
    return bn;
  }

  public void setBn(String bn) {
    this.bn = bn;
  }

  public double getBt() {
    return bt;
  }

  public void setBt(double bt) {
    this.bt = bt;
  }

  public String getBu() {
    return bu;
  }

  public void setBu(String bu) {
    this.bu = bu;
  }

  public int getVer() {
    return ver;
  }

  public void setVer(int ver) {
    this.ver = ver;
  }

  public List<MeasurementEntry> getE() {
    return e;
  }

  public void setE(List<MeasurementEntry> e) {
    this.e = e;
  }

}
