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

public class FunctionTypeBuilder_buildAndRegister_1388474616229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74233;

    public FunctionTypeBuilder_buildAndRegister_1388474616229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74233 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term74325 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        Object term74395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term74649 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder$UnknownFunctionContents"));
        setField(term74233, term74233.getClass(), "returnType", term74325);
        setField(term74233, term74233.getClass(), "parametersNode", term74395);
        setBooleanField(term74233, term74233.getClass(), "isConstructor", false);
        setBooleanField(term74233, term74233.getClass(), "isInterface", true);
        setField(term74233, term74233.getClass(), "typeRegistry", term74499);
        setField(term74233, term74233.getClass(), "fnName", null);
        setField(term74233, term74233.getClass(), "contents", term74649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "buildAndRegister", argTypes, term74233, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


