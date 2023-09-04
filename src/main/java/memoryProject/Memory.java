package memoryProject;


public class Memory {

	/**
	 * used가 max를 넘으면 메모리 부족 오류가 발생한다.
	 */
	private long used; // 사용중인 메모리
	private long max; // 최대 메모리

	public Memory(long used, long max) {
		this.used = used;
		this.max = max;
	}

	public long getUsed() {
		return used;
	}

	public long getMax() {
		return max;
	}

	@Override
	public String toString() {
		return "Memory{" +
				"used=" + used +
				", max=" + max +
				'}';
	}
}
