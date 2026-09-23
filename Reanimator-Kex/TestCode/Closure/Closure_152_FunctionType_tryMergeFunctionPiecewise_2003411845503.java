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

public class FunctionType_tryMergeFunctionPiecewise_2003411845503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450355;
     Object term450935;

    public FunctionType_tryMergeFunctionPiecewise_2003411845503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term452032 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term452031 = ((Class) term452032).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term452031).setAccessible(true);
        Object enum739 = ((Field) term452031).get((Object) null);
        term450355 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term450449 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term450519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term450589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term451224 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term450589, term450589.getClass(), "jsType", null);
        setField(term450589, term450589.getClass(), "next", null);
        setField(term450519, term450519.getClass(), "first", term450589);
        setField(term450449, term450449.getClass(), "parameters", term450519);
        setField(term451224, term451224.getClass(), "kind", enum739);
        setField(term450449, term450449.getClass(), "returnType", term451224);
        setBooleanField(term450449, term450449.getClass(), "returnTypeInferred", true);
        setField(term450355, term450355.getClass(), "call", term450449);
        setField(term450355, term450355.getClass(), "typeOfThis", null);
        term450935 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term451029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term451099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term451169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term451169, term451169.getClass(), "jsType", null);
        setField(term451169, term451169.getClass(), "next", null);
        setField(term451099, term451099.getClass(), "first", term451169);
        setField(term451029, term451029.getClass(), "parameters", term451099);
        setField(term451029, term451029.getClass(), "returnType", term451224);
        setField(term450935, term450935.getClass(), "call", term451029);
        setField(term450935, term450935.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term450935;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term450355, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


