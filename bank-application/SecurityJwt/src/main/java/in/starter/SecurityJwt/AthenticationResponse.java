package in.starter.SecurityJwt;

public class AthenticationResponse {

	private final String jwt;

	public AthenticationResponse(String jwt) {

		this.jwt = jwt;
	}

	public String getJwt() {
		return jwt;
	}

}
