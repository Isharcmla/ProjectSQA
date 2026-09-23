package org.apache.commons.math3.optim.nonlinear.vector;

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
import static org.apache.commons.math3.optim.nonlinear.vector.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optim.nonlinear.vector.EqualityUtils.*;
import java.lang.Object;

public class Weight_init_111688338415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4720;
     Object term4963;
     Object term4968;

    public Weight_init_111688338415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4887 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        setField(term4887, term4887.getClass(), "weightMatrix", null);
        term4720 = (double[]) newDoubleArray(2);
        term4963 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Object term4964 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term4965 = (Object[]) newArray("[D", 2);
        double[] term4966 = (double[]) newDoubleArray(2);
        double[] term4967 = (double[]) newDoubleArray(2);
        setElement(term4965, 0, term4966);
        setElement(term4965, 1, term4967);
        setField(term4964, term4964.getClass(), "data", term4965);
        setField(term4963, term4963.getClass(), "weightMatrix", term4964);
        term4968 = (double[]) newDoubleArray(2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.Weight");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4720;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4963));
        assertTrue(recursiveEquals(term4720, term4968));
    }

};


