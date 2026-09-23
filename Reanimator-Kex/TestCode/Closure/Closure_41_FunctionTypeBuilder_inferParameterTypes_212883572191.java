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

public class FunctionTypeBuilder_inferParameterTypes_212883572191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59680;
     Object term59750;
     Object term59830;
     Object term59878;
     Object term59879;
     Object term59880;
     Object term59871;

    public FunctionTypeBuilder_inferParameterTypes_212883572191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59680 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term59680, term59680.getClass(), "parametersNode", null);
        setField(term59680, term59680.getClass(), "typeRegistry", null);
        term59750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term59750, term59750.getClass(), "first", null);
        term59830 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term59830, term59830.getClass(), "info", null);
        term59878 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term59878, term59878.getClass(), "asList", null);
        term59879 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term59879, term59879.getClass(), "info", null);
        setField(term59879, term59879.getClass(), "documentation", null);
        setField(term59879, term59879.getClass(), "associatedNode", null);
        setField(term59879, term59879.getClass(), "visibility", null);
        setIntField(term59879, term59879.getClass(), "bitset", 0);
        setField(term59879, term59879.getClass(), "type", null);
        setField(term59879, term59879.getClass(), "thisType", null);
        setBooleanField(term59879, term59879.getClass(), "includeDocumentation", false);
        term59880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59880, term59880.getClass(), "type", 0);
        setField(term59880, term59880.getClass(), "next", null);
        setField(term59880, term59880.getClass(), "first", null);
        setField(term59880, term59880.getClass(), "last", null);
        setField(term59880, term59880.getClass(), "propListHead", null);
        setIntField(term59880, term59880.getClass(), "sourcePosition", 0);
        setField(term59880, term59880.getClass(), "jsType", null);
        setField(term59880, term59880.getClass(), "parent", null);
        term59871 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term59875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term59871, term59871.getClass(), "fnName", null);
        setField(term59871, term59871.getClass(), "compiler", null);
        setField(term59871, term59871.getClass(), "codingConvention", null);
        setField(term59871, term59871.getClass(), "typeRegistry", null);
        setField(term59871, term59871.getClass(), "errorRoot", null);
        setField(term59871, term59871.getClass(), "sourceName", null);
        setField(term59871, term59871.getClass(), "scope", null);
        setField(term59871, term59871.getClass(), "contents", null);
        setField(term59871, term59871.getClass(), "returnType", null);
        setBooleanField(term59871, term59871.getClass(), "returnTypeInferred", false);
        setField(term59871, term59871.getClass(), "implementedInterfaces", null);
        setField(term59871, term59871.getClass(), "extendedInterfaces", null);
        setField(term59871, term59871.getClass(), "baseType", null);
        setField(term59871, term59871.getClass(), "thisType", null);
        setBooleanField(term59871, term59871.getClass(), "isConstructor", false);
        setBooleanField(term59871, term59871.getClass(), "isInterface", false);
        setIntField(term59875, term59875.getClass(), "type", 83);
        setField(term59875, term59875.getClass(), "next", null);
        setField(term59875, term59875.getClass(), "first", null);
        setField(term59875, term59875.getClass(), "last", null);
        setField(term59875, term59875.getClass(), "propListHead", null);
        setIntField(term59875, term59875.getClass(), "sourcePosition", -1);
        setField(term59875, term59875.getClass(), "jsType", null);
        setField(term59875, term59875.getClass(), "parent", null);
        setField(term59871, term59871.getClass(), "parametersNode", term59875);
        setField(term59871, term59871.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term59750;
        args[1] = term59830;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term59680, args);
        assertTrue(recursiveEquals(term59680, term59878));
        assertTrue(recursiveEquals(term59750, term59879));
        assertTrue(recursiveEquals(term59830, term59880));
        assertTrue(recursiveEquals(retValue, term59871));
    }

};


