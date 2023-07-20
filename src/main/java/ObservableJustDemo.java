import io.reactivex.rxjava3.core.Observable;
import lombok.AllArgsConstructor;

@AllArgsConstructor
class Point {
    int x, y;
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
public class ObservableJustDemo {
    public static void main(String[] args) {
        Observable<Point> points = Observable.just(new Point(1, 2), new Point(2, 3)
                , new Point(4, 5));
        points.subscribe(System.out::println);
    }
}
