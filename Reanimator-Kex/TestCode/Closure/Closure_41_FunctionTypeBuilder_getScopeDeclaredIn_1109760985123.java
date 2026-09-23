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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class FunctionTypeBuilder_getScopeDeclaredIn_1109760985123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37160;
     Object term37206;

    public FunctionTypeBuilder_getScopeDeclaredIn_1109760985123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37160 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term37160, term37160.getClass(), "fnName", "");
        term37206 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term37206, term37206.getClass(), "fnName", "");
        setField(term37206, term37206.getClass(), "compiler", null);
        setField(term37206, term37206.getClass(), "codingConvention", null);
        setField(term37206, term37206.getClass(), "typeRegistry", null);
        setField(term37206, term37206.getClass(), "errorRoot", null);
        setField(term37206, term37206.getClass(), "sourceName", null);
        setField(term37206, term37206.getClass(), "scope", null);
        setField(term37206, term37206.getClass(), "contents", null);
        setField(term37206, term37206.getClass(), "returnType", null);
        setBooleanField(term37206, term37206.getClass(), "returnTypeInferred", false);
        setField(term37206, term37206.getClass(), "implementedInterfaces", null);
        setField(term37206, term37206.getClass(), "extendedInterfaces", null);
        setField(term37206, term37206.getClass(), "baseType", null);
        setField(term37206, term37206.getClass(), "thisType", null);
        setBooleanField(term37206, term37206.getClass(), "isConstructor", false);
        setBooleanField(term37206, term37206.getClass(), "isInterface", false);
        setField(term37206, term37206.getClass(), "parametersNode", null);
        setField(term37206, term37206.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getScopeDeclaredIn", argTypes, term37160, args);
        assertTrue(recursiveEquals(term37160, term37206));
        assertTrue(recursiveEquals(retValue, null));
    }

};


