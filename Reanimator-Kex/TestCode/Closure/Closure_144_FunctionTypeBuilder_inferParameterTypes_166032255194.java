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

public class FunctionTypeBuilder_inferParameterTypes_166032255194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55435;
     Object term55515;
     Object term55954;
     Object term55955;
     Object term55948;

    public FunctionTypeBuilder_inferParameterTypes_166032255194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55435 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term55515 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term55515, term55515.getClass(), "info", null);
        term55954 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term55954, term55954.getClass(), "asList", null);
        term55955 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term55955, term55955.getClass(), "info", null);
        setField(term55955, term55955.getClass(), "documentation", null);
        setField(term55955, term55955.getClass(), "sourceName", null);
        setField(term55955, term55955.getClass(), "visibility", null);
        setIntField(term55955, term55955.getClass(), "bitset", 0);
        setField(term55955, term55955.getClass(), "type", null);
        setField(term55955, term55955.getClass(), "thisType", null);
        setBooleanField(term55955, term55955.getClass(), "includeDocumentation", false);
        term55948 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term55951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term55948, term55948.getClass(), "fnName", null);
        setField(term55948, term55948.getClass(), "compiler", null);
        setField(term55948, term55948.getClass(), "codingConvention", null);
        setField(term55948, term55948.getClass(), "typeRegistry", null);
        setField(term55948, term55948.getClass(), "errorRoot", null);
        setField(term55948, term55948.getClass(), "sourceName", null);
        setField(term55948, term55948.getClass(), "scope", null);
        setField(term55948, term55948.getClass(), "returnType", null);
        setField(term55948, term55948.getClass(), "implementedInterfaces", null);
        setField(term55948, term55948.getClass(), "baseType", null);
        setField(term55948, term55948.getClass(), "thisType", null);
        setBooleanField(term55948, term55948.getClass(), "isConstructor", false);
        setBooleanField(term55948, term55948.getClass(), "isInterface", false);
        setIntField(term55951, term55951.getClass(), "type", 83);
        setField(term55951, term55951.getClass(), "next", null);
        setField(term55951, term55951.getClass(), "first", null);
        setField(term55951, term55951.getClass(), "last", null);
        setField(term55951, term55951.getClass(), "propListHead", null);
        setIntField(term55951, term55951.getClass(), "sourcePosition", -1);
        setField(term55951, term55951.getClass(), "jsType", null);
        setField(term55951, term55951.getClass(), "parent", null);
        setField(term55948, term55948.getClass(), "parametersNode", term55951);
        setField(term55948, term55948.getClass(), "sourceNode", null);
        setField(term55948, term55948.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term55515;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term55435, args);
        assertTrue(recursiveEquals(term55435, term55954));
        assertTrue(recursiveEquals(term55515, term55955));
        assertTrue(recursiveEquals(retValue, term55948));
    }

};


