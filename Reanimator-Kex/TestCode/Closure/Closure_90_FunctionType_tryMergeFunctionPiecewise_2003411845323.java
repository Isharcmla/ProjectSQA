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

public class FunctionType_tryMergeFunctionPiecewise_2003411845323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214871;
     Object term214692;

    public FunctionType_tryMergeFunctionPiecewise_2003411845323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term215711 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term215710 = ((Class) term215711).getDeclaredField((String) "ORDINARY");
        ((Field) term215710).setAccessible(true);
        Object enum377 = ((Field) term215710).get((Object) null);
        term214871 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term214918 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term214821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term214968 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term214821, term214821.getClass(), "first", term214821);
        setField(term214821, term214821.getClass(), "jsType", null);
        setField(term214821, term214821.getClass(), "next", null);
        setField(term214918, term214918.getClass(), "parameters", term214821);
        setField(term214968, term214968.getClass(), "kind", enum377);
        setField(term214918, term214918.getClass(), "returnType", term214968);
        setField(term214871, term214871.getClass(), "call", term214918);
        setField(term214871, term214871.getClass(), "kind", enum377);
        term214692 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term214786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term214786, term214786.getClass(), "parameters", term214821);
        setField(term214786, term214786.getClass(), "returnType", term214871);
        setField(term214692, term214692.getClass(), "call", term214786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term214692;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term214871, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


