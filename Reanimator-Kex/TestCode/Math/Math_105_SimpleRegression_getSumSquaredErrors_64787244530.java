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

public class SimpleRegression_getSumSquaredErrors_64787244530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112;
     Object term1728;

    public SimpleRegression_getSumSquaredErrors_64787244530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term112, term112.getClass(), "sumX", 0.7154795600170818);
        setDoubleField(term112, term112.getClass(), "sumXX", 0.6355029654528058);
        setDoubleField(term112, term112.getClass(), "sumY", 0.0022646783892913414);
        setDoubleField(term112, term112.getClass(), "sumYY", 0.36226058076369927);
        setDoubleField(term112, term112.getClass(), "sumXY", 0.03699061125289671);
        setLongField(term112, term112.getClass(), "n", 6811161968424632369L);
        setDoubleField(term112, term112.getClass(), "xbar", 0.6047137830113202);
        setDoubleField(term112, term112.getClass(), "ybar", 0.6767213143579776);
        term1728 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term1728, term1728.getClass(), "sumX", 0.7154795600170818);
        setDoubleField(term1728, term1728.getClass(), "sumXX", 0.6355029654528058);
        setDoubleField(term1728, term1728.getClass(), "sumY", 0.0022646783892913414);
        setDoubleField(term1728, term1728.getClass(), "sumYY", 0.36226058076369927);
        setDoubleField(term1728, term1728.getClass(), "sumXY", 0.03699061125289671);
        setLongField(term1728, term1728.getClass(), "n", 6811161968424632369L);
        setDoubleField(term1728, term1728.getClass(), "xbar", 0.6047137830113202);
        setDoubleField(term1728, term1728.getClass(), "ybar", 0.6767213143579776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSumSquaredErrors", argTypes, term112, args);
        assertTrue(recursiveEquals(term112, term1728));
        assertTrue(recursiveEquals(retValue, 0.3601074746489418));
    }

};


