package com.samadhan.service;

import com.samadhan.entity.Login;
import com.samadhan.exception.ConflictException;
import com.samadhan.repository.LoginRepo;
import com.samadhan.request.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GaadiService {

    @Autowired
    private LoginRepo loginRepo;

    public String login(LoginRequest loginRequest) throws Exception {
        try {
            Login login = loginRepo.findById(loginRequest.mobile).orElseThrow(() -> new Exception("user not found"));
            if(login.getOtp().equalsIgnoreCase(loginRequest.otp)) return "success";
            else throw new Exception("wrong otp");
        } catch (Exception exp) {
            //log error
            return exp.getMessage();
        }

    }

}
