package class1.ex;

public class MovieReviewMain1 {

    public static void main(String[] args) {
/*      // 영화 리뷰 정보 선언
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한 루프";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화";

        MovieReview[] movieReviews = {movieReview1, movieReview2};

        // 영화 리뷰 정보 출력
        for (MovieReview m : movieReviews) {
            System.out.println("영화 제목: " + '"' + m.title + '"' + ", 리뷰: " + '"' + m.review + '"');
        }
*/

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";

        System.out.println("영화 제목: " + inception.title + ", 리뷰: " + inception.review);
        System.out.println("영화 제목: " + aboutTime.title + ", 리뷰: " + aboutTime.review);
    }
}
