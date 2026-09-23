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

public class FunctionType_tryMergeFunctionPiecewise_2003411845305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196080;
     Object term195796;

    public FunctionType_tryMergeFunctionPiecewise_2003411845305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term197033 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term197032 = ((Class) term197033).getDeclaredField((String) "INTERFACE");
        ((Field) term197032).setAccessible(true);
        Object enum351 = ((Field) term197032).get((Object) null);
        term196080 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term196127 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term196162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term196197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term196247 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term196197, term196197.getClass(), "jsType", null);
        setField(term196197, term196197.getClass(), "next", null);
        setField(term196162, term196162.getClass(), "first", term196197);
        setField(term196127, term196127.getClass(), "parameters", term196162);
        setField(term196247, term196247.getClass(), "kind", enum351);
        setField(term196127, term196127.getClass(), "returnType", term196247);
        setField(term196080, term196080.getClass(), "call", term196127);
        term195796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term195890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term195960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term196030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term196030, term196030.getClass(), "jsType", null);
        setField(term196030, term196030.getClass(), "next", null);
        setField(term195960, term195960.getClass(), "first", term196030);
        setField(term195890, term195890.getClass(), "parameters", term195960);
        setField(term195890, term195890.getClass(), "returnType", term196080);
        setField(term195796, term195796.getClass(), "call", term195890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term195796;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term196080, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


