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

public class FunctionTypeBuilder_inferParameterTypes_1660322551147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72601;
     Object term72785;
     Object term72984;
     Object term72985;
     Object term72975;

    public FunctionTypeBuilder_inferParameterTypes_1660322551147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72601 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term72705 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term72601, term72601.getClass(), "typeRegistry", term72705);
        term72785 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term72909 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term72909, term72909.getClass(), "parameters", null);
        setField(term72785, term72785.getClass(), "info", term72909);
        term72984 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term72984, term72984.getClass(), "asList", null);
        term72985 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term72986 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term72986, term72986.getClass(), "baseType", null);
        setField(term72986, term72986.getClass(), "implementedInterfaces", null);
        setField(term72986, term72986.getClass(), "parameters", null);
        setField(term72986, term72986.getClass(), "thrownTypes", null);
        setField(term72986, term72986.getClass(), "templateTypeName", null);
        setField(term72986, term72986.getClass(), "description", null);
        setField(term72986, term72986.getClass(), "deprecated", null);
        setField(term72986, term72986.getClass(), "license", null);
        setField(term72986, term72986.getClass(), "suppressions", null);
        setField(term72985, term72985.getClass(), "info", term72986);
        setField(term72985, term72985.getClass(), "documentation", null);
        setField(term72985, term72985.getClass(), "sourceName", null);
        setField(term72985, term72985.getClass(), "visibility", null);
        setIntField(term72985, term72985.getClass(), "bitset", 0);
        setField(term72985, term72985.getClass(), "type", null);
        setField(term72985, term72985.getClass(), "thisType", null);
        setBooleanField(term72985, term72985.getClass(), "includeDocumentation", false);
        term72975 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term72976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term72981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term72975, term72975.getClass(), "fnName", null);
        setField(term72975, term72975.getClass(), "compiler", null);
        setField(term72975, term72975.getClass(), "codingConvention", null);
        setField(term72976, term72976.getClass(), "reporter", null);
        setField(term72976, term72976.getClass(), "nativeTypes", null);
        setField(term72976, term72976.getClass(), "namesToTypes", null);
        setField(term72976, term72976.getClass(), "namespaces", null);
        setField(term72976, term72976.getClass(), "enumTypeNames", null);
        setField(term72976, term72976.getClass(), "forwardDeclaredTypes", null);
        setField(term72976, term72976.getClass(), "typesIndexedByProperty", null);
        setField(term72976, term72976.getClass(), "greatestSubtypeByProperty", null);
        setField(term72976, term72976.getClass(), "interfaceToImplementors", null);
        setField(term72976, term72976.getClass(), "unresolvedNamedTypes", null);
        setField(term72976, term72976.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term72976, term72976.getClass(), "lastGeneration", false);
        setField(term72976, term72976.getClass(), "templateTypeName", null);
        setField(term72976, term72976.getClass(), "templateType", null);
        setBooleanField(term72976, term72976.getClass(), "tolerateUndefinedValues", false);
        setField(term72976, term72976.getClass(), "resolveMode", null);
        setField(term72975, term72975.getClass(), "typeRegistry", term72976);
        setField(term72975, term72975.getClass(), "errorRoot", null);
        setField(term72975, term72975.getClass(), "sourceName", null);
        setField(term72975, term72975.getClass(), "scope", null);
        setField(term72975, term72975.getClass(), "returnType", null);
        setField(term72975, term72975.getClass(), "implementedInterfaces", null);
        setField(term72975, term72975.getClass(), "baseType", null);
        setField(term72975, term72975.getClass(), "thisType", null);
        setBooleanField(term72975, term72975.getClass(), "isConstructor", false);
        setBooleanField(term72975, term72975.getClass(), "isInterface", false);
        setIntField(term72981, term72981.getClass(), "type", 83);
        setField(term72981, term72981.getClass(), "next", null);
        setField(term72981, term72981.getClass(), "first", null);
        setField(term72981, term72981.getClass(), "last", null);
        setField(term72981, term72981.getClass(), "propListHead", null);
        setIntField(term72981, term72981.getClass(), "sourcePosition", -1);
        setField(term72981, term72981.getClass(), "jsType", null);
        setField(term72981, term72981.getClass(), "parent", null);
        setField(term72975, term72975.getClass(), "parametersNode", term72981);
        setField(term72975, term72975.getClass(), "sourceNode", null);
        setField(term72975, term72975.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term72785;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term72601, args);
        assertTrue(recursiveEquals(term72601, term72984));
        assertTrue(recursiveEquals(term72785, term72985));
        assertTrue(recursiveEquals(retValue, term72975));
    }

};


