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

public class FunctionTypeBuilder_inferParameterTypes_1660322551101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48913;
     Object term49063;
     Object term49956;
     Object term49957;
     Object term49949;

    public FunctionTypeBuilder_inferParameterTypes_1660322551101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48913 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term48983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term48913, term48913.getClass(), "parametersNode", term48983);
        term49063 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term49063, term49063.getClass(), "info", null);
        term49956 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term49956, term49956.getClass(), "asList", null);
        term49957 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term49957, term49957.getClass(), "info", null);
        setField(term49957, term49957.getClass(), "documentation", null);
        setField(term49957, term49957.getClass(), "sourceName", null);
        setField(term49957, term49957.getClass(), "visibility", null);
        setIntField(term49957, term49957.getClass(), "bitset", 0);
        setField(term49957, term49957.getClass(), "type", null);
        setField(term49957, term49957.getClass(), "thisType", null);
        setBooleanField(term49957, term49957.getClass(), "includeDocumentation", false);
        term49949 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term49953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49949, term49949.getClass(), "fnName", null);
        setField(term49949, term49949.getClass(), "compiler", null);
        setField(term49949, term49949.getClass(), "codingConvention", null);
        setField(term49949, term49949.getClass(), "typeRegistry", null);
        setField(term49949, term49949.getClass(), "errorRoot", null);
        setField(term49949, term49949.getClass(), "sourceName", null);
        setField(term49949, term49949.getClass(), "scope", null);
        setField(term49949, term49949.getClass(), "returnType", null);
        setBooleanField(term49949, term49949.getClass(), "returnTypeInferred", false);
        setField(term49949, term49949.getClass(), "implementedInterfaces", null);
        setField(term49949, term49949.getClass(), "baseType", null);
        setField(term49949, term49949.getClass(), "thisType", null);
        setBooleanField(term49949, term49949.getClass(), "isConstructor", false);
        setBooleanField(term49949, term49949.getClass(), "isInterface", false);
        setIntField(term49953, term49953.getClass(), "type", 83);
        setField(term49953, term49953.getClass(), "next", null);
        setField(term49953, term49953.getClass(), "first", null);
        setField(term49953, term49953.getClass(), "last", null);
        setField(term49953, term49953.getClass(), "propListHead", null);
        setIntField(term49953, term49953.getClass(), "sourcePosition", -1);
        setField(term49953, term49953.getClass(), "jsType", null);
        setField(term49953, term49953.getClass(), "parent", null);
        setField(term49949, term49949.getClass(), "parametersNode", term49953);
        setField(term49949, term49949.getClass(), "sourceNode", null);
        setField(term49949, term49949.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term49063;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term48913, args);
        assertTrue(recursiveEquals(term48913, term49956));
        assertTrue(recursiveEquals(term49063, term49957));
        assertTrue(recursiveEquals(retValue, term49949));
    }

};


