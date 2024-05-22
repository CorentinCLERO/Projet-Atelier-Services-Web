package server;

import jakarta.xml.ws.Endpoint;
import service.BanqueServices;

public class ServeurJWS {

	public static void main(String[] args) {
		// On déclare une chaine pour l'url du serveur
		String url="http://localhost:8585/";
		
		// On publie le WebService avec la classe EndPoint de JaxWS
		Endpoint.publish(url, new BanqueServices());
		
		System.out.println(url); 
	}
   }
