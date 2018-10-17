CaptureDS cam;

class Cam{
  Cam(){}

  void draw(){
    if(cam.available()==true){
      count++;
      if(count==fR/2){
        cam.read();
        image(cam, sizeW/2, sizeH/2-ww, capW*sizeH*3/4/capH, sizeH*3/4);
        count=0;
      }

      // :: SAVE ::
      if(mouseX>=sizeW/2-1.7*ww && mouseX<=sizeW/2+1.7*ww && mouseY>=sizeH-ww*3/2 && mouseY<=sizeH-ww*3/2+ww){
        Color(1); //onMouse(1)
        if(mousePressed){
          Color(2);
//          cam.save("savec.bmp");
          page++;
        } //Click(2)
      }
      else{Color(0);} //Default(0)
      rect(sizeW/2-1.7*ww,sizeH-ww*3/2, 3.4*ww,ww);
      fill(255,255,255);
      noStroke();
      text("撮 影 (数秒間押す)", sizeW/2, ww/3+ww/11 + sizeH-ww*3/2);
    }
  }
}
