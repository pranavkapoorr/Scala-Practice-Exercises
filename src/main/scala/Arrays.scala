object Arrays{

  def main(args: Array[String]): Unit = {
    //generic
    var array1 = Array(1,2,3,4,5,6,7,8,9,10);
    //from range
    var array2 = Range(1,11);

    for(i<-array1){
      println("generic: "+i);
    }
    for(j<-array2){
      println("range: "+j);
    }
  }
}