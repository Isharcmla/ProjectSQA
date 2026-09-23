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

public class Variance_evaluate_1226774499133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172228;
     Object term168018;
     Object term183915;
     Object term183916;

    public Variance_evaluate_1226774499133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172228 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term168018 = (double[]) newDoubleArray(339);
        term183915 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term183915, term183915.getClass(), "moment", null);
        setBooleanField(term183915, term183915.getClass(), "incMoment", false);
        setBooleanField(term183915, term183915.getClass(), "isBiasCorrected", false);
        setField(term183915, term183915.getClass(), "storedData", null);
        term183916 = (double[]) newDoubleArray(339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term168018;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term172228, args);
        assertTrue(recursiveEquals(term172228, term183915));
        assertTrue(recursiveEquals(term168018, term183916));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


