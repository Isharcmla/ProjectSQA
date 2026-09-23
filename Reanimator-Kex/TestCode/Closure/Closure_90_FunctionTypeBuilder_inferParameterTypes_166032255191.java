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

public class FunctionTypeBuilder_inferParameterTypes_166032255191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46218;
     Object term46298;
     Object term47043;
     Object term47044;
     Object term47036;

    public FunctionTypeBuilder_inferParameterTypes_166032255191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46218 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term46218, term46218.getClass(), "parametersNode", null);
        setField(term46218, term46218.getClass(), "typeRegistry", null);
        term46298 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term46298, term46298.getClass(), "info", null);
        term47043 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term47043, term47043.getClass(), "asList", null);
        term47044 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term47044, term47044.getClass(), "info", null);
        setField(term47044, term47044.getClass(), "documentation", null);
        setField(term47044, term47044.getClass(), "sourceName", null);
        setField(term47044, term47044.getClass(), "visibility", null);
        setIntField(term47044, term47044.getClass(), "bitset", 0);
        setField(term47044, term47044.getClass(), "type", null);
        setField(term47044, term47044.getClass(), "thisType", null);
        setBooleanField(term47044, term47044.getClass(), "includeDocumentation", false);
        term47036 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term47040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47036, term47036.getClass(), "fnName", null);
        setField(term47036, term47036.getClass(), "compiler", null);
        setField(term47036, term47036.getClass(), "codingConvention", null);
        setField(term47036, term47036.getClass(), "typeRegistry", null);
        setField(term47036, term47036.getClass(), "errorRoot", null);
        setField(term47036, term47036.getClass(), "sourceName", null);
        setField(term47036, term47036.getClass(), "scope", null);
        setField(term47036, term47036.getClass(), "returnType", null);
        setBooleanField(term47036, term47036.getClass(), "returnTypeInferred", false);
        setField(term47036, term47036.getClass(), "implementedInterfaces", null);
        setField(term47036, term47036.getClass(), "baseType", null);
        setField(term47036, term47036.getClass(), "thisType", null);
        setBooleanField(term47036, term47036.getClass(), "isConstructor", false);
        setBooleanField(term47036, term47036.getClass(), "isInterface", false);
        setIntField(term47040, term47040.getClass(), "type", 83);
        setField(term47040, term47040.getClass(), "next", null);
        setField(term47040, term47040.getClass(), "first", null);
        setField(term47040, term47040.getClass(), "last", null);
        setField(term47040, term47040.getClass(), "propListHead", null);
        setIntField(term47040, term47040.getClass(), "sourcePosition", -1);
        setField(term47040, term47040.getClass(), "jsType", null);
        setField(term47040, term47040.getClass(), "parent", null);
        setField(term47036, term47036.getClass(), "parametersNode", term47040);
        setField(term47036, term47036.getClass(), "sourceNode", null);
        setField(term47036, term47036.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term46298;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term46218, args);
        assertTrue(recursiveEquals(term46218, term47043));
        assertTrue(recursiveEquals(term46298, term47044));
        assertTrue(recursiveEquals(retValue, term47036));
    }

};


