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

public class SimpleRegression_getSlopeConfidenceInterval_46393245216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184;

    public SimpleRegression_getSlopeConfidenceInterval_46393245216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term184, term184.getClass(), "sumX", 0.45069204793711093);
        setDoubleField(term184, term184.getClass(), "sumXX", 0.9341364461850963);
        setDoubleField(term184, term184.getClass(), "sumY", 0.9022041121474429);
        setDoubleField(term184, term184.getClass(), "sumYY", 0.6512870939318848);
        setDoubleField(term184, term184.getClass(), "sumXY", 0.8777038609128434);
        setLongField(term184, term184.getClass(), "n", -872011222785455006L);
        setDoubleField(term184, term184.getClass(), "xbar", 0.008025683154629148);
        setDoubleField(term184, term184.getClass(), "ybar", 0.40598298281353484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlopeConfidenceInterval", argTypes, term184, args);
    }

};


