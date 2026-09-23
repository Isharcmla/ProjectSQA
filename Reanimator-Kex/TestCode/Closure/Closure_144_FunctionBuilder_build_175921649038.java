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

public class FunctionBuilder_build_175921649038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41701;

    public FunctionBuilder_build_175921649038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41701 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term41771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41871 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term41701, term41701.getClass(), "registry", null);
        setField(term41701, term41701.getClass(), "name", null);
        setField(term41701, term41701.getClass(), "sourceNode", term41771);
        setField(term41701, term41701.getClass(), "parametersNode", null);
        setField(term41701, term41701.getClass(), "returnType", term41871);
        setBooleanField(term41701, term41701.getClass(), "inferredReturnType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "build", argTypes, term41701, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


