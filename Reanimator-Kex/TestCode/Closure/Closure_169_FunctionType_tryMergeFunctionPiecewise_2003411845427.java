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

public class FunctionType_tryMergeFunctionPiecewise_2003411845427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390858;
     Object term391216;

    public FunctionType_tryMergeFunctionPiecewise_2003411845427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term390858 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term390952 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term391345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term391116 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term391345, term391345.getClass(), "first", null);
        setField(term390952, term390952.getClass(), "parameters", term391345);
        setField(term390952, term390952.getClass(), "returnType", term391116);
        setField(term390858, term390858.getClass(), "call", term390952);
        term391216 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term391310 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term391439 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term391310, term391310.getClass(), "parameters", term391345);
        setField(term391310, term391310.getClass(), "returnType", term391439);
        setField(term391216, term391216.getClass(), "call", term391310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term391216;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term390858, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


