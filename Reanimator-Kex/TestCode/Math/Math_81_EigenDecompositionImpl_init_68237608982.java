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

public class EigenDecompositionImpl_init_68237608982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26734;
     Object term26735;

    public EigenDecompositionImpl_init_68237608982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29811 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        Object term29923 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        setField(term29811, term29811.getClass(), "main", null);
        setField(term29811, term29811.getClass(), "secondary", null);
        setField(term29811, term29811.getClass(), "transformer", term29923);
        setField(term29811, term29811.getClass(), "squaredSecondary", null);
        term26734 = (double[]) newDoubleArray(0);
        term26735 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term26734;
        args[1] = term26735;
        args[2] = 0.0;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


