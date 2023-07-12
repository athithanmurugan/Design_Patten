public class Main {
    public static void main(String[] args) {
        AuthProgram authProgram = new AuthProgram("Basic");
        authProgram.authenticate("username", "password");

        authProgram.setAuthenticationStrategy("OAuth");
        authProgram.authenticate("username", "password");

        authProgram.setAuthenticationStrategy("Digest");
        authProgram.authenticate("username", "password");

        authProgram.setAuthenticationStrategy("Invalid");
        authProgram.authenticate("username", "password");
        
        authProgram.setAuthenticationStrategy("LDAP");
        authProgram.authenticate("username", "password");
    }
}