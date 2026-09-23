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

public class Variance_evaluate_1226774499146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210087;
     Object term208625;
     Object term212929;
     Object term212930;

    public Variance_evaluate_1226774499146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210087 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term208625 = (double[]) newDoubleArray(110);
        term212929 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term212929, term212929.getClass(), "moment", null);
        setBooleanField(term212929, term212929.getClass(), "incMoment", false);
        setBooleanField(term212929, term212929.getClass(), "isBiasCorrected", false);
        setField(term212929, term212929.getClass(), "storedData", null);
        term212930 = (double[]) newDoubleArray(110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term208625;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term210087, args);
        assertTrue(recursiveEquals(term210087, term212929));
        assertTrue(recursiveEquals(term208625, term212930));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


