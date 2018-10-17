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

  void draw(){
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

