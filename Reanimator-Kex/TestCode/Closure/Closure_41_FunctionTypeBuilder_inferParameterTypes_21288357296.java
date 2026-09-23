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

public class FunctionTypeBuilder_inferParameterTypes_21288357296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29212;
     Object term29292;
     Object term29663;
     Object term29664;
     Object term29649;

    public FunctionTypeBuilder_inferParameterTypes_21288357296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29212 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term29292 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term29663 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term29663, term29663.getClass(), "asList", null);
        term29664 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term29664, term29664.getClass(), "info", null);
        setField(term29664, term29664.getClass(), "documentation", null);
        setField(term29664, term29664.getClass(), "associatedNode", null);
        setField(term29664, term29664.getClass(), "visibility", null);
        setIntField(term29664, term29664.getClass(), "bitset", 0);
        setField(term29664, term29664.getClass(), "type", null);
        setField(term29664, term29664.getClass(), "thisType", null);
        setBooleanField(term29664, term29664.getClass(), "includeDocumentation", false);
        term29649 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term29653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term29649, term29649.getClass(), "fnName", null);
        setField(term29649, term29649.getClass(), "compiler", null);
        setField(term29649, term29649.getClass(), "codingConvention", null);
        setField(term29649, term29649.getClass(), "typeRegistry", null);
        setField(term29649, term29649.getClass(), "errorRoot", null);
        setField(term29649, term29649.getClass(), "sourceName", null);
        setField(term29649, term29649.getClass(), "scope", null);
        setField(term29649, term29649.getClass(), "contents", null);
        setField(term29649, term29649.getClass(), "returnType", null);
        setBooleanField(term29649, term29649.getClass(), "returnTypeInferred", false);
        setField(term29649, term29649.getClass(), "implementedInterfaces", null);
        setField(term29649, term29649.getClass(), "extendedInterfaces", null);
        setField(term29649, term29649.getClass(), "baseType", null);
        setField(term29649, term29649.getClass(), "thisType", null);
        setBooleanField(term29649, term29649.getClass(), "isConstructor", false);
        setBooleanField(term29649, term29649.getClass(), "isInterface", false);
        setIntField(term29653, term29653.getClass(), "type", 83);
        setField(term29653, term29653.getClass(), "next", null);
        setField(term29653, term29653.getClass(), "first", null);
        setField(term29653, term29653.getClass(), "last", null);
        setField(term29653, term29653.getClass(), "propListHead", null);
        setIntField(term29653, term29653.getClass(), "sourcePosition", -1);
        setField(term29653, term29653.getClass(), "jsType", null);
        setField(term29653, term29653.getClass(), "parent", null);
        setField(term29649, term29649.getClass(), "parametersNode", term29653);
        setField(term29649, term29649.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term29292;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term29212, args);
        assertTrue(recursiveEquals(term29212, term29663));
        assertTrue(recursiveEquals(term29292, null));
        assertTrue(recursiveEquals(retValue, term29649));
    }

};


