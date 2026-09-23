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

public class Variance_evaluate_1226774499122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155930;
     Object term150880;
     Object term159729;
     Object term159730;

    public Variance_evaluate_1226774499122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155930 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term150880 = (double[]) newDoubleArray(409);
        term159729 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term159729, term159729.getClass(), "moment", null);
        setBooleanField(term159729, term159729.getClass(), "incMoment", false);
        setBooleanField(term159729, term159729.getClass(), "isBiasCorrected", false);
        setField(term159729, term159729.getClass(), "storedData", null);
        term159730 = (double[]) newDoubleArray(409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term150880;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term155930, args);
        assertTrue(recursiveEquals(term155930, term159729));
        assertTrue(recursiveEquals(term150880, term159730));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


