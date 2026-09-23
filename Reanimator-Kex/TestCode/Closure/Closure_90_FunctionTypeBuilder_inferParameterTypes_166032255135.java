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

public class FunctionTypeBuilder_inferParameterTypes_166032255135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8034;

    public FunctionTypeBuilder_inferParameterTypes_166032255135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8034 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term8034, term8034.getClass(), "fnName", null);
        setField(term8034, term8034.getClass(), "compiler", null);
        setField(term8034, term8034.getClass(), "codingConvention", null);
        setField(term8034, term8034.getClass(), "typeRegistry", null);
        setField(term8034, term8034.getClass(), "errorRoot", null);
        setField(term8034, term8034.getClass(), "sourceName", null);
        setField(term8034, term8034.getClass(), "scope", null);
        setField(term8034, term8034.getClass(), "returnType", null);
        setBooleanField(term8034, term8034.getClass(), "returnTypeInferred", false);
        setField(term8034, term8034.getClass(), "implementedInterfaces", null);
        setField(term8034, term8034.getClass(), "baseType", null);
        setField(term8034, term8034.getClass(), "thisType", null);
        setBooleanField(term8034, term8034.getClass(), "isConstructor", false);
        setBooleanField(term8034, term8034.getClass(), "isInterface", false);
        setField(term8034, term8034.getClass(), "parametersNode", null);
        setField(term8034, term8034.getClass(), "sourceNode", null);
        setField(term8034, term8034.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term8034, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


