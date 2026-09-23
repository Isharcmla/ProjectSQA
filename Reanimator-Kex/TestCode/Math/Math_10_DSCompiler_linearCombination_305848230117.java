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
import java.lang.NullPointerException;
import static org.apache.commons.math3.analysis.differentiation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DSCompiler_linearCombination_305848230117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39869;

    public DSCompiler_linearCombination_305848230117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39869 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term39729 = (Object[]) newArray("[I", 41);
        setField(term39869, term39869.getClass(), "sizes", term39729);
        setIntField(term39869, term39869.getClass(), "parameters", 40);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = double.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = double.class;
        argTypes[4] = Array.newInstance(double.class, 0).getClass();
        argTypes[5] = int.class;
        argTypes[6] = double.class;
        argTypes[7] = Array.newInstance(double.class, 0).getClass();
        argTypes[8] = int.class;
        argTypes[9] = Array.newInstance(double.class, 0).getClass();
        argTypes[10] = int.class;
        Object[] args = new Object[11];
        args[0] = 0.0;
        args[1] = null;
        args[2] = 0;
        args[3] = 0.0;
        args[4] = null;
        args[5] = 0;
        args[6] = 0.0;
        args[7] = null;
        args[8] = 0;
        args[9] = null;
        args[10] = 0;
        try {
            callMethod(klass, "linearCombination", argTypes, term39869, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


