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

public class FunctionTypeBuilder_inferParameterTypes_212883572134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57585;
     Object term57909;
     Object term58480;
     Object term58481;
     Object term58460;

    public FunctionTypeBuilder_inferParameterTypes_212883572134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57585 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term57655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57829 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term57655, term57655.getClass(), "first", term57725);
        setField(term57585, term57585.getClass(), "parametersNode", term57655);
        setField(term57585, term57585.getClass(), "typeRegistry", term57829);
        setField(term57585, term57585.getClass(), "templateTypeName", null);
        term57909 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term57909, term57909.getClass(), "info", null);
        term58480 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term58480, term58480.getClass(), "asList", null);
        term58481 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term58481, term58481.getClass(), "info", null);
        setField(term58481, term58481.getClass(), "documentation", null);
        setField(term58481, term58481.getClass(), "sourceName", null);
        setField(term58481, term58481.getClass(), "visibility", null);
        setIntField(term58481, term58481.getClass(), "bitset", 0);
        setField(term58481, term58481.getClass(), "type", null);
        setField(term58481, term58481.getClass(), "thisType", null);
        setBooleanField(term58481, term58481.getClass(), "includeDocumentation", false);
        term58460 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term58461 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term58467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term58460, term58460.getClass(), "fnName", null);
        setField(term58460, term58460.getClass(), "compiler", null);
        setField(term58460, term58460.getClass(), "codingConvention", null);
        setField(term58461, term58461.getClass(), "reporter", null);
        setField(term58461, term58461.getClass(), "nativeTypes", null);
        setField(term58461, term58461.getClass(), "namesToTypes", null);
        setField(term58461, term58461.getClass(), "namespaces", null);
        setField(term58461, term58461.getClass(), "nonNullableTypeNames", null);
        setField(term58461, term58461.getClass(), "forwardDeclaredTypes", null);
        setField(term58461, term58461.getClass(), "typesIndexedByProperty", null);
        setField(term58461, term58461.getClass(), "greatestSubtypeByProperty", null);
        setField(term58461, term58461.getClass(), "interfaceToImplementors", null);
        setField(term58461, term58461.getClass(), "unresolvedNamedTypes", null);
        setField(term58461, term58461.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term58461, term58461.getClass(), "lastGeneration", false);
        setField(term58461, term58461.getClass(), "templateTypeName", null);
        setField(term58461, term58461.getClass(), "templateType", null);
        setBooleanField(term58461, term58461.getClass(), "tolerateUndefinedValues", false);
        setField(term58461, term58461.getClass(), "resolveMode", null);
        setField(term58460, term58460.getClass(), "typeRegistry", term58461);
        setField(term58460, term58460.getClass(), "errorRoot", null);
        setField(term58460, term58460.getClass(), "sourceName", null);
        setField(term58460, term58460.getClass(), "scope", null);
        setField(term58460, term58460.getClass(), "returnType", null);
        setBooleanField(term58460, term58460.getClass(), "returnTypeInferred", false);
        setField(term58460, term58460.getClass(), "implementedInterfaces", null);
        setField(term58460, term58460.getClass(), "baseType", null);
        setField(term58460, term58460.getClass(), "thisType", null);
        setBooleanField(term58460, term58460.getClass(), "isConstructor", false);
        setBooleanField(term58460, term58460.getClass(), "isInterface", false);
        setIntField(term58467, term58467.getClass(), "type", 83);
        setField(term58467, term58467.getClass(), "next", null);
        setField(term58467, term58467.getClass(), "first", null);
        setField(term58467, term58467.getClass(), "last", null);
        setField(term58467, term58467.getClass(), "propListHead", null);
        setIntField(term58467, term58467.getClass(), "sourcePosition", -1);
        setField(term58467, term58467.getClass(), "jsType", null);
        setField(term58467, term58467.getClass(), "parent", null);
        setField(term58460, term58460.getClass(), "parametersNode", term58467);
        setField(term58460, term58460.getClass(), "sourceNode", null);
        setField(term58460, term58460.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term57909;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term57585, args);
        assertTrue(recursiveEquals(term57585, term58480));
        assertTrue(recursiveEquals(term57909, null));
        assertTrue(recursiveEquals(retValue, term58460));
    }

};


