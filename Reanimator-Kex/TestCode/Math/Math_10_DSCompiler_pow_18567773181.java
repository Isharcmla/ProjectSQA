package org.apache.commons.math3.analysis.differentiation;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math3.analysis.differentiation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DSCompiler_pow_18567773181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1549759;
     Object term1549619;

    public DSCompiler_pow_18567773181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1549759 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        term1549619 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Array.newInstance(double.class, 0).getClass();
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        args[3] = term1549619;
        args[4] = -1;
        try {
            callMethod(klass, "pow", argTypes, term1549759, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


