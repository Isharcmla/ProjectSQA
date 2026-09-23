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

public class SimpleRegression_getRSquare_9839119313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157;

    public SimpleRegression_getRSquare_9839119313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term157, term157.getClass(), "sumX", 0.686293604788188);
        setDoubleField(term157, term157.getClass(), "sumXX", 0.12764449157430724);
        setDoubleField(term157, term157.getClass(), "sumY", 0.39446728256884744);
        setDoubleField(term157, term157.getClass(), "sumYY", 0.7865909711092062);
        setDoubleField(term157, term157.getClass(), "sumXY", 0.06587158449170749);
        setLongField(term157, term157.getClass(), "n", -4325723315152823407L);
        setDoubleField(term157, term157.getClass(), "xbar", 0.0865998004187658);
        setDoubleField(term157, term157.getClass(), "ybar", 0.9628647861255637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRSquare", argTypes, term157, args);
    }

};


