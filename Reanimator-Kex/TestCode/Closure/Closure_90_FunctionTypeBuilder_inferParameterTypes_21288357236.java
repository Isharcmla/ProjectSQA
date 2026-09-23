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

public class FunctionTypeBuilder_inferParameterTypes_21288357236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9268;
     Object term26408;
     Object term26404;

    public FunctionTypeBuilder_inferParameterTypes_21288357236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9268 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term9268, term9268.getClass(), "fnName", null);
        setField(term9268, term9268.getClass(), "compiler", null);
        setField(term9268, term9268.getClass(), "codingConvention", null);
        setField(term9268, term9268.getClass(), "typeRegistry", null);
        setField(term9268, term9268.getClass(), "errorRoot", null);
        setField(term9268, term9268.getClass(), "sourceName", null);
        setField(term9268, term9268.getClass(), "scope", null);
        setField(term9268, term9268.getClass(), "returnType", null);
        setBooleanField(term9268, term9268.getClass(), "returnTypeInferred", false);
        setField(term9268, term9268.getClass(), "implementedInterfaces", null);
        setField(term9268, term9268.getClass(), "baseType", null);
        setField(term9268, term9268.getClass(), "thisType", null);
        setBooleanField(term9268, term9268.getClass(), "isConstructor", false);
        setBooleanField(term9268, term9268.getClass(), "isInterface", false);
        setField(term9268, term9268.getClass(), "parametersNode", null);
        setField(term9268, term9268.getClass(), "sourceNode", null);
        setField(term9268, term9268.getClass(), "templateTypeName", null);
        term26408 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term26408, term26408.getClass(), "fnName", null);
        setField(term26408, term26408.getClass(), "compiler", null);
        setField(term26408, term26408.getClass(), "codingConvention", null);
        setField(term26408, term26408.getClass(), "typeRegistry", null);
        setField(term26408, term26408.getClass(), "errorRoot", null);
        setField(term26408, term26408.getClass(), "sourceName", null);
        setField(term26408, term26408.getClass(), "scope", null);
        setField(term26408, term26408.getClass(), "returnType", null);
        setBooleanField(term26408, term26408.getClass(), "returnTypeInferred", false);
        setField(term26408, term26408.getClass(), "implementedInterfaces", null);
        setField(term26408, term26408.getClass(), "baseType", null);
        setField(term26408, term26408.getClass(), "thisType", null);
        setBooleanField(term26408, term26408.getClass(), "isConstructor", false);
        setBooleanField(term26408, term26408.getClass(), "isInterface", false);
        setField(term26408, term26408.getClass(), "parametersNode", null);
        setField(term26408, term26408.getClass(), "sourceNode", null);
        setField(term26408, term26408.getClass(), "templateTypeName", null);
        term26404 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term26404, term26404.getClass(), "fnName", null);
        setField(term26404, term26404.getClass(), "compiler", null);
        setField(term26404, term26404.getClass(), "codingConvention", null);
        setField(term26404, term26404.getClass(), "typeRegistry", null);
        setField(term26404, term26404.getClass(), "errorRoot", null);
        setField(term26404, term26404.getClass(), "sourceName", null);
        setField(term26404, term26404.getClass(), "scope", null);
        setField(term26404, term26404.getClass(), "returnType", null);
        setBooleanField(term26404, term26404.getClass(), "returnTypeInferred", false);
        setField(term26404, term26404.getClass(), "implementedInterfaces", null);
        setField(term26404, term26404.getClass(), "baseType", null);
        setField(term26404, term26404.getClass(), "thisType", null);
        setBooleanField(term26404, term26404.getClass(), "isConstructor", false);
        setBooleanField(term26404, term26404.getClass(), "isInterface", false);
        setField(term26404, term26404.getClass(), "parametersNode", null);
        setField(term26404, term26404.getClass(), "sourceNode", null);
        setField(term26404, term26404.getClass(), "templateTypeName", null);
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
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term9268, args);
        assertTrue(recursiveEquals(term9268, term26408));
        assertTrue(recursiveEquals(retValue, term26404));
    }

};


