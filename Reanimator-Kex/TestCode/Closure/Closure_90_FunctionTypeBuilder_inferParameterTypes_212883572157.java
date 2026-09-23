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

public class FunctionTypeBuilder_inferParameterTypes_212883572157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65506;
     Object term65716;
     Object term65796;
     Object term66148;
     Object term66149;
     Object term66150;
     Object term66141;

    public FunctionTypeBuilder_inferParameterTypes_212883572157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65506 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term65576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term65576, term65576.getClass(), "first", term65646);
        setField(term65506, term65506.getClass(), "parametersNode", term65576);
        setField(term65506, term65506.getClass(), "typeRegistry", null);
        term65716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term65796 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term66148 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term66148, term66148.getClass(), "asList", null);
        term66149 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term66149, term66149.getClass(), "info", null);
        setField(term66149, term66149.getClass(), "documentation", null);
        setField(term66149, term66149.getClass(), "sourceName", null);
        setField(term66149, term66149.getClass(), "visibility", null);
        setIntField(term66149, term66149.getClass(), "bitset", 0);
        setField(term66149, term66149.getClass(), "type", null);
        setField(term66149, term66149.getClass(), "thisType", null);
        setBooleanField(term66149, term66149.getClass(), "includeDocumentation", false);
        term66150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66150, term66150.getClass(), "type", 0);
        setField(term66150, term66150.getClass(), "next", null);
        setField(term66150, term66150.getClass(), "first", null);
        setField(term66150, term66150.getClass(), "last", null);
        setField(term66150, term66150.getClass(), "propListHead", null);
        setIntField(term66150, term66150.getClass(), "sourcePosition", 0);
        setField(term66150, term66150.getClass(), "jsType", null);
        setField(term66150, term66150.getClass(), "parent", null);
        term66141 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term66145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term66141, term66141.getClass(), "fnName", null);
        setField(term66141, term66141.getClass(), "compiler", null);
        setField(term66141, term66141.getClass(), "codingConvention", null);
        setField(term66141, term66141.getClass(), "typeRegistry", null);
        setField(term66141, term66141.getClass(), "errorRoot", null);
        setField(term66141, term66141.getClass(), "sourceName", null);
        setField(term66141, term66141.getClass(), "scope", null);
        setField(term66141, term66141.getClass(), "returnType", null);
        setBooleanField(term66141, term66141.getClass(), "returnTypeInferred", false);
        setField(term66141, term66141.getClass(), "implementedInterfaces", null);
        setField(term66141, term66141.getClass(), "baseType", null);
        setField(term66141, term66141.getClass(), "thisType", null);
        setBooleanField(term66141, term66141.getClass(), "isConstructor", false);
        setBooleanField(term66141, term66141.getClass(), "isInterface", false);
        setIntField(term66145, term66145.getClass(), "type", 83);
        setField(term66145, term66145.getClass(), "next", null);
        setField(term66145, term66145.getClass(), "first", null);
        setField(term66145, term66145.getClass(), "last", null);
        setField(term66145, term66145.getClass(), "propListHead", null);
        setIntField(term66145, term66145.getClass(), "sourcePosition", -1);
        setField(term66145, term66145.getClass(), "jsType", null);
        setField(term66145, term66145.getClass(), "parent", null);
        setField(term66141, term66141.getClass(), "parametersNode", term66145);
        setField(term66141, term66141.getClass(), "sourceNode", null);
        setField(term66141, term66141.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term65716;
        args[1] = term65796;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term65506, args);
        assertTrue(recursiveEquals(term65506, term66148));
        assertTrue(recursiveEquals(term65716, term66149));
        assertTrue(recursiveEquals(term65796, term66150));
        assertTrue(recursiveEquals(retValue, term66141));
    }

};


