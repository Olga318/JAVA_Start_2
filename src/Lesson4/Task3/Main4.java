package Lesson4.Task3;

import java.util.Deque;
import java.util.LinkedList;

public class Main4 {
    public static void main(String[] args) {
    }

    class Solution {
        public String simplifyPath(String path) {
            Deque<String> deq = new LinkedList<>();
            String[] signs = path.split("/");
            for (var sign : signs) {
                if ("..".equals(sign)) {
                    if (!deq.isEmpty()) {
                        deq.pollLast();
                    }
                } else if (!"".equals(sign) && !".".equals(sign)) {
                    deq.addLast(sign);
                }
            }
            if (deq.isEmpty()) {
                return "/";
            }
            StringBuilder ans = new StringBuilder();
            while (!deq.isEmpty()) {
                ans.append("/").append(deq.pollFirst());
            }
            return ans.toString();
        }
    }}