import io.reactivex.rxjava3.core.Observable;

public class ObservableExercise {
    public static void main(String[] args) {
        String[] names = {"James", "Jane", "Bob", "Mary"};
        Observable<String> namesObservable = Observable.fromArray(names);
        namesObservable.map(n -> {
            if (n.length() < 4)
                throw new Exception("Name too short");
            return n.toUpperCase();
        }).subscribe(System.out::println,
                error -> System.out.println("error = " + error),
                () -> System.out.println("Complete"));
    }
}
