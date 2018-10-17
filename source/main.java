import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import processing.video.CaptureDS; 
import java.io.*; 
import java.awt.*; 
import java.awt.image.*; 
import javax.imageio.*; 
import java.util.*; 
import java.awt.geom.AffineTransform; 
import com.itextpdf.text.*; 
import com.itextpdf.text.Image; 
import com.itextpdf.text.pdf.PdfWriter; 
import java.awt.print.*; 
import javax.print.*; 
import org.apache.pdfbox.pdmodel.PDDocument; 
import org.apache.commons.logging.LogFactory; 

import org.apache.pdfbox.util.*; 
import com.itextpdf.text.error_messages.*; 
import org.bouncycastle.asn1.isismtt.ocsp.*; 
import org.apache.pdfbox.pdmodel.interactive.action.*; 
import org.apache.pdfbox.util.operator.pagedrawer.*; 
import org.apache.pdfbox.pdfparser.*; 
import org.bouncycastle.asn1.esf.*; 
import org.bouncycastle.util.test.*; 
import org.bouncycastle.jce.provider.symmetric.*; 
import org.bouncycastle.asn1.sec.*; 
import org.bouncycastle.jce.examples.*; 
import com.itextpdf.text.pdf.hyphenation.*; 
import org.bouncycastle.mail.smime.*; 
import com.ibm.icu.util.*; 
import org.apache.fontbox.cff.charset.*; 
import com.itextpdf.text.xml.simpleparser.handler.*; 
import org.bouncycastle.crypto.agreement.kdf.*; 
import org.bouncycastle.asn1.crmf.*; 
import com.itextpdf.text.pdf.crypto.*; 
import org.apache.pdfbox.pdmodel.markedcontent.*; 
import org.bouncycastle.asn1.isismtt.*; 
import org.apache.pdfbox.pdmodel.graphics.xobject.*; 
import org.bouncycastle.jce.provider.asymmetric.*; 
import com.ibm.icu.math.*; 
import org.bouncycastle.crypto.util.*; 
import org.bouncycastle.voms.*; 
import org.apache.pdfbox.pdmodel.graphics.*; 
import org.apache.pdfbox.encoding.*; 
import org.bouncycastle.crypto.paddings.*; 
import com.itextpdf.text.pdf.events.*; 
import com.itextpdf.text.html.*; 
import org.apache.pdfbox.pdmodel.interactive.action.type.*; 
import org.apache.fontbox.cff.encoding.*; 
import org.apache.pdfbox.pdmodel.common.function.type4.*; 
import org.bouncycastle.jce.provider.*; 
import org.apache.pdfbox.pdmodel.*; 
import org.apache.pdfbox.pdmodel.interactive.viewerpreferences.*; 
import org.apache.pdfbox.util.operator.*; 
import org.bouncycastle.x509.*; 
import org.bouncycastle.i18n.*; 
import org.bouncycastle.mail.smime.util.*; 
import org.bouncycastle.asn1.mozilla.*; 
import org.apache.jempbox.impl.*; 
import com.itextpdf.text.html.simpleparser.*; 
import org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.*; 
import com.itextpdf.awt.geom.gl.*; 
import com.itextpdf.text.pdf.*; 
import org.bouncycastle.math.ec.*; 
import org.bouncycastle.crypto.tls.*; 
import com.itextpdf.text.pdf.fonts.cmaps.*; 
import org.bouncycastle.mail.smime.validator.*; 
import org.apache.pdfbox.pdmodel.graphics.color.*; 
import org.bouncycastle.asn1.pkcs.*; 
import com.itextpdf.text.pdf.collection.*; 
import org.apache.pdfbox.pdmodel.graphics.predictor.*; 
import com.ibm.icu.text.*; 
import org.bouncycastle.ocsp.*; 
import org.apache.pdfbox.pdmodel.common.*; 
import org.bouncycastle.asn1.util.*; 
import org.apache.pdfbox.pdmodel.interactive.form.*; 
import com.itextpdf.awt.geom.misc.*; 
import org.bouncycastle.jce.provider.util.*; 
import org.bouncycastle.crypto.modes.*; 
import com.itextpdf.text.pdf.interfaces.*; 
import org.bouncycastle.crypto.generators.*; 
import org.bouncycastle.asn1.ntt.*; 
import org.bouncycastle.crypto.engines.*; 
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.*; 
import org.bouncycastle.asn1.misc.*; 
import org.bouncycastle.asn1.tsp.*; 
import org.bouncycastle.jce.netscape.*; 
import com.itextpdf.text.log.*; 
import org.bouncycastle.jce.interfaces.*; 
import org.bouncycastle.asn1.gnu.*; 
import org.apache.pdfbox.pdmodel.common.filespecification.*; 
import org.bouncycastle.crypto.encodings.*; 
import org.apache.fontbox.util.*; 
import org.bouncycastle.asn1.x509.sigi.*; 
import com.ibm.icu.lang.*; 
import org.apache.pdfbox.pdmodel.edit.*; 
import org.bouncycastle.crypto.signers.*; 
import com.itextpdf.text.pdf.parser.*; 
import com.itextpdf.text.xml.*; 
import com.itextpdf.text.pdf.internal.*; 
import com.itextpdf.text.io.*; 
import org.apache.pdfbox.pdmodel.graphics.optionalcontent.*; 
import com.itextpdf.text.pdf.fonts.*; 
import com.itextpdf.text.xml.xmp.*; 
import org.bouncycastle.*; 
import com.itextpdf.awt.geom.*; 
import org.apache.jempbox.xmp.pdfa.*; 
import com.ibm.icu.impl.*; 
import org.apache.fontbox.afm.*; 
import org.apache.fontbox.cff.*; 
import org.apache.pdfbox.pdfviewer.*; 
import org.apache.pdfbox.exceptions.*; 
import org.bouncycastle.jce.provider.asymmetric.ec.*; 
import org.bouncycastle.crypto.digests.*; 
import com.itextpdf.text.pdf.draw.*; 
import org.apache.commons.logging.impl.*; 
import org.bouncycastle.asn1.eac.*; 
import org.bouncycastle.asn1.cms.*; 
import org.bouncycastle.asn1.x9.*; 
import org.apache.pdfbox.cos.*; 
import com.itextpdf.text.pdf.languages.*; 
import org.bouncycastle.asn1.cmp.*; 
import org.apache.pdfbox.pdmodel.interactive.measurement.*; 
import org.bouncycastle.util.io.*; 
import org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.*; 
import org.bouncycastle.asn1.nist.*; 
import org.bouncycastle.asn1.smime.*; 
import org.bouncycastle.crypto.macs.*; 
import com.itextpdf.text.pdf.fonts.otf.*; 
import org.bouncycastle.util.encoders.*; 
import org.bouncycastle.i18n.filter.*; 
import org.bouncycastle.jce.exception.*; 
import org.bouncycastle.cms.*; 
import org.apache.pdfbox.pdmodel.common.function.*; 
import org.bouncycastle.crypto.params.*; 
import org.apache.pdfbox.pdmodel.graphics.shading.*; 
import org.bouncycastle.asn1.cms.ecc.*; 
import org.bouncycastle.jce.spec.*; 
import org.apache.pdfbox.pdfwriter.*; 
import org.apache.pdfbox.io.ccitt.*; 
import org.apache.pdfbox.encoding.conversion.*; 
import org.apache.pdfbox.pdmodel.font.*; 
import org.bouncycastle.asn1.cryptopro.*; 
import com.itextpdf.text.pdf.codec.*; 
import org.bouncycastle.mail.smime.handlers.*; 
import org.apache.pdfbox.pdmodel.graphics.pattern.*; 
import org.bouncycastle.x509.util.*; 
import org.bouncycastle.crypto.agreement.*; 
import org.bouncycastle.asn1.*; 
import org.bouncycastle.mail.smime.examples.*; 
import org.apache.pdfbox.filter.*; 
import org.bouncycastle.crypto.examples.*; 
import org.apache.fontbox.ttf.*; 
import org.bouncycastle.crypto.prng.*; 
import org.bouncycastle.asn1.teletrust.*; 
import org.apache.fontbox.cmap.*; 
import org.bouncycastle.asn1.oiw.*; 
import com.itextpdf.text.exceptions.*; 
import org.bouncycastle.util.*; 
import com.itextpdf.text.pdf.security.*; 
import org.bouncycastle.x509.extension.*; 
import org.apache.pdfbox.encryption.*; 
import org.bouncycastle.asn1.x509.*; 
import org.bouncycastle.crypto.*; 
import org.apache.pdfbox.io.*; 
import org.bouncycastle.mozilla.*; 
import org.apache.pdfbox.pdmodel.documentinterchange.prepress.*; 
import org.bouncycastle.sasn1.*; 
import org.bouncycastle.asn1.x500.*; 
import org.apache.pdfbox.*; 
import com.itextpdf.text.pdf.qrcode.*; 
import org.bouncycastle.openssl.*; 
import com.ibm.icu.impl.duration.*; 
import org.bouncycastle.asn1.ocsp.*; 
import com.ibm.icu.impl.duration.impl.*; 
import org.apache.fontbox.encoding.*; 
import org.bouncycastle.crypto.modes.gcm.*; 
import org.bouncycastle.crypto.agreement.srp.*; 
import org.apache.pdfbox.persistence.util.*; 
import org.bouncycastle.jce.*; 
import org.apache.fontbox.pfb.*; 
import com.itextpdf.awt.*; 
import org.apache.pdfbox.pdmodel.encryption.*; 
import org.apache.pdfbox.pdmodel.interactive.annotation.*; 
import org.apache.pdfbox.pdmodel.interactive.digitalsignature.*; 
import com.itextpdf.text.api.*; 
import org.bouncycastle.sasn1.cms.*; 
import org.apache.pdfbox.pdmodel.text.*; 
import org.bouncycastle.asn1.x509.qualified.*; 
import org.bouncycastle.asn1.kisa.*; 
import org.bouncycastle.x509.examples.*; 
import com.itextpdf.text.factories.*; 
import org.bouncycastle.asn1.microsoft.*; 
import org.bouncycastle.crypto.io.*; 
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.*; 
import org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.*; 
import com.itextpdf.text.*; 
import org.bouncycastle.asn1.isismtt.x509.*; 
import com.ibm.icu.impl.data.*; 
import com.itextpdf.text.pdf.codec.wmf.*; 
import org.bouncycastle.asn1.icao.*; 
import org.apache.pdfbox.pdmodel.fdf.*; 
import org.bouncycastle.asn1.iana.*; 
import org.apache.commons.logging.*; 
import org.apache.jempbox.xmp.*; 
import org.apache.pdfbox.pdmodel.interactive.pagenavigation.*; 
import org.bouncycastle.asn1.ess.*; 
import com.itextpdf.text.xml.simpleparser.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class main extends PApplet {

int sizeW=880, sizeH=660, fR=24,count;
int capW=1600, capH=1200;
//int capW=640, capH=480;
int tmpX, tmpY, capX, capY;
int page=2;

PImage cap, tmp, img;
PFont font;
Cam ca;
Ohtu oh;   OK ok;
Panel pn;  CtrlBtn ct;

public void setup(){
  size(sizeW,sizeH); //windowSize
  frameRate(fR);
  font = loadFont("limited-mplus-1mn-regular-22.vlw");
  textFont(font, 18);
  textAlign(CENTER,CENTER);

  strokeJoin(BEVEL);
  ellipseMode(CENTER);
  imageMode(CENTER);
//  cap =loadImage("data/BLUR.bmp");
  cam = new CaptureDS(this, capW, capH, 2);
  tmp =loadImage("template/tatecard.png");
  tmpX = tmp.width; tmpY = tmp.height;
  capX = capW; capY = capH;
  
  ca = new Cam();
  oh = new Ohtu();   ok = new OK();
  pn = new Panel();  ct = new CtrlBtn(sizeW/8*7,sizeH/16); //(x,y, width)
}

public void draw(){
  if(page==2){ background(127); count=0; page++; }
  if(page==3){ ca.draw(); }
  if(page==4){ oh.draw(); }
  if(page==5){ ok.draw(); }
  if(page==6){
    background(207);
    pn.draw(); //Image preview & Background
    ct.draw(); //Control Button
  }
}

int cap_X=0, cap_Y=0, cap_W=12, rot=0;
int ww=sizeW/16;

public void Counter(char way){
  if(way=='u'){ if(count==0 && cap_Y > sizeH*3/4*(-1)){cap_Y-=8;} }
  if(way=='d'){ if(count==0 && cap_Y < sizeH*3/4)     {cap_Y+=8;} }
  if(way=='o'){ if(count==0){rot++; if(rot>3){rot=0;}} }
  if(way=='l'){ if(count==0 && cap_X > sizeW/2*(-1))  {cap_X-=8;} }
  if(way=='r'){ if(count==0 && cap_X < sizeW/2)       {cap_X+=8;} }
  
  if(count==fR/2-1){count=0;} else{count++;}
}

public void Counter2(char way){
  if(way=='p'){ if(count==0 && cap_W < 21){cap_W++;} }
  if(way=='m'){ if(count==0 && cap_W > 9) {cap_W--;} }
  
  if(count==fR/2-1){count=0;} else{count++;}
}

// ###################################

class CtrlBtn{ //Control Button
  int xx,yy, sp, root, cenY,cenX, topY,btmY,lefX,rigX;
  int saveY;

  CtrlBtn(int x, int y){
    xx = x-ww/2;
    yy = y;
    count=0;

    sp = PApplet.parseInt(ww * 1.2f + 0.5f);
    root = PApplet.parseInt(ww/4 * 1.732f + 0.5f);
    cenY = ww/2 + xx;
    cenX = ww/2 + yy + sp;
    topY = cenX - root/2 - ww/24;
    btmY = cenX + root/2 + ww/24;
    lefX = cenY - root/2 - ww/24;
    rigX = cenY + root/2 + ww/24;
    
    saveY = sizeH - sizeH/6 - 5;
  }

  public void draw(){
    strokeWeight(3);
    
    // :: UP ::
    if(mouseX>=xx && mouseX<=xx+ww && mouseY>=yy && mouseY<=yy+ww || keyPressed && keyCode==UP){
      Color(1); //onMouse(1)
      if(mousePressed || keyPressed && keyCode==UP){ Color(2); Counter('u'); } //Click(2)
    } else{Color(0);} //Default(0)
    rect(xx,yy, ww,ww);

    // :: DOWN ::
    if(mouseX>=xx && mouseX<=xx+ww && mouseY>=yy+sp*2 && mouseY<=yy+ww+sp*2 || keyPressed && keyCode==DOWN){
      Color(1); //onMouse(1)
      if(mousePressed || keyPressed && keyCode==DOWN){ Color(2); Counter('d'); } //Click(2)
    } else{Color(0);} //Default(0)
    rect(xx,yy+sp*2, ww,ww);

    // :: ROTATE ::
    if(dist(cenY,cenX, mouseX,mouseY) <= ww*0.45f || keyPressed && key=='r'){
      Color(0); //onMouse(1)
//      if(mousePressed || keyPressed && key=='r'){ Color(2); Counter('o'); } //Click(2)
    } else{Color(0);} //Default(0)
     ellipse(cenY,cenX, ww*0.9f,ww*0.9f);

    // :: LEFT ::
    if(mouseX>=xx-sp && mouseX<=xx+ww-sp && mouseY>=yy+sp && mouseY<=yy+ww+sp || keyPressed && keyCode==LEFT){
      Color(1); //onMouse(1)
      if(mousePressed || keyPressed && keyCode==LEFT){ Color(2); Counter('l'); } //Click(2)
    } else{Color(0);} //Default(0)
     rect(xx-sp,yy+sp, ww,ww);

    // :: RIGHT ::
    if(mouseX>=xx+sp && mouseX<=xx+ww+sp && mouseY>=yy+sp && mouseY<=yy+ww+sp || keyPressed && keyCode==RIGHT){
      Color(1); //onMouse(1)
      if(mousePressed || keyPressed && keyCode==RIGHT){ Color(2); Counter('r'); } //Click(2)
    } else{Color(0);} //Default(0)
    rect(xx+sp,yy+sp, ww,ww);
    
    if(mousePressed==false && keyPressed==false){ count=0; }
    
    
    // :: + ::
    if(mouseX>=cenY-1.7f*ww && mouseX<=cenY+1.7f*ww && mouseY>=saveY-sp*2 && mouseY<=saveY+ww-sp*2 || keyPressed && key=='+'){
      Color(1); //onMouse(1)
      if(mousePressed || keyPressed && key=='+'){Color(2); Counter2('p');} //Click(2)
    }
    else{Color(0);} //Default(0)
    rect(cenY-1.7f*ww,saveY-sp*2, 3.4f*ww,ww);
    
    // :: - ::
    if(mouseX>=cenY-1.7f*ww && mouseX<=cenY+1.7f*ww && mouseY>=saveY-sp && mouseY<=saveY+ww-sp || keyPressed && key=='-'){
      Color(1); //onMouse(1)
      if(mousePressed || keyPressed && key=='-'){Color(2); Counter2('m');} //Click(2)
    }
    else{Color(0);} //Default(0)
    rect(cenY-1.7f*ww,saveY-sp, 3.4f*ww,ww);
    
    
    // :: SAVE ::
    if(mouseX>=cenY-1.7f*ww && mouseX<=cenY+1.7f*ww && mouseY>=saveY && mouseY<=saveY+ww){
      Color(1); //onMouse(1)
      if(mousePressed){
        Color(2);
        SvPNG( PApplet.parseInt(cap_W*capX/20)-PApplet.parseInt(cap_X*100/per), PApplet.parseInt(cap_W*capY/20)-PApplet.parseInt(cap_Y*100/per) );
        Pdf();
        Print();
        page=2;
      } //Click(2)
    }
    else{Color(0);} //Default(0)
    rect(cenY-1.7f*ww,saveY, 3.4f*ww,ww);
    

    fill(255,255,255);
    noStroke();
    triangle(cenY, topY-sp, cenY-ww/4, topY+root-sp, cenY+ww/4, topY+root-sp);
    triangle(cenY, btmY+sp, cenY-ww/4, btmY-root+sp, cenY+ww/4, btmY-root+sp);
    triangle(lefX-sp, cenX, lefX+root-sp, cenX-ww/4, lefX+root-sp, cenX+ww/4);
    triangle(rigX+sp, cenX, rigX-root+sp, cenX-ww/4, rigX-root+sp, cenX+ww/4);
//    textAlign(CENTER,CENTER);
    text("\uff0b", cenY, ww/3+ww/11 + saveY-sp*2);
    text("\uff0d", cenY, ww/3+ww/11 + saveY-sp);
    text("\u4fdd\u5b58\u30fb\u5370\u5237", cenY, ww/3+ww/11 + saveY);
  }
}

float per;

class Panel{ //Image preview & Background
  int line, tx,ty, tw,th, cw;
  
  Panel(){
    line = sizeH/44;
    
    tx = sizeW/8*3 + line/2;
    ty = sizeH/2 - line/2*3;
    tw = sizeW/4*3 - line*3;
    th = tmpY;
  }

  public void draw(){
    noFill();
    stroke(0);
    strokeWeight(1);
    rectMode(CENTER);
    
    if(tmpX > tw){
      th = tmpY*tw/tmpX;
      per = 100*tw/tmpX;
    }
    if(th > sizeH-line*7){
      th = sizeH - line*7;
      tw = tmpX*th/tmpY;
      per = 100*th/tmpY;
    }
    
    translate(tx+cap_X,ty+cap_Y);
    rotate(PI*rot/2);
    image(cap, 0,0, capX*cap_W*per/1000,capY*cap_W*per/1000);
    rotate(PI*rot/2*(-1));
    translate(-tx-cap_X,-ty-cap_Y);
    
    image(tmp, tx,ty, tw,th);
    rect(tx,ty, tw,th);
    
    fill(0,55);
    noStroke();
    rectMode(CORNER);
    if(tw != tw/2*2){ tw++; }
    if(th != th/2*2){ th++; }
    rect(0,0, sizeW/4*3,ty-th/2);       //top
    rect(0,ty+th/2, sizeW/4*3,ty-th/2); //bottom
    rect(0,ty-th/2, tx-tw/2,th);        //left
    rect(tx+tw/2,ty-th/2 ,tx-tw/2,th);  //right
    
    fill(127);
    rect(0,0, sizeW,line);              //top
    rect(0,0, line,sizeH);              //left
    rect(0,sizeH-line*4, sizeW,line*4); //bottom
    rect(sizeW/4*3,0, sizeW/4,sizeH);   //right
  }
}

CaptureDS cam;

class Cam{
  Cam(){}

  public void draw(){
    if(cam.available()==true){
      count++;
      if(count==fR/2){
        cam.read();
        image(cam, sizeW/2, sizeH/2-ww, capW*sizeH*3/4/capH, sizeH*3/4);
        count=0;
      }

      // :: SAVE ::
      if(mouseX>=sizeW/2-1.7f*ww && mouseX<=sizeW/2+1.7f*ww && mouseY>=sizeH-ww*3/2 && mouseY<=sizeH-ww*3/2+ww){
        Color(1); //onMouse(1)
        if(mousePressed){
          Color(2);
//          cam.save("savec.bmp");
          page++;
        } //Click(2)
      }
      else{Color(0);} //Default(0)
      rect(sizeW/2-1.7f*ww,sizeH-ww*3/2, 3.4f*ww,ww);
      fill(255,255,255);
      noStroke();
      text("\u64ae \u5f71 (\u6570\u79d2\u9593\u62bc\u3059)", sizeW/2, ww/3+ww/11 + sizeH-ww*3/2);
    }
  }
}
public void Color(int state){
  if(state==0){ fill(2,52,77);   stroke(2,52,77); }   //Default(0)
  if(state==1){ fill(1,108,158); stroke(1,108,158); } //onMouse(1)
  if(state==2){ fill(0,180,234); stroke(0,180,234); } //Click(2)
}



















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

  public void draw(){
    background(127);
    img = cam;
//    PImage img = loadImage("data/cap.bmp");
    /* ################################################## */
    img.filter(GRAY);
    img.filter(BLUR,2);
    img.loadPixels(); // \u753b\u50cf\u306e\u5404\u30d4\u30af\u30bb\u30eb\u3092pixels\u914d\u5217\u306b\u30bb\u30c3\u30c8
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
            ave1 = (double)data / (double)c; //\u5e73\u5747=(\u30c7\u30fc\u30bf\u306e\u7dcf\u548c / \u500b\u6570)
            for(j=f;j<s;j++) bu+=(j-ave1)*(j-ave1)*his[j]; //\u5206\u6563=(\u30c7\u30fc\u30bf-\u5e73\u5747\u5024)^2\u306e\u7dcf\u548c/\u500b\u6570
            bu /= (double)c;
          }
          cl1 += c*bu; //\u30af\u30e9\u30b9\u5185\u5206\u6563
          cl2 += c*(ave1-ave)*(ave1-ave); //\u30af\u30e9\u30b9\u9593\u5206\u6563
        }
        cl2 /= cl1;
        if(max < cl2){ max=cl2; max_no=i; }
      }
    }println(max_no); //\u3057\u304d\u3044\u5024

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
  
  public void draw(){
    
      // :: SAVE ::
      if(mouseX>=sizeW/4-1.7f*ww && mouseX<=sizeW/4+1.7f*ww && mouseY>=sizeH-ww*3/2 && mouseY<=sizeH-ww*3/2+ww){
        Color(1); //onMouse(1)
        if(mousePressed){
          Color(2);
          cap = img;
          page++;
        } //Click(2)
      }
      else{Color(0);} //Default(0)
      rect(sizeW/4-1.7f*ww,sizeH-ww*3/2, 3.4f*ww,ww);
      fill(255,255,255);
      noStroke();
      text("\uff2f\uff2b", sizeW/4, ww/3+ww/11 + sizeH-ww*3/2);
  }
}
public void Pdf(){
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
public void Print(){
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
public void SvPNG(int x, int y){
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
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "main" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
