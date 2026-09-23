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

public class FunctionTypeBuilder_inferParameterTypes_166032255157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38726;
     Object term38806;
     Object term39559;
     Object term39560;
     Object term39552;

    public FunctionTypeBuilder_inferParameterTypes_166032255157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38726 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term38806 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term39559 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term39559, term39559.getClass(), "asList", null);
        term39560 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term39560, term39560.getClass(), "info", null);
        setField(term39560, term39560.getClass(), "documentation", null);
        setField(term39560, term39560.getClass(), "sourceName", null);
        setField(term39560, term39560.getClass(), "visibility", null);
        setIntField(term39560, term39560.getClass(), "bitset", 0);
        setField(term39560, term39560.getClass(), "type", null);
        setField(term39560, term39560.getClass(), "thisType", null);
        setBooleanField(term39560, term39560.getClass(), "includeDocumentation", false);
        term39552 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term39556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term39552, term39552.getClass(), "fnName", null);
        setField(term39552, term39552.getClass(), "compiler", null);
        setField(term39552, term39552.getClass(), "codingConvention", null);
        setField(term39552, term39552.getClass(), "typeRegistry", null);
        setField(term39552, term39552.getClass(), "errorRoot", null);
        setField(term39552, term39552.getClass(), "sourceName", null);
        setField(term39552, term39552.getClass(), "scope", null);
        setField(term39552, term39552.getClass(), "returnType", null);
        setBooleanField(term39552, term39552.getClass(), "returnTypeInferred", false);
        setField(term39552, term39552.getClass(), "implementedInterfaces", null);
        setField(term39552, term39552.getClass(), "baseType", null);
        setField(term39552, term39552.getClass(), "thisType", null);
        setBooleanField(term39552, term39552.getClass(), "isConstructor", false);
        setBooleanField(term39552, term39552.getClass(), "isInterface", false);
        setIntField(term39556, term39556.getClass(), "type", 83);
        setField(term39556, term39556.getClass(), "next", null);
        setField(term39556, term39556.getClass(), "first", null);
        setField(term39556, term39556.getClass(), "last", null);
        setField(term39556, term39556.getClass(), "propListHead", null);
        setIntField(term39556, term39556.getClass(), "sourcePosition", -1);
        setField(term39556, term39556.getClass(), "jsType", null);
        setField(term39556, term39556.getClass(), "parent", null);
        setField(term39552, term39552.getClass(), "parametersNode", term39556);
        setField(term39552, term39552.getClass(), "sourceNode", null);
        setField(term39552, term39552.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term38806;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term38726, args);
        assertTrue(recursiveEquals(term38726, term39559));
        assertTrue(recursiveEquals(term38806, term39560));
        assertTrue(recursiveEquals(retValue, term39552));
    }

};


