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

public class FunctionType_tryMergeFunctionPiecewise_2003411845409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320092;
     Object term320778;

    public FunctionType_tryMergeFunctionPiecewise_2003411845409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term322192 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term322191 = ((Class) term322192).getDeclaredField((String) "ORDINARY");
        ((Field) term322191).setAccessible(true);
        Object enum551 = ((Field) term322191).get((Object) null);
        term320092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term320186 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term320256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term320326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term320426 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term320678 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term320326, term320326.getClass(), "jsType", null);
        setField(term320326, term320326.getClass(), "next", null);
        setField(term320256, term320256.getClass(), "first", term320326);
        setField(term320186, term320186.getClass(), "parameters", term320256);
        setField(term320426, term320426.getClass(), "kind", enum551);
        setField(term320426, term320426.getClass(), "registry", term320678);
        setField(term320186, term320186.getClass(), "returnType", term320426);
        setField(term320092, term320092.getClass(), "call", term320186);
        Class<? extends Object> term322483 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term322482 = ((Class) term322483).getDeclaredField((String) "INTERFACE");
        ((Field) term322482).setAccessible(true);
        Object enum552 = ((Field) term322482).get((Object) null);
        term320778 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term320872 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term320942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term321012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term321120 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term321012, term321012.getClass(), "jsType", null);
        setField(term321012, term321012.getClass(), "next", null);
        setField(term320942, term320942.getClass(), "first", term321012);
        setField(term320872, term320872.getClass(), "parameters", term320942);
        setField(term321120, term321120.getClass(), "kind", enum552);
        setField(term320872, term320872.getClass(), "returnType", term321120);
        setField(term320778, term320778.getClass(), "call", term320872);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term320778;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term320092, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


