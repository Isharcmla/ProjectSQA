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

public class Variance_evaluate_122677449958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15165;
     Object term15024;
     Object term17189;
     Object term17190;

    public Variance_evaluate_122677449958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15165 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term15024 = (double[]) newDoubleArray(1);
        term17189 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term17189, term17189.getClass(), "moment", null);
        setBooleanField(term17189, term17189.getClass(), "incMoment", false);
        setBooleanField(term17189, term17189.getClass(), "isBiasCorrected", false);
        setField(term17189, term17189.getClass(), "storedData", null);
        term17190 = (double[]) newDoubleArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term15024;
        args[1] = 0.0;
        Object retValue = callMethod(klass, "evaluate", argTypes, term15165, args);
        assertTrue(recursiveEquals(term15165, term17189));
        assertTrue(recursiveEquals(term15024, term17190));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


