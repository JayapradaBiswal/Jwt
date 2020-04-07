package com.example.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class JwtUserDetailsService implements UserDetailsService
{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		if("jaya".equals(username))
		{
			return new User("jaya","$2a$10$JnbKXAMJdciXcGcbqrStnuBPoXlT/C6jLwwUuW7kKr23vNO3YykC6",new ArrayList<>());
		}
		else {
			throw new UsernameNotFoundException("User not Found");
		}
	}

}
