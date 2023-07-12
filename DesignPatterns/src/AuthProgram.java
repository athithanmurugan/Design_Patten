public class AuthProgram {
    private String authenticationStrategy;

    public AuthProgram(String authenticationStrategy) {
        this.authenticationStrategy = authenticationStrategy;
    }

    public void authenticate(String username, String password) {
        if (authenticationStrategy.equalsIgnoreCase("Basic")) {
            BasicAuthentication basicAuthentication = new BasicAuthentication();
            basicAuthentication.authenticate();
        } else if (authenticationStrategy.equalsIgnoreCase("OAuth")) {
            OAuthAuthentication oauthAuthentication = new OAuthAuthentication();
            oauthAuthentication.authenticate();
        } else if (authenticationStrategy.equalsIgnoreCase("Digest")) {
            DigestAuthentication digestAuthentication = new DigestAuthentication();
            digestAuthentication.authenticate();
        } else if (authenticationStrategy.equalsIgnoreCase("LDAP")) {
            LDAPAuthentication ldapAuthentication = new LDAPAuthentication();
            ldapAuthentication.authenticate();
        } else {
            System.out.println("Invalid authentication strategy.");
        }
    }

	public void setAuthenticationStrategy(String string) {
		// TODO Auto-generated method stub
		
	}
}
