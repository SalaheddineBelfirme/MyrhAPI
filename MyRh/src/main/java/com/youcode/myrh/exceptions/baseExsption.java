package com.youcode.myrh.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class baseExsption extends RuntimeException {
    public  baseExsption(String message){ super(message);}

}
