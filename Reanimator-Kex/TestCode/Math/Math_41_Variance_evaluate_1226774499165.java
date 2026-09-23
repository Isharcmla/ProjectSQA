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

public class Variance_evaluate_1226774499165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242270;
     Object term238468;
     Object term256009;
     Object term256010;

    public Variance_evaluate_1226774499165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242270 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term238468 = (double[]) newDoubleArray(305);
        term256009 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term256009, term256009.getClass(), "moment", null);
        setBooleanField(term256009, term256009.getClass(), "incMoment", false);
        setBooleanField(term256009, term256009.getClass(), "isBiasCorrected", false);
        setField(term256009, term256009.getClass(), "storedData", null);
        term256010 = (double[]) newDoubleArray(305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term238468;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term242270, args);
        assertTrue(recursiveEquals(term242270, term256009));
        assertTrue(recursiveEquals(term238468, term256010));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


