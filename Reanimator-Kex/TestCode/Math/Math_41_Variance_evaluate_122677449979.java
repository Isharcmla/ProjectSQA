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

public class Variance_evaluate_122677449979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54566;
     Object term52360;
     Object term59109;
     Object term59110;

    public Variance_evaluate_122677449979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54566 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term52360 = (double[]) newDoubleArray(172);
        term59109 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term59109, term59109.getClass(), "moment", null);
        setBooleanField(term59109, term59109.getClass(), "incMoment", false);
        setBooleanField(term59109, term59109.getClass(), "isBiasCorrected", false);
        setField(term59109, term59109.getClass(), "storedData", null);
        term59110 = (double[]) newDoubleArray(172);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term52360;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term54566, args);
        assertTrue(recursiveEquals(term54566, term59109));
        assertTrue(recursiveEquals(term52360, term59110));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


