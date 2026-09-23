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
import static org.apache.commons.math3.analysis.differentiation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.analysis.differentiation.EqualityUtils.*;
import java.lang.Object;

public class DSCompiler_multiply_368608416128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45116;
     Object term65090;

    public DSCompiler_multiply_368608416128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45116 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term44978 = (Object[]) newArray("[[I", 0);
        setField(term45116, term45116.getClass(), "multIndirection", term44978);
        term65090 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term65091 = (Object[]) newArray("[[I", 0);
        setIntField(term65090, term65090.getClass(), "parameters", 0);
        setIntField(term65090, term65090.getClass(), "order", 0);
        setField(term65090, term65090.getClass(), "sizes", null);
        setField(term65090, term65090.getClass(), "derivativesIndirection", null);
        setField(term65090, term65090.getClass(), "lowerIndirection", null);
        setField(term65090, term65090.getClass(), "multIndirection", term65091);
        setField(term65090, term65090.getClass(), "compIndirection", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = int.class;
        argTypes[4] = Array.newInstance(double.class, 0).getClass();
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = 0;
        args[2] = null;
        args[3] = 0;
        args[4] = null;
        args[5] = 0;
        callMethod(klass, "multiply", argTypes, term45116, args);
        assertTrue(recursiveEquals(term45116, term65090));
    }

};


