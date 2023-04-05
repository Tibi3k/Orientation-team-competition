package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Image;
import org.openapitools.model.UserGroup;
import org.openapitools.model.Waypoint;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Race
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-05T08:27:26.479061100+02:00[Europe/Budapest]")
public class Race {

  private String id;

  @Valid
  private List<@Valid UserGroup> teams;

  @Valid
  private List<@Valid Image> eventImages;

  @Valid
  private List<@Valid Waypoint> waypoints;

  public Race id(String id) {
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

  public Race teams(List<@Valid UserGroup> teams) {
    this.teams = teams;
    return this;
  }

  public Race addTeamsItem(UserGroup teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * Get teams
   * @return teams
  */
  @Valid 
  @Schema(name = "teams", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("teams")
  public List<@Valid UserGroup> getTeams() {
    return teams;
  }

  public void setTeams(List<@Valid UserGroup> teams) {
    this.teams = teams;
  }

  public Race eventImages(List<@Valid Image> eventImages) {
    this.eventImages = eventImages;
    return this;
  }

  public Race addEventImagesItem(Image eventImagesItem) {
    if (this.eventImages == null) {
      this.eventImages = new ArrayList<>();
    }
    this.eventImages.add(eventImagesItem);
    return this;
  }

  /**
   * Get eventImages
   * @return eventImages
  */
  @Valid 
  @Schema(name = "eventImages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventImages")
  public List<@Valid Image> getEventImages() {
    return eventImages;
  }

  public void setEventImages(List<@Valid Image> eventImages) {
    this.eventImages = eventImages;
  }

  public Race waypoints(List<@Valid Waypoint> waypoints) {
    this.waypoints = waypoints;
    return this;
  }

  public Race addWaypointsItem(Waypoint waypointsItem) {
    if (this.waypoints == null) {
      this.waypoints = new ArrayList<>();
    }
    this.waypoints.add(waypointsItem);
    return this;
  }

  /**
   * Get waypoints
   * @return waypoints
  */
  @Valid 
  @Schema(name = "Waypoints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Waypoints")
  public List<@Valid Waypoint> getWaypoints() {
    return waypoints;
  }

  public void setWaypoints(List<@Valid Waypoint> waypoints) {
    this.waypoints = waypoints;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Race race = (Race) o;
    return Objects.equals(this.id, race.id) &&
        Objects.equals(this.teams, race.teams) &&
        Objects.equals(this.eventImages, race.eventImages) &&
        Objects.equals(this.waypoints, race.waypoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, teams, eventImages, waypoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Race {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    eventImages: ").append(toIndentedString(eventImages)).append("\n");
    sb.append("    waypoints: ").append(toIndentedString(waypoints)).append("\n");
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

