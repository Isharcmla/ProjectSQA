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

public class Variance_evaluate_94156289860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18110;
     Object term17198;
     Object term19665;
     Object term19666;

    public Variance_evaluate_94156289860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18110 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setBooleanField(term18110, term18110.getClass(), "incMoment", false);
        term17198 = (double[]) newDoubleArray(768);
        term19665 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term19665, term19665.getClass(), "moment", null);
        setBooleanField(term19665, term19665.getClass(), "incMoment", false);
        setBooleanField(term19665, term19665.getClass(), "isBiasCorrected", false);
        setField(term19665, term19665.getClass(), "storedData", null);
        term19666 = (double[]) newDoubleArray(768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term17198;
        args[1] = 2;
        args[2] = 1;
        Object retValue = callMethod(klass, "evaluate", argTypes, term18110, args);
        assertTrue(recursiveEquals(term18110, term19665));
        assertTrue(recursiveEquals(term17198, term19666));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


