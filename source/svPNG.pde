void SvPNG(int x, int y){
  try{
    BufferedImage i = ImageIO.read(new File("data/save.bmp"));
    BufferedImage c = ImageIO.read(new File("template/tatecard.png"));
//    BufferedImage i = ImageIO.read(new File("C:/Documents and Settings/IBM/My Documents/Processing/main/data/save.bmp"));
//    BufferedImage c = ImageIO.read(new File("C:/Documents and Settings/IBM/My Documents/Processing/main/template/tatecard.png"));
    BufferedImage bg = new BufferedImage(c.getWidth(), c.getHeight(), BufferedImage.TYPE_INT_RGB);
    
    BufferedImage resize_i = new BufferedImage(i.getWidth()*cap_W/10, i.getHeight()*cap_W/10, i.getType());
    AffineTransform at = AffineTransform.getScaleInstance((double)cap_W/10, (double)cap_W/10);
    AffineTransformOp ato = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
    ato.filter(i, resize_i);
    
    Graphics2D gr = bg.createGraphics();
    gr.setBackground(Color.white);
    gr.clearRect(0, 0, bg.getWidth(), bg.getHeight());
    gr.drawImage(resize_i, tmpX/2-x,tmpY/2-y, null);
    gr.drawImage(c, 0,0, null);
    gr.dispose();
    ImageIO.write(bg, "png", new File("card/"+year()+month()+day()+hour()+minute()+second()+".png"));
    ImageIO.write(bg, "png", new File("data/print.png"));
//    ImageIO.write(bg, "png", new File("C:/Documents and Settings/IBM/My Documents/Processing/main/card/"+year()+month()+day()+hour()+minute()+second()+".png"));
//    ImageIO.write(bg, "png", new File("C:/Documents and Settings/IBM/My Documents/Processing/main/data/print.png"));
  }catch(Exception e){
    println(e.getMessage());
  }
}
