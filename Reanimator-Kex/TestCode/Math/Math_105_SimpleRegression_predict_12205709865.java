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
import java.lang.Double;

public class SimpleRegression_predict_12205709865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83;
     Object term92;

    public SimpleRegression_predict_12205709865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term83, term83.getClass(), "sumX", 0.7591353014991907);
        setDoubleField(term83, term83.getClass(), "sumXX", 0.791695029600875);
        setDoubleField(term83, term83.getClass(), "sumY", 0.6862221294683138);
        setDoubleField(term83, term83.getClass(), "sumYY", 0.15917839663695388);
        setDoubleField(term83, term83.getClass(), "sumXY", 0.9374115574082594);
        setLongField(term83, term83.getClass(), "n", 5270370404989704783L);
        setDoubleField(term83, term83.getClass(), "xbar", 0.8454723071922143);
        setDoubleField(term83, term83.getClass(), "ybar", 0.8566567697571895);
        term92 = new Double(0.9203805380592256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term92;
        callMethod(klass, "predict", argTypes, term83, args);
    }

};


