package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ActiveWaypoint;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Score
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-05T08:27:26.479061100+02:00[Europe/Budapest]")
public class Score {

  private String id;

  private String raceId;

  private String groupId;

  @Valid
  private List<@Valid ActiveWaypoint> routePoints;

  public Score id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "123e4567-e89b-12d3-a456-426614174000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Score raceId(String raceId) {
    this.raceId = raceId;
    return this;
  }

  /**
   * Get raceId
   * @return raceId
  */
  
  @Schema(name = "raceId", example = "123e4567-e89b-12d3-a456-426614174000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("raceId")
  public String getRaceId() {
    return raceId;
  }

  public void setRaceId(String raceId) {
    this.raceId = raceId;
  }

  public Score groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
  */
  
  @Schema(name = "groupId", example = "123e4567-e89b-12d3-a456-426614174000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public Score routePoints(List<@Valid ActiveWaypoint> routePoints) {
    this.routePoints = routePoints;
    return this;
  }

  public Score addRoutePointsItem(ActiveWaypoint routePointsItem) {
    if (this.routePoints == null) {
      this.routePoints = new ArrayList<>();
    }
    this.routePoints.add(routePointsItem);
    return this;
  }

  /**
   * Get routePoints
   * @return routePoints
  */
  @Valid 
  @Schema(name = "RoutePoints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RoutePoints")
  public List<@Valid ActiveWaypoint> getRoutePoints() {
    return routePoints;
  }

  public void setRoutePoints(List<@Valid ActiveWaypoint> routePoints) {
    this.routePoints = routePoints;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Score score = (Score) o;
    return Objects.equals(this.id, score.id) &&
        Objects.equals(this.raceId, score.raceId) &&
        Objects.equals(this.groupId, score.groupId) &&
        Objects.equals(this.routePoints, score.routePoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, raceId, groupId, routePoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Score {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    raceId: ").append(toIndentedString(raceId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    routePoints: ").append(toIndentedString(routePoints)).append("\n");
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

