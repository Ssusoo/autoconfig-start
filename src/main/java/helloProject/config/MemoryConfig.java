package helloProject.config;

import memoryProject.MemoryCondition;
import memoryProject.MemoryController;
import memoryProject.MemoryFinder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 외부 메모리 프로젝트를 내부 헬로 프로젝트에서 사용할 경우
 * 빈으로 등록해서 사용해야한다.
 *
 * Configuration을 단독으로 사용하기에 '설정'이라고 정의내리자.
 * AutoConfiguration의 경우 '자동 구성' 혹은 '자동 설정'으로 명명해보자.
 */
@Configuration
/**
 * @Conditional 어노테이션
 *  Conditional의 MemCondition.class가 true면
 *  아래 MemoryConfig 동작한다.
 */
@Conditional(MemoryCondition.class)
public class MemoryConfig {
	/**
	 * 내부 헬로 프로젝트에서 외부 메모리 프로젝트를 사용하고 싶은 경우
	 * 내부 프로젝트의 빈으로 등록해야 사용할 수 있다.
	 * @return
	 */
	@Bean
	public MemoryController memoryController() {
		return new MemoryController(memoryFinder());
	}

	/**
	 * 내부 헬로 프로젝트에서 외부 메모리 프로젝트를 사용하고 싶은 경우
	 * 내부 프로젝트의 빈으로 등록해야 사용할 수 있다.
	 * @return
	 */
	@Bean
	public MemoryFinder memoryFinder() {
		return new MemoryFinder();
	}
}
