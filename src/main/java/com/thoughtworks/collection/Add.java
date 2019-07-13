package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int min = leftBorder < rightBorder ? leftBorder : rightBorder;
        int number = Math.abs(leftBorder - rightBorder) + 1;
        return Stream.iterate(min, n -> n + 1).limit(number).filter(n -> n % 2 == 0).reduce(0, Integer::sum);
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int min = leftBorder < rightBorder ? leftBorder : rightBorder;
        int number = Math.abs(leftBorder - rightBorder) + 1;
        return Stream.iterate(min, n -> n + 1).limit(number).filter(n -> n % 2 == 1).reduce(0, Integer::sum);
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().filter(n -> n % 2 == 1).map(n -> n * 3 + 2).reduce(0, Integer::sum);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(n -> n % 2 == 1 ? 3 * n + 2 : n).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return arrayList.stream().filter( n -> n % 2 == 0).collect(Collectors.averagingDouble(i -> i));
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
