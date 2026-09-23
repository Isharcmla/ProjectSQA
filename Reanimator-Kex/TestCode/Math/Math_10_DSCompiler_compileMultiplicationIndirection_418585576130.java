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

public class DSCompiler_compileMultiplicationIndirection_418585576130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45592;
     Object term45718;
     Object term65356;
     Object term65358;
     Object term65345;

    public DSCompiler_compileMultiplicationIndirection_418585576130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45592 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term45438 = (Object[]) newArray("[[I", 0);
        setField(term45592, term45592.getClass(), "multIndirection", term45438);
        term45718 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(term45718, term45718.getClass(), "multIndirection", term45438);
        term65356 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term65357 = (Object[]) newArray("[[I", 0);
        setIntField(term65356, term65356.getClass(), "parameters", 0);
        setIntField(term65356, term65356.getClass(), "order", 0);
        setField(term65356, term65356.getClass(), "sizes", null);
        setField(term65356, term65356.getClass(), "derivativesIndirection", null);
        setField(term65356, term65356.getClass(), "lowerIndirection", null);
        setField(term65356, term65356.getClass(), "multIndirection", term65357);
        setField(term65356, term65356.getClass(), "compIndirection", null);
        term65358 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term65359 = (Object[]) newArray("[[I", 0);
        setIntField(term65358, term65358.getClass(), "parameters", 0);
        setIntField(term65358, term65358.getClass(), "order", 0);
        setField(term65358, term65358.getClass(), "sizes", null);
        setField(term65358, term65358.getClass(), "derivativesIndirection", null);
        setField(term65358, term65358.getClass(), "lowerIndirection", null);
        setField(term65358, term65358.getClass(), "multIndirection", term65359);
        setField(term65358, term65358.getClass(), "compIndirection", null);
        term65345 = (Object[]) newArray("[[I", 0);
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
        args[2] = term45592;
        args[3] = term45718;
        args[4] = null;
        Object retValue = callMethod(klass, "compileMultiplicationIndirection", argTypes, null, args);
        assertTrue(recursiveEquals(term45592, term65356));
        assertTrue(recursiveEquals(term45718, term65358));
        assertTrue(recursiveEquals(retValue, term65345));
    }

};


