/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm.fle.rest;

import com.google.gson.Gson;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.utl.dsm.fle.controller.Operaciones;
import org.utl.dsm.fle.model.Flete;
import org.utl.dsm.fle.model.coordenadas;

/**
 *
 * @author jonai
 */
@Path("fle")
public class RESTOperaciones extends Application{
    @Path ("resolver")
    @Produces (MediaType.APPLICATION_JSON)
    @GET
        public Response resolver(@QueryParam ("x1")@DefaultValue ("0") double x1,
                                 @QueryParam ("y1")@DefaultValue ("0") double y1,
                                 @QueryParam ("x2")@DefaultValue ("0") double x2,
                                 @QueryParam ("y2")@DefaultValue ("0") double y2){
          
            Operaciones op = new Operaciones();
            double distancia = op.distancia(x1, y1, x2, y2);
            double costoUnidad = op.costoUnidad(x1, y1, x2, y2);
            double costoTotal = op.costoTotal(distancia, costoUnidad);
            String tipoFlete = op.tipoflete(x1, y1, x2, y2);
           // out = String.format(out, x1, y1, x2, y2, distancia, costoUnidad, costoTotal, tipoFlete);
            
            coordenadas origen = new coordenadas(x1, y1);
            coordenadas destino = new coordenadas(x2, y2);
            
            Flete fle = new Flete(distancia, costoUnidad, costoTotal, tipoFlete,origen, destino );
            String flete = new Gson().toJson(fle);
            return Response.status(Response.Status.OK).entity(flete).build();
        }
}
