package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FunctionType_tryMergeFunctionPiecewise_2003411845708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term710130;
     Object term709706;

    public FunctionType_tryMergeFunctionPiecewise_2003411845708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term710408 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term710407 = ((Class) term710408).getDeclaredField((String) "INTERFACE");
        ((Field) term710407).setAccessible(true);
        Object enum1148 = ((Field) term710407).get((Object) null);
        term710130 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term710177 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term710212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term710247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term710282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term710332 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term710247, term710247.getClass(), "jsType", null);
        setField(term710282, term710282.getClass(), "jsType", null);
        setField(term710282, term710282.getClass(), "next", term710212);
        setField(term710247, term710247.getClass(), "next", term710282);
        setField(term710212, term710212.getClass(), "first", term710247);
        setField(term710212, term710212.getClass(), "jsType", null);
        setField(term710212, term710212.getClass(), "next", null);
        setField(term710177, term710177.getClass(), "parameters", term710212);
        setBooleanField(term710332, term710332.getClass(), "unknown", false);
        setField(term710332, term710332.getClass(), "kind", enum1148);
        setField(term710177, term710177.getClass(), "returnType", term710332);
        setField(term710130, term710130.getClass(), "call", term710177);
        setBooleanField(term710130, term710130.getClass(), "unknown", false);
        term709706 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term709800 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term709870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term709940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term710010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term710080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term709940, term709940.getClass(), "jsType", null);
        setField(term710010, term710010.getClass(), "jsType", null);
        setField(term710080, term710080.getClass(), "jsType", null);
        setField(term710080, term710080.getClass(), "next", null);
        setField(term710010, term710010.getClass(), "next", term710080);
        setField(term709940, term709940.getClass(), "next", term710010);
        setField(term709870, term709870.getClass(), "first", term709940);
        setField(term709800, term709800.getClass(), "parameters", term709870);
        setField(term709800, term709800.getClass(), "returnType", term710130);
        setField(term709706, term709706.getClass(), "call", term709800);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term709706;
        args[1] = true;
        callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term710130, args);
    }

};


