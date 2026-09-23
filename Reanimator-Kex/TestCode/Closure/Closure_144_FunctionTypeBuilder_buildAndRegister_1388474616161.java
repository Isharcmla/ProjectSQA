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

public class FunctionTypeBuilder_buildAndRegister_1388474616161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76810;

    public FunctionTypeBuilder_buildAndRegister_1388474616161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76810 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term76920 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term76990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77094 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term76810, term76810.getClass(), "returnType", term76920);
        setField(term76810, term76810.getClass(), "parametersNode", term76990);
        setBooleanField(term76810, term76810.getClass(), "isConstructor", true);
        setField(term76810, term76810.getClass(), "typeRegistry", term77094);
        setField(term76810, term76810.getClass(), "fnName", null);
        setField(term76810, term76810.getClass(), "sourceNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "buildAndRegister", argTypes, term76810, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


