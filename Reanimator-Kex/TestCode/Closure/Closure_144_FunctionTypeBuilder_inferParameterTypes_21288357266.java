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

public class FunctionTypeBuilder_inferParameterTypes_21288357266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46750;
     Object term46830;
     Object term47007;
     Object term47008;
     Object term46995;

    public FunctionTypeBuilder_inferParameterTypes_21288357266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46750 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        term46830 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term47007 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term47007, term47007.getClass(), "asList", null);
        term47008 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term47008, term47008.getClass(), "info", null);
        setField(term47008, term47008.getClass(), "documentation", null);
        setField(term47008, term47008.getClass(), "sourceName", null);
        setField(term47008, term47008.getClass(), "visibility", null);
        setIntField(term47008, term47008.getClass(), "bitset", 0);
        setField(term47008, term47008.getClass(), "type", null);
        setField(term47008, term47008.getClass(), "thisType", null);
        setBooleanField(term47008, term47008.getClass(), "includeDocumentation", false);
        term46995 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term46998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term46995, term46995.getClass(), "fnName", null);
        setField(term46995, term46995.getClass(), "compiler", null);
        setField(term46995, term46995.getClass(), "codingConvention", null);
        setField(term46995, term46995.getClass(), "typeRegistry", null);
        setField(term46995, term46995.getClass(), "errorRoot", null);
        setField(term46995, term46995.getClass(), "sourceName", null);
        setField(term46995, term46995.getClass(), "scope", null);
        setField(term46995, term46995.getClass(), "returnType", null);
        setField(term46995, term46995.getClass(), "implementedInterfaces", null);
        setField(term46995, term46995.getClass(), "baseType", null);
        setField(term46995, term46995.getClass(), "thisType", null);
        setBooleanField(term46995, term46995.getClass(), "isConstructor", false);
        setBooleanField(term46995, term46995.getClass(), "isInterface", false);
        setIntField(term46998, term46998.getClass(), "type", 83);
        setField(term46998, term46998.getClass(), "next", null);
        setField(term46998, term46998.getClass(), "first", null);
        setField(term46998, term46998.getClass(), "last", null);
        setField(term46998, term46998.getClass(), "propListHead", null);
        setIntField(term46998, term46998.getClass(), "sourcePosition", -1);
        setField(term46998, term46998.getClass(), "jsType", null);
        setField(term46998, term46998.getClass(), "parent", null);
        setField(term46995, term46995.getClass(), "parametersNode", term46998);
        setField(term46995, term46995.getClass(), "sourceNode", null);
        setField(term46995, term46995.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term46830;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term46750, args);
        assertTrue(recursiveEquals(term46750, term47007));
        assertTrue(recursiveEquals(term46830, null));
        assertTrue(recursiveEquals(retValue, term46995));
    }

};


