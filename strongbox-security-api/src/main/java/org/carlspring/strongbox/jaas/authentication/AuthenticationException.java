package org.carlspring.strongbox.jaas.authentication;

import javax.security.auth.login.LoginException;

/**
 * @author mtodorov
 */
public class AuthenticationException extends LoginException
{

    public AuthenticationException()
    {
    }

    public AuthenticationException(String message)
    {
        super(message);
    }

}
