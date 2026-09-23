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

public class Variance_evaluate_122677449980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58446;
     Object term54740;
     Object term60070;
     Object term60071;

    public Variance_evaluate_122677449980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58446 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term54740 = (double[]) newDoubleArray(297);
        term60070 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term60070, term60070.getClass(), "moment", null);
        setBooleanField(term60070, term60070.getClass(), "incMoment", false);
        setBooleanField(term60070, term60070.getClass(), "isBiasCorrected", false);
        setField(term60070, term60070.getClass(), "storedData", null);
        term60071 = (double[]) newDoubleArray(297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term54740;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term58446, args);
        assertTrue(recursiveEquals(term58446, term60070));
        assertTrue(recursiveEquals(term54740, term60071));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


