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

public class SimpleRegression_getSlopeConfidenceInterval_198606487517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193;
     Object term202;

    public SimpleRegression_getSlopeConfidenceInterval_198606487517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term193, term193.getClass(), "sumX", 0.3710067290060264);
        setDoubleField(term193, term193.getClass(), "sumXX", 0.7818620200430967);
        setDoubleField(term193, term193.getClass(), "sumY", 0.04640022995603543);
        setDoubleField(term193, term193.getClass(), "sumYY", 0.9123572866833729);
        setDoubleField(term193, term193.getClass(), "sumXY", 0.40635376375558196);
        setLongField(term193, term193.getClass(), "n", -316468845751588286L);
        setDoubleField(term193, term193.getClass(), "xbar", 0.4772043271031934);
        setDoubleField(term193, term193.getClass(), "ybar", 0.2446504549754045);
        term202 = new Double(0.6142723998707854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term202;
        callMethod(klass, "getSlopeConfidenceInterval", argTypes, term193, args);
    }

};


