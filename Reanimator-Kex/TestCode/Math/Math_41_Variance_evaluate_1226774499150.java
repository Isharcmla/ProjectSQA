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

public class Variance_evaluate_1226774499150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217842;
     Object term213152;
     Object term228974;
     Object term228975;

    public Variance_evaluate_1226774499150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217842 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term213152 = (double[]) newDoubleArray(379);
        term228974 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term228974, term228974.getClass(), "moment", null);
        setBooleanField(term228974, term228974.getClass(), "incMoment", false);
        setBooleanField(term228974, term228974.getClass(), "isBiasCorrected", false);
        setField(term228974, term228974.getClass(), "storedData", null);
        term228975 = (double[]) newDoubleArray(379);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term213152;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term217842, args);
        assertTrue(recursiveEquals(term217842, term228974));
        assertTrue(recursiveEquals(term213152, term228975));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


