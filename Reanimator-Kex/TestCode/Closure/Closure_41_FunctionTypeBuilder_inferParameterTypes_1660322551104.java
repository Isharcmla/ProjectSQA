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

public class FunctionTypeBuilder_inferParameterTypes_1660322551104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31394;
     Object term31474;
     Object term32089;
     Object term32090;
     Object term32082;

    public FunctionTypeBuilder_inferParameterTypes_1660322551104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31394 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term31394, term31394.getClass(), "parametersNode", null);
        setField(term31394, term31394.getClass(), "typeRegistry", null);
        term31474 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term31474, term31474.getClass(), "info", null);
        term32089 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term32089, term32089.getClass(), "asList", null);
        term32090 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term32090, term32090.getClass(), "info", null);
        setField(term32090, term32090.getClass(), "documentation", null);
        setField(term32090, term32090.getClass(), "associatedNode", null);
        setField(term32090, term32090.getClass(), "visibility", null);
        setIntField(term32090, term32090.getClass(), "bitset", 0);
        setField(term32090, term32090.getClass(), "type", null);
        setField(term32090, term32090.getClass(), "thisType", null);
        setBooleanField(term32090, term32090.getClass(), "includeDocumentation", false);
        term32082 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term32086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term32082, term32082.getClass(), "fnName", null);
        setField(term32082, term32082.getClass(), "compiler", null);
        setField(term32082, term32082.getClass(), "codingConvention", null);
        setField(term32082, term32082.getClass(), "typeRegistry", null);
        setField(term32082, term32082.getClass(), "errorRoot", null);
        setField(term32082, term32082.getClass(), "sourceName", null);
        setField(term32082, term32082.getClass(), "scope", null);
        setField(term32082, term32082.getClass(), "contents", null);
        setField(term32082, term32082.getClass(), "returnType", null);
        setBooleanField(term32082, term32082.getClass(), "returnTypeInferred", false);
        setField(term32082, term32082.getClass(), "implementedInterfaces", null);
        setField(term32082, term32082.getClass(), "extendedInterfaces", null);
        setField(term32082, term32082.getClass(), "baseType", null);
        setField(term32082, term32082.getClass(), "thisType", null);
        setBooleanField(term32082, term32082.getClass(), "isConstructor", false);
        setBooleanField(term32082, term32082.getClass(), "isInterface", false);
        setIntField(term32086, term32086.getClass(), "type", 83);
        setField(term32086, term32086.getClass(), "next", null);
        setField(term32086, term32086.getClass(), "first", null);
        setField(term32086, term32086.getClass(), "last", null);
        setField(term32086, term32086.getClass(), "propListHead", null);
        setIntField(term32086, term32086.getClass(), "sourcePosition", -1);
        setField(term32086, term32086.getClass(), "jsType", null);
        setField(term32086, term32086.getClass(), "parent", null);
        setField(term32082, term32082.getClass(), "parametersNode", term32086);
        setField(term32082, term32082.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term31474;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term31394, args);
        assertTrue(recursiveEquals(term31394, term32089));
        assertTrue(recursiveEquals(term31474, term32090));
        assertTrue(recursiveEquals(retValue, term32082));
    }

};


