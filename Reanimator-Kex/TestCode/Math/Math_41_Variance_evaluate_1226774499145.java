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

public class Variance_evaluate_1226774499145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206874;
     Object term204164;
     Object term212258;
     Object term212259;

    public Variance_evaluate_1226774499145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206874 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term204164 = (double[]) newDoubleArray(214);
        term212258 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term212258, term212258.getClass(), "moment", null);
        setBooleanField(term212258, term212258.getClass(), "incMoment", false);
        setBooleanField(term212258, term212258.getClass(), "isBiasCorrected", false);
        setField(term212258, term212258.getClass(), "storedData", null);
        term212259 = (double[]) newDoubleArray(214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term204164;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term206874, args);
        assertTrue(recursiveEquals(term206874, term212258));
        assertTrue(recursiveEquals(term204164, term212259));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


