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

public class FunctionType_tryMergeFunctionPiecewise_2003411845481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term415974;
     Object term416940;

    public FunctionType_tryMergeFunctionPiecewise_2003411845481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term417922 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term417921 = ((Class) term417922).getDeclaredField((String) "ORDINARY");
        ((Field) term417921).setAccessible(true);
        Object enum687 = ((Field) term417921).get((Object) null);
        term415974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term416068 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term416138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416308 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term416940 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term416987 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term417022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term417057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term417107 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term416208, term416208.getClass(), "jsType", null);
        setField(term416208, term416208.getClass(), "next", null);
        setField(term416138, term416138.getClass(), "first", term416208);
        setField(term416068, term416068.getClass(), "parameters", term416138);
        setField(term416308, term416308.getClass(), "kind", enum687);
        setField(term417057, term417057.getClass(), "jsType", null);
        setField(term417057, term417057.getClass(), "next", null);
        setField(term417022, term417022.getClass(), "first", term417057);
        setField(term416987, term416987.getClass(), "parameters", term417022);
        setField(term417107, term417107.getClass(), "kind", enum687);
        setField(term417107, term417107.getClass(), "typeOfThis", null);
        setField(term416987, term416987.getClass(), "returnType", term417107);
        setField(term416940, term416940.getClass(), "call", term416987);
        setField(term416308, term416308.getClass(), "typeOfThis", term416940);
        setField(term416068, term416068.getClass(), "returnType", term416308);
        setField(term415974, term415974.getClass(), "call", term416068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term416940;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term415974, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


