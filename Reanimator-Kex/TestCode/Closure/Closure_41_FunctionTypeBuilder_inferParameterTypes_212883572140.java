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
import java.lang.Object;

public class FunctionTypeBuilder_inferParameterTypes_212883572140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41722;
     Object term41827;
     Object term41976;
     Object term41978;
     Object term41969;

    public FunctionTypeBuilder_inferParameterTypes_212883572140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41722 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term41827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term41722, term41722.getClass(), "parametersNode", term41827);
        term41976 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term41977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term41976, term41976.getClass(), "fnName", null);
        setField(term41976, term41976.getClass(), "compiler", null);
        setField(term41976, term41976.getClass(), "codingConvention", null);
        setField(term41976, term41976.getClass(), "typeRegistry", null);
        setField(term41976, term41976.getClass(), "errorRoot", null);
        setField(term41976, term41976.getClass(), "sourceName", null);
        setField(term41976, term41976.getClass(), "scope", null);
        setField(term41976, term41976.getClass(), "contents", null);
        setField(term41976, term41976.getClass(), "returnType", null);
        setBooleanField(term41976, term41976.getClass(), "returnTypeInferred", false);
        setField(term41976, term41976.getClass(), "implementedInterfaces", null);
        setField(term41976, term41976.getClass(), "extendedInterfaces", null);
        setField(term41976, term41976.getClass(), "baseType", null);
        setField(term41976, term41976.getClass(), "thisType", null);
        setBooleanField(term41976, term41976.getClass(), "isConstructor", false);
        setBooleanField(term41976, term41976.getClass(), "isInterface", false);
        setIntField(term41977, term41977.getClass(), "type", 83);
        setField(term41977, term41977.getClass(), "next", null);
        setField(term41977, term41977.getClass(), "first", null);
        setField(term41977, term41977.getClass(), "last", null);
        setField(term41977, term41977.getClass(), "propListHead", null);
        setIntField(term41977, term41977.getClass(), "sourcePosition", -1);
        setField(term41977, term41977.getClass(), "jsType", null);
        setField(term41977, term41977.getClass(), "parent", null);
        setField(term41976, term41976.getClass(), "parametersNode", term41977);
        setField(term41976, term41976.getClass(), "templateTypeName", null);
        term41978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41978, term41978.getClass(), "type", 0);
        setField(term41978, term41978.getClass(), "next", null);
        setField(term41978, term41978.getClass(), "first", null);
        setField(term41978, term41978.getClass(), "last", null);
        setField(term41978, term41978.getClass(), "propListHead", null);
        setIntField(term41978, term41978.getClass(), "sourcePosition", 0);
        setField(term41978, term41978.getClass(), "jsType", null);
        setField(term41978, term41978.getClass(), "parent", null);
        term41969 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term41973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term41969, term41969.getClass(), "fnName", null);
        setField(term41969, term41969.getClass(), "compiler", null);
        setField(term41969, term41969.getClass(), "codingConvention", null);
        setField(term41969, term41969.getClass(), "typeRegistry", null);
        setField(term41969, term41969.getClass(), "errorRoot", null);
        setField(term41969, term41969.getClass(), "sourceName", null);
        setField(term41969, term41969.getClass(), "scope", null);
        setField(term41969, term41969.getClass(), "contents", null);
        setField(term41969, term41969.getClass(), "returnType", null);
        setBooleanField(term41969, term41969.getClass(), "returnTypeInferred", false);
        setField(term41969, term41969.getClass(), "implementedInterfaces", null);
        setField(term41969, term41969.getClass(), "extendedInterfaces", null);
        setField(term41969, term41969.getClass(), "baseType", null);
        setField(term41969, term41969.getClass(), "thisType", null);
        setBooleanField(term41969, term41969.getClass(), "isConstructor", false);
        setBooleanField(term41969, term41969.getClass(), "isInterface", false);
        setIntField(term41973, term41973.getClass(), "type", 83);
        setField(term41973, term41973.getClass(), "next", null);
        setField(term41973, term41973.getClass(), "first", null);
        setField(term41973, term41973.getClass(), "last", null);
        setField(term41973, term41973.getClass(), "propListHead", null);
        setIntField(term41973, term41973.getClass(), "sourcePosition", -1);
        setField(term41973, term41973.getClass(), "jsType", null);
        setField(term41973, term41973.getClass(), "parent", null);
        setField(term41969, term41969.getClass(), "parametersNode", term41973);
        setField(term41969, term41969.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term41827;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term41722, args);
        assertTrue(recursiveEquals(term41722, term41976));
        assertTrue(recursiveEquals(term41827, term41978));
        assertTrue(recursiveEquals(retValue, term41969));
    }

};


