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

public class FunctionType_tryMergeFunctionPiecewise_2003411845561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term528118;
     Object term528806;

    public FunctionType_tryMergeFunctionPiecewise_2003411845561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term531079 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term531078 = ((Class) term531079).getDeclaredField((String) "ORDINARY");
        ((Field) term531078).setAccessible(true);
        Object enum835 = ((Field) term531078).get((Object) null);
        term528118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term528212 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term528282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term528352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term528462 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term528718 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term528352, term528352.getClass(), "jsType", null);
        setField(term528352, term528352.getClass(), "next", null);
        setField(term528282, term528282.getClass(), "first", term528352);
        setField(term528212, term528212.getClass(), "parameters", term528282);
        setField(term528462, term528462.getClass(), "kind", enum835);
        setField(term528462, term528462.getClass(), "typeOfThis", term528718);
        setField(term528212, term528212.getClass(), "returnType", term528462);
        setField(term528118, term528118.getClass(), "call", term528212);
        Class<? extends Object> term531370 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term531369 = ((Class) term531370).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term531369).setAccessible(true);
        Object enum836 = ((Field) term531369).get((Object) null);
        term528806 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term528900 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term528970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term529040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term529150 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term529040, term529040.getClass(), "jsType", null);
        setField(term529040, term529040.getClass(), "next", null);
        setField(term528970, term528970.getClass(), "first", term529040);
        setField(term528900, term528900.getClass(), "parameters", term528970);
        setField(term529150, term529150.getClass(), "kind", enum836);
        setField(term529150, term529150.getClass(), "typeOfThis", null);
        setField(term528900, term528900.getClass(), "returnType", term529150);
        setField(term528806, term528806.getClass(), "call", term528900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term528806;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term528118, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


