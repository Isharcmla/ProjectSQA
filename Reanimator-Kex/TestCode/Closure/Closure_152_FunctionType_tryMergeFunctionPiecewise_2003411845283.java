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

public class FunctionType_tryMergeFunctionPiecewise_2003411845283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161082;
     Object term161772;

    public FunctionType_tryMergeFunctionPiecewise_2003411845283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term164788 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term164787 = ((Class) term164788).getDeclaredField((String) "ORDINARY");
        ((Field) term164787).setAccessible(true);
        Object enum298 = ((Field) term164787).get((Object) null);
        term161082 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term161176 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term161971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term162006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term161416 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term161662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term162006, term162006.getClass(), "jsType", null);
        setField(term162006, term162006.getClass(), "next", null);
        setField(term161971, term161971.getClass(), "first", term162006);
        setField(term161971, term161971.getClass(), "jsType", null);
        setField(term161971, term161971.getClass(), "next", null);
        setField(term161176, term161176.getClass(), "parameters", term161971);
        setField(term161416, term161416.getClass(), "kind", enum298);
        setField(term161416, term161416.getClass(), "typeOfThis", term161662);
        setField(term161176, term161176.getClass(), "returnType", term161416);
        setField(term161082, term161082.getClass(), "call", term161176);
        Class<? extends Object> term165079 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term165078 = ((Class) term165079).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term165078).setAccessible(true);
        Object enum299 = ((Field) term165078).get((Object) null);
        term161772 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term161866 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term161936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term162106 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term161936, term161936.getClass(), "first", term161971);
        setField(term161866, term161866.getClass(), "parameters", term161936);
        setField(term162106, term162106.getClass(), "kind", enum299);
        setField(term162106, term162106.getClass(), "typeOfThis", null);
        setField(term161866, term161866.getClass(), "returnType", term162106);
        setField(term161772, term161772.getClass(), "call", term161866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term161772;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term161082, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


