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

public class FunctionTypeBuilder_inferParameterTypes_212883572149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43824;
     Object term43904;
     Object term44449;
     Object term44450;
     Object term44435;

    public FunctionTypeBuilder_inferParameterTypes_212883572149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43824 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term43824, term43824.getClass(), "parametersNode", null);
        setField(term43824, term43824.getClass(), "typeRegistry", null);
        term43904 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term43904, term43904.getClass(), "info", null);
        term44449 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term44449, term44449.getClass(), "asList", null);
        term44450 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term44450, term44450.getClass(), "info", null);
        setField(term44450, term44450.getClass(), "documentation", null);
        setField(term44450, term44450.getClass(), "associatedNode", null);
        setField(term44450, term44450.getClass(), "visibility", null);
        setIntField(term44450, term44450.getClass(), "bitset", 0);
        setField(term44450, term44450.getClass(), "type", null);
        setField(term44450, term44450.getClass(), "thisType", null);
        setBooleanField(term44450, term44450.getClass(), "includeDocumentation", false);
        term44435 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term44439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term44435, term44435.getClass(), "fnName", null);
        setField(term44435, term44435.getClass(), "compiler", null);
        setField(term44435, term44435.getClass(), "codingConvention", null);
        setField(term44435, term44435.getClass(), "typeRegistry", null);
        setField(term44435, term44435.getClass(), "errorRoot", null);
        setField(term44435, term44435.getClass(), "sourceName", null);
        setField(term44435, term44435.getClass(), "scope", null);
        setField(term44435, term44435.getClass(), "contents", null);
        setField(term44435, term44435.getClass(), "returnType", null);
        setBooleanField(term44435, term44435.getClass(), "returnTypeInferred", false);
        setField(term44435, term44435.getClass(), "implementedInterfaces", null);
        setField(term44435, term44435.getClass(), "extendedInterfaces", null);
        setField(term44435, term44435.getClass(), "baseType", null);
        setField(term44435, term44435.getClass(), "thisType", null);
        setBooleanField(term44435, term44435.getClass(), "isConstructor", false);
        setBooleanField(term44435, term44435.getClass(), "isInterface", false);
        setIntField(term44439, term44439.getClass(), "type", 83);
        setField(term44439, term44439.getClass(), "next", null);
        setField(term44439, term44439.getClass(), "first", null);
        setField(term44439, term44439.getClass(), "last", null);
        setField(term44439, term44439.getClass(), "propListHead", null);
        setIntField(term44439, term44439.getClass(), "sourcePosition", -1);
        setField(term44439, term44439.getClass(), "jsType", null);
        setField(term44439, term44439.getClass(), "parent", null);
        setField(term44435, term44435.getClass(), "parametersNode", term44439);
        setField(term44435, term44435.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term43904;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term43824, args);
        assertTrue(recursiveEquals(term43824, term44449));
        assertTrue(recursiveEquals(term43904, null));
        assertTrue(recursiveEquals(retValue, term44435));
    }

};


