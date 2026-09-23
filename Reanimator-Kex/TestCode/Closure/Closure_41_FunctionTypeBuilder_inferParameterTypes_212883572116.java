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

public class FunctionTypeBuilder_inferParameterTypes_212883572116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35166;
     Object term35236;
     Object term35316;
     Object term35781;
     Object term35782;
     Object term35783;
     Object term35774;

    public FunctionTypeBuilder_inferParameterTypes_212883572116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35166 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term35166, term35166.getClass(), "parametersNode", null);
        setField(term35166, term35166.getClass(), "typeRegistry", null);
        setField(term35166, term35166.getClass(), "templateTypeName", null);
        term35236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term35236, term35236.getClass(), "first", null);
        term35316 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term35316, term35316.getClass(), "info", null);
        term35781 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term35781, term35781.getClass(), "asList", null);
        term35782 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term35782, term35782.getClass(), "info", null);
        setField(term35782, term35782.getClass(), "documentation", null);
        setField(term35782, term35782.getClass(), "associatedNode", null);
        setField(term35782, term35782.getClass(), "visibility", null);
        setIntField(term35782, term35782.getClass(), "bitset", 0);
        setField(term35782, term35782.getClass(), "type", null);
        setField(term35782, term35782.getClass(), "thisType", null);
        setBooleanField(term35782, term35782.getClass(), "includeDocumentation", false);
        term35783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35783, term35783.getClass(), "type", 0);
        setField(term35783, term35783.getClass(), "next", null);
        setField(term35783, term35783.getClass(), "first", null);
        setField(term35783, term35783.getClass(), "last", null);
        setField(term35783, term35783.getClass(), "propListHead", null);
        setIntField(term35783, term35783.getClass(), "sourcePosition", 0);
        setField(term35783, term35783.getClass(), "jsType", null);
        setField(term35783, term35783.getClass(), "parent", null);
        term35774 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term35778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term35774, term35774.getClass(), "fnName", null);
        setField(term35774, term35774.getClass(), "compiler", null);
        setField(term35774, term35774.getClass(), "codingConvention", null);
        setField(term35774, term35774.getClass(), "typeRegistry", null);
        setField(term35774, term35774.getClass(), "errorRoot", null);
        setField(term35774, term35774.getClass(), "sourceName", null);
        setField(term35774, term35774.getClass(), "scope", null);
        setField(term35774, term35774.getClass(), "contents", null);
        setField(term35774, term35774.getClass(), "returnType", null);
        setBooleanField(term35774, term35774.getClass(), "returnTypeInferred", false);
        setField(term35774, term35774.getClass(), "implementedInterfaces", null);
        setField(term35774, term35774.getClass(), "extendedInterfaces", null);
        setField(term35774, term35774.getClass(), "baseType", null);
        setField(term35774, term35774.getClass(), "thisType", null);
        setBooleanField(term35774, term35774.getClass(), "isConstructor", false);
        setBooleanField(term35774, term35774.getClass(), "isInterface", false);
        setIntField(term35778, term35778.getClass(), "type", 83);
        setField(term35778, term35778.getClass(), "next", null);
        setField(term35778, term35778.getClass(), "first", null);
        setField(term35778, term35778.getClass(), "last", null);
        setField(term35778, term35778.getClass(), "propListHead", null);
        setIntField(term35778, term35778.getClass(), "sourcePosition", -1);
        setField(term35778, term35778.getClass(), "jsType", null);
        setField(term35778, term35778.getClass(), "parent", null);
        setField(term35774, term35774.getClass(), "parametersNode", term35778);
        setField(term35774, term35774.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term35236;
        args[1] = term35316;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term35166, args);
        assertTrue(recursiveEquals(term35166, term35781));
        assertTrue(recursiveEquals(term35236, term35782));
        assertTrue(recursiveEquals(term35316, term35783));
        assertTrue(recursiveEquals(retValue, term35774));
    }

};


