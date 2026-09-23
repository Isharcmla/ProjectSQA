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

public class SimpleRegression_addData_84287699369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88981;
     Object term86247;
     Object term1549930;
     Object term1549931;

    public SimpleRegression_addData_84287699369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88981 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setLongField(term88981, term88981.getClass(), "n", 4294967293L);
        setDoubleField(term88981, term88981.getClass(), "xbar", 0.0);
        setDoubleField(term88981, term88981.getClass(), "ybar", 0.0);
        setDoubleField(term88981, term88981.getClass(), "sumXX", 0.0);
        setDoubleField(term88981, term88981.getClass(), "sumYY", 0.0);
        setDoubleField(term88981, term88981.getClass(), "sumXY", 0.0);
        setDoubleField(term88981, term88981.getClass(), "sumX", 0.0);
        setDoubleField(term88981, term88981.getClass(), "sumY", 0.0);
        term86247 = (Object[]) newArray("[D", 2);
        double[] term86248 = (double[]) newDoubleArray(490);
        setDoubleElement(term86248, 0, 1.0);
        setDoubleElement(term86248, 1, 1.0);
        setDoubleElement(term86248, 2, 1.0);
        setElement(term86247, 0, term86248);
        setElement(term86247, 1, term86248);
        term1549930 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term1549930, term1549930.getClass(), "sumX", 2.0);
        setDoubleField(term1549930, term1549930.getClass(), "sumXX", 1.9999999990686774);
        setDoubleField(term1549930, term1549930.getClass(), "sumY", 2.0);
        setDoubleField(term1549930, term1549930.getClass(), "sumYY", 1.9999999990686774);
        setDoubleField(term1549930, term1549930.getClass(), "sumXY", 1.9999999990686774);
        setLongField(term1549930, term1549930.getClass(), "n", 4294967295L);
        setDoubleField(term1549930, term1549930.getClass(), "xbar", 4.656612874161595E-10);
        setDoubleField(term1549930, term1549930.getClass(), "ybar", 4.656612874161595E-10);
        term1549931 = (Object[]) newArray("[D", 2);
        double[] term1549932 = (double[]) newDoubleArray(490);
        double[] term1549933 = (double[]) newDoubleArray(490);
        setDoubleElement(term1549932, 0, 1.0);
        setDoubleElement(term1549932, 1, 1.0);
        setDoubleElement(term1549932, 2, 1.0);
        setElement(term1549931, 0, term1549932);
        setDoubleElement(term1549933, 0, 1.0);
        setDoubleElement(term1549933, 1, 1.0);
        setDoubleElement(term1549933, 2, 1.0);
        setElement(term1549931, 1, term1549933);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term86247;
        callMethod(klass, "addData", argTypes, term88981, args);
        assertTrue(recursiveEquals(term88981, term1549930));
        assertTrue(recursiveEquals(term86247, term1549931));
    }

};


