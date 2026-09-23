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

public class SimpleRegression_addData_51661719849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39253;
     Object term64252;

    public SimpleRegression_addData_51661719849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39253 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setLongField(term39253, term39253.getClass(), "n", 0L);
        term64252 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term64252, term64252.getClass(), "sumX", 0.0);
        setDoubleField(term64252, term64252.getClass(), "sumXX", 0.0);
        setDoubleField(term64252, term64252.getClass(), "sumY", 0.0);
        setDoubleField(term64252, term64252.getClass(), "sumYY", 0.0);
        setDoubleField(term64252, term64252.getClass(), "sumXY", 0.0);
        setLongField(term64252, term64252.getClass(), "n", 1L);
        setDoubleField(term64252, term64252.getClass(), "xbar", 0.0);
        setDoubleField(term64252, term64252.getClass(), "ybar", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = 0.0;
        args[1] = 0.0;
        callMethod(klass, "addData", argTypes, term39253, args);
        assertTrue(recursiveEquals(term39253, term64252));
    }

};


