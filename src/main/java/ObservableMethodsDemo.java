import io.reactivex.rxjava3.core.Observable;

public class ObservableMethodsDemo {
    public static void main(String[] args) {
        Observable<String> hello = Observable.just("Hello, World!");
        hello.map(String::toUpperCase).subscribe(System.out::println, // try (on next) handler
                error -> System.out.println("error = " + error), // catch (on error) handler
                () -> System.out.println("Complete")); // finally (on complete) handler
    }
}
