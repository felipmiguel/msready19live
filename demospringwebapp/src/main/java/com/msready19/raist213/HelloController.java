package com.msready19.raist213;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    String hello() {
        return "Hello World!";
    }

    @Data
    static class Result {
        public Result(int left, int right, int answer) {
            this.left = left;
            this.right = right;
            this.answer = answer;
        }

        public long getAnswer() {
            return answer;
        }

        public int getRight() {
            return right;
        }

        public int getLeft() {
            return left;
        }

        private final int left;
        private final int right;
        private final long answer;
    }

    // SQL sample
    @RequestMapping("calc")
    Result calc(@RequestParam int left, @RequestParam int right) {

        Result r = new Result(left, right, right + left);
        return r;
    }
}
