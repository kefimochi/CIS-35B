//	 Provide a list of available models to the client.
//	 2. Send the object (using Serialization) to the client, upon selection of an Automobile
package server;

public interface AutoServable {

	public void serve(int port);

}