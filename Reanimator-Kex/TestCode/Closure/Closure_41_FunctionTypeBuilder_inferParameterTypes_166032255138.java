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

public class FunctionTypeBuilder_inferParameterTypes_166032255138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4097;

    public FunctionTypeBuilder_inferParameterTypes_166032255138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4097 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term4097, term4097.getClass(), "fnName", null);
        setField(term4097, term4097.getClass(), "compiler", null);
        setField(term4097, term4097.getClass(), "codingConvention", null);
        setField(term4097, term4097.getClass(), "typeRegistry", null);
        setField(term4097, term4097.getClass(), "errorRoot", null);
        setField(term4097, term4097.getClass(), "sourceName", null);
        setField(term4097, term4097.getClass(), "scope", null);
        setField(term4097, term4097.getClass(), "contents", null);
        setField(term4097, term4097.getClass(), "returnType", null);
        setBooleanField(term4097, term4097.getClass(), "returnTypeInferred", false);
        setField(term4097, term4097.getClass(), "implementedInterfaces", null);
        setField(term4097, term4097.getClass(), "extendedInterfaces", null);
        setField(term4097, term4097.getClass(), "baseType", null);
        setField(term4097, term4097.getClass(), "thisType", null);
        setBooleanField(term4097, term4097.getClass(), "isConstructor", false);
        setBooleanField(term4097, term4097.getClass(), "isInterface", false);
        setField(term4097, term4097.getClass(), "parametersNode", null);
        setField(term4097, term4097.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term4097, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


