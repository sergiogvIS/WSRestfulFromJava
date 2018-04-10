/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produce;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author entrar
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }
    static Producto prod;
    /**
     * Retrieves representation of an instance of produce.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Producto getJson() {
        //TODO return proper representation object
        Producto producto = new Producto();
        producto.setId(0);
        producto.setNombre("macarrones");
        producto.setPrecio(2.05);
        producto.setCategoria("Comida");
        return producto;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Producto getResources() {
        //TODO return proper representation object
        Producto producto = new Producto();
        producto.setId(0);
        producto.setNombre("macarrones");
        producto.setPrecio(2.05);
        producto.setCategoria("Comida");
        return producto;
    }
    @POST
    @Consumes({"application/xml","application/json"})
    public Response guardar(Producto pr) {
        //TODO return proper representation object
        prod = pr;
        return Response.ok(pr).build();
    } 
}
