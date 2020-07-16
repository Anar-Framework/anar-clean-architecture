package af.gov.anar.pista.province;

import af.gov.anar.api.annotation.ThrowsException;
import af.gov.anar.api.annotation.ThrowsExceptions;
import af.gov.anar.api.handler.exception.InternalServerProblemException;
import af.gov.anar.api.handler.exception.ResourceNotFoundException;
import af.gov.anar.pista.infrastructure.exception.UnAuthorizedException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/administration/provinces", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value="provinceControllerApi", description="Province Api for Anar Framework")
public class ProvinceController {

    @Autowired
    private ProvinceService service;

    @ApiOperation(value = "test endpoint for producing a ResponseEntity<List>", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @ThrowsExceptions(value = {
            @ThrowsException(status = HttpStatus.NOT_FOUND, exception= ResourceNotFoundException.class),
            @ThrowsException(status = HttpStatus.UNAUTHORIZED, exception = UnAuthorizedException.class),
            @ThrowsException(status = HttpStatus.INTERNAL_SERVER_ERROR, exception = InternalServerProblemException.class)
    })
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Province>> findall() {
        return ResponseEntity.ok(service.findAll());
    }


    @ApiOperation(value = "test endpoint for producing a ResponseEntity", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @ThrowsExceptions(value = {
            @ThrowsException(status = HttpStatus.NOT_FOUND, exception= ResourceNotFoundException.class),
            @ThrowsException(status = HttpStatus.UNAUTHORIZED, exception = UnAuthorizedException.class),
            @ThrowsException(status = HttpStatus.INTERNAL_SERVER_ERROR, exception = InternalServerProblemException.class)
    })
    @GetMapping(value = "/{id}")
    public ResponseEntity<Province> findOne(@PathVariable(name = "id", required = true) String id) {
        return ResponseEntity.ok(service.findOne(id));
    }


    @ApiOperation(value = "test endpoint for producing a ResponseEntity", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @ThrowsExceptions(value = {
            @ThrowsException(status = HttpStatus.NOT_FOUND, exception= ResourceNotFoundException.class),
            @ThrowsException(status = HttpStatus.UNAUTHORIZED, exception = UnAuthorizedException.class),
            @ThrowsException(status = HttpStatus.INTERNAL_SERVER_ERROR, exception = InternalServerProblemException.class)
    })
    @GetMapping(value = "/name/{name}")
    public ResponseEntity<Province> findByName(@PathVariable(name = "name", required = true) String name) {
        return ResponseEntity.ok(service.findByName(name));
    }

    @ApiOperation(value = "test endpoint for producing a ResponseEntity", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @ThrowsExceptions(value = {
            @ThrowsException(status = HttpStatus.NOT_FOUND, exception= ResourceNotFoundException.class),
            @ThrowsException(status = HttpStatus.UNAUTHORIZED, exception = UnAuthorizedException.class),
            @ThrowsException(status = HttpStatus.INTERNAL_SERVER_ERROR, exception = InternalServerProblemException.class)
    })
    @GetMapping(value = "/code/{code}")
    public @ResponseBody ResponseEntity<Province> findByCode(
            @PathVariable(name = "code", required = true) String code) {
        return ResponseEntity.ok(service.findByProvinceCode(code));
    }

    @ApiOperation(value = "test endpoint for producing a ResponseEntity", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @ThrowsExceptions(value = {
            @ThrowsException(status = HttpStatus.NOT_FOUND, exception= ResourceNotFoundException.class),
            @ThrowsException(status = HttpStatus.UNAUTHORIZED, exception = UnAuthorizedException.class),
            @ThrowsException(status = HttpStatus.INTERNAL_SERVER_ERROR, exception = InternalServerProblemException.class)
    })
    @PutMapping(value = "/{id}")
    public ResponseEntity<Province> update(@PathVariable(name = "id", required = true) String id,
            @RequestBody(required = true) Province obj) {
        System.out.println("ID: " + id + "   Province: " + obj);
        Province item = service.findOne(id);
        item.setName(obj.getName());
        item.setProvinceCode(obj.getProvinceCode());

        return ResponseEntity.ok(service.save(obj));
    }

    @ApiOperation(value = "test endpoint for producing a ResponseEntity", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @ThrowsExceptions(value = {
            @ThrowsException(status = HttpStatus.NOT_FOUND, exception= ResourceNotFoundException.class),
            @ThrowsException(status = HttpStatus.UNAUTHORIZED, exception = UnAuthorizedException.class),
            @ThrowsException(status = HttpStatus.INTERNAL_SERVER_ERROR, exception = InternalServerProblemException.class)
    })
    @PostMapping()
    public ResponseEntity<Province> save(@RequestBody(required = true) Province obj) {
        return ResponseEntity.ok(service.save(obj));
    }


    @ApiOperation(value = "test endpoint for producing a ResponseEntity", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @ThrowsExceptions(value = {
            @ThrowsException(status = HttpStatus.NOT_FOUND, exception= ResourceNotFoundException.class),
            @ThrowsException(status = HttpStatus.UNAUTHORIZED, exception = UnAuthorizedException.class),
            @ThrowsException(status = HttpStatus.INTERNAL_SERVER_ERROR, exception = InternalServerProblemException.class)
    })
     @DeleteMapping(value = "/{id}")
     public @ResponseBody
     ResponseEntity<Void> delete(@PathVariable(name = "id", required = true)
     String id){

     service.delete(id);
     return ResponseEntity.noContent().build();
     }

}
