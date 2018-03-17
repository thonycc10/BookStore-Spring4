package security;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rol implements Serializable {

	private static final long serialVersionUID = 123321123L;
	
	@Id
	private int roleId;
	private String name;
	private Set<UserRole> userRoles = new HashSet<>();
	
	// CONSTRUCTOR
	public Rol() {	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	// GET Y SETTERS
	
	
}
