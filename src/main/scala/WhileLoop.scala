object WhileLoop{

  def main(args: Array[String]): Unit = {
    val reqVal = 10;
    var count = 0;
    while( count<=reqVal ){
      println( "count: "+ count );
      count += 1;
    }
  }
}