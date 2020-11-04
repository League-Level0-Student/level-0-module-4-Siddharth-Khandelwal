
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
boolean canPlaySounds = false;
PImage waldo;
void setup() {
  
  //Find a Where's Waldo picture and drop it into this sketch.     
  waldo = loadImage("waldo2.jpg"); // Change this to match your file name.
  size(600, 400); 
  // Resize your waldo picture to the same size as the sketch
  waldo.resize(600,400);
  // Make the waldo image your sketch background

}

void draw() {
background(waldo);
      // If the user presses the mouse .......
  if(mousePressed){
          // Use this print statement to help you find the location of Waldo to use in the code below
           println("X: " + mouseX + " Y: " + mouseY); 
  
          //min = 369, 200
          //max = 418, 280
          // Check if the location of the mouse is anywhere on the image of Waldo.
          if (mouseX >= 369 && mouseX <= 418 && mouseY >= 200 && mouseY <= 280){
         
          // If it is, print “Waldo found!”  Use the text() command to write it on the sketch.
         fill(0);
         text("You found Waldo!",350,189);
        
                if (canPlaySounds) {
                    // Use the playWhoohoo() method below. You can change the sound if you want 
                } 
  
          // However, if the mouse is not on Waldo, print "Not here!" 
          // Use the text() command to write it on the sketch. 
          
                if (canPlaySounds) {
                    // Use the playDoh() method below. You can change the sound if you want 
                }       
}  
else{
fill(0);
  text("This is not Waldo, try again.",241,181);


}
}
}

/*********************  This code is needed to play sounds. ********************
              Remove the comment markers below, but DON'T CHANGE THE CODE */
              

/*
import ddf.minim.*;
Minim minim = new Minim(this); 

AudioSample woohoo;
void playWoohoo() {
     if (woohoo == null) 
         woohoo = minim.loadSample("homer-woohoo.wav");
     woohoo.stop();
     woohoo.trigger();
}

AudioSample doh;
void playDoh() {
     if (doh == null)
         doh = minim.loadSample("homer-doh.wav"); 
     doh.stop();
     doh.trigger();
}
*/
