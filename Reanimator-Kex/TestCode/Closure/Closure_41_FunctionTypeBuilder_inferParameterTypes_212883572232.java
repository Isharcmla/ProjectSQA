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

public class FunctionTypeBuilder_inferParameterTypes_212883572232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75127;
     Object term75337;
     Object term75417;
     Object term76101;
     Object term76102;
     Object term76103;
     Object term76094;

    public FunctionTypeBuilder_inferParameterTypes_212883572232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75127 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term75197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term75197, term75197.getClass(), "first", term75267);
        setField(term75127, term75127.getClass(), "parametersNode", term75197);
        setField(term75127, term75127.getClass(), "typeRegistry", null);
        setField(term75127, term75127.getClass(), "templateTypeName", null);
        term75337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term75337, term75337.getClass(), "first", null);
        term75417 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term75417, term75417.getClass(), "info", null);
        term76101 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term76101, term76101.getClass(), "asList", null);
        term76102 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term76102, term76102.getClass(), "info", null);
        setField(term76102, term76102.getClass(), "documentation", null);
        setField(term76102, term76102.getClass(), "associatedNode", null);
        setField(term76102, term76102.getClass(), "visibility", null);
        setIntField(term76102, term76102.getClass(), "bitset", 0);
        setField(term76102, term76102.getClass(), "type", null);
        setField(term76102, term76102.getClass(), "thisType", null);
        setBooleanField(term76102, term76102.getClass(), "includeDocumentation", false);
        term76103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76103, term76103.getClass(), "type", 0);
        setField(term76103, term76103.getClass(), "next", null);
        setField(term76103, term76103.getClass(), "first", null);
        setField(term76103, term76103.getClass(), "last", null);
        setField(term76103, term76103.getClass(), "propListHead", null);
        setIntField(term76103, term76103.getClass(), "sourcePosition", 0);
        setField(term76103, term76103.getClass(), "jsType", null);
        setField(term76103, term76103.getClass(), "parent", null);
        term76094 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term76098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term76094, term76094.getClass(), "fnName", null);
        setField(term76094, term76094.getClass(), "compiler", null);
        setField(term76094, term76094.getClass(), "codingConvention", null);
        setField(term76094, term76094.getClass(), "typeRegistry", null);
        setField(term76094, term76094.getClass(), "errorRoot", null);
        setField(term76094, term76094.getClass(), "sourceName", null);
        setField(term76094, term76094.getClass(), "scope", null);
        setField(term76094, term76094.getClass(), "contents", null);
        setField(term76094, term76094.getClass(), "returnType", null);
        setBooleanField(term76094, term76094.getClass(), "returnTypeInferred", false);
        setField(term76094, term76094.getClass(), "implementedInterfaces", null);
        setField(term76094, term76094.getClass(), "extendedInterfaces", null);
        setField(term76094, term76094.getClass(), "baseType", null);
        setField(term76094, term76094.getClass(), "thisType", null);
        setBooleanField(term76094, term76094.getClass(), "isConstructor", false);
        setBooleanField(term76094, term76094.getClass(), "isInterface", false);
        setIntField(term76098, term76098.getClass(), "type", 83);
        setField(term76098, term76098.getClass(), "next", null);
        setField(term76098, term76098.getClass(), "first", null);
        setField(term76098, term76098.getClass(), "last", null);
        setField(term76098, term76098.getClass(), "propListHead", null);
        setIntField(term76098, term76098.getClass(), "sourcePosition", -1);
        setField(term76098, term76098.getClass(), "jsType", null);
        setField(term76098, term76098.getClass(), "parent", null);
        setField(term76094, term76094.getClass(), "parametersNode", term76098);
        setField(term76094, term76094.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term75337;
        args[1] = term75417;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term75127, args);
        assertTrue(recursiveEquals(term75127, term76101));
        assertTrue(recursiveEquals(term75337, term76102));
        assertTrue(recursiveEquals(term75417, term76103));
        assertTrue(recursiveEquals(retValue, term76094));
    }

};


