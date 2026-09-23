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

public class Variance_evaluate_1226774499153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227908;
     Object term224334;
     Object term232380;
     Object term232381;

    public Variance_evaluate_1226774499153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227908 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term224334 = (double[]) newDoubleArray(286);
        term232380 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term232380, term232380.getClass(), "moment", null);
        setBooleanField(term232380, term232380.getClass(), "incMoment", false);
        setBooleanField(term232380, term232380.getClass(), "isBiasCorrected", false);
        setField(term232380, term232380.getClass(), "storedData", null);
        term232381 = (double[]) newDoubleArray(286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term224334;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term227908, args);
        assertTrue(recursiveEquals(term227908, term232380));
        assertTrue(recursiveEquals(term224334, term232381));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


