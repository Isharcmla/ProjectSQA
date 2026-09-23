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

public class FunctionType_tryMergeFunctionPiecewise_2003411845321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212034;
     Object term212626;

    public FunctionType_tryMergeFunctionPiecewise_2003411845321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term213633 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term213632 = ((Class) term213633).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term213632).setAccessible(true);
        Object enum375 = ((Field) term213632).get((Object) null);
        term212034 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term212128 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term212198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term212268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term212368 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term212268, term212268.getClass(), "jsType", null);
        setField(term212268, term212268.getClass(), "next", null);
        setField(term212198, term212198.getClass(), "first", term212268);
        setField(term212128, term212128.getClass(), "parameters", term212198);
        setField(term212368, term212368.getClass(), "kind", enum375);
        setField(term212128, term212128.getClass(), "returnType", term212368);
        setField(term212034, term212034.getClass(), "call", term212128);
        term212626 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term212720 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term212790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term212860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term212960 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term212860, term212860.getClass(), "jsType", null);
        setField(term212860, term212860.getClass(), "next", null);
        setField(term212790, term212790.getClass(), "first", term212860);
        setField(term212720, term212720.getClass(), "parameters", term212790);
        setField(term212720, term212720.getClass(), "returnType", term212960);
        setField(term212626, term212626.getClass(), "call", term212720);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term212626;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term212034, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


