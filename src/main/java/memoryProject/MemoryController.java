package memoryProject;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MemoryController {

	private final MemoryFinder memoryFinder;

	@GetMapping("/memory")
	public Memory system() {
		Memory memory = memoryFinder.get();
		log.info("memory={} : " + memory); // Memory{used=24333952, max=8589934592}
		return memory;
	}
}
