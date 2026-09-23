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

public class FunctionType_tryMergeFunctionPiecewise_2003411845577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term552042;
     Object term553132;

    public FunctionType_tryMergeFunctionPiecewise_2003411845577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term554461 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term554460 = ((Class) term554461).getDeclaredField((String) "INTERFACE");
        ((Field) term554460).setAccessible(true);
        Object enum861 = ((Field) term554460).get((Object) null);
        term552042 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term552136 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term552206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term552276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term552376 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term552928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term553032 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term552276, term552276.getClass(), "jsType", null);
        setField(term552276, term552276.getClass(), "next", null);
        setField(term552206, term552206.getClass(), "first", term552276);
        setField(term552136, term552136.getClass(), "parameters", term552206);
        setField(term552376, term552376.getClass(), "kind", enum861);
        setField(term552376, term552376.getClass(), "typeOfThis", term552928);
        setField(term552376, term552376.getClass(), "registry", term553032);
        setField(term552136, term552136.getClass(), "returnType", term552376);
        setField(term552042, term552042.getClass(), "call", term552136);
        Class<? extends Object> term554755 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term554754 = ((Class) term554755).getDeclaredField((String) "INTERFACE");
        ((Field) term554754).setAccessible(true);
        Object enum862 = ((Field) term554754).get((Object) null);
        term553132 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term553226 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term553296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term553366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term553466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term553366, term553366.getClass(), "jsType", null);
        setField(term553366, term553366.getClass(), "next", null);
        setField(term553296, term553296.getClass(), "first", term553366);
        setField(term553226, term553226.getClass(), "parameters", term553296);
        setField(term553466, term553466.getClass(), "kind", enum862);
        setField(term553466, term553466.getClass(), "typeOfThis", null);
        setField(term553226, term553226.getClass(), "returnType", term553466);
        setField(term553132, term553132.getClass(), "call", term553226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term553132;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term552042, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


