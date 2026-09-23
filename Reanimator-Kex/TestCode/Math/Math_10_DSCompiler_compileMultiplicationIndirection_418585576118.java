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

public class DSCompiler_compileMultiplicationIndirection_418585576118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40053;
     Object term40179;

    public DSCompiler_compileMultiplicationIndirection_418585576118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40053 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term39874 = (Object[]) newArray("[[I", 48);
        Object[] term39875 = (Object[]) newArray("[I", 0);
        setElement(term39874, 1, term39875);
        setElement(term39874, 2, term39875);
        setElement(term39874, 3, term39875);
        setElement(term39874, 4, term39875);
        setElement(term39874, 5, term39875);
        setElement(term39874, 6, term39875);
        setElement(term39874, 7, term39875);
        setElement(term39874, 8, term39875);
        setElement(term39874, 9, term39875);
        setElement(term39874, 10, term39875);
        setElement(term39874, 11, term39875);
        setElement(term39874, 12, term39875);
        setElement(term39874, 13, term39875);
        setElement(term39874, 14, term39875);
        setElement(term39874, 15, term39875);
        setElement(term39874, 16, term39875);
        setElement(term39874, 17, term39875);
        setElement(term39874, 18, term39875);
        setElement(term39874, 19, term39875);
        setElement(term39874, 20, term39875);
        setElement(term39874, 21, term39875);
        setElement(term39874, 22, term39875);
        setElement(term39874, 23, term39875);
        setElement(term39874, 24, term39875);
        setElement(term39874, 25, term39875);
        setElement(term39874, 26, term39875);
        setElement(term39874, 27, term39875);
        setElement(term39874, 28, term39875);
        setElement(term39874, 29, term39875);
        setElement(term39874, 30, term39875);
        setElement(term39874, 31, term39875);
        setElement(term39874, 32, term39875);
        setElement(term39874, 33, term39875);
        setElement(term39874, 34, term39875);
        setElement(term39874, 35, term39875);
        setElement(term39874, 36, term39875);
        setElement(term39874, 37, term39875);
        setElement(term39874, 38, term39875);
        setElement(term39874, 39, term39875);
        setElement(term39874, 40, term39875);
        setElement(term39874, 41, term39875);
        setElement(term39874, 42, term39875);
        setElement(term39874, 43, term39875);
        setElement(term39874, 44, term39875);
        setElement(term39874, 45, term39875);
        setElement(term39874, 46, term39875);
        setElement(term39874, 47, term39875);
        setField(term40053, term40053.getClass(), "multIndirection", term39874);
        term40179 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term39876 = (Object[]) newArray("[[I", 67);
        setElement(term39876, 0, term39875);
        setField(term40179, term40179.getClass(), "multIndirection", term39876);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        argTypes[3] = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        argTypes[4] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[5];
        args[0] = -1;
        args[1] = -1;
        args[2] = term40053;
        args[3] = term40179;
        args[4] = null;
        try {
            callMethod(klass, "compileMultiplicationIndirection", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


