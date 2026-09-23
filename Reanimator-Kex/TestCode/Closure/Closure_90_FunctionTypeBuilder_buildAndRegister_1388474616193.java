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

public class FunctionTypeBuilder_buildAndRegister_1388474616193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76575;

    public FunctionTypeBuilder_buildAndRegister_1388474616193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76575 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term76671 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        Object term76741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76845 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term76575, term76575.getClass(), "returnType", term76671);
        setField(term76575, term76575.getClass(), "parametersNode", term76741);
        setBooleanField(term76575, term76575.getClass(), "isConstructor", false);
        setBooleanField(term76575, term76575.getClass(), "isInterface", true);
        setField(term76575, term76575.getClass(), "typeRegistry", term76845);
        setField(term76575, term76575.getClass(), "fnName", null);
        setField(term76575, term76575.getClass(), "sourceNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "buildAndRegister", argTypes, term76575, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


