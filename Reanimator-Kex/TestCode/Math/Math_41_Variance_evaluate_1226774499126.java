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

public class Variance_evaluate_1226774499126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162336;
     Object term160550;
     Object term167074;
     Object term167075;

    public Variance_evaluate_1226774499126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162336 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term160550 = (double[]) newDoubleArray(137);
        term167074 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term167074, term167074.getClass(), "moment", null);
        setBooleanField(term167074, term167074.getClass(), "incMoment", false);
        setBooleanField(term167074, term167074.getClass(), "isBiasCorrected", false);
        setField(term167074, term167074.getClass(), "storedData", null);
        term167075 = (double[]) newDoubleArray(137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term160550;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term162336, args);
        assertTrue(recursiveEquals(term162336, term167074));
        assertTrue(recursiveEquals(term160550, term167075));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


