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

public class FunctionTypeBuilder_inferParameterTypes_1660322551127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65545;
     Object term65729;
     Object term66053;
     Object term66054;
     Object term66044;

    public FunctionTypeBuilder_inferParameterTypes_1660322551127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65545 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term65649 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term65545, term65545.getClass(), "typeRegistry", term65649);
        setField(term65545, term65545.getClass(), "templateTypeName", null);
        term65729 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term65729, term65729.getClass(), "info", null);
        term66053 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term66053, term66053.getClass(), "asList", null);
        term66054 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term66054, term66054.getClass(), "info", null);
        setField(term66054, term66054.getClass(), "documentation", null);
        setField(term66054, term66054.getClass(), "sourceName", null);
        setField(term66054, term66054.getClass(), "visibility", null);
        setIntField(term66054, term66054.getClass(), "bitset", 0);
        setField(term66054, term66054.getClass(), "type", null);
        setField(term66054, term66054.getClass(), "thisType", null);
        setBooleanField(term66054, term66054.getClass(), "includeDocumentation", false);
        term66044 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term66045 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term66050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term66044, term66044.getClass(), "fnName", null);
        setField(term66044, term66044.getClass(), "compiler", null);
        setField(term66044, term66044.getClass(), "codingConvention", null);
        setField(term66045, term66045.getClass(), "reporter", null);
        setField(term66045, term66045.getClass(), "nativeTypes", null);
        setField(term66045, term66045.getClass(), "namesToTypes", null);
        setField(term66045, term66045.getClass(), "namespaces", null);
        setField(term66045, term66045.getClass(), "enumTypeNames", null);
        setField(term66045, term66045.getClass(), "forwardDeclaredTypes", null);
        setField(term66045, term66045.getClass(), "typesIndexedByProperty", null);
        setField(term66045, term66045.getClass(), "greatestSubtypeByProperty", null);
        setField(term66045, term66045.getClass(), "interfaceToImplementors", null);
        setField(term66045, term66045.getClass(), "unresolvedNamedTypes", null);
        setField(term66045, term66045.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term66045, term66045.getClass(), "lastGeneration", false);
        setField(term66045, term66045.getClass(), "templateTypeName", null);
        setField(term66045, term66045.getClass(), "templateType", null);
        setBooleanField(term66045, term66045.getClass(), "tolerateUndefinedValues", false);
        setField(term66045, term66045.getClass(), "resolveMode", null);
        setField(term66044, term66044.getClass(), "typeRegistry", term66045);
        setField(term66044, term66044.getClass(), "errorRoot", null);
        setField(term66044, term66044.getClass(), "sourceName", null);
        setField(term66044, term66044.getClass(), "scope", null);
        setField(term66044, term66044.getClass(), "returnType", null);
        setField(term66044, term66044.getClass(), "implementedInterfaces", null);
        setField(term66044, term66044.getClass(), "baseType", null);
        setField(term66044, term66044.getClass(), "thisType", null);
        setBooleanField(term66044, term66044.getClass(), "isConstructor", false);
        setBooleanField(term66044, term66044.getClass(), "isInterface", false);
        setIntField(term66050, term66050.getClass(), "type", 83);
        setField(term66050, term66050.getClass(), "next", null);
        setField(term66050, term66050.getClass(), "first", null);
        setField(term66050, term66050.getClass(), "last", null);
        setField(term66050, term66050.getClass(), "propListHead", null);
        setIntField(term66050, term66050.getClass(), "sourcePosition", -1);
        setField(term66050, term66050.getClass(), "jsType", null);
        setField(term66050, term66050.getClass(), "parent", null);
        setField(term66044, term66044.getClass(), "parametersNode", term66050);
        setField(term66044, term66044.getClass(), "sourceNode", null);
        setField(term66044, term66044.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term65729;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term65545, args);
        assertTrue(recursiveEquals(term65545, term66053));
        assertTrue(recursiveEquals(term65729, term66054));
        assertTrue(recursiveEquals(retValue, term66044));
    }

};


