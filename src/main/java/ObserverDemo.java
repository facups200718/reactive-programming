import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.List;

public class ObserverDemo {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        Observable<Integer> numbersObservable = Observable.fromArray(numbers);
        numbersObservable.subscribe(System.out::println);

        List<String> flowers = Arrays.asList("Fireweed", "Western Red Lily", "Blue Flag Iris",
                "White Trillium", "Purple Saxifrage", "Mayflower", "Mountain Avens", "Purple Pitcher",
                "Purple Violet", "Prairie Crocus", "Wild Rose");
        Observable<String> flowerObservable = Observable.fromIterable(flowers);
        flowerObservable.subscribe(System.out::println);
        flowerObservable.subscribe(s -> System.out.println(s.toLowerCase()));
        flowerObservable.subscribe(s -> System.out.println(s.toUpperCase()));
    }
}
