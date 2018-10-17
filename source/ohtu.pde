class Ohtu{
  int[] his, d;
  int sum, i,j, f,s, max_no, c, cnt,sc, re;
  long data;
  double ave,ave1, max, bu, cl1,cl2;
  
  Ohtu(){
    his = new int[256];
    max_no=256;  re=0;
    ave1=0;
  }

  void draw(){
    background(127);
    img = cam;
//    PImage img = loadImage("data/cap.bmp");
    /* ################################################## */
    img.filter(GRAY);
    img.filter(BLUR,2);
    img.loadPixels(); // 画像の各ピクセルをpixels配列にセット
    d=new int[img.pixels.length];
    for(i=0; i<img.pixels.length; i++) d[i]=(int)red(img.pixels[i]);

    for(sc=0;sc<2;sc++){
      for(i=0;i<256;i++) his[i]=0;
      sum=0; max=0; cnt=0;
      for(j=0; j<img.pixels.length; j++){
        if(d[j]<max_no){ i=d[j]; his[i]++; sum+=i; cnt++; }
//        if(ave>=183 && d[j]<max_no || ave<183 && d[j]>max_no){ i=d[j]; his[i]++; sum+=i; cnt++; }
      }ave=sum/cnt;
      for(i=0;i<256;i++){
        cl1=cl2=0;
        for(cnt=0;cnt<2;cnt++){
          if(cnt==0){ f=0; s=i; }
          else      { f=i; s=256; }
          c=0; data=0; bu=0;
          for(j=f;j<s;j++){ c+=his[j]; data+=his[j]*j; }
          if(c != 0){
            ave1 = (double)data / (double)c; //平均=(データの総和 / 個数)
            for(j=f;j<s;j++) bu+=(j-ave1)*(j-ave1)*his[j]; //分散=(データ-平均値)^2の総和/個数
            bu /= (double)c;
          }
          cl1 += c*bu; //クラス内分散
          cl2 += c*(ave1-ave)*(ave1-ave); //クラス間分散
        }
        cl2 /= cl1;
        if(max < cl2){ max=cl2; max_no=i; }
      }
    }println(max_no); //しきい値

    c=img.pixels.length;
    for(i=0;i<c;i++){ if(d[i]<max_no){d[i]=0;} else{d[i]=255;} }
    if(re==1){ for(i=0;i<c;i++) img.pixels[i-1+img.width-(i%img.width)*2]=color(255-d[i]); }
    else     { for(i=0;i<c;i++) img.pixels[i]=color(d[i]); }
    img.updatePixels();
    /* ################################################## */

    img.save("data/save.bmp");
    image(img, sizeW/2, sizeH/2-ww, capW*sizeH*3/4/capH, sizeH*3/4);
    page++;
  }
}


/* ################################################## */

class OK{
  OK(){}
  
  void draw(){
    
      // :: SAVE ::
      if(mouseX>=sizeW/4-1.7*ww && mouseX<=sizeW/4+1.7*ww && mouseY>=sizeH-ww*3/2 && mouseY<=sizeH-ww*3/2+ww){
        Color(1); //onMouse(1)
        if(mousePressed){
          Color(2);
          cap = img;
          page++;
        } //Click(2)
      }
      else{Color(0);} //Default(0)
      rect(sizeW/4-1.7*ww,sizeH-ww*3/2, 3.4*ww,ww);
      fill(255,255,255);
      noStroke();
      text("ＯＫ", sizeW/4, ww/3+ww/11 + sizeH-ww*3/2);
  }
}
