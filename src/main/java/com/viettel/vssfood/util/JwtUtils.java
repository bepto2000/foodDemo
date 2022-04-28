package com.viettel.vssfood.util;

import com.viettel.vssfood.model.UserDetail;
import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtils {

    @Value("${security.jwt.token.secret-key}")
    private String secretKey;

    @Value("${security.jwt.expiration.ms}")
    private Long expiration;

    public String generateJwtToken(UserDetail userDetails) {
        String token = Jwts.builder()
                .setSubject((userDetails.getUsername()))
                .setIssuedAt(new Date())
                .setExpiration(generateExpirationDate())
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact();

        return token;
    }

    public Date generateExpirationDate() {
        return new Date(System.currentTimeMillis() + expiration);
    }

    public Claims getClaimsFromJwtToken(String token) {
        return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
    }

    private boolean isTokenExpired(Claims claims) {
        return claims.getExpiration().after(new Date());
    }

    public String getUserNameFromJwtToken(String token) {
        Claims claims = getClaimsFromJwtToken(token);
        if (claims != null && isTokenExpired(claims)) {
            return claims.getSubject();
        }
        return null;
    }

    public boolean validateJwtToken(String authToken) {
        try {
            Jwts.parser().setSigningKey(secretKey).parseClaimsJws(authToken);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
