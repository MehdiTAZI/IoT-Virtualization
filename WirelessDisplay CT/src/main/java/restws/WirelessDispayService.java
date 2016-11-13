package restws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/wireless-dispay")
public class WirelessDispayService {

	@GET
	@Path("/{message}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response display(@PathParam("message") String message) {

		String output = "Wireless Display : " + message;
		System.out.println(output);

		return Response.status(200).entity(output).build();
	}

}