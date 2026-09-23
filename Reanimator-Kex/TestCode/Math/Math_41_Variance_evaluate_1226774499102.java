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

public class Variance_evaluate_1226774499102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100392;
     Object term98462;
     Object term107744;
     Object term107745;

    public Variance_evaluate_1226774499102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100392 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term98462 = (double[]) newDoubleArray(149);
        term107744 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term107744, term107744.getClass(), "moment", null);
        setBooleanField(term107744, term107744.getClass(), "incMoment", false);
        setBooleanField(term107744, term107744.getClass(), "isBiasCorrected", false);
        setField(term107744, term107744.getClass(), "storedData", null);
        term107745 = (double[]) newDoubleArray(149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term98462;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term100392, args);
        assertTrue(recursiveEquals(term100392, term107744));
        assertTrue(recursiveEquals(term98462, term107745));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


