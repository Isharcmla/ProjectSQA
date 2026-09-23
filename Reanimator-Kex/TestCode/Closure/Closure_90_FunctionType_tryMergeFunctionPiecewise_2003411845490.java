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

public class FunctionType_tryMergeFunctionPiecewise_2003411845490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410054;
     Object term410552;

    public FunctionType_tryMergeFunctionPiecewise_2003411845490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term410054 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term410148 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term410218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term410751, term410751.getClass(), "jsType", null);
        setField(term410786, term410786.getClass(), "jsType", null);
        setField(term410786, term410786.getClass(), "next", null);
        setField(term410751, term410751.getClass(), "next", term410786);
        setField(term410218, term410218.getClass(), "first", term410751);
        setField(term410148, term410148.getClass(), "parameters", term410218);
        setField(term410148, term410148.getClass(), "returnType", term410452);
        setField(term410054, term410054.getClass(), "call", term410148);
        term410552 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term410646 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term410716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term410886 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term410716, term410716.getClass(), "first", term410751);
        setField(term410646, term410646.getClass(), "parameters", term410716);
        setField(term410646, term410646.getClass(), "returnType", term410886);
        setField(term410552, term410552.getClass(), "call", term410646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term410552;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term410054, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


