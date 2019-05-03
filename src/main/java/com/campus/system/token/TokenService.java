package com.campus.system.token;

import com.campus.system.service.Service;
import com.campus.system.token.model.Token;

public abstract class TokenService extends Service {

    public abstract Token createToken(String userId);

    public abstract Token parseToken(String token);

    public abstract Token updateToken(String userId);

    public abstract boolean verifyToken(String token);
}
