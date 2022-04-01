package dev.norska.rc.data;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Code {

	@Getter @Setter private List<String> commands, commandIDTabComplete;
	@Getter @Setter private List<String> securedToUUIDs, usedByUUIDs, securedUUIDTabComplete;
	@Getter @Setter private int uses;
	@Getter @Setter private Boolean permBased, enabled;
	@Getter @Setter private String expiry;
	
}
