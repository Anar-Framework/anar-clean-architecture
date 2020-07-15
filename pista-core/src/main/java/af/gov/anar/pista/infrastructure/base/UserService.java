package af.gov.anar.pista.infrastructure.base;

import org.keycloak.KeycloakSecurityContext;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.representations.AccessToken;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private KeycloakSecurityContext keycloakSecurityContext;

    @Autowired
    private AccessToken accessToken;

    @Value("${keycloak.auth-server-url}")
    private String keycloakServerUrl;

    @Value("${keycloak.realm}")
    private String keycloackRealm;

    @Value("${admin.user}")
    private String keycloackUser;

    @Value("${admin.password}")
    private String keycloackPassword;

    public List getUsers() {
        Keycloak keycloak = Keycloak.getInstance(keycloakServerUrl,keycloackRealm,keycloackUser, keycloackPassword, "admin-cli");
        List<UserRepresentation> results = keycloak.realm(keycloackRealm).users().search(null, 0, Integer.MAX_VALUE);
        return results;
    }

    public String getId()
    {
        return accessToken.getId();
    }

    public String getPreferredUsername()
    {
        return accessToken.getPreferredUsername();
    }

    public String getName()
    {
        return accessToken.getName();
    }


    public String getFamilyName()
    {
        return accessToken.getFamilyName();
    }

    public String getGivenName()
    {
        return accessToken.getGivenName();
    }

    public String getDoB()
    {
        return accessToken.getBirthdate();
    }


    public String getEmail()
    {
        return accessToken.getEmail();
    }


    public boolean getPhoneNumberVerified()
    {
        return accessToken.getPhoneNumberVerified();
    }


    public boolean getEmailVerified()
    {
        return accessToken.getEmailVerified();
    }


    public String getAcr()
    {
        return accessToken.getAcr();
    }



    public String getProfile()
    {
        return accessToken.getProfile();
    }

    public String getIssuer()
    {
        return accessToken.getIssuer();
    }


    public String getType()
    {
        return accessToken.getType();
    }


    public String getLocale()
    {
        return accessToken.getLocale();
    }

    public String getScope()
    {
        return accessToken.getScope();
    }

    public String getPhoneNumber()
    {
        return accessToken.getPhoneNumber();
    }
}
