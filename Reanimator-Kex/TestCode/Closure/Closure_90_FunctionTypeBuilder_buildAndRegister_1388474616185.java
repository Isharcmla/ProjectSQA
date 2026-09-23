package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionTypeBuilder_buildAndRegister_1388474616185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74209;

    public FunctionTypeBuilder_buildAndRegister_1388474616185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74209 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term74319 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term74389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74493 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term74209, term74209.getClass(), "returnType", term74319);
        setField(term74209, term74209.getClass(), "parametersNode", term74389);
        setBooleanField(term74209, term74209.getClass(), "isConstructor", true);
        setField(term74209, term74209.getClass(), "typeRegistry", term74493);
        setField(term74209, term74209.getClass(), "fnName", null);
        setField(term74209, term74209.getClass(), "sourceNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "buildAndRegister", argTypes, term74209, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


