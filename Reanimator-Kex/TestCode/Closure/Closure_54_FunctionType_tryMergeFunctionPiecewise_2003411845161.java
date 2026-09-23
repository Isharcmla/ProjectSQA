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

public class FunctionType_tryMergeFunctionPiecewise_2003411845161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77984;
     Object term78388;

    public FunctionType_tryMergeFunctionPiecewise_2003411845161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77984 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term78078 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term78148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term78218, term78218.getClass(), "jsType", null);
        setField(term78218, term78218.getClass(), "next", term78657);
        setField(term78148, term78148.getClass(), "first", term78218);
        setField(term78078, term78078.getClass(), "parameters", term78148);
        setField(term77984, term77984.getClass(), "call", term78078);
        term78388 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term78482 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term78552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term78622, term78622.getClass(), "jsType", null);
        setField(term78622, term78622.getClass(), "next", term78657);
        setField(term78552, term78552.getClass(), "first", term78622);
        setField(term78482, term78482.getClass(), "parameters", term78552);
        setField(term78388, term78388.getClass(), "call", term78482);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term78388;
        args[1] = false;
        callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term77984, args);
    }

};


