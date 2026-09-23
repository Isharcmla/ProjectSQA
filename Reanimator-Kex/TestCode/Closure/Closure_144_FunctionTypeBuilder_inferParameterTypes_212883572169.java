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

public class FunctionTypeBuilder_inferParameterTypes_212883572169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80393;
     Object term80473;
     Object term80668;
     Object term80669;
     Object term80656;

    public FunctionTypeBuilder_inferParameterTypes_212883572169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80393 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term80393, term80393.getClass(), "typeRegistry", null);
        term80473 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term80597 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term80597, term80597.getClass(), "parameters", null);
        setField(term80473, term80473.getClass(), "info", term80597);
        term80668 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term80668, term80668.getClass(), "asList", null);
        term80669 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term80670 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term80670, term80670.getClass(), "baseType", null);
        setField(term80670, term80670.getClass(), "implementedInterfaces", null);
        setField(term80670, term80670.getClass(), "parameters", null);
        setField(term80670, term80670.getClass(), "thrownTypes", null);
        setField(term80670, term80670.getClass(), "templateTypeName", null);
        setField(term80670, term80670.getClass(), "description", null);
        setField(term80670, term80670.getClass(), "deprecated", null);
        setField(term80670, term80670.getClass(), "license", null);
        setField(term80670, term80670.getClass(), "suppressions", null);
        setField(term80669, term80669.getClass(), "info", term80670);
        setField(term80669, term80669.getClass(), "documentation", null);
        setField(term80669, term80669.getClass(), "sourceName", null);
        setField(term80669, term80669.getClass(), "visibility", null);
        setIntField(term80669, term80669.getClass(), "bitset", 0);
        setField(term80669, term80669.getClass(), "type", null);
        setField(term80669, term80669.getClass(), "thisType", null);
        setBooleanField(term80669, term80669.getClass(), "includeDocumentation", false);
        term80656 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term80659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term80656, term80656.getClass(), "fnName", null);
        setField(term80656, term80656.getClass(), "compiler", null);
        setField(term80656, term80656.getClass(), "codingConvention", null);
        setField(term80656, term80656.getClass(), "typeRegistry", null);
        setField(term80656, term80656.getClass(), "errorRoot", null);
        setField(term80656, term80656.getClass(), "sourceName", null);
        setField(term80656, term80656.getClass(), "scope", null);
        setField(term80656, term80656.getClass(), "returnType", null);
        setField(term80656, term80656.getClass(), "implementedInterfaces", null);
        setField(term80656, term80656.getClass(), "baseType", null);
        setField(term80656, term80656.getClass(), "thisType", null);
        setBooleanField(term80656, term80656.getClass(), "isConstructor", false);
        setBooleanField(term80656, term80656.getClass(), "isInterface", false);
        setIntField(term80659, term80659.getClass(), "type", 83);
        setField(term80659, term80659.getClass(), "next", null);
        setField(term80659, term80659.getClass(), "first", null);
        setField(term80659, term80659.getClass(), "last", null);
        setField(term80659, term80659.getClass(), "propListHead", null);
        setIntField(term80659, term80659.getClass(), "sourcePosition", -1);
        setField(term80659, term80659.getClass(), "jsType", null);
        setField(term80659, term80659.getClass(), "parent", null);
        setField(term80656, term80656.getClass(), "parametersNode", term80659);
        setField(term80656, term80656.getClass(), "sourceNode", null);
        setField(term80656, term80656.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term80473;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term80393, args);
        assertTrue(recursiveEquals(term80393, term80668));
        assertTrue(recursiveEquals(term80473, null));
        assertTrue(recursiveEquals(retValue, term80656));
    }

};


