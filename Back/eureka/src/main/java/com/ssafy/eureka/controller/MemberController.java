package com.ssafy.eureka.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.eureka.dto.Member;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.ApiResponse;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@Slf4j
@RestController
@RequestMapping("/member")
@Api(value = "eureka")
public class MemberController {
	
	
	@ApiOperation(value = "로그인", notes = "로그인 합니다.")
	@PostMapping("/login")
	public ResponseEntity<Map<String,Object>> memberLogin(@RequestBody Member member, HttpServletResponse res){

		return null;
	}
	
	@ApiOperation(value = "회원 조회", notes = "해당 회원의 정보를 반환합니다.")
	@PostMapping("/info")
	public ResponseEntity<Map<String,Object>> memberInfo(HttpServletRequest req, @RequestBody Member member){

		return null;
	}


//	@ApiOperation(value = "회원 조회", notes = "해당 회원의 정보를 반환합니다.")
//	@GetMapping("/{userid}")
//	private ResponseEntity<Member> memberInfo(@PathVariable("userid") Member member) {
//		return null;
//
//	}
	
	@ApiOperation(value = "비밀번호 찾기", notes = "이메일로 비밀번호를 찾습니다.")
	@GetMapping("/{userid}")
	private ResponseEntity<Object> findPwd() {
		return null;
	}

	@ApiOperation(value = "회원 등록", notes = "입력한 회원 정보를 등록합니다.")
	@PostMapping
	private ResponseEntity<String> memberJoin(@RequestBody Member member) {
		return null;
	}

	@ApiOperation(value = "회원 삭제", notes = "해당 회원의 정보를 삭제합니다.")
	@DeleteMapping("/{userid}")
	private ResponseEntity<String> memberDelete(@PathVariable("userid") String userid) {
		return null;

	}

	@ApiOperation(value = "회원 수정", notes = "입력된 회원 정보로 수정합니다.", response = Member.class)
	@ApiResponses({ @ApiResponse(code = 200, message = "회원 수정 OK"), @ApiResponse(code = 500, message = "서버 에러"),
			@ApiResponse(code = 404, message = "페이지 없어") })
	@PutMapping
	private ResponseEntity<Member> memberModify(@RequestBody Member member) {
		return null;
	}
	

}