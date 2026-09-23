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
     Object term39827;
     Object term39977;
     Object term40718;
     Object term40719;
     Object term40704;

    public FunctionTypeBuilder_inferParameterTypes_212883572134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39827 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term39897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term39827, term39827.getClass(), "parametersNode", term39897);
        term39977 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term39977, term39977.getClass(), "info", null);
        term40718 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term40718, term40718.getClass(), "asList", null);
        term40719 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term40719, term40719.getClass(), "info", null);
        setField(term40719, term40719.getClass(), "documentation", null);
        setField(term40719, term40719.getClass(), "associatedNode", null);
        setField(term40719, term40719.getClass(), "visibility", null);
        setIntField(term40719, term40719.getClass(), "bitset", 0);
        setField(term40719, term40719.getClass(), "type", null);
        setField(term40719, term40719.getClass(), "thisType", null);
        setBooleanField(term40719, term40719.getClass(), "includeDocumentation", false);
        term40704 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term40708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40704, term40704.getClass(), "fnName", null);
        setField(term40704, term40704.getClass(), "compiler", null);
        setField(term40704, term40704.getClass(), "codingConvention", null);
        setField(term40704, term40704.getClass(), "typeRegistry", null);
        setField(term40704, term40704.getClass(), "errorRoot", null);
        setField(term40704, term40704.getClass(), "sourceName", null);
        setField(term40704, term40704.getClass(), "scope", null);
        setField(term40704, term40704.getClass(), "contents", null);
        setField(term40704, term40704.getClass(), "returnType", null);
        setBooleanField(term40704, term40704.getClass(), "returnTypeInferred", false);
        setField(term40704, term40704.getClass(), "implementedInterfaces", null);
        setField(term40704, term40704.getClass(), "extendedInterfaces", null);
        setField(term40704, term40704.getClass(), "baseType", null);
        setField(term40704, term40704.getClass(), "thisType", null);
        setBooleanField(term40704, term40704.getClass(), "isConstructor", false);
        setBooleanField(term40704, term40704.getClass(), "isInterface", false);
        setIntField(term40708, term40708.getClass(), "type", 83);
        setField(term40708, term40708.getClass(), "next", null);
        setField(term40708, term40708.getClass(), "first", null);
        setField(term40708, term40708.getClass(), "last", null);
        setField(term40708, term40708.getClass(), "propListHead", null);
        setIntField(term40708, term40708.getClass(), "sourcePosition", -1);
        setField(term40708, term40708.getClass(), "jsType", null);
        setField(term40708, term40708.getClass(), "parent", null);
        setField(term40704, term40704.getClass(), "parametersNode", term40708);
        setField(term40704, term40704.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term39977;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term39827, args);
        assertTrue(recursiveEquals(term39827, term40718));
        assertTrue(recursiveEquals(term39977, null));
        assertTrue(recursiveEquals(retValue, term40704));
    }

};


