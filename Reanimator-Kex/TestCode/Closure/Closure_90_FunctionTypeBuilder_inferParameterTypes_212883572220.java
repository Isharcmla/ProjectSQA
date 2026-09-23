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

public class FunctionTypeBuilder_inferParameterTypes_212883572220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85522;
     Object term85592;
     Object term85672;
     Object term86514;
     Object term86515;
     Object term86516;
     Object term86507;

    public FunctionTypeBuilder_inferParameterTypes_212883572220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85522 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term85522, term85522.getClass(), "parametersNode", null);
        setField(term85522, term85522.getClass(), "typeRegistry", null);
        setField(term85522, term85522.getClass(), "templateTypeName", null);
        term85592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term85592, term85592.getClass(), "first", null);
        term85672 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term85672, term85672.getClass(), "info", null);
        term86514 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term86514, term86514.getClass(), "asList", null);
        term86515 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term86515, term86515.getClass(), "info", null);
        setField(term86515, term86515.getClass(), "documentation", null);
        setField(term86515, term86515.getClass(), "sourceName", null);
        setField(term86515, term86515.getClass(), "visibility", null);
        setIntField(term86515, term86515.getClass(), "bitset", 0);
        setField(term86515, term86515.getClass(), "type", null);
        setField(term86515, term86515.getClass(), "thisType", null);
        setBooleanField(term86515, term86515.getClass(), "includeDocumentation", false);
        term86516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86516, term86516.getClass(), "type", 0);
        setField(term86516, term86516.getClass(), "next", null);
        setField(term86516, term86516.getClass(), "first", null);
        setField(term86516, term86516.getClass(), "last", null);
        setField(term86516, term86516.getClass(), "propListHead", null);
        setIntField(term86516, term86516.getClass(), "sourcePosition", 0);
        setField(term86516, term86516.getClass(), "jsType", null);
        setField(term86516, term86516.getClass(), "parent", null);
        term86507 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term86511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term86507, term86507.getClass(), "fnName", null);
        setField(term86507, term86507.getClass(), "compiler", null);
        setField(term86507, term86507.getClass(), "codingConvention", null);
        setField(term86507, term86507.getClass(), "typeRegistry", null);
        setField(term86507, term86507.getClass(), "errorRoot", null);
        setField(term86507, term86507.getClass(), "sourceName", null);
        setField(term86507, term86507.getClass(), "scope", null);
        setField(term86507, term86507.getClass(), "returnType", null);
        setBooleanField(term86507, term86507.getClass(), "returnTypeInferred", false);
        setField(term86507, term86507.getClass(), "implementedInterfaces", null);
        setField(term86507, term86507.getClass(), "baseType", null);
        setField(term86507, term86507.getClass(), "thisType", null);
        setBooleanField(term86507, term86507.getClass(), "isConstructor", false);
        setBooleanField(term86507, term86507.getClass(), "isInterface", false);
        setIntField(term86511, term86511.getClass(), "type", 83);
        setField(term86511, term86511.getClass(), "next", null);
        setField(term86511, term86511.getClass(), "first", null);
        setField(term86511, term86511.getClass(), "last", null);
        setField(term86511, term86511.getClass(), "propListHead", null);
        setIntField(term86511, term86511.getClass(), "sourcePosition", -1);
        setField(term86511, term86511.getClass(), "jsType", null);
        setField(term86511, term86511.getClass(), "parent", null);
        setField(term86507, term86507.getClass(), "parametersNode", term86511);
        setField(term86507, term86507.getClass(), "sourceNode", null);
        setField(term86507, term86507.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term85592;
        args[1] = term85672;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term85522, args);
        assertTrue(recursiveEquals(term85522, term86514));
        assertTrue(recursiveEquals(term85592, term86515));
        assertTrue(recursiveEquals(term85672, term86516));
        assertTrue(recursiveEquals(retValue, term86507));
    }

};


