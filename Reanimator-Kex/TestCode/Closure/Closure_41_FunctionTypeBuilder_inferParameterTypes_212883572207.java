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

public class FunctionTypeBuilder_inferParameterTypes_212883572207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64940;
     Object term65150;
     Object term65230;
     Object term65782;
     Object term65783;
     Object term65784;
     Object term65775;

    public FunctionTypeBuilder_inferParameterTypes_212883572207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64940 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term65010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term65010, term65010.getClass(), "first", term65080);
        setField(term64940, term64940.getClass(), "parametersNode", term65010);
        setField(term64940, term64940.getClass(), "typeRegistry", null);
        term65150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term65230 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term65782 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term65782, term65782.getClass(), "asList", null);
        term65783 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term65783, term65783.getClass(), "info", null);
        setField(term65783, term65783.getClass(), "documentation", null);
        setField(term65783, term65783.getClass(), "associatedNode", null);
        setField(term65783, term65783.getClass(), "visibility", null);
        setIntField(term65783, term65783.getClass(), "bitset", 0);
        setField(term65783, term65783.getClass(), "type", null);
        setField(term65783, term65783.getClass(), "thisType", null);
        setBooleanField(term65783, term65783.getClass(), "includeDocumentation", false);
        term65784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65784, term65784.getClass(), "type", 0);
        setField(term65784, term65784.getClass(), "next", null);
        setField(term65784, term65784.getClass(), "first", null);
        setField(term65784, term65784.getClass(), "last", null);
        setField(term65784, term65784.getClass(), "propListHead", null);
        setIntField(term65784, term65784.getClass(), "sourcePosition", 0);
        setField(term65784, term65784.getClass(), "jsType", null);
        setField(term65784, term65784.getClass(), "parent", null);
        term65775 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term65779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term65775, term65775.getClass(), "fnName", null);
        setField(term65775, term65775.getClass(), "compiler", null);
        setField(term65775, term65775.getClass(), "codingConvention", null);
        setField(term65775, term65775.getClass(), "typeRegistry", null);
        setField(term65775, term65775.getClass(), "errorRoot", null);
        setField(term65775, term65775.getClass(), "sourceName", null);
        setField(term65775, term65775.getClass(), "scope", null);
        setField(term65775, term65775.getClass(), "contents", null);
        setField(term65775, term65775.getClass(), "returnType", null);
        setBooleanField(term65775, term65775.getClass(), "returnTypeInferred", false);
        setField(term65775, term65775.getClass(), "implementedInterfaces", null);
        setField(term65775, term65775.getClass(), "extendedInterfaces", null);
        setField(term65775, term65775.getClass(), "baseType", null);
        setField(term65775, term65775.getClass(), "thisType", null);
        setBooleanField(term65775, term65775.getClass(), "isConstructor", false);
        setBooleanField(term65775, term65775.getClass(), "isInterface", false);
        setIntField(term65779, term65779.getClass(), "type", 83);
        setField(term65779, term65779.getClass(), "next", null);
        setField(term65779, term65779.getClass(), "first", null);
        setField(term65779, term65779.getClass(), "last", null);
        setField(term65779, term65779.getClass(), "propListHead", null);
        setIntField(term65779, term65779.getClass(), "sourcePosition", -1);
        setField(term65779, term65779.getClass(), "jsType", null);
        setField(term65779, term65779.getClass(), "parent", null);
        setField(term65775, term65775.getClass(), "parametersNode", term65779);
        setField(term65775, term65775.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term65150;
        args[1] = term65230;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term64940, args);
        assertTrue(recursiveEquals(term64940, term65782));
        assertTrue(recursiveEquals(term65150, term65783));
        assertTrue(recursiveEquals(term65230, term65784));
        assertTrue(recursiveEquals(retValue, term65775));
    }

};


