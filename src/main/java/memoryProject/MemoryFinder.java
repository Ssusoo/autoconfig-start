package memoryProject;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

/**
 * JVM에서 메모리 정보를 조회하는 기능
 */
@Slf4j
public class MemoryFinder {

	public Memory get() {
		long maxMemory = Runtime.getRuntime().maxMemory();
		long totalMemory = Runtime.getRuntime().totalMemory();
		long freeMemory = Runtime.getRuntime().freeMemory();

		// 현재 사용중인 메모리
		long used = totalMemory - freeMemory;
		return new Memory(used, maxMemory);
	}

	/**
	 * 빈 등록 로그
	 */
	@PostConstruct
	public void init() {
		log.info("init memoryFinder");
	}
}
