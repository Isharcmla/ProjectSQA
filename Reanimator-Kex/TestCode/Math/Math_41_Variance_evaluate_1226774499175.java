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

public class Variance_evaluate_1226774499175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265928;
     Object term264514;
     Object term277247;
     Object term277248;

    public Variance_evaluate_1226774499175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265928 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term264514 = (double[]) newDoubleArray(106);
        term277247 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term277247, term277247.getClass(), "moment", null);
        setBooleanField(term277247, term277247.getClass(), "incMoment", false);
        setBooleanField(term277247, term277247.getClass(), "isBiasCorrected", false);
        setField(term277247, term277247.getClass(), "storedData", null);
        term277248 = (double[]) newDoubleArray(106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term264514;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term265928, args);
        assertTrue(recursiveEquals(term265928, term277247));
        assertTrue(recursiveEquals(term264514, term277248));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


