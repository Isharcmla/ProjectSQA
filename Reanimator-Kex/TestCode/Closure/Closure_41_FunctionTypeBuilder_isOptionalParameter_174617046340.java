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

public class FunctionTypeBuilder_isOptionalParameter_174617046340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5558;

    public FunctionTypeBuilder_isOptionalParameter_174617046340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5558 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term5558, term5558.getClass(), "fnName", null);
        setField(term5558, term5558.getClass(), "compiler", null);
        setField(term5558, term5558.getClass(), "codingConvention", null);
        setField(term5558, term5558.getClass(), "typeRegistry", null);
        setField(term5558, term5558.getClass(), "errorRoot", null);
        setField(term5558, term5558.getClass(), "sourceName", null);
        setField(term5558, term5558.getClass(), "scope", null);
        setField(term5558, term5558.getClass(), "contents", null);
        setField(term5558, term5558.getClass(), "returnType", null);
        setBooleanField(term5558, term5558.getClass(), "returnTypeInferred", false);
        setField(term5558, term5558.getClass(), "implementedInterfaces", null);
        setField(term5558, term5558.getClass(), "extendedInterfaces", null);
        setField(term5558, term5558.getClass(), "baseType", null);
        setField(term5558, term5558.getClass(), "thisType", null);
        setBooleanField(term5558, term5558.getClass(), "isConstructor", false);
        setBooleanField(term5558, term5558.getClass(), "isInterface", false);
        setField(term5558, term5558.getClass(), "parametersNode", null);
        setField(term5558, term5558.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "isOptionalParameter", argTypes, term5558, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


