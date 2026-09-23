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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FunctionType_tryMergeFunctionPiecewise_2003411845531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term484917;
     Object term485427;

    public FunctionType_tryMergeFunctionPiecewise_2003411845531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term486411 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term486410 = ((Class) term486411).getDeclaredField((String) "ORDINARY");
        ((Field) term486410).setAccessible(true);
        Object enum781 = ((Field) term486410).get((Object) null);
        term484917 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term485011 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term485081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term485191 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term485081, term485081.getClass(), "first", term485081);
        setField(term485081, term485081.getClass(), "jsType", null);
        setField(term485081, term485081.getClass(), "next", null);
        setField(term485011, term485011.getClass(), "parameters", term485081);
        setField(term485191, term485191.getClass(), "kind", enum781);
        setField(term485011, term485011.getClass(), "returnType", term485191);
        setField(term484917, term484917.getClass(), "call", term485011);
        term485427 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term485521 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term485591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term485661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term485761 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term485661, term485661.getClass(), "jsType", null);
        setField(term485661, term485661.getClass(), "next", null);
        setField(term485591, term485591.getClass(), "first", term485661);
        setField(term485521, term485521.getClass(), "parameters", term485591);
        setField(term485521, term485521.getClass(), "returnType", term485761);
        setField(term485427, term485427.getClass(), "call", term485521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term485427;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term484917, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


