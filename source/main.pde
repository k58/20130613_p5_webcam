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

void setup(){
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

void draw(){
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

