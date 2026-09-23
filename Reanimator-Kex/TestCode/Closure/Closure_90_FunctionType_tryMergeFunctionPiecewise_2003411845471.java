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

public class FunctionType_tryMergeFunctionPiecewise_2003411845471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395545;
     Object term396147;

    public FunctionType_tryMergeFunctionPiecewise_2003411845471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term397261 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term397260 = ((Class) term397261).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term397260).setAccessible(true);
        Object enum672 = ((Field) term397260).get((Object) null);
        term395545 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term395639 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term395709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term395779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term395889 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term395779, term395779.getClass(), "jsType", null);
        setField(term395779, term395779.getClass(), "next", null);
        setField(term395709, term395709.getClass(), "first", term395779);
        setField(term395639, term395639.getClass(), "parameters", term395709);
        setField(term395889, term395889.getClass(), "kind", enum672);
        setField(term395639, term395639.getClass(), "returnType", term395889);
        setField(term395545, term395545.getClass(), "call", term395639);
        term396147 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term396241 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term396311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term396381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term396481 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term396381, term396381.getClass(), "jsType", null);
        setField(term396381, term396381.getClass(), "next", null);
        setField(term396311, term396311.getClass(), "first", term396381);
        setField(term396241, term396241.getClass(), "parameters", term396311);
        setField(term396481, term396481.getClass(), "kind", enum672);
        setField(term396241, term396241.getClass(), "returnType", term396481);
        setField(term396147, term396147.getClass(), "call", term396241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term396147;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term395545, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


