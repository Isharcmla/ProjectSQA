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

public class SimpleRegression_getMeanSquareError_138030964833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2129;

    public SimpleRegression_getMeanSquareError_138030964833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2129 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term2129, term2129.getClass(), "sumX", 0.0);
        setDoubleField(term2129, term2129.getClass(), "sumXX", 0.0);
        setDoubleField(term2129, term2129.getClass(), "sumY", 0.0);
        setDoubleField(term2129, term2129.getClass(), "sumYY", 0.0);
        setDoubleField(term2129, term2129.getClass(), "sumXY", 0.0);
        setLongField(term2129, term2129.getClass(), "n", 0L);
        setDoubleField(term2129, term2129.getClass(), "xbar", 0.0);
        setDoubleField(term2129, term2129.getClass(), "ybar", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeanSquareError", argTypes, term2129, args);
    }

};


