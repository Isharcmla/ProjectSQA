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

public class Variance_evaluate_122677449951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11689;
     Object term11516;
     Object term12627;
     Object term12628;

    public Variance_evaluate_122677449951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11689 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setBooleanField(term11689, term11689.getClass(), "isBiasCorrected", false);
        term11516 = (double[]) newDoubleArray(2);
        term12627 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term12627, term12627.getClass(), "moment", null);
        setBooleanField(term12627, term12627.getClass(), "incMoment", false);
        setBooleanField(term12627, term12627.getClass(), "isBiasCorrected", false);
        setField(term12627, term12627.getClass(), "storedData", null);
        term12628 = (double[]) newDoubleArray(2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term11516;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term11689, args);
        assertTrue(recursiveEquals(term11689, term12627));
        assertTrue(recursiveEquals(term11516, term12628));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


