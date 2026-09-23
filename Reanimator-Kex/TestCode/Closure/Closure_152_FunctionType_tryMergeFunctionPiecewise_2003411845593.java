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

public class FunctionType_tryMergeFunctionPiecewise_2003411845593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term576601;
     Object term577111;

    public FunctionType_tryMergeFunctionPiecewise_2003411845593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term578191 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term578190 = ((Class) term578191).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term578190).setAccessible(true);
        Object enum895 = ((Field) term578190).get((Object) null);
        term576601 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term576695 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term577310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term576875 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term577310, term577310.getClass(), "first", term577310);
        setField(term577310, term577310.getClass(), "jsType", null);
        setField(term577310, term577310.getClass(), "next", null);
        setField(term576695, term576695.getClass(), "parameters", term577310);
        setField(term576875, term576875.getClass(), "kind", enum895);
        setField(term576695, term576695.getClass(), "returnType", term576875);
        setField(term576601, term576601.getClass(), "call", term576695);
        term577111 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term577205 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term577275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term577420 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term577275, term577275.getClass(), "first", term577310);
        setField(term577205, term577205.getClass(), "parameters", term577275);
        setField(term577420, term577420.getClass(), "kind", enum895);
        setField(term577205, term577205.getClass(), "returnType", term577420);
        setField(term577111, term577111.getClass(), "call", term577205);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term577111;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term576601, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


