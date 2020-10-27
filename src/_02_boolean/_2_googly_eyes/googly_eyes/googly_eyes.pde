PImage face;
void setup(){
size(800,600);
face = loadImage("eyes.jpeg");
face.resize(width,height);
  
}

void draw() {
  image(face, 0, 0);
  
  println(mouseX + "   " + mouseY);
  
fill(255);
 ellipse(407,151,140,150);
ellipse(307,130,120,150);
if(mouseX < 360){
  mouseX = 360; 
}
if(mouseX > 460){
  mouseX = 460; 
}
if(mouseY < 100){
  mouseY = 100; 
}
if(mouseY > 201){
  mouseY = 201; 
}

fill(0);
ellipse(mouseX,mouseY,50,50);
ellipse(mouseX-100,mouseY,50,50);
}
