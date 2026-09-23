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

public class FunctionTypeBuilder_inferParameterTypes_1660322551201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63455;
     Object term63675;
     Object term63748;
     Object term63749;
     Object term63741;

    public FunctionTypeBuilder_inferParameterTypes_1660322551201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63455 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term63525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term63525, term63525.getClass(), "first", term63595);
        setField(term63455, term63455.getClass(), "parametersNode", term63525);
        setField(term63455, term63455.getClass(), "typeRegistry", null);
        term63675 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term63675, term63675.getClass(), "info", null);
        term63748 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term63748, term63748.getClass(), "asList", null);
        term63749 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term63749, term63749.getClass(), "info", null);
        setField(term63749, term63749.getClass(), "documentation", null);
        setField(term63749, term63749.getClass(), "associatedNode", null);
        setField(term63749, term63749.getClass(), "visibility", null);
        setIntField(term63749, term63749.getClass(), "bitset", 0);
        setField(term63749, term63749.getClass(), "type", null);
        setField(term63749, term63749.getClass(), "thisType", null);
        setBooleanField(term63749, term63749.getClass(), "includeDocumentation", false);
        term63741 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term63745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term63741, term63741.getClass(), "fnName", null);
        setField(term63741, term63741.getClass(), "compiler", null);
        setField(term63741, term63741.getClass(), "codingConvention", null);
        setField(term63741, term63741.getClass(), "typeRegistry", null);
        setField(term63741, term63741.getClass(), "errorRoot", null);
        setField(term63741, term63741.getClass(), "sourceName", null);
        setField(term63741, term63741.getClass(), "scope", null);
        setField(term63741, term63741.getClass(), "contents", null);
        setField(term63741, term63741.getClass(), "returnType", null);
        setBooleanField(term63741, term63741.getClass(), "returnTypeInferred", false);
        setField(term63741, term63741.getClass(), "implementedInterfaces", null);
        setField(term63741, term63741.getClass(), "extendedInterfaces", null);
        setField(term63741, term63741.getClass(), "baseType", null);
        setField(term63741, term63741.getClass(), "thisType", null);
        setBooleanField(term63741, term63741.getClass(), "isConstructor", false);
        setBooleanField(term63741, term63741.getClass(), "isInterface", false);
        setIntField(term63745, term63745.getClass(), "type", 83);
        setField(term63745, term63745.getClass(), "next", null);
        setField(term63745, term63745.getClass(), "first", null);
        setField(term63745, term63745.getClass(), "last", null);
        setField(term63745, term63745.getClass(), "propListHead", null);
        setIntField(term63745, term63745.getClass(), "sourcePosition", -1);
        setField(term63745, term63745.getClass(), "jsType", null);
        setField(term63745, term63745.getClass(), "parent", null);
        setField(term63741, term63741.getClass(), "parametersNode", term63745);
        setField(term63741, term63741.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term63675;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term63455, args);
        assertTrue(recursiveEquals(term63455, term63748));
        assertTrue(recursiveEquals(term63675, term63749));
        assertTrue(recursiveEquals(retValue, term63741));
    }

};


