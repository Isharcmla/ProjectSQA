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

public class FunctionType_tryMergeFunctionPiecewise_2003411845189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99723;
     Object term100157;

    public FunctionType_tryMergeFunctionPiecewise_2003411845189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99723 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term99817 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term100286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100057 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term100321, term100321.getClass(), "jsType", null);
        setField(term100321, term100321.getClass(), "next", null);
        setField(term100286, term100286.getClass(), "first", term100321);
        setField(term99817, term99817.getClass(), "parameters", term100286);
        setField(term99817, term99817.getClass(), "returnType", term100057);
        setField(term99723, term99723.getClass(), "call", term99817);
        term100157 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term100251 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term100421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term100251, term100251.getClass(), "parameters", term100286);
        setField(term100251, term100251.getClass(), "returnType", term100421);
        setField(term100157, term100157.getClass(), "call", term100251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term100157;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term99723, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


