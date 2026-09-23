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

public class FunctionTypeBuilder_inferParameterTypes_166032255188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54086;
     Object term54166;
     Object term54742;
     Object term54743;
     Object term54736;

    public FunctionTypeBuilder_inferParameterTypes_166032255188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54086 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term54166 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term54290 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term54290, term54290.getClass(), "parameters", null);
        setField(term54166, term54166.getClass(), "info", term54290);
        term54742 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term54742, term54742.getClass(), "asList", null);
        term54743 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term54744 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term54744, term54744.getClass(), "baseType", null);
        setField(term54744, term54744.getClass(), "implementedInterfaces", null);
        setField(term54744, term54744.getClass(), "parameters", null);
        setField(term54744, term54744.getClass(), "thrownTypes", null);
        setField(term54744, term54744.getClass(), "templateTypeName", null);
        setField(term54744, term54744.getClass(), "description", null);
        setField(term54744, term54744.getClass(), "deprecated", null);
        setField(term54744, term54744.getClass(), "license", null);
        setField(term54744, term54744.getClass(), "suppressions", null);
        setField(term54743, term54743.getClass(), "info", term54744);
        setField(term54743, term54743.getClass(), "documentation", null);
        setField(term54743, term54743.getClass(), "sourceName", null);
        setField(term54743, term54743.getClass(), "visibility", null);
        setIntField(term54743, term54743.getClass(), "bitset", 0);
        setField(term54743, term54743.getClass(), "type", null);
        setField(term54743, term54743.getClass(), "thisType", null);
        setBooleanField(term54743, term54743.getClass(), "includeDocumentation", false);
        term54736 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term54739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term54736, term54736.getClass(), "fnName", null);
        setField(term54736, term54736.getClass(), "compiler", null);
        setField(term54736, term54736.getClass(), "codingConvention", null);
        setField(term54736, term54736.getClass(), "typeRegistry", null);
        setField(term54736, term54736.getClass(), "errorRoot", null);
        setField(term54736, term54736.getClass(), "sourceName", null);
        setField(term54736, term54736.getClass(), "scope", null);
        setField(term54736, term54736.getClass(), "returnType", null);
        setField(term54736, term54736.getClass(), "implementedInterfaces", null);
        setField(term54736, term54736.getClass(), "baseType", null);
        setField(term54736, term54736.getClass(), "thisType", null);
        setBooleanField(term54736, term54736.getClass(), "isConstructor", false);
        setBooleanField(term54736, term54736.getClass(), "isInterface", false);
        setIntField(term54739, term54739.getClass(), "type", 83);
        setField(term54739, term54739.getClass(), "next", null);
        setField(term54739, term54739.getClass(), "first", null);
        setField(term54739, term54739.getClass(), "last", null);
        setField(term54739, term54739.getClass(), "propListHead", null);
        setIntField(term54739, term54739.getClass(), "sourcePosition", -1);
        setField(term54739, term54739.getClass(), "jsType", null);
        setField(term54739, term54739.getClass(), "parent", null);
        setField(term54736, term54736.getClass(), "parametersNode", term54739);
        setField(term54736, term54736.getClass(), "sourceNode", null);
        setField(term54736, term54736.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term54166;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term54086, args);
        assertTrue(recursiveEquals(term54086, term54742));
        assertTrue(recursiveEquals(term54166, term54743));
        assertTrue(recursiveEquals(retValue, term54736));
    }

};


