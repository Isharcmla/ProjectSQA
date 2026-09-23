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

public class FunctionTypeBuilder_inferParameterTypes_212883572207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93842;
     Object term93922;
     Object term94319;
     Object term94320;
     Object term94307;

    public FunctionTypeBuilder_inferParameterTypes_212883572207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93842 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term93842, term93842.getClass(), "typeRegistry", null);
        HashMap term94094 = new HashMap();
        term93922 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term94046 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term94046, term94046.getClass(), "parameters", term94094);
        setField(term93922, term93922.getClass(), "info", term94046);
        term94319 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term94319, term94319.getClass(), "asList", null);
        HashMap term94322 = new HashMap();
        term94320 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term94321 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term94321, term94321.getClass(), "baseType", null);
        setField(term94321, term94321.getClass(), "implementedInterfaces", null);
        setField(term94321, term94321.getClass(), "parameters", term94322);
        setField(term94321, term94321.getClass(), "thrownTypes", null);
        setField(term94321, term94321.getClass(), "templateTypeName", null);
        setField(term94321, term94321.getClass(), "description", null);
        setField(term94321, term94321.getClass(), "deprecated", null);
        setField(term94321, term94321.getClass(), "license", null);
        setField(term94321, term94321.getClass(), "suppressions", null);
        setField(term94320, term94320.getClass(), "info", term94321);
        setField(term94320, term94320.getClass(), "documentation", null);
        setField(term94320, term94320.getClass(), "sourceName", null);
        setField(term94320, term94320.getClass(), "visibility", null);
        setIntField(term94320, term94320.getClass(), "bitset", 0);
        setField(term94320, term94320.getClass(), "type", null);
        setField(term94320, term94320.getClass(), "thisType", null);
        setBooleanField(term94320, term94320.getClass(), "includeDocumentation", false);
        term94307 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term94310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term94307, term94307.getClass(), "fnName", null);
        setField(term94307, term94307.getClass(), "compiler", null);
        setField(term94307, term94307.getClass(), "codingConvention", null);
        setField(term94307, term94307.getClass(), "typeRegistry", null);
        setField(term94307, term94307.getClass(), "errorRoot", null);
        setField(term94307, term94307.getClass(), "sourceName", null);
        setField(term94307, term94307.getClass(), "scope", null);
        setField(term94307, term94307.getClass(), "returnType", null);
        setField(term94307, term94307.getClass(), "implementedInterfaces", null);
        setField(term94307, term94307.getClass(), "baseType", null);
        setField(term94307, term94307.getClass(), "thisType", null);
        setBooleanField(term94307, term94307.getClass(), "isConstructor", false);
        setBooleanField(term94307, term94307.getClass(), "isInterface", false);
        setIntField(term94310, term94310.getClass(), "type", 83);
        setField(term94310, term94310.getClass(), "next", null);
        setField(term94310, term94310.getClass(), "first", null);
        setField(term94310, term94310.getClass(), "last", null);
        setField(term94310, term94310.getClass(), "propListHead", null);
        setIntField(term94310, term94310.getClass(), "sourcePosition", -1);
        setField(term94310, term94310.getClass(), "jsType", null);
        setField(term94310, term94310.getClass(), "parent", null);
        setField(term94307, term94307.getClass(), "parametersNode", term94310);
        setField(term94307, term94307.getClass(), "sourceNode", null);
        setField(term94307, term94307.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term93922;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term93842, args);
        assertTrue(recursiveEquals(term93842, term94319));
        assertTrue(recursiveEquals(term93922, null));
        assertTrue(recursiveEquals(retValue, term94307));
    }

};


