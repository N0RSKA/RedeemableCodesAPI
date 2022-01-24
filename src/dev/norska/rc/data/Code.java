package dev.norska.rc.data;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Code {

	@Getter @Setter private List<String> commands;
	@Getter @Setter private List<String> securedToUUIDs, usedByUUIDs;
	@Getter @Setter private int uses;
	@Getter @Setter private Boolean permBased;
	
}
