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

public class FunctionTypeBuilder_inferParameterTypes_212883572189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87989;
     Object term88069;
     Object term88362;
     Object term88363;
     Object term88350;

    public FunctionTypeBuilder_inferParameterTypes_212883572189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87989 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        HashMap term88241 = new HashMap();
        term88069 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term88193 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term88193, term88193.getClass(), "parameters", term88241);
        setField(term88069, term88069.getClass(), "info", term88193);
        term88362 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term88362, term88362.getClass(), "asList", null);
        HashMap term88365 = new HashMap();
        term88363 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term88364 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term88364, term88364.getClass(), "baseType", null);
        setField(term88364, term88364.getClass(), "implementedInterfaces", null);
        setField(term88364, term88364.getClass(), "parameters", term88365);
        setField(term88364, term88364.getClass(), "thrownTypes", null);
        setField(term88364, term88364.getClass(), "templateTypeName", null);
        setField(term88364, term88364.getClass(), "description", null);
        setField(term88364, term88364.getClass(), "deprecated", null);
        setField(term88364, term88364.getClass(), "license", null);
        setField(term88364, term88364.getClass(), "suppressions", null);
        setField(term88363, term88363.getClass(), "info", term88364);
        setField(term88363, term88363.getClass(), "documentation", null);
        setField(term88363, term88363.getClass(), "sourceName", null);
        setField(term88363, term88363.getClass(), "visibility", null);
        setIntField(term88363, term88363.getClass(), "bitset", 0);
        setField(term88363, term88363.getClass(), "type", null);
        setField(term88363, term88363.getClass(), "thisType", null);
        setBooleanField(term88363, term88363.getClass(), "includeDocumentation", false);
        term88350 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term88353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term88350, term88350.getClass(), "fnName", null);
        setField(term88350, term88350.getClass(), "compiler", null);
        setField(term88350, term88350.getClass(), "codingConvention", null);
        setField(term88350, term88350.getClass(), "typeRegistry", null);
        setField(term88350, term88350.getClass(), "errorRoot", null);
        setField(term88350, term88350.getClass(), "sourceName", null);
        setField(term88350, term88350.getClass(), "scope", null);
        setField(term88350, term88350.getClass(), "returnType", null);
        setField(term88350, term88350.getClass(), "implementedInterfaces", null);
        setField(term88350, term88350.getClass(), "baseType", null);
        setField(term88350, term88350.getClass(), "thisType", null);
        setBooleanField(term88350, term88350.getClass(), "isConstructor", false);
        setBooleanField(term88350, term88350.getClass(), "isInterface", false);
        setIntField(term88353, term88353.getClass(), "type", 83);
        setField(term88353, term88353.getClass(), "next", null);
        setField(term88353, term88353.getClass(), "first", null);
        setField(term88353, term88353.getClass(), "last", null);
        setField(term88353, term88353.getClass(), "propListHead", null);
        setIntField(term88353, term88353.getClass(), "sourcePosition", -1);
        setField(term88353, term88353.getClass(), "jsType", null);
        setField(term88353, term88353.getClass(), "parent", null);
        setField(term88350, term88350.getClass(), "parametersNode", term88353);
        setField(term88350, term88350.getClass(), "sourceNode", null);
        setField(term88350, term88350.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term88069;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term87989, args);
        assertTrue(recursiveEquals(term87989, term88362));
        assertTrue(recursiveEquals(term88069, null));
        assertTrue(recursiveEquals(retValue, term88350));
    }

};


