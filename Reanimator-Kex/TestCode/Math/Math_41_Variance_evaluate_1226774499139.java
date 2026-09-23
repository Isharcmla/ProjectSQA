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

public class Variance_evaluate_1226774499139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188602;
     Object term184596;
     Object term198212;
     Object term198213;

    public Variance_evaluate_1226774499139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188602 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term184596 = (double[]) newDoubleArray(322);
        term198212 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term198212, term198212.getClass(), "moment", null);
        setBooleanField(term198212, term198212.getClass(), "incMoment", false);
        setBooleanField(term198212, term198212.getClass(), "isBiasCorrected", false);
        setField(term198212, term198212.getClass(), "storedData", null);
        term198213 = (double[]) newDoubleArray(322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term184596;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term188602, args);
        assertTrue(recursiveEquals(term188602, term198212));
        assertTrue(recursiveEquals(term184596, term198213));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


