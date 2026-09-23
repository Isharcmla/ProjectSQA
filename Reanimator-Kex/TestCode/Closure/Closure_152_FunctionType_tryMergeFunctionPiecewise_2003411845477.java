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

public class FunctionType_tryMergeFunctionPiecewise_2003411845477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411741;
     Object term411527;

    public FunctionType_tryMergeFunctionPiecewise_2003411845477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term413085 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term413084 = ((Class) term413085).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term413084).setAccessible(true);
        Object enum680 = ((Field) term413084).get((Object) null);
        Class<? extends Object> term413385 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term413384 = ((Class) term413385).getDeclaredField((String) "ORDINARY");
        ((Field) term413384).setAccessible(true);
        Object enum681 = ((Field) term413384).get((Object) null);
        term411741 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term411788 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term411823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411878 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term411691, term411691.getClass(), "jsType", null);
        setField(term411691, term411691.getClass(), "next", null);
        setField(term411656, term411656.getClass(), "first", term411691);
        setField(term411656, term411656.getClass(), "jsType", null);
        setField(term411656, term411656.getClass(), "next", null);
        setField(term411823, term411823.getClass(), "first", term411656);
        setField(term411788, term411788.getClass(), "parameters", term411823);
        setField(term411878, term411878.getClass(), "kind", enum680);
        setField(term411788, term411788.getClass(), "returnType", term411878);
        setField(term411741, term411741.getClass(), "call", term411788);
        setField(term411741, term411741.getClass(), "kind", enum681);
        term411527 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term411621 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term411621, term411621.getClass(), "parameters", term411656);
        setField(term411621, term411621.getClass(), "returnType", term411741);
        setField(term411527, term411527.getClass(), "call", term411621);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term411527;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term411741, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


