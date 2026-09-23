package org.apache.commons.math.stat.descriptive.moment;

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
import static org.apache.commons.math.stat.descriptive.moment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.descriptive.moment.EqualityUtils.*;
import java.lang.Double;

public class Variance_evaluate_1226774499117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138274;
     Object term132984;
     Object term146404;
     Object term146405;

    public Variance_evaluate_1226774499117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138274 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term132984 = (double[]) newDoubleArray(429);
        term146404 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term146404, term146404.getClass(), "moment", null);
        setBooleanField(term146404, term146404.getClass(), "incMoment", false);
        setBooleanField(term146404, term146404.getClass(), "isBiasCorrected", false);
        setField(term146404, term146404.getClass(), "storedData", null);
        term146405 = (double[]) newDoubleArray(429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term132984;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term138274, args);
        assertTrue(recursiveEquals(term138274, term146404));
        assertTrue(recursiveEquals(term132984, term146405));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


