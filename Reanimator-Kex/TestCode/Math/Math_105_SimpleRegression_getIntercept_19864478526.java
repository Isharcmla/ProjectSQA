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

public class SimpleRegression_getIntercept_19864478526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94;

    public SimpleRegression_getIntercept_19864478526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term94, term94.getClass(), "sumX", 0.5804948995371725);
        setDoubleField(term94, term94.getClass(), "sumXX", 0.20737514139742264);
        setDoubleField(term94, term94.getClass(), "sumY", 0.7919370314903882);
        setDoubleField(term94, term94.getClass(), "sumYY", 0.2109867221632754);
        setDoubleField(term94, term94.getClass(), "sumXY", 0.3227335400819148);
        setLongField(term94, term94.getClass(), "n", 7411271909051562686L);
        setDoubleField(term94, term94.getClass(), "xbar", 0.43337207054070237);
        setDoubleField(term94, term94.getClass(), "ybar", 0.13246999699526574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntercept", argTypes, term94, args);
    }

};


