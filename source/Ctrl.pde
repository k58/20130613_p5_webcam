int cap_X=0, cap_Y=0, cap_W=12, rot=0;
int ww=sizeW/16;

void Counter(char way){
  if(way=='u'){ if(count==0 && cap_Y > sizeH*3/4*(-1)){cap_Y-=8;} }
  if(way=='d'){ if(count==0 && cap_Y < sizeH*3/4)     {cap_Y+=8;} }
  if(way=='o'){ if(count==0){rot++; if(rot>3){rot=0;}} }
  if(way=='l'){ if(count==0 && cap_X > sizeW/2*(-1))  {cap_X-=8;} }
  if(way=='r'){ if(count==0 && cap_X < sizeW/2)       {cap_X+=8;} }
  
  if(count==fR/2-1){count=0;} else{count++;}
}

void Counter2(char way){
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

    sp = int(ww * 1.2 + 0.5);
    root = int(ww/4 * 1.732 + 0.5);
    cenY = ww/2 + xx;
    cenX = ww/2 + yy + sp;
    topY = cenX - root/2 - ww/24;
    btmY = cenX + root/2 + ww/24;
    lefX = cenY - root/2 - ww/24;
    rigX = cenY + root/2 + ww/24;
    
    saveY = sizeH - sizeH/6 - 5;
  }

  void draw(){
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
    if(dist(cenY,cenX, mouseX,mouseY) <= ww*0.45 || keyPressed && key=='r'){
      Color(0); //onMouse(1)
//      if(mousePressed || keyPressed && key=='r'){ Color(2); Counter('o'); } //Click(2)
    } else{Color(0);} //Default(0)
     ellipse(cenY,cenX, ww*0.9,ww*0.9);

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
    if(mouseX>=cenY-1.7*ww && mouseX<=cenY+1.7*ww && mouseY>=saveY-sp*2 && mouseY<=saveY+ww-sp*2 || keyPressed && key=='+'){
      Color(1); //onMouse(1)
      if(mousePressed || keyPressed && key=='+'){Color(2); Counter2('p');} //Click(2)
    }
    else{Color(0);} //Default(0)
    rect(cenY-1.7*ww,saveY-sp*2, 3.4*ww,ww);
    
    // :: - ::
    if(mouseX>=cenY-1.7*ww && mouseX<=cenY+1.7*ww && mouseY>=saveY-sp && mouseY<=saveY+ww-sp || keyPressed && key=='-'){
      Color(1); //onMouse(1)
      if(mousePressed || keyPressed && key=='-'){Color(2); Counter2('m');} //Click(2)
    }
    else{Color(0);} //Default(0)
    rect(cenY-1.7*ww,saveY-sp, 3.4*ww,ww);
    
    
    // :: SAVE ::
    if(mouseX>=cenY-1.7*ww && mouseX<=cenY+1.7*ww && mouseY>=saveY && mouseY<=saveY+ww){
      Color(1); //onMouse(1)
      if(mousePressed){
        Color(2);
        SvPNG( int(cap_W*capX/20)-int(cap_X*100/per), int(cap_W*capY/20)-int(cap_Y*100/per) );
        Pdf();
        Print();
        page=2;
      } //Click(2)
    }
    else{Color(0);} //Default(0)
    rect(cenY-1.7*ww,saveY, 3.4*ww,ww);
    

    fill(255,255,255);
    noStroke();
    triangle(cenY, topY-sp, cenY-ww/4, topY+root-sp, cenY+ww/4, topY+root-sp);
    triangle(cenY, btmY+sp, cenY-ww/4, btmY-root+sp, cenY+ww/4, btmY-root+sp);
    triangle(lefX-sp, cenX, lefX+root-sp, cenX-ww/4, lefX+root-sp, cenX+ww/4);
    triangle(rigX+sp, cenX, rigX-root+sp, cenX-ww/4, rigX-root+sp, cenX+ww/4);
//    textAlign(CENTER,CENTER);
    text("＋", cenY, ww/3+ww/11 + saveY-sp*2);
    text("－", cenY, ww/3+ww/11 + saveY-sp);
    text("保存・印刷", cenY, ww/3+ww/11 + saveY);
  }
}

