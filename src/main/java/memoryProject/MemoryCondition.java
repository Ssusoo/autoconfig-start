package memoryProject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

@Slf4j
public class MemoryCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// -Dmemory=on
		String memory = context.getEnvironment().getProperty("memory");
		log.info("memory={} : " + memory);

		// 환경 정보에 memory=on일 경우 'true' 반환
		return "on".equals(memory); // memory={} : null
	}
}
