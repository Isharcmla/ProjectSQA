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

public class FunctionTypeBuilder_inferParameterTypes_212883572215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97598;
     Object term97678;
     Object term98075;
     Object term98076;
     Object term98063;

    public FunctionTypeBuilder_inferParameterTypes_212883572215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97598 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term97598, term97598.getClass(), "typeRegistry", null);
        setField(term97598, term97598.getClass(), "templateTypeName", null);
        HashMap term97850 = new HashMap();
        term97678 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term97802 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term97802, term97802.getClass(), "parameters", term97850);
        setField(term97678, term97678.getClass(), "info", term97802);
        term98075 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term98075, term98075.getClass(), "asList", null);
        HashMap term98078 = new HashMap();
        term98076 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term98077 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term98077, term98077.getClass(), "baseType", null);
        setField(term98077, term98077.getClass(), "implementedInterfaces", null);
        setField(term98077, term98077.getClass(), "parameters", term98078);
        setField(term98077, term98077.getClass(), "thrownTypes", null);
        setField(term98077, term98077.getClass(), "templateTypeName", null);
        setField(term98077, term98077.getClass(), "description", null);
        setField(term98077, term98077.getClass(), "deprecated", null);
        setField(term98077, term98077.getClass(), "license", null);
        setField(term98077, term98077.getClass(), "suppressions", null);
        setField(term98076, term98076.getClass(), "info", term98077);
        setField(term98076, term98076.getClass(), "documentation", null);
        setField(term98076, term98076.getClass(), "sourceName", null);
        setField(term98076, term98076.getClass(), "visibility", null);
        setIntField(term98076, term98076.getClass(), "bitset", 0);
        setField(term98076, term98076.getClass(), "type", null);
        setField(term98076, term98076.getClass(), "thisType", null);
        setBooleanField(term98076, term98076.getClass(), "includeDocumentation", false);
        term98063 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term98066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term98063, term98063.getClass(), "fnName", null);
        setField(term98063, term98063.getClass(), "compiler", null);
        setField(term98063, term98063.getClass(), "codingConvention", null);
        setField(term98063, term98063.getClass(), "typeRegistry", null);
        setField(term98063, term98063.getClass(), "errorRoot", null);
        setField(term98063, term98063.getClass(), "sourceName", null);
        setField(term98063, term98063.getClass(), "scope", null);
        setField(term98063, term98063.getClass(), "returnType", null);
        setField(term98063, term98063.getClass(), "implementedInterfaces", null);
        setField(term98063, term98063.getClass(), "baseType", null);
        setField(term98063, term98063.getClass(), "thisType", null);
        setBooleanField(term98063, term98063.getClass(), "isConstructor", false);
        setBooleanField(term98063, term98063.getClass(), "isInterface", false);
        setIntField(term98066, term98066.getClass(), "type", 83);
        setField(term98066, term98066.getClass(), "next", null);
        setField(term98066, term98066.getClass(), "first", null);
        setField(term98066, term98066.getClass(), "last", null);
        setField(term98066, term98066.getClass(), "propListHead", null);
        setIntField(term98066, term98066.getClass(), "sourcePosition", -1);
        setField(term98066, term98066.getClass(), "jsType", null);
        setField(term98066, term98066.getClass(), "parent", null);
        setField(term98063, term98063.getClass(), "parametersNode", term98066);
        setField(term98063, term98063.getClass(), "sourceNode", null);
        setField(term98063, term98063.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term97678;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term97598, args);
        assertTrue(recursiveEquals(term97598, term98075));
        assertTrue(recursiveEquals(term97678, null));
        assertTrue(recursiveEquals(retValue, term98063));
    }

};


