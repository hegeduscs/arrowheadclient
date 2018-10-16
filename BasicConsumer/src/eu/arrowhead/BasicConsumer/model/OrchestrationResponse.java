/*
 * Copyright (c) 2018 AITIA International Inc.
 *
 * This work is part of the Productive 4.0 innovation project, which receives grants from the
 * European Commissions H2020 research and innovation programme, ECSEL Joint Undertaking
 * (project no. 737459), the free state of Saxony, the German Federal Ministry of Education and
 * national funding authorities from involved countries.
 */

package eu.arrowhead.BasicConsumer.model;

import java.util.ArrayList; // An ordered collection (also known as a sequence). (Interface rather than a class)
import java.util.List;  // The Properties class represents a persistent set of properties.

public class OrchestrationResponse {

  private List<OrchestrationForm> response = new ArrayList<>();

  public OrchestrationResponse() {
  }

  public OrchestrationResponse(List<OrchestrationForm> response) {
    this.response = response;
  }

  public List<OrchestrationForm> getResponse() {
    return response;
  }

  public void setResponse(List<OrchestrationForm> response) {
    this.response = response;
  }

}
