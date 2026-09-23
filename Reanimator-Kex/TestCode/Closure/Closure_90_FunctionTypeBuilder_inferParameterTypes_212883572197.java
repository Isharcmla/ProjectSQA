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

public class FunctionTypeBuilder_inferParameterTypes_212883572197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78228;
     Object term78438;
     Object term78518;
     Object term79024;
     Object term79025;
     Object term79026;
     Object term79017;

    public FunctionTypeBuilder_inferParameterTypes_212883572197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78228 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term78298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term78298, term78298.getClass(), "first", term78368);
        setField(term78228, term78228.getClass(), "parametersNode", term78298);
        setField(term78228, term78228.getClass(), "typeRegistry", null);
        term78438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term78438, term78438.getClass(), "first", null);
        term78518 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term78518, term78518.getClass(), "info", null);
        term79024 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term79024, term79024.getClass(), "asList", null);
        term79025 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term79025, term79025.getClass(), "info", null);
        setField(term79025, term79025.getClass(), "documentation", null);
        setField(term79025, term79025.getClass(), "sourceName", null);
        setField(term79025, term79025.getClass(), "visibility", null);
        setIntField(term79025, term79025.getClass(), "bitset", 0);
        setField(term79025, term79025.getClass(), "type", null);
        setField(term79025, term79025.getClass(), "thisType", null);
        setBooleanField(term79025, term79025.getClass(), "includeDocumentation", false);
        term79026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term79026, term79026.getClass(), "type", 0);
        setField(term79026, term79026.getClass(), "next", null);
        setField(term79026, term79026.getClass(), "first", null);
        setField(term79026, term79026.getClass(), "last", null);
        setField(term79026, term79026.getClass(), "propListHead", null);
        setIntField(term79026, term79026.getClass(), "sourcePosition", 0);
        setField(term79026, term79026.getClass(), "jsType", null);
        setField(term79026, term79026.getClass(), "parent", null);
        term79017 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term79021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term79017, term79017.getClass(), "fnName", null);
        setField(term79017, term79017.getClass(), "compiler", null);
        setField(term79017, term79017.getClass(), "codingConvention", null);
        setField(term79017, term79017.getClass(), "typeRegistry", null);
        setField(term79017, term79017.getClass(), "errorRoot", null);
        setField(term79017, term79017.getClass(), "sourceName", null);
        setField(term79017, term79017.getClass(), "scope", null);
        setField(term79017, term79017.getClass(), "returnType", null);
        setBooleanField(term79017, term79017.getClass(), "returnTypeInferred", false);
        setField(term79017, term79017.getClass(), "implementedInterfaces", null);
        setField(term79017, term79017.getClass(), "baseType", null);
        setField(term79017, term79017.getClass(), "thisType", null);
        setBooleanField(term79017, term79017.getClass(), "isConstructor", false);
        setBooleanField(term79017, term79017.getClass(), "isInterface", false);
        setIntField(term79021, term79021.getClass(), "type", 83);
        setField(term79021, term79021.getClass(), "next", null);
        setField(term79021, term79021.getClass(), "first", null);
        setField(term79021, term79021.getClass(), "last", null);
        setField(term79021, term79021.getClass(), "propListHead", null);
        setIntField(term79021, term79021.getClass(), "sourcePosition", -1);
        setField(term79021, term79021.getClass(), "jsType", null);
        setField(term79021, term79021.getClass(), "parent", null);
        setField(term79017, term79017.getClass(), "parametersNode", term79021);
        setField(term79017, term79017.getClass(), "sourceNode", null);
        setField(term79017, term79017.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term78438;
        args[1] = term78518;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term78228, args);
        assertTrue(recursiveEquals(term78228, term79024));
        assertTrue(recursiveEquals(term78438, term79025));
        assertTrue(recursiveEquals(term78518, term79026));
        assertTrue(recursiveEquals(retValue, term79017));
    }

};


