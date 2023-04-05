/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.5.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.UserGroup;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-05T07:53:28.767320600+02:00[Europe/Budapest]")
@Validated
@Tag(name = "UserGroup", description = "the UserGroup API")
public interface GroupApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /group/{groupId}/{id} : Add a user to the user group
     *
     * @param id ID of the User to add (required)
     * @param groupId ID of the Group to add the user to (required)
     * @return User added (status code 200)
     */
    @Operation(
        operationId = "addUserToUserGroup",
        summary = "Add a user to the user group",
        tags = { "UserGroup" },
        responses = {
            @ApiResponse(responseCode = "200", description = "User added")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/group/{groupId}/{id}"
    )
    default ResponseEntity<Void> addUserToUserGroup(
        @Parameter(name = "id", description = "ID of the User to add", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id,
        @Parameter(name = "groupId", description = "ID of the Group to add the user to", required = true, in = ParameterIn.PATH) @PathVariable("groupId") Integer groupId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /group : Create a new UserGroup.
     *
     * @param userGroup UserGroup object to create. (required)
     * @return UserGroup created (status code 201)
     */
    @Operation(
        operationId = "createUserGroup",
        summary = "Create a new UserGroup.",
        tags = { "UserGroup" },
        responses = {
            @ApiResponse(responseCode = "201", description = "UserGroup created", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserGroup.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/group",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<UserGroup> createUserGroup(
        @Parameter(name = "UserGroup", description = "UserGroup object to create.", required = true) @Valid @RequestBody UserGroup userGroup
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"raceId\" : \"123e4567-e89b-12d3-a456-426614174000\", \"score\" : { \"raceId\" : \"123e4567-e89b-12d3-a456-426614174000\", \"RoutePoints\" : [ null, null ], \"groupId\" : \"123e4567-e89b-12d3-a456-426614174000\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\" }, \"groupName\" : \"The Avangers\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"users\" : [ { \"firstName\" : \"John\", \"lastName\" : \"James\", \"profilePicture\" : { \"imagePath\" : \"imagePath\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"imageType\" : \"ProfilePicture\" }, \"password\" : \"12345\", \"phone\" : \"+36301234567\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"email\" : \"john@email.com\", \"username\" : \"theUser\" }, { \"firstName\" : \"John\", \"lastName\" : \"James\", \"profilePicture\" : { \"imagePath\" : \"imagePath\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"imageType\" : \"ProfilePicture\" }, \"password\" : \"12345\", \"phone\" : \"+36301234567\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"email\" : \"john@email.com\", \"username\" : \"theUser\" } ], \"leaderId\" : \"123e4567-e89b-12d3-a456-426614174000\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /group/{id} : Delete a UserGroup by ID.
     *
     * @param id ID of the UserGroup to retrieve, update or delete. (required)
     * @return UserGroup deleted (status code 204)
     *         or UserGroup not found (status code 404)
     */
    @Operation(
        operationId = "deleteUserGroupById",
        summary = "Delete a UserGroup by ID.",
        tags = { "UserGroup" },
        responses = {
            @ApiResponse(responseCode = "204", description = "UserGroup deleted"),
            @ApiResponse(responseCode = "404", description = "UserGroup not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/group/{id}"
    )
    default ResponseEntity<Void> deleteUserGroupById(
        @Parameter(name = "id", description = "ID of the UserGroup to retrieve, update or delete.", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /group/race/{id} : Gets all the groups in the given race
     *
     * @param id ID of the associated race (required)
     * @return UserGroup created (status code 200)
     */
    @Operation(
        operationId = "getAllGroupsInARace",
        summary = "Gets all the groups in the given race",
        tags = { "UserGroup" },
        responses = {
            @ApiResponse(responseCode = "200", description = "UserGroup created", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = UserGroup.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/group/race/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<List<UserGroup>> getAllGroupsInARace(
        @Parameter(name = "id", description = "ID of the associated race", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"raceId\" : \"123e4567-e89b-12d3-a456-426614174000\", \"score\" : { \"raceId\" : \"123e4567-e89b-12d3-a456-426614174000\", \"RoutePoints\" : [ null, null ], \"groupId\" : \"123e4567-e89b-12d3-a456-426614174000\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\" }, \"groupName\" : \"The Avangers\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"users\" : [ { \"firstName\" : \"John\", \"lastName\" : \"James\", \"profilePicture\" : { \"imagePath\" : \"imagePath\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"imageType\" : \"ProfilePicture\" }, \"password\" : \"12345\", \"phone\" : \"+36301234567\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"email\" : \"john@email.com\", \"username\" : \"theUser\" }, { \"firstName\" : \"John\", \"lastName\" : \"James\", \"profilePicture\" : { \"imagePath\" : \"imagePath\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"imageType\" : \"ProfilePicture\" }, \"password\" : \"12345\", \"phone\" : \"+36301234567\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"email\" : \"john@email.com\", \"username\" : \"theUser\" } ], \"leaderId\" : \"123e4567-e89b-12d3-a456-426614174000\" }, { \"raceId\" : \"123e4567-e89b-12d3-a456-426614174000\", \"score\" : { \"raceId\" : \"123e4567-e89b-12d3-a456-426614174000\", \"RoutePoints\" : [ null, null ], \"groupId\" : \"123e4567-e89b-12d3-a456-426614174000\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\" }, \"groupName\" : \"The Avangers\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"users\" : [ { \"firstName\" : \"John\", \"lastName\" : \"James\", \"profilePicture\" : { \"imagePath\" : \"imagePath\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"imageType\" : \"ProfilePicture\" }, \"password\" : \"12345\", \"phone\" : \"+36301234567\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"email\" : \"john@email.com\", \"username\" : \"theUser\" }, { \"firstName\" : \"John\", \"lastName\" : \"James\", \"profilePicture\" : { \"imagePath\" : \"imagePath\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"imageType\" : \"ProfilePicture\" }, \"password\" : \"12345\", \"phone\" : \"+36301234567\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"email\" : \"john@email.com\", \"username\" : \"theUser\" } ], \"leaderId\" : \"123e4567-e89b-12d3-a456-426614174000\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /group : Get all UserGroups.
     *
     * @return List of UserGroup objects (status code 200)
     */
    @Operation(
        operationId = "getAllUserGroups",
        summary = "Get all UserGroups.",
        tags = { "UserGroup" },
        responses = {
            @ApiResponse(responseCode = "200", description = "List of UserGroup objects", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = UserGroup.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/group",
        produces = { "application/json" }
    )
    default ResponseEntity<List<UserGroup>> getAllUserGroups(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"raceId\" : \"123e4567-e89b-12d3-a456-426614174000\", \"score\" : { \"raceId\" : \"123e4567-e89b-12d3-a456-426614174000\", \"RoutePoints\" : [ null, null ], \"groupId\" : \"123e4567-e89b-12d3-a456-426614174000\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\" }, \"groupName\" : \"The Avangers\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"users\" : [ { \"firstName\" : \"John\", \"lastName\" : \"James\", \"profilePicture\" : { \"imagePath\" : \"imagePath\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"imageType\" : \"ProfilePicture\" }, \"password\" : \"12345\", \"phone\" : \"+36301234567\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"email\" : \"john@email.com\", \"username\" : \"theUser\" }, { \"firstName\" : \"John\", \"lastName\" : \"James\", \"profilePicture\" : { \"imagePath\" : \"imagePath\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"imageType\" : \"ProfilePicture\" }, \"password\" : \"12345\", \"phone\" : \"+36301234567\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"email\" : \"john@email.com\", \"username\" : \"theUser\" } ], \"leaderId\" : \"123e4567-e89b-12d3-a456-426614174000\" }, { \"raceId\" : \"123e4567-e89b-12d3-a456-426614174000\", \"score\" : { \"raceId\" : \"123e4567-e89b-12d3-a456-426614174000\", \"RoutePoints\" : [ null, null ], \"groupId\" : \"123e4567-e89b-12d3-a456-426614174000\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\" }, \"groupName\" : \"The Avangers\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"users\" : [ { \"firstName\" : \"John\", \"lastName\" : \"James\", \"profilePicture\" : { \"imagePath\" : \"imagePath\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"imageType\" : \"ProfilePicture\" }, \"password\" : \"12345\", \"phone\" : \"+36301234567\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"email\" : \"john@email.com\", \"username\" : \"theUser\" }, { \"firstName\" : \"John\", \"lastName\" : \"James\", \"profilePicture\" : { \"imagePath\" : \"imagePath\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"imageType\" : \"ProfilePicture\" }, \"password\" : \"12345\", \"phone\" : \"+36301234567\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"email\" : \"john@email.com\", \"username\" : \"theUser\" } ], \"leaderId\" : \"123e4567-e89b-12d3-a456-426614174000\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /group/{id} : Get a UserGroup by ID.
     *
     * @param id ID of the UserGroup to retrieve, update or delete. (required)
     * @return UserGroup object (status code 200)
     *         or UserGroup not found (status code 404)
     */
    @Operation(
        operationId = "getUserGroupById",
        summary = "Get a UserGroup by ID.",
        tags = { "UserGroup" },
        responses = {
            @ApiResponse(responseCode = "200", description = "UserGroup object", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserGroup.class))
            }),
            @ApiResponse(responseCode = "404", description = "UserGroup not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/group/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<UserGroup> getUserGroupById(
        @Parameter(name = "id", description = "ID of the UserGroup to retrieve, update or delete.", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"raceId\" : \"123e4567-e89b-12d3-a456-426614174000\", \"score\" : { \"raceId\" : \"123e4567-e89b-12d3-a456-426614174000\", \"RoutePoints\" : [ null, null ], \"groupId\" : \"123e4567-e89b-12d3-a456-426614174000\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\" }, \"groupName\" : \"The Avangers\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"users\" : [ { \"firstName\" : \"John\", \"lastName\" : \"James\", \"profilePicture\" : { \"imagePath\" : \"imagePath\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"imageType\" : \"ProfilePicture\" }, \"password\" : \"12345\", \"phone\" : \"+36301234567\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"email\" : \"john@email.com\", \"username\" : \"theUser\" }, { \"firstName\" : \"John\", \"lastName\" : \"James\", \"profilePicture\" : { \"imagePath\" : \"imagePath\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"imageType\" : \"ProfilePicture\" }, \"password\" : \"12345\", \"phone\" : \"+36301234567\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"email\" : \"john@email.com\", \"username\" : \"theUser\" } ], \"leaderId\" : \"123e4567-e89b-12d3-a456-426614174000\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /group/{groupId}/{id} : Remove user from group
     *
     * @param id ID of the User to add (required)
     * @param groupId ID of the Group to add the user to (required)
     * @return User removed (status code 204)
     */
    @Operation(
        operationId = "removeUserFromGroup",
        summary = "Remove user from group",
        tags = { "UserGroup" },
        responses = {
            @ApiResponse(responseCode = "204", description = "User removed")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/group/{groupId}/{id}"
    )
    default ResponseEntity<Void> removeUserFromGroup(
        @Parameter(name = "id", description = "ID of the User to add", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id,
        @Parameter(name = "groupId", description = "ID of the Group to add the user to", required = true, in = ParameterIn.PATH) @PathVariable("groupId") Integer groupId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /group/{id} : Upsert a UserGroup by ID.
     *
     * @param id ID of the UserGroup to retrieve, update or delete. (required)
     * @param userGroup UserGroup object to upsert. (required)
     * @return UserGroup object (status code 200)
     *         or UserGroup created (status code 201)
     *         or UserGroup not found (status code 404)
     */
    @Operation(
        operationId = "upsertUserGroupById",
        summary = "Upsert a UserGroup by ID.",
        tags = { "UserGroup" },
        responses = {
            @ApiResponse(responseCode = "200", description = "UserGroup object", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserGroup.class))
            }),
            @ApiResponse(responseCode = "201", description = "UserGroup created", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserGroup.class))
            }),
            @ApiResponse(responseCode = "404", description = "UserGroup not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/group/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<UserGroup> upsertUserGroupById(
        @Parameter(name = "id", description = "ID of the UserGroup to retrieve, update or delete.", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id,
        @Parameter(name = "UserGroup", description = "UserGroup object to upsert.", required = true) @Valid @RequestBody UserGroup userGroup
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"raceId\" : \"123e4567-e89b-12d3-a456-426614174000\", \"score\" : { \"raceId\" : \"123e4567-e89b-12d3-a456-426614174000\", \"RoutePoints\" : [ null, null ], \"groupId\" : \"123e4567-e89b-12d3-a456-426614174000\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\" }, \"groupName\" : \"The Avangers\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"users\" : [ { \"firstName\" : \"John\", \"lastName\" : \"James\", \"profilePicture\" : { \"imagePath\" : \"imagePath\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"imageType\" : \"ProfilePicture\" }, \"password\" : \"12345\", \"phone\" : \"+36301234567\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"email\" : \"john@email.com\", \"username\" : \"theUser\" }, { \"firstName\" : \"John\", \"lastName\" : \"James\", \"profilePicture\" : { \"imagePath\" : \"imagePath\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"imageType\" : \"ProfilePicture\" }, \"password\" : \"12345\", \"phone\" : \"+36301234567\", \"id\" : \"123e4567-e89b-12d3-a456-426614174000\", \"email\" : \"john@email.com\", \"username\" : \"theUser\" } ], \"leaderId\" : \"123e4567-e89b-12d3-a456-426614174000\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
