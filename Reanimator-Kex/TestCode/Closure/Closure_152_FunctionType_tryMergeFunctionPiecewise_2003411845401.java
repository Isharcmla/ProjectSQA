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

public class FunctionType_tryMergeFunctionPiecewise_2003411845401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308881;
     Object term309483;

    public FunctionType_tryMergeFunctionPiecewise_2003411845401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term310597 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term310596 = ((Class) term310597).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term310596).setAccessible(true);
        Object enum535 = ((Field) term310596).get((Object) null);
        term308881 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term308975 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term309045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term309115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term309225 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term309115, term309115.getClass(), "jsType", null);
        setField(term309115, term309115.getClass(), "next", null);
        setField(term309045, term309045.getClass(), "first", term309115);
        setField(term308975, term308975.getClass(), "parameters", term309045);
        setField(term309225, term309225.getClass(), "kind", enum535);
        setField(term308975, term308975.getClass(), "returnType", term309225);
        setField(term308881, term308881.getClass(), "call", term308975);
        term309483 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term309577 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term309647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term309717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term309817 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term309717, term309717.getClass(), "jsType", null);
        setField(term309717, term309717.getClass(), "next", null);
        setField(term309647, term309647.getClass(), "first", term309717);
        setField(term309577, term309577.getClass(), "parameters", term309647);
        setField(term309817, term309817.getClass(), "kind", enum535);
        setField(term309577, term309577.getClass(), "returnType", term309817);
        setField(term309483, term309483.getClass(), "call", term309577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term309483;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term308881, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


