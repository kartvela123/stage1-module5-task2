package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return arg -> {
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < arg.size(); i++) {
                res.add(arg.get(i)/divider);
            }
            return res;
        };
    }
}
