void Pdf(){
//  String FILEPATH = "C:/Documents and Settings/IBM/My Documents/Processing/main/";
  String FILEPATH = "";
  try {
    OutputStream out = new FileOutputStream(FILEPATH + "data/print.pdf");
    Document doc = new Document(PageSize.A6, 0,0,0,0);
    PdfWriter pdfwriter = PdfWriter.getInstance(doc, out);
    Image img = Image.getInstance(FILEPATH + "data/print.png");
 
    doc.open();
    img.scalePercent(24f);
//    doc.add(new Phrase("300dpi\n\n"));
    doc.add(img); 
    doc.close();
  }
  catch(Exception e){ e.printStackTrace(); }
}
