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

public class Variance_evaluate_1226774499174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264051;
     Object term258377;
     Object term276090;
     Object term276091;

    public Variance_evaluate_1226774499174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264051 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term258377 = (double[]) newDoubleArray(461);
        term276090 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term276090, term276090.getClass(), "moment", null);
        setBooleanField(term276090, term276090.getClass(), "incMoment", false);
        setBooleanField(term276090, term276090.getClass(), "isBiasCorrected", false);
        setField(term276090, term276090.getClass(), "storedData", null);
        term276091 = (double[]) newDoubleArray(461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term258377;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term264051, args);
        assertTrue(recursiveEquals(term264051, term276090));
        assertTrue(recursiveEquals(term258377, term276091));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


