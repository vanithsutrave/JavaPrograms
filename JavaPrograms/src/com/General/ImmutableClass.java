//a. Write an Immutable class.

package com.General;

public final class ImmutableClass {
	
	private final String id;

	public ImmutableClass(String id){
		
		this.id = id;
	}

	public String getId() {
		return id;
	}	

}
