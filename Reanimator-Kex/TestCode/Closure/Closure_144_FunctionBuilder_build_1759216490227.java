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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionBuilder_build_1759216490227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162104;

    public FunctionBuilder_build_1759216490227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162104 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term162208 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term161642 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        Object term162316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term162208, term162208.getClass(), "nativeTypes", term161642);
        setField(term162104, term162104.getClass(), "registry", term162208);
        setField(term162104, term162104.getClass(), "name", "");
        setField(term162104, term162104.getClass(), "sourceNode", term162316);
        setField(term162104, term162104.getClass(), "parametersNode", null);
        setField(term162104, term162104.getClass(), "returnType", null);
        setBooleanField(term162104, term162104.getClass(), "inferredReturnType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "build", argTypes, term162104, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


