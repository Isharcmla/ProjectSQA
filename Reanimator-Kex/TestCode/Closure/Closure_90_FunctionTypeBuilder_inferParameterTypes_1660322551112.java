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

public class FunctionTypeBuilder_inferParameterTypes_1660322551112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52082;
     Object term52266;
     Object term52590;
     Object term52591;
     Object term52580;

    public FunctionTypeBuilder_inferParameterTypes_1660322551112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52082 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term52186 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term52082, term52082.getClass(), "parametersNode", null);
        setField(term52082, term52082.getClass(), "typeRegistry", term52186);
        setField(term52082, term52082.getClass(), "templateTypeName", null);
        term52266 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term52266, term52266.getClass(), "info", null);
        term52590 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term52590, term52590.getClass(), "asList", null);
        term52591 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term52591, term52591.getClass(), "info", null);
        setField(term52591, term52591.getClass(), "documentation", null);
        setField(term52591, term52591.getClass(), "sourceName", null);
        setField(term52591, term52591.getClass(), "visibility", null);
        setIntField(term52591, term52591.getClass(), "bitset", 0);
        setField(term52591, term52591.getClass(), "type", null);
        setField(term52591, term52591.getClass(), "thisType", null);
        setBooleanField(term52591, term52591.getClass(), "includeDocumentation", false);
        term52580 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term52581 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term52587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term52580, term52580.getClass(), "fnName", null);
        setField(term52580, term52580.getClass(), "compiler", null);
        setField(term52580, term52580.getClass(), "codingConvention", null);
        setField(term52581, term52581.getClass(), "reporter", null);
        setField(term52581, term52581.getClass(), "nativeTypes", null);
        setField(term52581, term52581.getClass(), "namesToTypes", null);
        setField(term52581, term52581.getClass(), "namespaces", null);
        setField(term52581, term52581.getClass(), "nonNullableTypeNames", null);
        setField(term52581, term52581.getClass(), "forwardDeclaredTypes", null);
        setField(term52581, term52581.getClass(), "typesIndexedByProperty", null);
        setField(term52581, term52581.getClass(), "greatestSubtypeByProperty", null);
        setField(term52581, term52581.getClass(), "interfaceToImplementors", null);
        setField(term52581, term52581.getClass(), "unresolvedNamedTypes", null);
        setField(term52581, term52581.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term52581, term52581.getClass(), "lastGeneration", false);
        setField(term52581, term52581.getClass(), "templateTypeName", null);
        setField(term52581, term52581.getClass(), "templateType", null);
        setBooleanField(term52581, term52581.getClass(), "tolerateUndefinedValues", false);
        setField(term52581, term52581.getClass(), "resolveMode", null);
        setField(term52580, term52580.getClass(), "typeRegistry", term52581);
        setField(term52580, term52580.getClass(), "errorRoot", null);
        setField(term52580, term52580.getClass(), "sourceName", null);
        setField(term52580, term52580.getClass(), "scope", null);
        setField(term52580, term52580.getClass(), "returnType", null);
        setBooleanField(term52580, term52580.getClass(), "returnTypeInferred", false);
        setField(term52580, term52580.getClass(), "implementedInterfaces", null);
        setField(term52580, term52580.getClass(), "baseType", null);
        setField(term52580, term52580.getClass(), "thisType", null);
        setBooleanField(term52580, term52580.getClass(), "isConstructor", false);
        setBooleanField(term52580, term52580.getClass(), "isInterface", false);
        setIntField(term52587, term52587.getClass(), "type", 83);
        setField(term52587, term52587.getClass(), "next", null);
        setField(term52587, term52587.getClass(), "first", null);
        setField(term52587, term52587.getClass(), "last", null);
        setField(term52587, term52587.getClass(), "propListHead", null);
        setIntField(term52587, term52587.getClass(), "sourcePosition", -1);
        setField(term52587, term52587.getClass(), "jsType", null);
        setField(term52587, term52587.getClass(), "parent", null);
        setField(term52580, term52580.getClass(), "parametersNode", term52587);
        setField(term52580, term52580.getClass(), "sourceNode", null);
        setField(term52580, term52580.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term52266;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term52082, args);
        assertTrue(recursiveEquals(term52082, term52590));
        assertTrue(recursiveEquals(term52266, term52591));
        assertTrue(recursiveEquals(retValue, term52580));
    }

};


