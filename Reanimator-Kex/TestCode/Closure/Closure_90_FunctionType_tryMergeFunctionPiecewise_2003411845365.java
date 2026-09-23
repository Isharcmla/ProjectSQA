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

public class FunctionType_tryMergeFunctionPiecewise_2003411845365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260093;
     Object term260777;

    public FunctionType_tryMergeFunctionPiecewise_2003411845365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term262298 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term262297 = ((Class) term262298).getDeclaredField((String) "ORDINARY");
        ((Field) term262297).setAccessible(true);
        Object enum453 = ((Field) term262297).get((Object) null);
        term260093 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term260187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term260257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term260327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term260427 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term260667 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term260327, term260327.getClass(), "jsType", null);
        setField(term260327, term260327.getClass(), "next", null);
        setField(term260257, term260257.getClass(), "first", term260327);
        setField(term260187, term260187.getClass(), "parameters", term260257);
        setField(term260427, term260427.getClass(), "kind", enum453);
        setField(term260427, term260427.getClass(), "typeOfThis", term260667);
        setField(term260187, term260187.getClass(), "returnType", term260427);
        setField(term260093, term260093.getClass(), "call", term260187);
        Class<? extends Object> term262589 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term262588 = ((Class) term262589).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term262588).setAccessible(true);
        Object enum454 = ((Field) term262588).get((Object) null);
        term260777 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term260871 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term260941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term261011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term261111 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term261011, term261011.getClass(), "jsType", null);
        setField(term261011, term261011.getClass(), "next", null);
        setField(term260941, term260941.getClass(), "first", term261011);
        setField(term260871, term260871.getClass(), "parameters", term260941);
        setField(term261111, term261111.getClass(), "kind", enum454);
        setField(term261111, term261111.getClass(), "typeOfThis", null);
        setField(term260871, term260871.getClass(), "returnType", term261111);
        setField(term260777, term260777.getClass(), "call", term260871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term260777;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term260093, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


