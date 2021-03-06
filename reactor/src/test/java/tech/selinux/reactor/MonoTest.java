package tech.selinux.reactor;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoTest {

	@Test
	public void monoTest01(){
		Mono<String> noData = Mono.empty();

		Mono<String> data = Mono.just("foo");

		Flux<Integer> numbersFromFiveToSeven = Flux.range(5, 3);

		noData.subscribe();
		data.subscribe();
		numbersFromFiveToSeven.subscribe(System.out::println);
	}
}
