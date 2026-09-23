package org.apache.commons.math.stat.regression;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.math.stat.regression.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.regression.EqualityUtils.*;
import java.lang.Object;

public class SimpleRegression_addData_84287699353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68529;
     Object term64254;
     Object term71520;
     Object term71521;

    public SimpleRegression_addData_84287699353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68529 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setLongField(term68529, term68529.getClass(), "n", 4294967293L);
        setDoubleField(term68529, term68529.getClass(), "xbar", 0.0);
        setDoubleField(term68529, term68529.getClass(), "ybar", 0.0);
        setDoubleField(term68529, term68529.getClass(), "sumXX", 0.0);
        setDoubleField(term68529, term68529.getClass(), "sumYY", 0.0);
        setDoubleField(term68529, term68529.getClass(), "sumXY", 0.0);
        setDoubleField(term68529, term68529.getClass(), "sumX", 0.0);
        setDoubleField(term68529, term68529.getClass(), "sumY", 0.0);
        term64254 = (Object[]) newArray("[D", 3);
        double[] term64255 = (double[]) newDoubleArray(490);
        double[] term64746 = (double[]) newDoubleArray(490);
        setDoubleElement(term64255, 0, 2.0);
        setDoubleElement(term64255, 1, 1.0);
        setDoubleElement(term64255, 2, 1.0);
        setDoubleElement(term64255, 3, 1.0);
        setElement(term64254, 0, term64255);
        setDoubleElement(term64746, 0, 2.0);
        setDoubleElement(term64746, 1, 1.0);
        setDoubleElement(term64746, 2, 1.0);
        setDoubleElement(term64746, 3, 1.0);
        setElement(term64254, 1, term64746);
        setElement(term64254, 2, term64746);
        term71520 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term71520, term71520.getClass(), "sumX", 6.0);
        setDoubleField(term71520, term71520.getClass(), "sumXX", 11.999999991618097);
        setDoubleField(term71520, term71520.getClass(), "sumY", 3.0);
        setDoubleField(term71520, term71520.getClass(), "sumYY", 2.999999997904524);
        setDoubleField(term71520, term71520.getClass(), "sumXY", 5.999999995809048);
        setLongField(term71520, term71520.getClass(), "n", 4294967296L);
        setDoubleField(term71520, term71520.getClass(), "xbar", 1.3969838619232178E-9);
        setDoubleField(term71520, term71520.getClass(), "ybar", 6.984919309616089E-10);
        term71521 = (Object[]) newArray("[D", 3);
        double[] term71522 = (double[]) newDoubleArray(490);
        double[] term71523 = (double[]) newDoubleArray(490);
        double[] term71524 = (double[]) newDoubleArray(490);
        setDoubleElement(term71522, 0, 2.0);
        setDoubleElement(term71522, 1, 1.0);
        setDoubleElement(term71522, 2, 1.0);
        setDoubleElement(term71522, 3, 1.0);
        setElement(term71521, 0, term71522);
        setDoubleElement(term71523, 0, 2.0);
        setDoubleElement(term71523, 1, 1.0);
        setDoubleElement(term71523, 2, 1.0);
        setDoubleElement(term71523, 3, 1.0);
        setElement(term71521, 1, term71523);
        setDoubleElement(term71524, 0, 2.0);
        setDoubleElement(term71524, 1, 1.0);
        setDoubleElement(term71524, 2, 1.0);
        setDoubleElement(term71524, 3, 1.0);
        setElement(term71521, 2, term71524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term64254;
        callMethod(klass, "addData", argTypes, term68529, args);
        assertTrue(recursiveEquals(term68529, term71520));
        assertTrue(recursiveEquals(term64254, term71521));
    }

};


