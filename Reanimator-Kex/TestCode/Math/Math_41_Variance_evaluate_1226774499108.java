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

public class Variance_evaluate_1226774499108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118253;
     Object term114931;
     Object term120887;
     Object term120888;

    public Variance_evaluate_1226774499108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118253 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term114931 = (double[]) newDoubleArray(265);
        term120887 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term120887, term120887.getClass(), "moment", null);
        setBooleanField(term120887, term120887.getClass(), "incMoment", false);
        setBooleanField(term120887, term120887.getClass(), "isBiasCorrected", false);
        setField(term120887, term120887.getClass(), "storedData", null);
        term120888 = (double[]) newDoubleArray(265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term114931;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term118253, args);
        assertTrue(recursiveEquals(term118253, term120887));
        assertTrue(recursiveEquals(term114931, term120888));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


