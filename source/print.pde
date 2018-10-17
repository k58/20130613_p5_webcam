void Print(){
  try{
//    PDDocument document = PDDocument.load("C:\\Documents and Settings\\IBM\\My Documents\\Processing\\main\\data\\print.pdf");
    PDDocument document = PDDocument.load("data\\print.pdf");
    PrinterJob printJob = PrinterJob.getPrinterJob();
    PrintService service = PrintServiceLookup.lookupDefaultPrintService();
    printJob.setPrintService(service);
    document.silentPrint( printJob );
    document.close();
  }
  catch(IOException e){ e.printStackTrace();}
  catch(PrinterException e){ e.printStackTrace(); }
}
