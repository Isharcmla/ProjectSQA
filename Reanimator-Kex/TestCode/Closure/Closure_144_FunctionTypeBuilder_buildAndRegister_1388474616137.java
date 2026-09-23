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

public class FunctionTypeBuilder_buildAndRegister_1388474616137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70019;

    public FunctionTypeBuilder_buildAndRegister_1388474616137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70019 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term70109 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term70179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term70019, term70019.getClass(), "returnType", term70109);
        setField(term70019, term70019.getClass(), "parametersNode", term70179);
        setBooleanField(term70019, term70019.getClass(), "isConstructor", false);
        setBooleanField(term70019, term70019.getClass(), "isInterface", true);
        setField(term70019, term70019.getClass(), "typeRegistry", term70283);
        setField(term70019, term70019.getClass(), "fnName", null);
        setField(term70019, term70019.getClass(), "sourceNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "buildAndRegister", argTypes, term70019, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


