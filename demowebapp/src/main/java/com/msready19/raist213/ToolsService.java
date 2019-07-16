package com.msready19.raist213;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/tools")
public class ToolsService {

    private SuperUtilities _tools;

    
    public ToolsService(SuperUtilities tools) {
        _tools = tools;
    }

    @POST
    @Path("echo")
    @Produces("text/plain")
    public String echo(@FormParam("source") String source) {
        return source;
    }

    @POST
    @Path("reverse")
    @Produces("text/plain")
    public String reverse(@FormParam("source") String source) {
        return _tools.doReverse(source);
    }

}