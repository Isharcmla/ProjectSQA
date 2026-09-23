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

public class Variance_evaluate_122677449999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95780;
     Object term92194;
     Object term104378;
     Object term104379;

    public Variance_evaluate_122677449999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95780 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term92194 = (double[]) newDoubleArray(287);
        term104378 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term104378, term104378.getClass(), "moment", null);
        setBooleanField(term104378, term104378.getClass(), "incMoment", false);
        setBooleanField(term104378, term104378.getClass(), "isBiasCorrected", false);
        setField(term104378, term104378.getClass(), "storedData", null);
        term104379 = (double[]) newDoubleArray(287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term92194;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term95780, args);
        assertTrue(recursiveEquals(term95780, term104378));
        assertTrue(recursiveEquals(term92194, term104379));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


