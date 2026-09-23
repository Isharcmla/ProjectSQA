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

public class FunctionBuilder_build_1759216490239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174660;

    public FunctionBuilder_build_1759216490239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174660 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term174764 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term174834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term174764, term174764.getClass(), "nativeTypes", null);
        setField(term174660, term174660.getClass(), "registry", term174764);
        setField(term174660, term174660.getClass(), "name", null);
        setField(term174660, term174660.getClass(), "sourceNode", null);
        setField(term174660, term174660.getClass(), "parametersNode", term174834);
        setField(term174660, term174660.getClass(), "returnType", null);
        setBooleanField(term174660, term174660.getClass(), "inferredReturnType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "build", argTypes, term174660, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


