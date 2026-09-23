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

public class Variance_evaluate_1226774499127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164549;
     Object term162475;
     Object term167693;
     Object term167694;

    public Variance_evaluate_1226774499127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164549 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term162475 = (double[]) newDoubleArray(161);
        term167693 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term167693, term167693.getClass(), "moment", null);
        setBooleanField(term167693, term167693.getClass(), "incMoment", false);
        setBooleanField(term167693, term167693.getClass(), "isBiasCorrected", false);
        setField(term167693, term167693.getClass(), "storedData", null);
        term167694 = (double[]) newDoubleArray(161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term162475;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term164549, args);
        assertTrue(recursiveEquals(term164549, term167693));
        assertTrue(recursiveEquals(term162475, term167694));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


