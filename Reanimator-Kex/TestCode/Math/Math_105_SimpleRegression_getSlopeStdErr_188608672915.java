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

public class SimpleRegression_getSlopeStdErr_188608672915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175;

    public SimpleRegression_getSlopeStdErr_188608672915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term175, term175.getClass(), "sumX", 0.6059734092898602);
        setDoubleField(term175, term175.getClass(), "sumXX", 0.3074693824288357);
        setDoubleField(term175, term175.getClass(), "sumY", 0.1245258965512791);
        setDoubleField(term175, term175.getClass(), "sumYY", 0.9511861072660375);
        setDoubleField(term175, term175.getClass(), "sumXY", 0.05880719443135807);
        setLongField(term175, term175.getClass(), "n", -5476826692763582090L);
        setDoubleField(term175, term175.getClass(), "xbar", 0.34010089048558567);
        setDoubleField(term175, term175.getClass(), "ybar", 0.19625398866403143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlopeStdErr", argTypes, term175, args);
    }

};


