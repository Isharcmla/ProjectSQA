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

public class FunctionTypeBuilder_inferParameterTypes_212883572281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105986;
     Object term106266;
     Object term106346;
     Object term106418;
     Object term106419;
     Object term106420;
     Object term106408;

    public FunctionTypeBuilder_inferParameterTypes_212883572281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105986 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term106072 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term106176 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term106072, term106072.getClass(), "first", null);
        setField(term105986, term105986.getClass(), "parametersNode", term106072);
        setField(term105986, term105986.getClass(), "typeRegistry", term106176);
        term106266 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        term106346 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term106346, term106346.getClass(), "info", null);
        term106418 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term106418, term106418.getClass(), "asList", null);
        term106419 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term106419, term106419.getClass(), "info", null);
        setField(term106419, term106419.getClass(), "documentation", null);
        setField(term106419, term106419.getClass(), "sourceName", null);
        setField(term106419, term106419.getClass(), "visibility", null);
        setIntField(term106419, term106419.getClass(), "bitset", 0);
        setField(term106419, term106419.getClass(), "type", null);
        setField(term106419, term106419.getClass(), "thisType", null);
        setBooleanField(term106419, term106419.getClass(), "includeDocumentation", false);
        term106420 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term106420, term106420.getClass(), "encodedSourceStart", 0);
        setIntField(term106420, term106420.getClass(), "encodedSourceEnd", 0);
        setField(term106420, term106420.getClass(), "sourceName", null);
        setIntField(term106420, term106420.getClass(), "baseLineno", 0);
        setIntField(term106420, term106420.getClass(), "endLineno", 0);
        setField(term106420, term106420.getClass(), "functions", null);
        setField(term106420, term106420.getClass(), "regexps", null);
        setField(term106420, term106420.getClass(), "itsVariables", null);
        setField(term106420, term106420.getClass(), "itsConst", null);
        setField(term106420, term106420.getClass(), "itsVariableNames", null);
        setIntField(term106420, term106420.getClass(), "varStart", 0);
        setField(term106420, term106420.getClass(), "compilerData", null);
        setIntField(term106420, term106420.getClass(), "type", 0);
        setField(term106420, term106420.getClass(), "next", null);
        setField(term106420, term106420.getClass(), "first", null);
        setField(term106420, term106420.getClass(), "last", null);
        setField(term106420, term106420.getClass(), "propListHead", null);
        setIntField(term106420, term106420.getClass(), "sourcePosition", 0);
        setField(term106420, term106420.getClass(), "jsType", null);
        setField(term106420, term106420.getClass(), "parent", null);
        term106408 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term106409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term106415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term106408, term106408.getClass(), "fnName", null);
        setField(term106408, term106408.getClass(), "compiler", null);
        setField(term106408, term106408.getClass(), "codingConvention", null);
        setField(term106409, term106409.getClass(), "reporter", null);
        setField(term106409, term106409.getClass(), "nativeTypes", null);
        setField(term106409, term106409.getClass(), "namesToTypes", null);
        setField(term106409, term106409.getClass(), "namespaces", null);
        setField(term106409, term106409.getClass(), "nonNullableTypeNames", null);
        setField(term106409, term106409.getClass(), "forwardDeclaredTypes", null);
        setField(term106409, term106409.getClass(), "typesIndexedByProperty", null);
        setField(term106409, term106409.getClass(), "greatestSubtypeByProperty", null);
        setField(term106409, term106409.getClass(), "interfaceToImplementors", null);
        setField(term106409, term106409.getClass(), "unresolvedNamedTypes", null);
        setField(term106409, term106409.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term106409, term106409.getClass(), "lastGeneration", false);
        setField(term106409, term106409.getClass(), "templateTypeName", null);
        setField(term106409, term106409.getClass(), "templateType", null);
        setBooleanField(term106409, term106409.getClass(), "tolerateUndefinedValues", false);
        setField(term106409, term106409.getClass(), "resolveMode", null);
        setField(term106408, term106408.getClass(), "typeRegistry", term106409);
        setField(term106408, term106408.getClass(), "errorRoot", null);
        setField(term106408, term106408.getClass(), "sourceName", null);
        setField(term106408, term106408.getClass(), "scope", null);
        setField(term106408, term106408.getClass(), "returnType", null);
        setBooleanField(term106408, term106408.getClass(), "returnTypeInferred", false);
        setField(term106408, term106408.getClass(), "implementedInterfaces", null);
        setField(term106408, term106408.getClass(), "baseType", null);
        setField(term106408, term106408.getClass(), "thisType", null);
        setBooleanField(term106408, term106408.getClass(), "isConstructor", false);
        setBooleanField(term106408, term106408.getClass(), "isInterface", false);
        setIntField(term106415, term106415.getClass(), "type", 83);
        setField(term106415, term106415.getClass(), "next", null);
        setField(term106415, term106415.getClass(), "first", null);
        setField(term106415, term106415.getClass(), "last", null);
        setField(term106415, term106415.getClass(), "propListHead", null);
        setIntField(term106415, term106415.getClass(), "sourcePosition", -1);
        setField(term106415, term106415.getClass(), "jsType", null);
        setField(term106415, term106415.getClass(), "parent", null);
        setField(term106408, term106408.getClass(), "parametersNode", term106415);
        setField(term106408, term106408.getClass(), "sourceNode", null);
        setField(term106408, term106408.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term106266;
        args[1] = term106346;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term105986, args);
        assertTrue(recursiveEquals(term105986, term106418));
        assertTrue(recursiveEquals(term106266, term106419));
        assertTrue(recursiveEquals(term106346, term106420));
        assertTrue(recursiveEquals(retValue, term106408));
    }

};


