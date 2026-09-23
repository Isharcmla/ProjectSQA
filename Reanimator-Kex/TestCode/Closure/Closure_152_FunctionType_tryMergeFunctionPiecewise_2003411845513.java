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

public class FunctionType_tryMergeFunctionPiecewise_2003411845513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term464699;
     Object term465221;

    public FunctionType_tryMergeFunctionPiecewise_2003411845513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term466312 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term466311 = ((Class) term466312).getDeclaredField((String) "INTERFACE");
        ((Field) term466311).setAccessible(true);
        Object enum759 = ((Field) term466311).get((Object) null);
        term464699 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term464793 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term464863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term464963 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term464863, term464863.getClass(), "first", term464863);
        setField(term464863, term464863.getClass(), "jsType", null);
        setField(term464863, term464863.getClass(), "next", null);
        setField(term464793, term464793.getClass(), "parameters", term464863);
        setField(term464963, term464963.getClass(), "kind", enum759);
        setField(term464793, term464793.getClass(), "returnType", term464963);
        setField(term464699, term464699.getClass(), "call", term464793);
        term465221 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term465315 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term465385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term465455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term465555 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term465455, term465455.getClass(), "jsType", null);
        setField(term465455, term465455.getClass(), "next", null);
        setField(term465385, term465385.getClass(), "first", term465455);
        setField(term465315, term465315.getClass(), "parameters", term465385);
        setField(term465555, term465555.getClass(), "kind", enum759);
        setField(term465315, term465315.getClass(), "returnType", term465555);
        setField(term465221, term465221.getClass(), "call", term465315);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term465221;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term464699, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


