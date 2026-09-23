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

public class FunctionTypeBuilder_inferParameterTypes_1660322551148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62773;
     Object term62993;
     Object term63062;
     Object term63063;
     Object term63055;

    public FunctionTypeBuilder_inferParameterTypes_1660322551148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62773 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term62843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term62843, term62843.getClass(), "first", term62913);
        setField(term62773, term62773.getClass(), "parametersNode", term62843);
        setField(term62773, term62773.getClass(), "typeRegistry", null);
        term62993 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term62993, term62993.getClass(), "info", null);
        term63062 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term63062, term63062.getClass(), "asList", null);
        term63063 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term63063, term63063.getClass(), "info", null);
        setField(term63063, term63063.getClass(), "documentation", null);
        setField(term63063, term63063.getClass(), "sourceName", null);
        setField(term63063, term63063.getClass(), "visibility", null);
        setIntField(term63063, term63063.getClass(), "bitset", 0);
        setField(term63063, term63063.getClass(), "type", null);
        setField(term63063, term63063.getClass(), "thisType", null);
        setBooleanField(term63063, term63063.getClass(), "includeDocumentation", false);
        term63055 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term63059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term63055, term63055.getClass(), "fnName", null);
        setField(term63055, term63055.getClass(), "compiler", null);
        setField(term63055, term63055.getClass(), "codingConvention", null);
        setField(term63055, term63055.getClass(), "typeRegistry", null);
        setField(term63055, term63055.getClass(), "errorRoot", null);
        setField(term63055, term63055.getClass(), "sourceName", null);
        setField(term63055, term63055.getClass(), "scope", null);
        setField(term63055, term63055.getClass(), "returnType", null);
        setBooleanField(term63055, term63055.getClass(), "returnTypeInferred", false);
        setField(term63055, term63055.getClass(), "implementedInterfaces", null);
        setField(term63055, term63055.getClass(), "baseType", null);
        setField(term63055, term63055.getClass(), "thisType", null);
        setBooleanField(term63055, term63055.getClass(), "isConstructor", false);
        setBooleanField(term63055, term63055.getClass(), "isInterface", false);
        setIntField(term63059, term63059.getClass(), "type", 83);
        setField(term63059, term63059.getClass(), "next", null);
        setField(term63059, term63059.getClass(), "first", null);
        setField(term63059, term63059.getClass(), "last", null);
        setField(term63059, term63059.getClass(), "propListHead", null);
        setIntField(term63059, term63059.getClass(), "sourcePosition", -1);
        setField(term63059, term63059.getClass(), "jsType", null);
        setField(term63059, term63059.getClass(), "parent", null);
        setField(term63055, term63055.getClass(), "parametersNode", term63059);
        setField(term63055, term63055.getClass(), "sourceNode", null);
        setField(term63055, term63055.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term62993;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term62773, args);
        assertTrue(recursiveEquals(term62773, term63062));
        assertTrue(recursiveEquals(term62993, term63063));
        assertTrue(recursiveEquals(retValue, term63055));
    }

};


