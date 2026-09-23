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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionType_tryMergeFunctionPiecewise_2003411845163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79106;

    public FunctionType_tryMergeFunctionPiecewise_2003411845163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79106 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term79153 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term79188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term79188, term79188.getClass(), "first", null);
        setField(term79153, term79153.getClass(), "parameters", term79188);
        setField(term79106, term79106.getClass(), "call", term79153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term79106;
        args[1] = false;
        callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term79106, args);
    }

};


