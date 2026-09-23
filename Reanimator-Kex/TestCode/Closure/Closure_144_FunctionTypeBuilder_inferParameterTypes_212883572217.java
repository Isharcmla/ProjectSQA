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

public class FunctionTypeBuilder_inferParameterTypes_212883572217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98379;
     Object term98449;
     Object term98529;
     Object term98700;
     Object term98701;
     Object term98703;
     Object term98694;

    public FunctionTypeBuilder_inferParameterTypes_212883572217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98379 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term98379, term98379.getClass(), "typeRegistry", null);
        term98449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term98449, term98449.getClass(), "first", null);
        term98529 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term98653 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term98653, term98653.getClass(), "parameters", null);
        setField(term98529, term98529.getClass(), "info", term98653);
        term98700 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term98700, term98700.getClass(), "asList", null);
        term98701 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term98702 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term98702, term98702.getClass(), "baseType", null);
        setField(term98702, term98702.getClass(), "implementedInterfaces", null);
        setField(term98702, term98702.getClass(), "parameters", null);
        setField(term98702, term98702.getClass(), "thrownTypes", null);
        setField(term98702, term98702.getClass(), "templateTypeName", null);
        setField(term98702, term98702.getClass(), "description", null);
        setField(term98702, term98702.getClass(), "deprecated", null);
        setField(term98702, term98702.getClass(), "license", null);
        setField(term98702, term98702.getClass(), "suppressions", null);
        setField(term98701, term98701.getClass(), "info", term98702);
        setField(term98701, term98701.getClass(), "documentation", null);
        setField(term98701, term98701.getClass(), "sourceName", null);
        setField(term98701, term98701.getClass(), "visibility", null);
        setIntField(term98701, term98701.getClass(), "bitset", 0);
        setField(term98701, term98701.getClass(), "type", null);
        setField(term98701, term98701.getClass(), "thisType", null);
        setBooleanField(term98701, term98701.getClass(), "includeDocumentation", false);
        term98703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term98703, term98703.getClass(), "type", 0);
        setField(term98703, term98703.getClass(), "next", null);
        setField(term98703, term98703.getClass(), "first", null);
        setField(term98703, term98703.getClass(), "last", null);
        setField(term98703, term98703.getClass(), "propListHead", null);
        setIntField(term98703, term98703.getClass(), "sourcePosition", 0);
        setField(term98703, term98703.getClass(), "jsType", null);
        setField(term98703, term98703.getClass(), "parent", null);
        term98694 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term98697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term98694, term98694.getClass(), "fnName", null);
        setField(term98694, term98694.getClass(), "compiler", null);
        setField(term98694, term98694.getClass(), "codingConvention", null);
        setField(term98694, term98694.getClass(), "typeRegistry", null);
        setField(term98694, term98694.getClass(), "errorRoot", null);
        setField(term98694, term98694.getClass(), "sourceName", null);
        setField(term98694, term98694.getClass(), "scope", null);
        setField(term98694, term98694.getClass(), "returnType", null);
        setField(term98694, term98694.getClass(), "implementedInterfaces", null);
        setField(term98694, term98694.getClass(), "baseType", null);
        setField(term98694, term98694.getClass(), "thisType", null);
        setBooleanField(term98694, term98694.getClass(), "isConstructor", false);
        setBooleanField(term98694, term98694.getClass(), "isInterface", false);
        setIntField(term98697, term98697.getClass(), "type", 83);
        setField(term98697, term98697.getClass(), "next", null);
        setField(term98697, term98697.getClass(), "first", null);
        setField(term98697, term98697.getClass(), "last", null);
        setField(term98697, term98697.getClass(), "propListHead", null);
        setIntField(term98697, term98697.getClass(), "sourcePosition", -1);
        setField(term98697, term98697.getClass(), "jsType", null);
        setField(term98697, term98697.getClass(), "parent", null);
        setField(term98694, term98694.getClass(), "parametersNode", term98697);
        setField(term98694, term98694.getClass(), "sourceNode", null);
        setField(term98694, term98694.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term98449;
        args[1] = term98529;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term98379, args);
        assertTrue(recursiveEquals(term98379, term98700));
        assertTrue(recursiveEquals(term98449, term98701));
        assertTrue(recursiveEquals(term98529, term98703));
        assertTrue(recursiveEquals(retValue, term98694));
    }

};


