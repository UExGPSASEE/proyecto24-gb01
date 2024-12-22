/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.62).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

package es.unex.swagger.api;


import es.unex.swagger.model.User;
import es.unex.swagger.model.UserProfile;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-18T10:29:32.211856553Z[GMT]")
@Validated
public interface ProfilesApi {

    @Operation(summary = "Elimina la información sobre un profile dado su id.", description = "Elimina toda la información un profile de un user dado el id del user y el id del profile", security = {
            @SecurityRequirement(name = "cookieAuth"),
            @SecurityRequirement(name = "medifli_auth", scopes = {
                    "write:users",
                    "read:users"})}, tags = {"user-profile"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operación exitosa."),

            @ApiResponse(responseCode = "400", description = "Valor no soportado"),

            @ApiResponse(responseCode = "404", description = "User o profile de user no encontrado")})
    @RequestMapping(value = "/profiles/{idProfile}",
            method = RequestMethod.DELETE)
    ResponseEntity<UserProfile> deleteUserProfileById(@Parameter(in = ParameterIn.PATH, description = "El id del profile de user que se desea eliminar.", required = false, schema = @Schema()) @PathVariable("idProfile") Long idProfile
            , @Parameter(in = ParameterIn.COOKIE, description = "", required = false, schema = @Schema()) @CookieValue(value = "SessionUserCookie", required = false) User sessionUserCookie
    );


    @Operation(summary = "Devuelve todos los profilees del user dada su id.", description = "Devuelve todos los profilees del user.", security = {
            @SecurityRequirement(name = "cookieAuth"),
            @SecurityRequirement(name = "medifli_auth", scopes = {
                    "write:users",
                    "read:users"})}, tags = {"user-profile"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operación exitosa.", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = UserProfile.class)))),

            @ApiResponse(responseCode = "400", description = "Valor no soportado"),

            @ApiResponse(responseCode = "404", description = "Profile no encontrado")})
    @RequestMapping(value = "/profiles",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<UserProfile>> getAllUserProfileById(@Parameter(in = ParameterIn.COOKIE, description = "", required = false, schema = @Schema()) @CookieValue(value = "SessionUserCookie", required = false) User sessionUserCookie
    );


    @Operation(summary = "Devuelve la información sobre un profile dado su id.", description = "Devuelve la información sobre un profile de un user dado el ide del user y el id del profile", tags = {"user-profile"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operación exitosa.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserProfile.class))),

            @ApiResponse(responseCode = "400", description = "Valor no soportado"),

            @ApiResponse(responseCode = "404", description = "Profile no encontrado")})
    @RequestMapping(value = "/profiles/{idProfile}",
            produces = {"application/json", "application/xml", "application/x-www-form-urlencoded"},
            method = RequestMethod.GET)
    ResponseEntity<UserProfile> getUserProfileById(@Parameter(in = ParameterIn.PATH, description = "El id del profile de user que se desea buscar.", required = false, schema = @Schema()) @PathVariable("idProfile") Long idProfile
            , @Parameter(in = ParameterIn.COOKIE, description = "", required = false, schema = @Schema()) @CookieValue(value = "SessionUserCookie", required = false) User sessionUserCookie
    );

    @Operation(summary = "Obtiene perfiles por id de usuario")
    @RequestMapping(value = "/profiles/user/{idUser}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<UserProfile>> getProfilesByUserId(
            @PathVariable("idUser") Long idUser);


    @Operation(summary = "Añade un nuevo profile de user", description = "Añade un nuevo profile a un user, facilitando la información en el body de la petición.", security = {
            @SecurityRequirement(name = "cookieAuth"),
            @SecurityRequirement(name = "medifli_auth", scopes = {
                    "write:users",
                    "read:users"})}, tags = {"user-profile"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Operación exitosa.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserProfile.class))),

            @ApiResponse(responseCode = "400", description = "Valor no soportado"),

            @ApiResponse(responseCode = "404", description = "Profile no encontrado")})
    @RequestMapping(value = "/profiles",
            produces = {"application/json", "application/xml", "application/x-www-form-urlencoded"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<UserProfile> postUserProfile(@Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema()) @Valid @RequestBody UserProfile body
    );


    @Operation(summary = " Actualiza la información sobre un profile dado su id.", description = "Actualiza toda la información un profile de un user dado su id", security = {
            @SecurityRequirement(name = "cookieAuth"),
            @SecurityRequirement(name = "medifli_auth", scopes = {
                    "write:users",
                    "read:users"})}, tags = {"user-profile"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operación exitosa.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserProfile.class))),

            @ApiResponse(responseCode = "400", description = "Valor no soportado"),

            @ApiResponse(responseCode = "404", description = "Profile no encontrado")})
    @RequestMapping(value = "/profiles/{idProfile}",
            produces = {"application/json", "application/xml", "application/x-www-form-urlencoded"},
            consumes = {"application/json", "application/xml", "application/x-www-form-urlencoded"},
            method = RequestMethod.PUT)
    ResponseEntity<UserProfile> putUserProfileById(@Parameter(in = ParameterIn.PATH, description = "El id del profile de user que se desea eliminar.", required = false, schema = @Schema()) @PathVariable("idProfile") Long idProfile
            , @Parameter(in = ParameterIn.COOKIE, description = "", required = false, schema = @Schema()) @CookieValue(value = "User", required = false) User sessionUserCookie
            , @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema()) @Valid @RequestBody UserProfile body
    );

}
