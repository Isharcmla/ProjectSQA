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

public class Variance_evaluate_1226774499100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98287;
     Object term96069;
     Object term105321;
     Object term105322;

    public Variance_evaluate_1226774499100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98287 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term96069 = (double[]) newDoubleArray(173);
        term105321 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term105321, term105321.getClass(), "moment", null);
        setBooleanField(term105321, term105321.getClass(), "incMoment", false);
        setBooleanField(term105321, term105321.getClass(), "isBiasCorrected", false);
        setField(term105321, term105321.getClass(), "storedData", null);
        term105322 = (double[]) newDoubleArray(173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term96069;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term98287, args);
        assertTrue(recursiveEquals(term98287, term105321));
        assertTrue(recursiveEquals(term96069, term105322));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


