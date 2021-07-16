package com.thecat.product.endpoint;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import com.thecat.product.service.ProductService;
import com.thecat.product.model.Product;

@Path("/product")
public class ProductResources {

    @Inject
    ProductService productService;

    @ConfigProperty(name = "application") 
    String apps;

    @ConfigProperty(name = "quarkus.datasource.jdbc.url")
    String url;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> listProduct() {
        return productService.listProduct();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product getAProduct(@PathParam( "id" ) Integer id) {
        return productService.findProductById(id);
    }

    @GET
    @Path("size/{size}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getAProduct(@PathParam( "size" ) String size) {
        return productService.findProductBySize(size);
    }

    @GET
    @Path("count")
    @Produces(MediaType.APPLICATION_JSON)
    public long getCount() {
        return productService.getProductCount();
    }

    @GET
    @Path( "health")
    @Produces(MediaType.TEXT_PLAIN)
    public String health() {
        System.out.println( "applicaiton " + apps);
        System.out.println( "url " + url);

        return "SUCCESS";
    }
}