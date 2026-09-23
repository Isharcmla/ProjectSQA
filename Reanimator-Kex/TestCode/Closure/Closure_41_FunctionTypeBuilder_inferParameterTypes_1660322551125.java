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

public class FunctionTypeBuilder_inferParameterTypes_1660322551125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37350;
     Object term37500;
     Object term37570;
     Object term37571;
     Object term37563;

    public FunctionTypeBuilder_inferParameterTypes_1660322551125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37350 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term37420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term37350, term37350.getClass(), "parametersNode", term37420);
        term37500 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term37500, term37500.getClass(), "info", null);
        term37570 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term37570, term37570.getClass(), "asList", null);
        term37571 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term37571, term37571.getClass(), "info", null);
        setField(term37571, term37571.getClass(), "documentation", null);
        setField(term37571, term37571.getClass(), "associatedNode", null);
        setField(term37571, term37571.getClass(), "visibility", null);
        setIntField(term37571, term37571.getClass(), "bitset", 0);
        setField(term37571, term37571.getClass(), "type", null);
        setField(term37571, term37571.getClass(), "thisType", null);
        setBooleanField(term37571, term37571.getClass(), "includeDocumentation", false);
        term37563 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term37567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term37563, term37563.getClass(), "fnName", null);
        setField(term37563, term37563.getClass(), "compiler", null);
        setField(term37563, term37563.getClass(), "codingConvention", null);
        setField(term37563, term37563.getClass(), "typeRegistry", null);
        setField(term37563, term37563.getClass(), "errorRoot", null);
        setField(term37563, term37563.getClass(), "sourceName", null);
        setField(term37563, term37563.getClass(), "scope", null);
        setField(term37563, term37563.getClass(), "contents", null);
        setField(term37563, term37563.getClass(), "returnType", null);
        setBooleanField(term37563, term37563.getClass(), "returnTypeInferred", false);
        setField(term37563, term37563.getClass(), "implementedInterfaces", null);
        setField(term37563, term37563.getClass(), "extendedInterfaces", null);
        setField(term37563, term37563.getClass(), "baseType", null);
        setField(term37563, term37563.getClass(), "thisType", null);
        setBooleanField(term37563, term37563.getClass(), "isConstructor", false);
        setBooleanField(term37563, term37563.getClass(), "isInterface", false);
        setIntField(term37567, term37567.getClass(), "type", 83);
        setField(term37567, term37567.getClass(), "next", null);
        setField(term37567, term37567.getClass(), "first", null);
        setField(term37567, term37567.getClass(), "last", null);
        setField(term37567, term37567.getClass(), "propListHead", null);
        setIntField(term37567, term37567.getClass(), "sourcePosition", -1);
        setField(term37567, term37567.getClass(), "jsType", null);
        setField(term37567, term37567.getClass(), "parent", null);
        setField(term37563, term37563.getClass(), "parametersNode", term37567);
        setField(term37563, term37563.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term37500;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term37350, args);
        assertTrue(recursiveEquals(term37350, term37570));
        assertTrue(recursiveEquals(term37500, term37571));
        assertTrue(recursiveEquals(retValue, term37563));
    }

};


