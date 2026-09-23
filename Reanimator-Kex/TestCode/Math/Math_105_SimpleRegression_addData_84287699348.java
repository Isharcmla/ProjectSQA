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
import static org.apache.commons.math.stat.regression.EqualityUtils.*;
import java.lang.Object;

public class SimpleRegression_addData_84287699348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26990;
     Object term25305;
     Object term63256;
     Object term63257;

    public SimpleRegression_addData_84287699348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26990 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setLongField(term26990, term26990.getClass(), "n", 2147483648L);
        setDoubleField(term26990, term26990.getClass(), "xbar", 0.0);
        setDoubleField(term26990, term26990.getClass(), "ybar", 0.0);
        setDoubleField(term26990, term26990.getClass(), "sumXX", 0.0);
        setDoubleField(term26990, term26990.getClass(), "sumYY", 0.0);
        setDoubleField(term26990, term26990.getClass(), "sumXY", 0.0);
        setDoubleField(term26990, term26990.getClass(), "sumX", 0.0);
        setDoubleField(term26990, term26990.getClass(), "sumY", 0.0);
        term25305 = (Object[]) newArray("[D", 1);
        double[] term25306 = (double[]) newDoubleArray(490);
        setDoubleElement(term25306, 0, 1.0);
        setDoubleElement(term25306, 1, 1.0);
        setElement(term25305, 0, term25306);
        term63256 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term63256, term63256.getClass(), "sumX", 1.0);
        setDoubleField(term63256, term63256.getClass(), "sumXX", 0.9999999995343387);
        setDoubleField(term63256, term63256.getClass(), "sumY", 1.0);
        setDoubleField(term63256, term63256.getClass(), "sumYY", 0.9999999995343387);
        setDoubleField(term63256, term63256.getClass(), "sumXY", 0.9999999995343387);
        setLongField(term63256, term63256.getClass(), "n", 2147483649L);
        setDoubleField(term63256, term63256.getClass(), "xbar", 4.656612870908988E-10);
        setDoubleField(term63256, term63256.getClass(), "ybar", 4.656612870908988E-10);
        term63257 = (Object[]) newArray("[D", 1);
        double[] term63258 = (double[]) newDoubleArray(490);
        setDoubleElement(term63258, 0, 1.0);
        setDoubleElement(term63258, 1, 1.0);
        setElement(term63257, 0, term63258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term25305;
        callMethod(klass, "addData", argTypes, term26990, args);
        assertTrue(recursiveEquals(term26990, term63256));
        assertTrue(recursiveEquals(term25305, term63257));
    }

};


