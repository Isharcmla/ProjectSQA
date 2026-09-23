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

public class Variance_evaluate_170869860648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11002;
     Object term10347;

    public Variance_evaluate_170869860648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11002 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setBooleanField(term11002, term11002.getClass(), "incMoment", false);
        term10347 = (double[]) newDoubleArray(512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10347;
        callMethod(klass, "evaluate", argTypes, term11002, args);
    }

};


