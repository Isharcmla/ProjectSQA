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

public class FunctionTypeBuilder_inferParameterTypes_212883572179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84227;
     Object term84401;
     Object term84481;
     Object term84535;
     Object term84536;
     Object term84537;
     Object term84526;

    public FunctionTypeBuilder_inferParameterTypes_212883572179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84227 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term84331 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term84227, term84227.getClass(), "typeRegistry", term84331);
        setField(term84227, term84227.getClass(), "templateTypeName", null);
        term84401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term84401, term84401.getClass(), "first", null);
        term84481 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term84481, term84481.getClass(), "info", null);
        term84535 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term84535, term84535.getClass(), "asList", null);
        term84536 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term84536, term84536.getClass(), "info", null);
        setField(term84536, term84536.getClass(), "documentation", null);
        setField(term84536, term84536.getClass(), "sourceName", null);
        setField(term84536, term84536.getClass(), "visibility", null);
        setIntField(term84536, term84536.getClass(), "bitset", 0);
        setField(term84536, term84536.getClass(), "type", null);
        setField(term84536, term84536.getClass(), "thisType", null);
        setBooleanField(term84536, term84536.getClass(), "includeDocumentation", false);
        term84537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term84537, term84537.getClass(), "type", 0);
        setField(term84537, term84537.getClass(), "next", null);
        setField(term84537, term84537.getClass(), "first", null);
        setField(term84537, term84537.getClass(), "last", null);
        setField(term84537, term84537.getClass(), "propListHead", null);
        setIntField(term84537, term84537.getClass(), "sourcePosition", 0);
        setField(term84537, term84537.getClass(), "jsType", null);
        setField(term84537, term84537.getClass(), "parent", null);
        term84526 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term84527 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term84532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term84526, term84526.getClass(), "fnName", null);
        setField(term84526, term84526.getClass(), "compiler", null);
        setField(term84526, term84526.getClass(), "codingConvention", null);
        setField(term84527, term84527.getClass(), "reporter", null);
        setField(term84527, term84527.getClass(), "nativeTypes", null);
        setField(term84527, term84527.getClass(), "namesToTypes", null);
        setField(term84527, term84527.getClass(), "namespaces", null);
        setField(term84527, term84527.getClass(), "enumTypeNames", null);
        setField(term84527, term84527.getClass(), "forwardDeclaredTypes", null);
        setField(term84527, term84527.getClass(), "typesIndexedByProperty", null);
        setField(term84527, term84527.getClass(), "greatestSubtypeByProperty", null);
        setField(term84527, term84527.getClass(), "interfaceToImplementors", null);
        setField(term84527, term84527.getClass(), "unresolvedNamedTypes", null);
        setField(term84527, term84527.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term84527, term84527.getClass(), "lastGeneration", false);
        setField(term84527, term84527.getClass(), "templateTypeName", null);
        setField(term84527, term84527.getClass(), "templateType", null);
        setBooleanField(term84527, term84527.getClass(), "tolerateUndefinedValues", false);
        setField(term84527, term84527.getClass(), "resolveMode", null);
        setField(term84526, term84526.getClass(), "typeRegistry", term84527);
        setField(term84526, term84526.getClass(), "errorRoot", null);
        setField(term84526, term84526.getClass(), "sourceName", null);
        setField(term84526, term84526.getClass(), "scope", null);
        setField(term84526, term84526.getClass(), "returnType", null);
        setField(term84526, term84526.getClass(), "implementedInterfaces", null);
        setField(term84526, term84526.getClass(), "baseType", null);
        setField(term84526, term84526.getClass(), "thisType", null);
        setBooleanField(term84526, term84526.getClass(), "isConstructor", false);
        setBooleanField(term84526, term84526.getClass(), "isInterface", false);
        setIntField(term84532, term84532.getClass(), "type", 83);
        setField(term84532, term84532.getClass(), "next", null);
        setField(term84532, term84532.getClass(), "first", null);
        setField(term84532, term84532.getClass(), "last", null);
        setField(term84532, term84532.getClass(), "propListHead", null);
        setIntField(term84532, term84532.getClass(), "sourcePosition", -1);
        setField(term84532, term84532.getClass(), "jsType", null);
        setField(term84532, term84532.getClass(), "parent", null);
        setField(term84526, term84526.getClass(), "parametersNode", term84532);
        setField(term84526, term84526.getClass(), "sourceNode", null);
        setField(term84526, term84526.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term84401;
        args[1] = term84481;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term84227, args);
        assertTrue(recursiveEquals(term84227, term84535));
        assertTrue(recursiveEquals(term84401, term84536));
        assertTrue(recursiveEquals(term84481, term84537));
        assertTrue(recursiveEquals(retValue, term84526));
    }

};


