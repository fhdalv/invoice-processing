package com.invoiceprocessing.server.services;

import com.invoiceprocessing.server.model.Invoice;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceService {

    public Invoice addInvoice(Invoice invoice);
}
