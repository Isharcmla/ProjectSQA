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

public class FunctionTypeBuilder_inferParameterTypes_212883572200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79706;
     Object term79916;
     Object term79996;
     Object term80049;
     Object term80050;
     Object term80051;
     Object term80042;

    public FunctionTypeBuilder_inferParameterTypes_212883572200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79706 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term79776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term79776, term79776.getClass(), "first", term79846);
        setField(term79706, term79706.getClass(), "parametersNode", term79776);
        setField(term79706, term79706.getClass(), "typeRegistry", null);
        setField(term79706, term79706.getClass(), "templateTypeName", null);
        term79916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term79916, term79916.getClass(), "first", null);
        term79996 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term79996, term79996.getClass(), "info", null);
        term80049 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term80049, term80049.getClass(), "asList", null);
        term80050 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term80050, term80050.getClass(), "info", null);
        setField(term80050, term80050.getClass(), "documentation", null);
        setField(term80050, term80050.getClass(), "sourceName", null);
        setField(term80050, term80050.getClass(), "visibility", null);
        setIntField(term80050, term80050.getClass(), "bitset", 0);
        setField(term80050, term80050.getClass(), "type", null);
        setField(term80050, term80050.getClass(), "thisType", null);
        setBooleanField(term80050, term80050.getClass(), "includeDocumentation", false);
        term80051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term80051, term80051.getClass(), "type", 0);
        setField(term80051, term80051.getClass(), "next", null);
        setField(term80051, term80051.getClass(), "first", null);
        setField(term80051, term80051.getClass(), "last", null);
        setField(term80051, term80051.getClass(), "propListHead", null);
        setIntField(term80051, term80051.getClass(), "sourcePosition", 0);
        setField(term80051, term80051.getClass(), "jsType", null);
        setField(term80051, term80051.getClass(), "parent", null);
        term80042 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term80046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term80042, term80042.getClass(), "fnName", null);
        setField(term80042, term80042.getClass(), "compiler", null);
        setField(term80042, term80042.getClass(), "codingConvention", null);
        setField(term80042, term80042.getClass(), "typeRegistry", null);
        setField(term80042, term80042.getClass(), "errorRoot", null);
        setField(term80042, term80042.getClass(), "sourceName", null);
        setField(term80042, term80042.getClass(), "scope", null);
        setField(term80042, term80042.getClass(), "returnType", null);
        setBooleanField(term80042, term80042.getClass(), "returnTypeInferred", false);
        setField(term80042, term80042.getClass(), "implementedInterfaces", null);
        setField(term80042, term80042.getClass(), "baseType", null);
        setField(term80042, term80042.getClass(), "thisType", null);
        setBooleanField(term80042, term80042.getClass(), "isConstructor", false);
        setBooleanField(term80042, term80042.getClass(), "isInterface", false);
        setIntField(term80046, term80046.getClass(), "type", 83);
        setField(term80046, term80046.getClass(), "next", null);
        setField(term80046, term80046.getClass(), "first", null);
        setField(term80046, term80046.getClass(), "last", null);
        setField(term80046, term80046.getClass(), "propListHead", null);
        setIntField(term80046, term80046.getClass(), "sourcePosition", -1);
        setField(term80046, term80046.getClass(), "jsType", null);
        setField(term80046, term80046.getClass(), "parent", null);
        setField(term80042, term80042.getClass(), "parametersNode", term80046);
        setField(term80042, term80042.getClass(), "sourceNode", null);
        setField(term80042, term80042.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term79916;
        args[1] = term79996;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term79706, args);
        assertTrue(recursiveEquals(term79706, term80049));
        assertTrue(recursiveEquals(term79916, term80050));
        assertTrue(recursiveEquals(term79996, term80051));
        assertTrue(recursiveEquals(retValue, term80042));
    }

};


