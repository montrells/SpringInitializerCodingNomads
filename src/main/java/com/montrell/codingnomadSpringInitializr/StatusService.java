package com.montrell.codingnomadSpringInitializr;

import org.springframework.stereotype.Service;

@Service
public class StatusService {
//service at a cross road.
    public String processStatus(boolean arriving) {
        if (arriving) {
            return "springfundamentals/hello";
        } else {
            return "springfundamentals/goodbye";
        }
    }
}
