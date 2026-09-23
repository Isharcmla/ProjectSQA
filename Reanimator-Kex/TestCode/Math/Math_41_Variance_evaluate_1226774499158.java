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

public class Variance_evaluate_1226774499158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237193;
     Object term236199;
     Object term238323;
     Object term238324;

    public Variance_evaluate_1226774499158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237193 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term236199 = (double[]) newDoubleArray(71);
        term238323 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term238323, term238323.getClass(), "moment", null);
        setBooleanField(term238323, term238323.getClass(), "incMoment", false);
        setBooleanField(term238323, term238323.getClass(), "isBiasCorrected", false);
        setField(term238323, term238323.getClass(), "storedData", null);
        term238324 = (double[]) newDoubleArray(71);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term236199;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term237193, args);
        assertTrue(recursiveEquals(term237193, term238323));
        assertTrue(recursiveEquals(term236199, term238324));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


