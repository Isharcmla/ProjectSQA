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
import java.util.HashMap;

public class FunctionTypeBuilder_inferParameterTypes_212883572229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104506;
     Object term104680;
     Object term104760;
     Object term105016;
     Object term105017;
     Object term105021;
     Object term105007;

    public FunctionTypeBuilder_inferParameterTypes_212883572229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104506 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term104610 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term104506, term104506.getClass(), "typeRegistry", term104610);
        term104680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        HashMap term104932 = new HashMap();
        term104760 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term104884 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term104884, term104884.getClass(), "parameters", term104932);
        setField(term104760, term104760.getClass(), "info", term104884);
        term105016 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term105016, term105016.getClass(), "asList", null);
        HashMap term105019 = new HashMap();
        term105017 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term105018 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term105018, term105018.getClass(), "baseType", null);
        setField(term105018, term105018.getClass(), "implementedInterfaces", null);
        setField(term105018, term105018.getClass(), "parameters", term105019);
        setField(term105018, term105018.getClass(), "thrownTypes", null);
        setField(term105018, term105018.getClass(), "templateTypeName", null);
        setField(term105018, term105018.getClass(), "description", null);
        setField(term105018, term105018.getClass(), "deprecated", null);
        setField(term105018, term105018.getClass(), "license", null);
        setField(term105018, term105018.getClass(), "suppressions", null);
        setField(term105017, term105017.getClass(), "info", term105018);
        setField(term105017, term105017.getClass(), "documentation", null);
        setField(term105017, term105017.getClass(), "sourceName", null);
        setField(term105017, term105017.getClass(), "visibility", null);
        setIntField(term105017, term105017.getClass(), "bitset", 0);
        setField(term105017, term105017.getClass(), "type", null);
        setField(term105017, term105017.getClass(), "thisType", null);
        setBooleanField(term105017, term105017.getClass(), "includeDocumentation", false);
        term105021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term105021, term105021.getClass(), "type", 0);
        setField(term105021, term105021.getClass(), "next", null);
        setField(term105021, term105021.getClass(), "first", null);
        setField(term105021, term105021.getClass(), "last", null);
        setField(term105021, term105021.getClass(), "propListHead", null);
        setIntField(term105021, term105021.getClass(), "sourcePosition", 0);
        setField(term105021, term105021.getClass(), "jsType", null);
        setField(term105021, term105021.getClass(), "parent", null);
        term105007 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term105008 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term105013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term105007, term105007.getClass(), "fnName", null);
        setField(term105007, term105007.getClass(), "compiler", null);
        setField(term105007, term105007.getClass(), "codingConvention", null);
        setField(term105008, term105008.getClass(), "reporter", null);
        setField(term105008, term105008.getClass(), "nativeTypes", null);
        setField(term105008, term105008.getClass(), "namesToTypes", null);
        setField(term105008, term105008.getClass(), "namespaces", null);
        setField(term105008, term105008.getClass(), "enumTypeNames", null);
        setField(term105008, term105008.getClass(), "forwardDeclaredTypes", null);
        setField(term105008, term105008.getClass(), "typesIndexedByProperty", null);
        setField(term105008, term105008.getClass(), "greatestSubtypeByProperty", null);
        setField(term105008, term105008.getClass(), "interfaceToImplementors", null);
        setField(term105008, term105008.getClass(), "unresolvedNamedTypes", null);
        setField(term105008, term105008.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term105008, term105008.getClass(), "lastGeneration", false);
        setField(term105008, term105008.getClass(), "templateTypeName", null);
        setField(term105008, term105008.getClass(), "templateType", null);
        setBooleanField(term105008, term105008.getClass(), "tolerateUndefinedValues", false);
        setField(term105008, term105008.getClass(), "resolveMode", null);
        setField(term105007, term105007.getClass(), "typeRegistry", term105008);
        setField(term105007, term105007.getClass(), "errorRoot", null);
        setField(term105007, term105007.getClass(), "sourceName", null);
        setField(term105007, term105007.getClass(), "scope", null);
        setField(term105007, term105007.getClass(), "returnType", null);
        setField(term105007, term105007.getClass(), "implementedInterfaces", null);
        setField(term105007, term105007.getClass(), "baseType", null);
        setField(term105007, term105007.getClass(), "thisType", null);
        setBooleanField(term105007, term105007.getClass(), "isConstructor", false);
        setBooleanField(term105007, term105007.getClass(), "isInterface", false);
        setIntField(term105013, term105013.getClass(), "type", 83);
        setField(term105013, term105013.getClass(), "next", null);
        setField(term105013, term105013.getClass(), "first", null);
        setField(term105013, term105013.getClass(), "last", null);
        setField(term105013, term105013.getClass(), "propListHead", null);
        setIntField(term105013, term105013.getClass(), "sourcePosition", -1);
        setField(term105013, term105013.getClass(), "jsType", null);
        setField(term105013, term105013.getClass(), "parent", null);
        setField(term105007, term105007.getClass(), "parametersNode", term105013);
        setField(term105007, term105007.getClass(), "sourceNode", null);
        setField(term105007, term105007.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term104680;
        args[1] = term104760;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term104506, args);
        assertTrue(recursiveEquals(term104506, term105016));
        assertTrue(recursiveEquals(term104680, term105017));
        assertTrue(recursiveEquals(term104760, term105021));
        assertTrue(recursiveEquals(retValue, term105007));
    }

};


