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

public class FunctionBuilder_build_175921649063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53295;

    public FunctionBuilder_build_175921649063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53295 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term53399 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term53469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53563 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term53295, term53295.getClass(), "registry", term53399);
        setField(term53295, term53295.getClass(), "name", null);
        setField(term53295, term53295.getClass(), "sourceNode", null);
        setField(term53295, term53295.getClass(), "parametersNode", term53469);
        setField(term53295, term53295.getClass(), "returnType", term53563);
        setBooleanField(term53295, term53295.getClass(), "inferredReturnType", false);
        setField(term53295, term53295.getClass(), "typeOfThis", null);
        setField(term53295, term53295.getClass(), "templateTypeName", null);
        setBooleanField(term53295, term53295.getClass(), "isConstructor", false);
        setBooleanField(term53295, term53295.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "build", argTypes, term53295, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


