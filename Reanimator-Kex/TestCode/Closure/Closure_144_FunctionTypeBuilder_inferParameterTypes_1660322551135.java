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

public class FunctionTypeBuilder_inferParameterTypes_1660322551135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69623;
     Object term69703;
     Object term69890;
     Object term69891;
     Object term69884;

    public FunctionTypeBuilder_inferParameterTypes_1660322551135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69623 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term69623, term69623.getClass(), "typeRegistry", null);
        setField(term69623, term69623.getClass(), "templateTypeName", null);
        term69703 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term69827 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term69827, term69827.getClass(), "parameters", null);
        setField(term69703, term69703.getClass(), "info", term69827);
        term69890 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term69890, term69890.getClass(), "asList", null);
        term69891 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term69892 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term69892, term69892.getClass(), "baseType", null);
        setField(term69892, term69892.getClass(), "implementedInterfaces", null);
        setField(term69892, term69892.getClass(), "parameters", null);
        setField(term69892, term69892.getClass(), "thrownTypes", null);
        setField(term69892, term69892.getClass(), "templateTypeName", null);
        setField(term69892, term69892.getClass(), "description", null);
        setField(term69892, term69892.getClass(), "deprecated", null);
        setField(term69892, term69892.getClass(), "license", null);
        setField(term69892, term69892.getClass(), "suppressions", null);
        setField(term69891, term69891.getClass(), "info", term69892);
        setField(term69891, term69891.getClass(), "documentation", null);
        setField(term69891, term69891.getClass(), "sourceName", null);
        setField(term69891, term69891.getClass(), "visibility", null);
        setIntField(term69891, term69891.getClass(), "bitset", 0);
        setField(term69891, term69891.getClass(), "type", null);
        setField(term69891, term69891.getClass(), "thisType", null);
        setBooleanField(term69891, term69891.getClass(), "includeDocumentation", false);
        term69884 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term69887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term69884, term69884.getClass(), "fnName", null);
        setField(term69884, term69884.getClass(), "compiler", null);
        setField(term69884, term69884.getClass(), "codingConvention", null);
        setField(term69884, term69884.getClass(), "typeRegistry", null);
        setField(term69884, term69884.getClass(), "errorRoot", null);
        setField(term69884, term69884.getClass(), "sourceName", null);
        setField(term69884, term69884.getClass(), "scope", null);
        setField(term69884, term69884.getClass(), "returnType", null);
        setField(term69884, term69884.getClass(), "implementedInterfaces", null);
        setField(term69884, term69884.getClass(), "baseType", null);
        setField(term69884, term69884.getClass(), "thisType", null);
        setBooleanField(term69884, term69884.getClass(), "isConstructor", false);
        setBooleanField(term69884, term69884.getClass(), "isInterface", false);
        setIntField(term69887, term69887.getClass(), "type", 83);
        setField(term69887, term69887.getClass(), "next", null);
        setField(term69887, term69887.getClass(), "first", null);
        setField(term69887, term69887.getClass(), "last", null);
        setField(term69887, term69887.getClass(), "propListHead", null);
        setIntField(term69887, term69887.getClass(), "sourcePosition", -1);
        setField(term69887, term69887.getClass(), "jsType", null);
        setField(term69887, term69887.getClass(), "parent", null);
        setField(term69884, term69884.getClass(), "parametersNode", term69887);
        setField(term69884, term69884.getClass(), "sourceNode", null);
        setField(term69884, term69884.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term69703;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term69623, args);
        assertTrue(recursiveEquals(term69623, term69890));
        assertTrue(recursiveEquals(term69703, term69891));
        assertTrue(recursiveEquals(retValue, term69884));
    }

};


