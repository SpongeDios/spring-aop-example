package com.dev.hector.aspect.app.services;

import com.dev.hector.aspect.app.anootation.TestAnnotation;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class InvoiceBusinessService {

    public void saveInvoice(){
        System.out.println("From saveInvoice()");
        if(new Random().nextInt(20)<=10) {
            throw new RuntimeException("Exception occured");
        }
    }

    public String helloInvoice() {
        return "FROM helloInvoice()";
    }

    public void testMethodforAroundAdvice() {
        System.out.println("Business Method is getting Executed !");
    }

    @TestAnnotation
    public void testMethodWithAnnotation(){
        System.out.println("FROM testMethodWithAnnotation()");
    }

}
