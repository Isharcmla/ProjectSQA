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

public class SimpleRegression_getRSquare_9839119335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2181;

    public SimpleRegression_getRSquare_9839119335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2181 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term2181, term2181.getClass(), "sumX", 0.0);
        setDoubleField(term2181, term2181.getClass(), "sumXX", 0.0);
        setDoubleField(term2181, term2181.getClass(), "sumY", 0.0);
        setDoubleField(term2181, term2181.getClass(), "sumYY", 0.0);
        setDoubleField(term2181, term2181.getClass(), "sumXY", 0.0);
        setLongField(term2181, term2181.getClass(), "n", 0L);
        setDoubleField(term2181, term2181.getClass(), "xbar", 0.0);
        setDoubleField(term2181, term2181.getClass(), "ybar", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRSquare", argTypes, term2181, args);
    }

};


