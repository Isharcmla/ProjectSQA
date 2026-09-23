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

public class Variance_evaluate_1226774499107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113962;
     Object term108444;
     Object term119438;
     Object term119439;

    public Variance_evaluate_1226774499107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113962 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term108444 = (double[]) newDoubleArray(448);
        term119438 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term119438, term119438.getClass(), "moment", null);
        setBooleanField(term119438, term119438.getClass(), "incMoment", false);
        setBooleanField(term119438, term119438.getClass(), "isBiasCorrected", false);
        setField(term119438, term119438.getClass(), "storedData", null);
        term119439 = (double[]) newDoubleArray(448);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term108444;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term113962, args);
        assertTrue(recursiveEquals(term113962, term119438));
        assertTrue(recursiveEquals(term108444, term119439));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


