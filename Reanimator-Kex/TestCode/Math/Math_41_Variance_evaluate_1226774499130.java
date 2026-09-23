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

public class Variance_evaluate_1226774499130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166630;
     Object term164712;
     Object term179308;
     Object term179309;

    public Variance_evaluate_1226774499130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166630 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term164712 = (double[]) newDoubleArray(148);
        term179308 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term179308, term179308.getClass(), "moment", null);
        setBooleanField(term179308, term179308.getClass(), "incMoment", false);
        setBooleanField(term179308, term179308.getClass(), "isBiasCorrected", false);
        setField(term179308, term179308.getClass(), "storedData", null);
        term179309 = (double[]) newDoubleArray(148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term164712;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term166630, args);
        assertTrue(recursiveEquals(term166630, term179308));
        assertTrue(recursiveEquals(term164712, term179309));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


