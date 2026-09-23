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

public class FunctionTypeBuilder_buildAndRegister_1388474616176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52554;

    public FunctionTypeBuilder_buildAndRegister_1388474616176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52554 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term52646 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        Object term52716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52858 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents"));
        setField(term52554, term52554.getClass(), "returnType", term52646);
        setField(term52554, term52554.getClass(), "parametersNode", term52716);
        setBooleanField(term52554, term52554.getClass(), "isConstructor", false);
        setBooleanField(term52554, term52554.getClass(), "isInterface", false);
        setField(term52554, term52554.getClass(), "typeRegistry", null);
        setField(term52554, term52554.getClass(), "fnName", null);
        setField(term52554, term52554.getClass(), "contents", term52858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "buildAndRegister", argTypes, term52554, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


