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

public class FunctionTypeBuilder_inferParameterTypes_1660322551163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48286;
     Object term48610;
     Object term48716;
     Object term48717;
     Object term48706;

    public FunctionTypeBuilder_inferParameterTypes_1660322551163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48286 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term48356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term48356, term48356.getClass(), "first", term48426);
        setField(term48286, term48286.getClass(), "parametersNode", term48356);
        setField(term48286, term48286.getClass(), "typeRegistry", term48530);
        setField(term48286, term48286.getClass(), "templateTypeName", null);
        term48610 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term48610, term48610.getClass(), "info", null);
        term48716 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term48716, term48716.getClass(), "asList", null);
        term48717 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term48717, term48717.getClass(), "info", null);
        setField(term48717, term48717.getClass(), "documentation", null);
        setField(term48717, term48717.getClass(), "associatedNode", null);
        setField(term48717, term48717.getClass(), "visibility", null);
        setIntField(term48717, term48717.getClass(), "bitset", 0);
        setField(term48717, term48717.getClass(), "type", null);
        setField(term48717, term48717.getClass(), "thisType", null);
        setBooleanField(term48717, term48717.getClass(), "includeDocumentation", false);
        term48706 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term48707 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term48713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term48706, term48706.getClass(), "fnName", null);
        setField(term48706, term48706.getClass(), "compiler", null);
        setField(term48706, term48706.getClass(), "codingConvention", null);
        setField(term48707, term48707.getClass(), "reporter", null);
        setField(term48707, term48707.getClass(), "nativeTypes", null);
        setField(term48707, term48707.getClass(), "namesToTypes", null);
        setField(term48707, term48707.getClass(), "namespaces", null);
        setField(term48707, term48707.getClass(), "nonNullableTypeNames", null);
        setField(term48707, term48707.getClass(), "forwardDeclaredTypes", null);
        setField(term48707, term48707.getClass(), "typesIndexedByProperty", null);
        setField(term48707, term48707.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term48707, term48707.getClass(), "greatestSubtypeByProperty", null);
        setField(term48707, term48707.getClass(), "interfaceToImplementors", null);
        setField(term48707, term48707.getClass(), "unresolvedNamedTypes", null);
        setField(term48707, term48707.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term48707, term48707.getClass(), "lastGeneration", false);
        setField(term48707, term48707.getClass(), "templateTypeName", null);
        setField(term48707, term48707.getClass(), "templateType", null);
        setBooleanField(term48707, term48707.getClass(), "tolerateUndefinedValues", false);
        setField(term48707, term48707.getClass(), "resolveMode", null);
        setField(term48706, term48706.getClass(), "typeRegistry", term48707);
        setField(term48706, term48706.getClass(), "errorRoot", null);
        setField(term48706, term48706.getClass(), "sourceName", null);
        setField(term48706, term48706.getClass(), "scope", null);
        setField(term48706, term48706.getClass(), "contents", null);
        setField(term48706, term48706.getClass(), "returnType", null);
        setBooleanField(term48706, term48706.getClass(), "returnTypeInferred", false);
        setField(term48706, term48706.getClass(), "implementedInterfaces", null);
        setField(term48706, term48706.getClass(), "extendedInterfaces", null);
        setField(term48706, term48706.getClass(), "baseType", null);
        setField(term48706, term48706.getClass(), "thisType", null);
        setBooleanField(term48706, term48706.getClass(), "isConstructor", false);
        setBooleanField(term48706, term48706.getClass(), "isInterface", false);
        setIntField(term48713, term48713.getClass(), "type", 83);
        setField(term48713, term48713.getClass(), "next", null);
        setField(term48713, term48713.getClass(), "first", null);
        setField(term48713, term48713.getClass(), "last", null);
        setField(term48713, term48713.getClass(), "propListHead", null);
        setIntField(term48713, term48713.getClass(), "sourcePosition", -1);
        setField(term48713, term48713.getClass(), "jsType", null);
        setField(term48713, term48713.getClass(), "parent", null);
        setField(term48706, term48706.getClass(), "parametersNode", term48713);
        setField(term48706, term48706.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term48610;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term48286, args);
        assertTrue(recursiveEquals(term48286, term48716));
        assertTrue(recursiveEquals(term48610, term48717));
        assertTrue(recursiveEquals(retValue, term48706));
    }

};


