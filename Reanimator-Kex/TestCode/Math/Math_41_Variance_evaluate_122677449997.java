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

public class Variance_evaluate_122677449997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91729;
     Object term86031;
     Object term101489;
     Object term101490;

    public Variance_evaluate_122677449997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91729 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term86031 = (double[]) newDoubleArray(463);
        term101489 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term101489, term101489.getClass(), "moment", null);
        setBooleanField(term101489, term101489.getClass(), "incMoment", false);
        setBooleanField(term101489, term101489.getClass(), "isBiasCorrected", false);
        setField(term101489, term101489.getClass(), "storedData", null);
        term101490 = (double[]) newDoubleArray(463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term86031;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term91729, args);
        assertTrue(recursiveEquals(term91729, term101489));
        assertTrue(recursiveEquals(term86031, term101490));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


