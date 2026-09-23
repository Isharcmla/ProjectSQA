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

public class FunctionTypeBuilder_inferParameterTypes_212883572219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98924;
     Object term98994;
     Object term99074;
     Object term99245;
     Object term99246;
     Object term99248;
     Object term99239;

    public FunctionTypeBuilder_inferParameterTypes_212883572219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98924 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term98924, term98924.getClass(), "typeRegistry", null);
        setField(term98924, term98924.getClass(), "templateTypeName", null);
        term98994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term98994, term98994.getClass(), "first", null);
        term99074 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term99198 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term99198, term99198.getClass(), "parameters", null);
        setField(term99074, term99074.getClass(), "info", term99198);
        term99245 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term99245, term99245.getClass(), "asList", null);
        term99246 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term99247 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term99247, term99247.getClass(), "baseType", null);
        setField(term99247, term99247.getClass(), "implementedInterfaces", null);
        setField(term99247, term99247.getClass(), "parameters", null);
        setField(term99247, term99247.getClass(), "thrownTypes", null);
        setField(term99247, term99247.getClass(), "templateTypeName", null);
        setField(term99247, term99247.getClass(), "description", null);
        setField(term99247, term99247.getClass(), "deprecated", null);
        setField(term99247, term99247.getClass(), "license", null);
        setField(term99247, term99247.getClass(), "suppressions", null);
        setField(term99246, term99246.getClass(), "info", term99247);
        setField(term99246, term99246.getClass(), "documentation", null);
        setField(term99246, term99246.getClass(), "sourceName", null);
        setField(term99246, term99246.getClass(), "visibility", null);
        setIntField(term99246, term99246.getClass(), "bitset", 0);
        setField(term99246, term99246.getClass(), "type", null);
        setField(term99246, term99246.getClass(), "thisType", null);
        setBooleanField(term99246, term99246.getClass(), "includeDocumentation", false);
        term99248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term99248, term99248.getClass(), "type", 0);
        setField(term99248, term99248.getClass(), "next", null);
        setField(term99248, term99248.getClass(), "first", null);
        setField(term99248, term99248.getClass(), "last", null);
        setField(term99248, term99248.getClass(), "propListHead", null);
        setIntField(term99248, term99248.getClass(), "sourcePosition", 0);
        setField(term99248, term99248.getClass(), "jsType", null);
        setField(term99248, term99248.getClass(), "parent", null);
        term99239 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term99242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term99239, term99239.getClass(), "fnName", null);
        setField(term99239, term99239.getClass(), "compiler", null);
        setField(term99239, term99239.getClass(), "codingConvention", null);
        setField(term99239, term99239.getClass(), "typeRegistry", null);
        setField(term99239, term99239.getClass(), "errorRoot", null);
        setField(term99239, term99239.getClass(), "sourceName", null);
        setField(term99239, term99239.getClass(), "scope", null);
        setField(term99239, term99239.getClass(), "returnType", null);
        setField(term99239, term99239.getClass(), "implementedInterfaces", null);
        setField(term99239, term99239.getClass(), "baseType", null);
        setField(term99239, term99239.getClass(), "thisType", null);
        setBooleanField(term99239, term99239.getClass(), "isConstructor", false);
        setBooleanField(term99239, term99239.getClass(), "isInterface", false);
        setIntField(term99242, term99242.getClass(), "type", 83);
        setField(term99242, term99242.getClass(), "next", null);
        setField(term99242, term99242.getClass(), "first", null);
        setField(term99242, term99242.getClass(), "last", null);
        setField(term99242, term99242.getClass(), "propListHead", null);
        setIntField(term99242, term99242.getClass(), "sourcePosition", -1);
        setField(term99242, term99242.getClass(), "jsType", null);
        setField(term99242, term99242.getClass(), "parent", null);
        setField(term99239, term99239.getClass(), "parametersNode", term99242);
        setField(term99239, term99239.getClass(), "sourceNode", null);
        setField(term99239, term99239.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term98994;
        args[1] = term99074;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term98924, args);
        assertTrue(recursiveEquals(term98924, term99245));
        assertTrue(recursiveEquals(term98994, term99246));
        assertTrue(recursiveEquals(term99074, term99248));
        assertTrue(recursiveEquals(retValue, term99239));
    }

};


