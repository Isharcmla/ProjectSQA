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

public class Variance_evaluate_1226774499121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150611;
     Object term147265;
     Object term158354;
     Object term158355;

    public Variance_evaluate_1226774499121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150611 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term147265 = (double[]) newDoubleArray(267);
        term158354 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term158354, term158354.getClass(), "moment", null);
        setBooleanField(term158354, term158354.getClass(), "incMoment", false);
        setBooleanField(term158354, term158354.getClass(), "isBiasCorrected", false);
        setField(term158354, term158354.getClass(), "storedData", null);
        term158355 = (double[]) newDoubleArray(267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term147265;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term150611, args);
        assertTrue(recursiveEquals(term150611, term158354));
        assertTrue(recursiveEquals(term147265, term158355));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


