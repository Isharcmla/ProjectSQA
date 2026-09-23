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

public class FunctionType_tryMergeFunctionPiecewise_2003411845383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348006;
     Object term348504;

    public FunctionType_tryMergeFunctionPiecewise_2003411845383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term348006 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term348100 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term348170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term348703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term348738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term348404 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term348703, term348703.getClass(), "jsType", null);
        setField(term348738, term348738.getClass(), "jsType", null);
        setField(term348738, term348738.getClass(), "next", null);
        setField(term348703, term348703.getClass(), "next", term348738);
        setField(term348170, term348170.getClass(), "first", term348703);
        setField(term348100, term348100.getClass(), "parameters", term348170);
        setField(term348100, term348100.getClass(), "returnType", term348404);
        setField(term348006, term348006.getClass(), "call", term348100);
        term348504 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term348598 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term348668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term348852 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term348668, term348668.getClass(), "first", term348703);
        setField(term348598, term348598.getClass(), "parameters", term348668);
        setField(term348598, term348598.getClass(), "returnType", term348852);
        setField(term348504, term348504.getClass(), "call", term348598);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term348504;
        args[1] = false;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term348006, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


