package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Score;
import org.openapitools.model.User;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserGroup
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-05T08:27:26.479061100+02:00[Europe/Budapest]")
public class UserGroup {

  private String id;

  private String groupName;

  private String leaderId;

  private String raceId;

  @Valid
  private List<@Valid User> users;

  private Score score;

  public UserGroup id(String id) {
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

  public UserGroup groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * Get groupName
   * @return groupName
  */
  
  @Schema(name = "groupName", example = "The Avangers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupName")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public UserGroup leaderId(String leaderId) {
    this.leaderId = leaderId;
    return this;
  }

  /**
   * Get leaderId
   * @return leaderId
  */
  
  @Schema(name = "leaderId", example = "123e4567-e89b-12d3-a456-426614174000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("leaderId")
  public String getLeaderId() {
    return leaderId;
  }

  public void setLeaderId(String leaderId) {
    this.leaderId = leaderId;
  }

  public UserGroup raceId(String raceId) {
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

  public UserGroup users(List<@Valid User> users) {
    this.users = users;
    return this;
  }

  public UserGroup addUsersItem(User usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
  */
  @Valid 
  @Schema(name = "users", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("users")
  public List<@Valid User> getUsers() {
    return users;
  }

  public void setUsers(List<@Valid User> users) {
    this.users = users;
  }

  public UserGroup score(Score score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   * @return score
  */
  @Valid 
  @Schema(name = "score", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("score")
  public Score getScore() {
    return score;
  }

  public void setScore(Score score) {
    this.score = score;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGroup userGroup = (UserGroup) o;
    return Objects.equals(this.id, userGroup.id) &&
        Objects.equals(this.groupName, userGroup.groupName) &&
        Objects.equals(this.leaderId, userGroup.leaderId) &&
        Objects.equals(this.raceId, userGroup.raceId) &&
        Objects.equals(this.users, userGroup.users) &&
        Objects.equals(this.score, userGroup.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupName, leaderId, raceId, users, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    leaderId: ").append(toIndentedString(leaderId)).append("\n");
    sb.append("    raceId: ").append(toIndentedString(raceId)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

