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

public class FunctionTypeBuilder_inferParameterTypes_212883572133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69171;
     Object term69345;
     Object term69385;
     Object term69388;
     Object term69376;

    public FunctionTypeBuilder_inferParameterTypes_212883572133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69171 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term69275 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term69171, term69171.getClass(), "typeRegistry", term69275);
        setField(term69171, term69171.getClass(), "templateTypeName", null);
        term69345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term69345, term69345.getClass(), "first", null);
        term69385 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term69386 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term69387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term69385, term69385.getClass(), "fnName", null);
        setField(term69385, term69385.getClass(), "compiler", null);
        setField(term69385, term69385.getClass(), "codingConvention", null);
        setField(term69386, term69386.getClass(), "reporter", null);
        setField(term69386, term69386.getClass(), "nativeTypes", null);
        setField(term69386, term69386.getClass(), "namesToTypes", null);
        setField(term69386, term69386.getClass(), "namespaces", null);
        setField(term69386, term69386.getClass(), "enumTypeNames", null);
        setField(term69386, term69386.getClass(), "forwardDeclaredTypes", null);
        setField(term69386, term69386.getClass(), "typesIndexedByProperty", null);
        setField(term69386, term69386.getClass(), "greatestSubtypeByProperty", null);
        setField(term69386, term69386.getClass(), "interfaceToImplementors", null);
        setField(term69386, term69386.getClass(), "unresolvedNamedTypes", null);
        setField(term69386, term69386.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term69386, term69386.getClass(), "lastGeneration", false);
        setField(term69386, term69386.getClass(), "templateTypeName", null);
        setField(term69386, term69386.getClass(), "templateType", null);
        setBooleanField(term69386, term69386.getClass(), "tolerateUndefinedValues", false);
        setField(term69386, term69386.getClass(), "resolveMode", null);
        setField(term69385, term69385.getClass(), "typeRegistry", term69386);
        setField(term69385, term69385.getClass(), "errorRoot", null);
        setField(term69385, term69385.getClass(), "sourceName", null);
        setField(term69385, term69385.getClass(), "scope", null);
        setField(term69385, term69385.getClass(), "returnType", null);
        setField(term69385, term69385.getClass(), "implementedInterfaces", null);
        setField(term69385, term69385.getClass(), "baseType", null);
        setField(term69385, term69385.getClass(), "thisType", null);
        setBooleanField(term69385, term69385.getClass(), "isConstructor", false);
        setBooleanField(term69385, term69385.getClass(), "isInterface", false);
        setIntField(term69387, term69387.getClass(), "type", 83);
        setField(term69387, term69387.getClass(), "next", null);
        setField(term69387, term69387.getClass(), "first", null);
        setField(term69387, term69387.getClass(), "last", null);
        setField(term69387, term69387.getClass(), "propListHead", null);
        setIntField(term69387, term69387.getClass(), "sourcePosition", -1);
        setField(term69387, term69387.getClass(), "jsType", null);
        setField(term69387, term69387.getClass(), "parent", null);
        setField(term69385, term69385.getClass(), "parametersNode", term69387);
        setField(term69385, term69385.getClass(), "sourceNode", null);
        setField(term69385, term69385.getClass(), "templateTypeName", null);
        term69388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term69388, term69388.getClass(), "type", 0);
        setField(term69388, term69388.getClass(), "next", null);
        setField(term69388, term69388.getClass(), "first", null);
        setField(term69388, term69388.getClass(), "last", null);
        setField(term69388, term69388.getClass(), "propListHead", null);
        setIntField(term69388, term69388.getClass(), "sourcePosition", 0);
        setField(term69388, term69388.getClass(), "jsType", null);
        setField(term69388, term69388.getClass(), "parent", null);
        term69376 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term69377 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term69382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term69376, term69376.getClass(), "fnName", null);
        setField(term69376, term69376.getClass(), "compiler", null);
        setField(term69376, term69376.getClass(), "codingConvention", null);
        setField(term69377, term69377.getClass(), "reporter", null);
        setField(term69377, term69377.getClass(), "nativeTypes", null);
        setField(term69377, term69377.getClass(), "namesToTypes", null);
        setField(term69377, term69377.getClass(), "namespaces", null);
        setField(term69377, term69377.getClass(), "enumTypeNames", null);
        setField(term69377, term69377.getClass(), "forwardDeclaredTypes", null);
        setField(term69377, term69377.getClass(), "typesIndexedByProperty", null);
        setField(term69377, term69377.getClass(), "greatestSubtypeByProperty", null);
        setField(term69377, term69377.getClass(), "interfaceToImplementors", null);
        setField(term69377, term69377.getClass(), "unresolvedNamedTypes", null);
        setField(term69377, term69377.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term69377, term69377.getClass(), "lastGeneration", false);
        setField(term69377, term69377.getClass(), "templateTypeName", null);
        setField(term69377, term69377.getClass(), "templateType", null);
        setBooleanField(term69377, term69377.getClass(), "tolerateUndefinedValues", false);
        setField(term69377, term69377.getClass(), "resolveMode", null);
        setField(term69376, term69376.getClass(), "typeRegistry", term69377);
        setField(term69376, term69376.getClass(), "errorRoot", null);
        setField(term69376, term69376.getClass(), "sourceName", null);
        setField(term69376, term69376.getClass(), "scope", null);
        setField(term69376, term69376.getClass(), "returnType", null);
        setField(term69376, term69376.getClass(), "implementedInterfaces", null);
        setField(term69376, term69376.getClass(), "baseType", null);
        setField(term69376, term69376.getClass(), "thisType", null);
        setBooleanField(term69376, term69376.getClass(), "isConstructor", false);
        setBooleanField(term69376, term69376.getClass(), "isInterface", false);
        setIntField(term69382, term69382.getClass(), "type", 83);
        setField(term69382, term69382.getClass(), "next", null);
        setField(term69382, term69382.getClass(), "first", null);
        setField(term69382, term69382.getClass(), "last", null);
        setField(term69382, term69382.getClass(), "propListHead", null);
        setIntField(term69382, term69382.getClass(), "sourcePosition", -1);
        setField(term69382, term69382.getClass(), "jsType", null);
        setField(term69382, term69382.getClass(), "parent", null);
        setField(term69376, term69376.getClass(), "parametersNode", term69382);
        setField(term69376, term69376.getClass(), "sourceNode", null);
        setField(term69376, term69376.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term69345;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term69171, args);
        assertTrue(recursiveEquals(term69171, term69385));
        assertTrue(recursiveEquals(term69345, term69388));
        assertTrue(recursiveEquals(retValue, term69376));
    }

};


