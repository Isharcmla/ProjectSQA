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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionType_tryMergeFunctionPiecewise_2003411845303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194116;
     Object term194474;

    public FunctionType_tryMergeFunctionPiecewise_2003411845303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194116 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term194210 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term194603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term194374 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term194603, term194603.getClass(), "first", null);
        setField(term194210, term194210.getClass(), "parameters", term194603);
        setField(term194210, term194210.getClass(), "returnType", term194374);
        setField(term194116, term194116.getClass(), "call", term194210);
        term194474 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term194568 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term194697 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term194568, term194568.getClass(), "parameters", term194603);
        setField(term194568, term194568.getClass(), "returnType", term194697);
        setField(term194474, term194474.getClass(), "call", term194568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term194474;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term194116, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


