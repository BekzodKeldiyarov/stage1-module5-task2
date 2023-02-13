package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return x -> {
            List<Integer> data= new ArrayList<>();
            for (Integer i :
                    x) {
                data.add(i/divider);
            }
            return data;
        };

    }
}
