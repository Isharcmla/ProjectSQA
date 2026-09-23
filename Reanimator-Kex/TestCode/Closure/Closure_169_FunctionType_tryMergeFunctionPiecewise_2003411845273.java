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

public class FunctionType_tryMergeFunctionPiecewise_2003411845273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262974;
     Object term263548;

    public FunctionType_tryMergeFunctionPiecewise_2003411845273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term263068 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term263138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263448 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term263208, term263208.getClass(), "jsType", null);
        setField(term263817, term263817.getClass(), "jsType", null);
        setField(term263852, term263852.getClass(), "jsType", null);
        setField(term263852, term263852.getClass(), "next", null);
        setField(term263817, term263817.getClass(), "next", term263852);
        setField(term263208, term263208.getClass(), "next", term263817);
        setField(term263138, term263138.getClass(), "first", term263208);
        setField(term263068, term263068.getClass(), "parameters", term263138);
        setField(term263068, term263068.getClass(), "returnType", term263448);
        setField(term262974, term262974.getClass(), "call", term263068);
        term263548 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term263642 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term263712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263952 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term263782, term263782.getClass(), "jsType", null);
        setField(term263782, term263782.getClass(), "next", term263817);
        setField(term263712, term263712.getClass(), "first", term263782);
        setField(term263642, term263642.getClass(), "parameters", term263712);
        setField(term263642, term263642.getClass(), "returnType", term263952);
        setField(term263548, term263548.getClass(), "call", term263642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term263548;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term262974, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


