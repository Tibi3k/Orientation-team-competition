package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ActiveWaypointAllOf
 */

@JsonTypeName("ActiveWaypoint_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-05T08:27:26.479061100+02:00[Europe/Budapest]")
public class ActiveWaypointAllOf {

  private String estimatedTime;

  private String reachedTime;

  public ActiveWaypointAllOf estimatedTime(String estimatedTime) {
    this.estimatedTime = estimatedTime;
    return this;
  }

  /**
   * Get estimatedTime
   * @return estimatedTime
  */
  
  @Schema(name = "EstimatedTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EstimatedTime")
  public String getEstimatedTime() {
    return estimatedTime;
  }

  public void setEstimatedTime(String estimatedTime) {
    this.estimatedTime = estimatedTime;
  }

  public ActiveWaypointAllOf reachedTime(String reachedTime) {
    this.reachedTime = reachedTime;
    return this;
  }

  /**
   * Get reachedTime
   * @return reachedTime
  */
  
  @Schema(name = "ReachedTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ReachedTime")
  public String getReachedTime() {
    return reachedTime;
  }

  public void setReachedTime(String reachedTime) {
    this.reachedTime = reachedTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveWaypointAllOf activeWaypointAllOf = (ActiveWaypointAllOf) o;
    return Objects.equals(this.estimatedTime, activeWaypointAllOf.estimatedTime) &&
        Objects.equals(this.reachedTime, activeWaypointAllOf.reachedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedTime, reachedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveWaypointAllOf {\n");
    sb.append("    estimatedTime: ").append(toIndentedString(estimatedTime)).append("\n");
    sb.append("    reachedTime: ").append(toIndentedString(reachedTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

