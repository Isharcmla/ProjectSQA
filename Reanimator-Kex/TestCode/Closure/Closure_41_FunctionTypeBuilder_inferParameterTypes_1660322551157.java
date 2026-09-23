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

public class FunctionTypeBuilder_inferParameterTypes_1660322551157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46692;
     Object term46912;
     Object term47020;
     Object term47021;
     Object term47013;

    public FunctionTypeBuilder_inferParameterTypes_1660322551157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46692 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term46762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term46762, term46762.getClass(), "first", term46832);
        setField(term46692, term46692.getClass(), "parametersNode", term46762);
        setField(term46692, term46692.getClass(), "typeRegistry", null);
        term46912 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term46912, term46912.getClass(), "info", null);
        term47020 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term47020, term47020.getClass(), "asList", null);
        term47021 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term47021, term47021.getClass(), "info", null);
        setField(term47021, term47021.getClass(), "documentation", null);
        setField(term47021, term47021.getClass(), "associatedNode", null);
        setField(term47021, term47021.getClass(), "visibility", null);
        setIntField(term47021, term47021.getClass(), "bitset", 0);
        setField(term47021, term47021.getClass(), "type", null);
        setField(term47021, term47021.getClass(), "thisType", null);
        setBooleanField(term47021, term47021.getClass(), "includeDocumentation", false);
        term47013 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term47017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47013, term47013.getClass(), "fnName", null);
        setField(term47013, term47013.getClass(), "compiler", null);
        setField(term47013, term47013.getClass(), "codingConvention", null);
        setField(term47013, term47013.getClass(), "typeRegistry", null);
        setField(term47013, term47013.getClass(), "errorRoot", null);
        setField(term47013, term47013.getClass(), "sourceName", null);
        setField(term47013, term47013.getClass(), "scope", null);
        setField(term47013, term47013.getClass(), "contents", null);
        setField(term47013, term47013.getClass(), "returnType", null);
        setBooleanField(term47013, term47013.getClass(), "returnTypeInferred", false);
        setField(term47013, term47013.getClass(), "implementedInterfaces", null);
        setField(term47013, term47013.getClass(), "extendedInterfaces", null);
        setField(term47013, term47013.getClass(), "baseType", null);
        setField(term47013, term47013.getClass(), "thisType", null);
        setBooleanField(term47013, term47013.getClass(), "isConstructor", false);
        setBooleanField(term47013, term47013.getClass(), "isInterface", false);
        setIntField(term47017, term47017.getClass(), "type", 83);
        setField(term47017, term47017.getClass(), "next", null);
        setField(term47017, term47017.getClass(), "first", null);
        setField(term47017, term47017.getClass(), "last", null);
        setField(term47017, term47017.getClass(), "propListHead", null);
        setIntField(term47017, term47017.getClass(), "sourcePosition", -1);
        setField(term47017, term47017.getClass(), "jsType", null);
        setField(term47017, term47017.getClass(), "parent", null);
        setField(term47013, term47013.getClass(), "parametersNode", term47017);
        setField(term47013, term47013.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term46912;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term46692, args);
        assertTrue(recursiveEquals(term46692, term47020));
        assertTrue(recursiveEquals(term46912, term47021));
        assertTrue(recursiveEquals(retValue, term47013));
    }

};


