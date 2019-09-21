void setup() {
size(500,500);
}
void draw(){
fill(255,255,255);
ellipse(250,250,100,100);
fill(255,255,0);
triangle(300,200,200,200,255,100);
if(mousePressed){
  fill(255,0,0);
}
ellipse(200,250,50,50);
}
