package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Image
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-05T08:27:26.479061100+02:00[Europe/Budapest]")
public class Image {

  private String id;

  /**
   * Gets or Sets imageType
   */
  public enum ImageTypeEnum {
    PROFILEPICTURE("ProfilePicture"),
    
    EVENTPICTURE("EventPicture");

    private String value;

    ImageTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ImageTypeEnum fromValue(String value) {
      for (ImageTypeEnum b : ImageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ImageTypeEnum imageType;

  private String imagePath;

  public Image id(String id) {
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

  public Image imageType(ImageTypeEnum imageType) {
    this.imageType = imageType;
    return this;
  }

  /**
   * Get imageType
   * @return imageType
  */
  
  @Schema(name = "imageType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imageType")
  public ImageTypeEnum getImageType() {
    return imageType;
  }

  public void setImageType(ImageTypeEnum imageType) {
    this.imageType = imageType;
  }

  public Image imagePath(String imagePath) {
    this.imagePath = imagePath;
    return this;
  }

  /**
   * Get imagePath
   * @return imagePath
  */
  
  @Schema(name = "imagePath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imagePath")
  public String getImagePath() {
    return imagePath;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image image = (Image) o;
    return Objects.equals(this.id, image.id) &&
        Objects.equals(this.imageType, image.imageType) &&
        Objects.equals(this.imagePath, image.imagePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, imageType, imagePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
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

