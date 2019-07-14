package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        int size = Math.abs(left - right) + 1;
        if (left < right) {
            return Stream.iterate(left, n -> n + 1).limit(size).collect(Collectors.toList());
        } else {
            return Stream.iterate(left, n -> n - 1).limit(size).collect(Collectors.toList());
        }
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        CollectionOperator collectionOperator = new CollectionOperator();
        return collectionOperator.getListByInterval(left, right).stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        return Arrays.stream(array).filter(n -> n % 2 == 0).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

    }

    public int popLastElment(int[] array) {
        return Arrays.stream(array).reduce(0,(first, second) -> second);
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
