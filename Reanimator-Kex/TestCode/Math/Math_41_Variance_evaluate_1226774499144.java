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

public class Variance_evaluate_1226774499144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203765;
     Object term198859;
     Object term211013;
     Object term211014;

    public Variance_evaluate_1226774499144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203765 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term198859 = (double[]) newDoubleArray(397);
        term211013 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term211013, term211013.getClass(), "moment", null);
        setBooleanField(term211013, term211013.getClass(), "incMoment", false);
        setBooleanField(term211013, term211013.getClass(), "isBiasCorrected", false);
        setField(term211013, term211013.getClass(), "storedData", null);
        term211014 = (double[]) newDoubleArray(397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term198859;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term203765, args);
        assertTrue(recursiveEquals(term203765, term211013));
        assertTrue(recursiveEquals(term198859, term211014));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


