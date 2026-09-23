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

public class FunctionTypeBuilder_buildAndRegister_1388474616209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65913;

    public FunctionTypeBuilder_buildAndRegister_1388474616209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65913 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term66007 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term66077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66227 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder$UnknownFunctionContents"));
        setField(term65913, term65913.getClass(), "returnType", term66007);
        setField(term65913, term65913.getClass(), "parametersNode", term66077);
        setBooleanField(term65913, term65913.getClass(), "isConstructor", false);
        setBooleanField(term65913, term65913.getClass(), "isInterface", true);
        setField(term65913, term65913.getClass(), "typeRegistry", null);
        setField(term65913, term65913.getClass(), "fnName", null);
        setField(term65913, term65913.getClass(), "contents", term66227);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "buildAndRegister", argTypes, term65913, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


