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

public class FunctionType_tryMergeFunctionPiecewise_2003411845517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470263;
     Object term470773;

    public FunctionType_tryMergeFunctionPiecewise_2003411845517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term471853 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term471852 = ((Class) term471853).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term471852).setAccessible(true);
        Object enum765 = ((Field) term471852).get((Object) null);
        term470263 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term470357 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term470972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term470537 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term470972, term470972.getClass(), "first", term470972);
        setField(term470972, term470972.getClass(), "jsType", null);
        setField(term470972, term470972.getClass(), "next", null);
        setField(term470357, term470357.getClass(), "parameters", term470972);
        setField(term470537, term470537.getClass(), "kind", enum765);
        setField(term470357, term470357.getClass(), "returnType", term470537);
        setField(term470263, term470263.getClass(), "call", term470357);
        term470773 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term470867 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term470937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term471082 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term470937, term470937.getClass(), "first", term470972);
        setField(term470867, term470867.getClass(), "parameters", term470937);
        setField(term471082, term471082.getClass(), "kind", enum765);
        setField(term470867, term470867.getClass(), "returnType", term471082);
        setField(term470773, term470773.getClass(), "call", term470867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term470773;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term470263, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


