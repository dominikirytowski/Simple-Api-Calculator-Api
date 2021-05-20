/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labora10;

import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Dominik
 */
@Path("kalk")
@RequestScoped
public class Kalkulator {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Kalkulator
     */
    public Kalkulator() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.labora10.Kalkulator
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/add/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String add(@PathParam("a") double a, @PathParam("b") double b) {
        try{
            return Double.toString(a + b);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }


    @GET
    @Path("/subtract/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String subtract(@PathParam("a") double a, @PathParam("b") double b){
        try {
            return Double.toString(a - b);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }


    @GET
    @Path("/multiply/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String multiply(@PathParam("a") double a, @PathParam("b") double b){
        try {
            return Double.toString(a * b);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }


    @GET
    @Path("/divide/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String divide(@PathParam("a") double a, @PathParam("b") double b){
        try {
            if(b != 0) {
                return Double.toString(a / b);
            }else{
                throw new Exception("Don't divide by 0");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }


    @GET
    @Path("/sqrt/{a}")
    @Produces(MediaType.TEXT_PLAIN)
    public String squareRoot(@PathParam("a") double a){
        try {
            if(a > 0) {
                return Double.toString(Math.sqrt(a));
            }else{
                throw new Exception("Square root must be calculated from positive value");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }


    @GET
    @Path("/pow/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String powerOfNumber(@PathParam("a") double a, @PathParam("b") double b){
        try {
                int lv = (int) b;
                return Double.toString(Math.pow(a, lv));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }



}
