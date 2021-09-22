package com.simha.SpringOAuth2Demo2Example;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecureController {
	
	@RequestMapping("/")
	public String test(OAuth2AuthenticationToken token)
	{
		OAuth2User pri = token.getPrincipal();
	
		System.out.println(token.getName());
		System.out.println(token.getCredentials());
		return "secure.html";
	}

}
