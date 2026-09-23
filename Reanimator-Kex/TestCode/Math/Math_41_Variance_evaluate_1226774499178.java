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
import java.lang.Double;

public class Variance_evaluate_1226774499178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290998;
     Object term285372;

    public Variance_evaluate_1226774499178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290998 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term285372 = (double[]) newDoubleArray(457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term285372;
        args[1] = Double.NaN;
        callMethod(klass, "evaluate", argTypes, term290998, args);
    }

};


