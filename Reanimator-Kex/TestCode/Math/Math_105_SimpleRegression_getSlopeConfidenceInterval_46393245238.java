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

public class SimpleRegression_getSlopeConfidenceInterval_46393245238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13620;

    public SimpleRegression_getSlopeConfidenceInterval_46393245238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13620 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term13620, term13620.getClass(), "sumX", 0.0);
        setDoubleField(term13620, term13620.getClass(), "sumXX", 0.0);
        setDoubleField(term13620, term13620.getClass(), "sumY", 0.0);
        setDoubleField(term13620, term13620.getClass(), "sumYY", 0.0);
        setDoubleField(term13620, term13620.getClass(), "sumXY", 0.0);
        setLongField(term13620, term13620.getClass(), "n", 0L);
        setDoubleField(term13620, term13620.getClass(), "xbar", 0.0);
        setDoubleField(term13620, term13620.getClass(), "ybar", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlopeConfidenceInterval", argTypes, term13620, args);
    }

};


