package com.springboot.springboot2webservice.domain.member.service;

import com.springboot.springboot2webservice.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService implements UserDetailsService {

    private final MemberRepository memberRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Member member = memberRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("아이디가 없습니다"));

        return User.builder().username(member.getUsername())
                .password(member.getPassword())
                .roles(member.getRole().name())
                .build();
    }

}