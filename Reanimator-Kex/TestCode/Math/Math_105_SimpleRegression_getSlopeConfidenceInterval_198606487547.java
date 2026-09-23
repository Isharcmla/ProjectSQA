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
import java.lang.IllegalArgumentException;
import static org.apache.commons.math.stat.regression.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class SimpleRegression_getSlopeConfidenceInterval_198606487547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25162;
     Object term25171;

    public SimpleRegression_getSlopeConfidenceInterval_198606487547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25162 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term25162, term25162.getClass(), "sumX", 0.0);
        setDoubleField(term25162, term25162.getClass(), "sumXX", 0.0);
        setDoubleField(term25162, term25162.getClass(), "sumY", 0.0);
        setDoubleField(term25162, term25162.getClass(), "sumYY", 0.0);
        setDoubleField(term25162, term25162.getClass(), "sumXY", 0.0);
        setLongField(term25162, term25162.getClass(), "n", 0L);
        setDoubleField(term25162, term25162.getClass(), "xbar", 0.0);
        setDoubleField(term25162, term25162.getClass(), "ybar", 0.0);
        term25171 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term25171;
        try {
            callMethod(klass, "getSlopeConfidenceInterval", argTypes, term25162, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


