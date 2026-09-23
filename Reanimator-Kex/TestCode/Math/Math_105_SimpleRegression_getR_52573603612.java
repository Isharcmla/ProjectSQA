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

public class SimpleRegression_getR_52573603612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148;

    public SimpleRegression_getR_52573603612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term148, term148.getClass(), "sumX", 0.09067063848644474);
        setDoubleField(term148, term148.getClass(), "sumXX", 0.268304014379393);
        setDoubleField(term148, term148.getClass(), "sumY", 0.7171972879282721);
        setDoubleField(term148, term148.getClass(), "sumYY", 0.9006361024877096);
        setDoubleField(term148, term148.getClass(), "sumXY", 0.5644914462415626);
        setLongField(term148, term148.getClass(), "n", -8885298608300233488L);
        setDoubleField(term148, term148.getClass(), "xbar", 0.509895859167191);
        setDoubleField(term148, term148.getClass(), "ybar", 0.07417792024383196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getR", argTypes, term148, args);
    }

};


