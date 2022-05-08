package com.dev.hector.aspect.app;

import com.dev.hector.aspect.app.services.InvoiceBusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

    private final InvoiceBusinessService invoiceBusinessService;

    @Override
    public void run(String... args) throws Exception {

        invoiceBusinessService.helloInvoice();
        invoiceBusinessService.testMethodforAroundAdvice();
        invoiceBusinessService.saveInvoice();
        invoiceBusinessService.testMethodWithAnnotation();

    }
}
