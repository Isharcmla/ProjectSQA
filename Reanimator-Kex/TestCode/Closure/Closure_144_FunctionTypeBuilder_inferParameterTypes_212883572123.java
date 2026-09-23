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

public class FunctionTypeBuilder_inferParameterTypes_212883572123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64807;
     Object term64887;
     Object term65082;
     Object term65083;
     Object term65070;

    public FunctionTypeBuilder_inferParameterTypes_212883572123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64807 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term64887 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term65011 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term64887, term64887.getClass(), "info", term65011);
        term65082 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term65082, term65082.getClass(), "asList", null);
        term65083 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term65084 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term65084, term65084.getClass(), "baseType", null);
        setField(term65084, term65084.getClass(), "implementedInterfaces", null);
        setField(term65084, term65084.getClass(), "parameters", null);
        setField(term65084, term65084.getClass(), "thrownTypes", null);
        setField(term65084, term65084.getClass(), "templateTypeName", null);
        setField(term65084, term65084.getClass(), "description", null);
        setField(term65084, term65084.getClass(), "deprecated", null);
        setField(term65084, term65084.getClass(), "license", null);
        setField(term65084, term65084.getClass(), "suppressions", null);
        setField(term65083, term65083.getClass(), "info", term65084);
        setField(term65083, term65083.getClass(), "documentation", null);
        setField(term65083, term65083.getClass(), "sourceName", null);
        setField(term65083, term65083.getClass(), "visibility", null);
        setIntField(term65083, term65083.getClass(), "bitset", 0);
        setField(term65083, term65083.getClass(), "type", null);
        setField(term65083, term65083.getClass(), "thisType", null);
        setBooleanField(term65083, term65083.getClass(), "includeDocumentation", false);
        term65070 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term65073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term65070, term65070.getClass(), "fnName", null);
        setField(term65070, term65070.getClass(), "compiler", null);
        setField(term65070, term65070.getClass(), "codingConvention", null);
        setField(term65070, term65070.getClass(), "typeRegistry", null);
        setField(term65070, term65070.getClass(), "errorRoot", null);
        setField(term65070, term65070.getClass(), "sourceName", null);
        setField(term65070, term65070.getClass(), "scope", null);
        setField(term65070, term65070.getClass(), "returnType", null);
        setField(term65070, term65070.getClass(), "implementedInterfaces", null);
        setField(term65070, term65070.getClass(), "baseType", null);
        setField(term65070, term65070.getClass(), "thisType", null);
        setBooleanField(term65070, term65070.getClass(), "isConstructor", false);
        setBooleanField(term65070, term65070.getClass(), "isInterface", false);
        setIntField(term65073, term65073.getClass(), "type", 83);
        setField(term65073, term65073.getClass(), "next", null);
        setField(term65073, term65073.getClass(), "first", null);
        setField(term65073, term65073.getClass(), "last", null);
        setField(term65073, term65073.getClass(), "propListHead", null);
        setIntField(term65073, term65073.getClass(), "sourcePosition", -1);
        setField(term65073, term65073.getClass(), "jsType", null);
        setField(term65073, term65073.getClass(), "parent", null);
        setField(term65070, term65070.getClass(), "parametersNode", term65073);
        setField(term65070, term65070.getClass(), "sourceNode", null);
        setField(term65070, term65070.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term64887;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term64807, args);
        assertTrue(recursiveEquals(term64807, term65082));
        assertTrue(recursiveEquals(term64887, null));
        assertTrue(recursiveEquals(retValue, term65070));
    }

};


