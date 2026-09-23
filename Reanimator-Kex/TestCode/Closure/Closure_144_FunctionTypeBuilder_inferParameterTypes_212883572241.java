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
import java.util.HashMap;

public class FunctionTypeBuilder_inferParameterTypes_212883572241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108681;
     Object term108761;
     Object term109158;
     Object term109159;
     Object term109146;

    public FunctionTypeBuilder_inferParameterTypes_212883572241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108681 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term108681, term108681.getClass(), "typeRegistry", null);
        HashMap term108933 = new HashMap();
        term108761 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term108885 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term108885, term108885.getClass(), "parameters", term108933);
        setField(term108761, term108761.getClass(), "info", term108885);
        term109158 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term109158, term109158.getClass(), "asList", null);
        HashMap term109161 = new HashMap();
        term109159 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term109160 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term109160, term109160.getClass(), "baseType", null);
        setField(term109160, term109160.getClass(), "implementedInterfaces", null);
        setField(term109160, term109160.getClass(), "parameters", term109161);
        setField(term109160, term109160.getClass(), "thrownTypes", null);
        setField(term109160, term109160.getClass(), "templateTypeName", null);
        setField(term109160, term109160.getClass(), "description", null);
        setField(term109160, term109160.getClass(), "deprecated", null);
        setField(term109160, term109160.getClass(), "license", null);
        setField(term109160, term109160.getClass(), "suppressions", null);
        setField(term109159, term109159.getClass(), "info", term109160);
        setField(term109159, term109159.getClass(), "documentation", null);
        setField(term109159, term109159.getClass(), "sourceName", null);
        setField(term109159, term109159.getClass(), "visibility", null);
        setIntField(term109159, term109159.getClass(), "bitset", 0);
        setField(term109159, term109159.getClass(), "type", null);
        setField(term109159, term109159.getClass(), "thisType", null);
        setBooleanField(term109159, term109159.getClass(), "includeDocumentation", false);
        term109146 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term109149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term109146, term109146.getClass(), "fnName", null);
        setField(term109146, term109146.getClass(), "compiler", null);
        setField(term109146, term109146.getClass(), "codingConvention", null);
        setField(term109146, term109146.getClass(), "typeRegistry", null);
        setField(term109146, term109146.getClass(), "errorRoot", null);
        setField(term109146, term109146.getClass(), "sourceName", null);
        setField(term109146, term109146.getClass(), "scope", null);
        setField(term109146, term109146.getClass(), "returnType", null);
        setField(term109146, term109146.getClass(), "implementedInterfaces", null);
        setField(term109146, term109146.getClass(), "baseType", null);
        setField(term109146, term109146.getClass(), "thisType", null);
        setBooleanField(term109146, term109146.getClass(), "isConstructor", false);
        setBooleanField(term109146, term109146.getClass(), "isInterface", false);
        setIntField(term109149, term109149.getClass(), "type", 83);
        setField(term109149, term109149.getClass(), "next", null);
        setField(term109149, term109149.getClass(), "first", null);
        setField(term109149, term109149.getClass(), "last", null);
        setField(term109149, term109149.getClass(), "propListHead", null);
        setIntField(term109149, term109149.getClass(), "sourcePosition", -1);
        setField(term109149, term109149.getClass(), "jsType", null);
        setField(term109149, term109149.getClass(), "parent", null);
        setField(term109146, term109146.getClass(), "parametersNode", term109149);
        setField(term109146, term109146.getClass(), "sourceNode", null);
        setField(term109146, term109146.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term108761;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term108681, args);
        assertTrue(recursiveEquals(term108681, term109158));
        assertTrue(recursiveEquals(term108761, null));
        assertTrue(recursiveEquals(retValue, term109146));
    }

};


