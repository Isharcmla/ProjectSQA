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

public class Variance_evaluate_122677449976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51765;
     Object term50255;
     Object term52129;
     Object term52130;

    public Variance_evaluate_122677449976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51765 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term50255 = (double[]) newDoubleArray(114);
        term52129 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term52129, term52129.getClass(), "moment", null);
        setBooleanField(term52129, term52129.getClass(), "incMoment", false);
        setBooleanField(term52129, term52129.getClass(), "isBiasCorrected", false);
        setField(term52129, term52129.getClass(), "storedData", null);
        term52130 = (double[]) newDoubleArray(114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term50255;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term51765, args);
        assertTrue(recursiveEquals(term51765, term52129));
        assertTrue(recursiveEquals(term50255, term52130));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


