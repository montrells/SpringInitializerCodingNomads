package com.montrell.codingnomadSpringInitializr;

import org.springframework.stereotype.Service;

@Service
public class SuccessService {
        //service at a cross road.
        public String processSuccessStatus(boolean arriving) {
            if (arriving) {
                return "springfundamentals/success";
            } else {
                return "springfundamentals/goodbye";
            }
        }
    }

