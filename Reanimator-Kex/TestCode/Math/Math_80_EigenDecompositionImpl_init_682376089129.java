package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class EigenDecompositionImpl_init_682376089129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47729;
     Object term47730;

    public EigenDecompositionImpl_init_682376089129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term49422 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(term49422, term49422.getClass(), "main", null);
        setField(term49422, term49422.getClass(), "secondary", null);
        setField(term49422, term49422.getClass(), "transformer", null);
        setField(term49422, term49422.getClass(), "squaredSecondary", null);
        term47729 = (double[]) newDoubleArray(0);
        term47730 = (double[]) newDoubleArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term47729;
        args[1] = term47730;
        args[2] = 0.0;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


