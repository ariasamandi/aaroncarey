package com.codingdojo.AaronCarey.service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.codingdojo.AaronCarey.models.Admin;
import com.codingdojo.AaronCarey.repository.AaronCareyRepository;

@Service
public class AaronCareyService {
	private final AaronCareyRepository acr;
	public AaronCareyService(AaronCareyRepository acr) {
		this.acr = acr;
	}
	 // register user and hash their password
    public Admin registerUser(Admin a) {
        String hashed = BCrypt.hashpw(a.getPassword(), BCrypt.gensalt());
        a.setPassword(hashed);
        return acr.save(a);
    }

    // authenticate user
    public boolean authenticateUser(String password) {
        // first find the user by email
        Admin a = acr.findById();
        // if we can't find it by email, return false
        if(a == null) {
            return false;
        } else {
            // if the passwords match, return true, else, return false
            if(BCrypt.checkpw(password, a.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
    }
}
