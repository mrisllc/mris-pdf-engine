package com.mris.pdf.engine.api
interface PdfEngine : AutoCloseable { fun open(source: String): PdfDocumentHandle }
