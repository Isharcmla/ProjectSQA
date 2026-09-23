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

public class Variance_evaluate_122677449969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36647;
     Object term32017;
     Object term45182;
     Object term45183;

    public Variance_evaluate_122677449969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36647 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term32017 = (double[]) newDoubleArray(374);
        term45182 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term45182, term45182.getClass(), "moment", null);
        setBooleanField(term45182, term45182.getClass(), "incMoment", false);
        setBooleanField(term45182, term45182.getClass(), "isBiasCorrected", false);
        setField(term45182, term45182.getClass(), "storedData", null);
        term45183 = (double[]) newDoubleArray(374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term32017;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term36647, args);
        assertTrue(recursiveEquals(term36647, term45182));
        assertTrue(recursiveEquals(term32017, term45183));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


