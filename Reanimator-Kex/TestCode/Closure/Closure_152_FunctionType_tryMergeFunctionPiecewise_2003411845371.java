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

public class FunctionType_tryMergeFunctionPiecewise_2003411845371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266655;
     Object term267247;

    public FunctionType_tryMergeFunctionPiecewise_2003411845371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term268791 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term268790 = ((Class) term268791).getDeclaredField((String) "ORDINARY");
        ((Field) term268790).setAccessible(true);
        Object enum469 = ((Field) term268790).get((Object) null);
        term266655 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term266749 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term267446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term267481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term266989 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term267481, term267481.getClass(), "jsType", null);
        setField(term267481, term267481.getClass(), "next", null);
        setField(term267446, term267446.getClass(), "first", term267481);
        setField(term267446, term267446.getClass(), "jsType", null);
        setField(term267446, term267446.getClass(), "next", null);
        setField(term266749, term266749.getClass(), "parameters", term267446);
        setField(term266989, term266989.getClass(), "kind", enum469);
        setField(term266989, term266989.getClass(), "typeOfThis", term266655);
        setField(term266749, term266749.getClass(), "returnType", term266989);
        setField(term266655, term266655.getClass(), "call", term266749);
        Class<? extends Object> term269082 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term269081 = ((Class) term269082).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term269081).setAccessible(true);
        Object enum470 = ((Field) term269081).get((Object) null);
        term267247 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term267341 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term267411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term267581 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term267411, term267411.getClass(), "first", term267446);
        setField(term267341, term267341.getClass(), "parameters", term267411);
        setField(term267581, term267581.getClass(), "kind", enum470);
        setField(term267581, term267581.getClass(), "typeOfThis", null);
        setField(term267341, term267341.getClass(), "returnType", term267581);
        setField(term267247, term267247.getClass(), "call", term267341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term267247;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term266655, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


