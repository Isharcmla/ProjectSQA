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

public class FunctionTypeBuilder_inferThisType_107389744178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24474;
     Object term24554;
     Object term25923;
     Object term25924;

    public FunctionTypeBuilder_inferThisType_107389744178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24474 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term24554 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term25923 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term25923, term25923.getClass(), "fnName", null);
        setField(term25923, term25923.getClass(), "compiler", null);
        setField(term25923, term25923.getClass(), "codingConvention", null);
        setField(term25923, term25923.getClass(), "typeRegistry", null);
        setField(term25923, term25923.getClass(), "errorRoot", null);
        setField(term25923, term25923.getClass(), "sourceName", null);
        setField(term25923, term25923.getClass(), "scope", null);
        setField(term25923, term25923.getClass(), "contents", null);
        setField(term25923, term25923.getClass(), "returnType", null);
        setBooleanField(term25923, term25923.getClass(), "returnTypeInferred", false);
        setField(term25923, term25923.getClass(), "implementedInterfaces", null);
        setField(term25923, term25923.getClass(), "extendedInterfaces", null);
        setField(term25923, term25923.getClass(), "baseType", null);
        setField(term25923, term25923.getClass(), "thisType", null);
        setBooleanField(term25923, term25923.getClass(), "isConstructor", false);
        setBooleanField(term25923, term25923.getClass(), "isInterface", false);
        setField(term25923, term25923.getClass(), "parametersNode", null);
        setField(term25923, term25923.getClass(), "templateTypeName", null);
        term25924 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term25924, term25924.getClass(), "info", null);
        setField(term25924, term25924.getClass(), "documentation", null);
        setField(term25924, term25924.getClass(), "associatedNode", null);
        setField(term25924, term25924.getClass(), "visibility", null);
        setIntField(term25924, term25924.getClass(), "bitset", 0);
        setField(term25924, term25924.getClass(), "type", null);
        setField(term25924, term25924.getClass(), "thisType", null);
        setBooleanField(term25924, term25924.getClass(), "includeDocumentation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term24554;
        callMethod(klass, "inferThisType", argTypes, term24474, args);
        assertTrue(recursiveEquals(term24474, term25923));
        assertTrue(recursiveEquals(term24554, term25924));
    }

};


