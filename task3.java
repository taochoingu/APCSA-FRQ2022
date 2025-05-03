import java.util.*;

class Review{
  /*private int rating;
  private String comment;
  public Review(int r,String c){
    rating = r;
    comment = c;
  }
  public int getRating(){
    return rating;
  }
  public String getComment(){
    return comment;
  }*/
}
public class ReviewAnalysis{
  /*private Review[] allReviews;
  public ReviewAnalysis(){
    allReviews = new Review[];
  }
  */
  //a
  public double getAverageRating(){
    int sum =0;
    for(int i =0;i<allReviews.length;i++){
      sum+=allReviews[i].getRating();
    }
    return 1.0*sum/allReviews.length;
  }
  //b
  public ArrayList<String> collectComments(){
    ArrayList<String> arr = new ArrayList<String>();
    for(int i = 0;i<allReviews.length;i++){
      if(allReviews[i].getComment().indexOf("!")!= -1){
        if(allReviews[i].getComment().substring(allReviews[i].getComment().length()-1,allReviews[i].getComment().length())!="!"||allReviews[i].getComment().substring(allReviews[i].getComment().length()-1,allReviews[i].getComment().length())!=".")
        arr.add(allReviews[i].getRating()+"-"+allReviews[i].getComment()+".");
        else arr.add(allReviews[i].getRating()+"-"+allReviews[i].getComment());
      }
      
    }
    return arr;
  }
  /*public static void main(String[] args){
    
  }*/
  
}
