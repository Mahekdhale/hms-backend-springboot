package com.hms.user.jwt;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtUtil {
    private static final Long JWT_TOKEN_VALIDITY=5*60*60L;
    private static final String SECRET="77a1877279afb79c48d02a4dc931a6cf0a9d97980dd16447d711594757b321c457cb71debc4a75c68bd7250e513551df03f6db75bf65a5d536102a49e1776476";
    public String generateToken(UserDetails userDetails) {
       Map<String,Object> claims = new HashMap<>();
       CustomUserDetails user = (CustomUserDetails) userDetails;
       claims.put("id",user.getId());
       claims.put("email",user.getEmail());
       claims.put("role",user.getRole());
       claims.put("name",user.getName());

       return doGenerateToken(claims,userDetails.getUsername());
    }
    public String doGenerateToken(Map<String,Object> claims,String subject){
        return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis())).setExpiration(new Date(System.currentTimeMillis()+JWT_TOKEN_VALIDITY*1000)).signWith(SignatureAlgorithm.HS512, SECRET).compact();
    }
}
