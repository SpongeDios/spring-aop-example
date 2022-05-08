package com.dev.hector.aspect.app.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class InvoiceAspect {

    @Pointcut("execution(public void com.dev.hector.aspect.app.services.InvoiceBusinessService.saveInvoice())")
    public void p1() {

    }

    @Pointcut("execution(public String com.dev.hector.aspect.app.services.InvoiceBusinessService.helloInvoice())")
    public void p2() {

    }

    @Pointcut("@annotation(com.dev.hector.aspect.app.anootation.TestAnnotation)")
    public void p3(){

    }


    @Pointcut("execution(* com.dev.hector.aspect.app.services.InvoiceBusinessService.testMethodforAroundAdvice())")
    public void p4() {

    }

    @Before("p1()")
    public void beginTransaction() {
        System.out.println("Transaction begins !");
    }

    @After("p1()")
    public void completeTransaction() {
        System.out.println("Transaction completes !");
    }

    @AfterReturning("p1()")
    public void commitTransaction() {
        System.out.println("Transaction committed !");
    }

    @AfterThrowing("p1()")
    public void rollbackTransaction() {
        System.out.println("Transaction rolled back !");
    }

    @AfterReturning(value="p2()", returning = "obj")
    public void getAdviceReturnValue(Object obj) {
        System.out.println("Returning Value is : "+obj);
        System.out.println("Desde el AFTERRETURNING");
    }

    @AfterThrowing(value="p1()", throwing = "th")
    public void rollbackTransactionGetMessage(Throwable th) {
        System.out.println("Transaction rolled back ! Message from method : "+th);
    }


    @Around("p4()")
    public void testAroundAdvice(ProceedingJoinPoint pj) throws Throwable {

        System.out.println("Executing Before part of business method");

        pj.proceed();  // this code will call business method

        System.out.println("Executing After part of business method");
    }

    @Before("p3()")
    public void testAnnotatedMethod(){
        System.out.println(" From testAnnotateMethod() AOPPPPP");
    }

}
