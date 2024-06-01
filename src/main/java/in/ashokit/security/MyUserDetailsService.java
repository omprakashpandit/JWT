package in.ashokit.security;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService{
	
	@Override
	public UserDetails loadUserByUsername(String s) {
		return new User("om","$2a$12$rxLoGZ/fLby.JdLTppyAl.X4PLzfwgzryor.qH/HpFPU3hVP80HPO",new ArrayList<>());
	}

}
