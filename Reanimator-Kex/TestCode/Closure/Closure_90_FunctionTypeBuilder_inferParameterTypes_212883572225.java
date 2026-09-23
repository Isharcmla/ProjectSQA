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

public class FunctionTypeBuilder_inferParameterTypes_212883572225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87248;
     Object term87318;
     Object term87939;
     Object term87941;
     Object term87932;

    public FunctionTypeBuilder_inferParameterTypes_212883572225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87248 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term87248, term87248.getClass(), "parametersNode", null);
        setField(term87248, term87248.getClass(), "typeRegistry", null);
        term87318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term87318, term87318.getClass(), "first", null);
        term87939 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term87940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term87939, term87939.getClass(), "fnName", null);
        setField(term87939, term87939.getClass(), "compiler", null);
        setField(term87939, term87939.getClass(), "codingConvention", null);
        setField(term87939, term87939.getClass(), "typeRegistry", null);
        setField(term87939, term87939.getClass(), "errorRoot", null);
        setField(term87939, term87939.getClass(), "sourceName", null);
        setField(term87939, term87939.getClass(), "scope", null);
        setField(term87939, term87939.getClass(), "returnType", null);
        setBooleanField(term87939, term87939.getClass(), "returnTypeInferred", false);
        setField(term87939, term87939.getClass(), "implementedInterfaces", null);
        setField(term87939, term87939.getClass(), "baseType", null);
        setField(term87939, term87939.getClass(), "thisType", null);
        setBooleanField(term87939, term87939.getClass(), "isConstructor", false);
        setBooleanField(term87939, term87939.getClass(), "isInterface", false);
        setIntField(term87940, term87940.getClass(), "type", 83);
        setField(term87940, term87940.getClass(), "next", null);
        setField(term87940, term87940.getClass(), "first", null);
        setField(term87940, term87940.getClass(), "last", null);
        setField(term87940, term87940.getClass(), "propListHead", null);
        setIntField(term87940, term87940.getClass(), "sourcePosition", -1);
        setField(term87940, term87940.getClass(), "jsType", null);
        setField(term87940, term87940.getClass(), "parent", null);
        setField(term87939, term87939.getClass(), "parametersNode", term87940);
        setField(term87939, term87939.getClass(), "sourceNode", null);
        setField(term87939, term87939.getClass(), "templateTypeName", null);
        term87941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term87941, term87941.getClass(), "type", 0);
        setField(term87941, term87941.getClass(), "next", null);
        setField(term87941, term87941.getClass(), "first", null);
        setField(term87941, term87941.getClass(), "last", null);
        setField(term87941, term87941.getClass(), "propListHead", null);
        setIntField(term87941, term87941.getClass(), "sourcePosition", 0);
        setField(term87941, term87941.getClass(), "jsType", null);
        setField(term87941, term87941.getClass(), "parent", null);
        term87932 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term87936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term87932, term87932.getClass(), "fnName", null);
        setField(term87932, term87932.getClass(), "compiler", null);
        setField(term87932, term87932.getClass(), "codingConvention", null);
        setField(term87932, term87932.getClass(), "typeRegistry", null);
        setField(term87932, term87932.getClass(), "errorRoot", null);
        setField(term87932, term87932.getClass(), "sourceName", null);
        setField(term87932, term87932.getClass(), "scope", null);
        setField(term87932, term87932.getClass(), "returnType", null);
        setBooleanField(term87932, term87932.getClass(), "returnTypeInferred", false);
        setField(term87932, term87932.getClass(), "implementedInterfaces", null);
        setField(term87932, term87932.getClass(), "baseType", null);
        setField(term87932, term87932.getClass(), "thisType", null);
        setBooleanField(term87932, term87932.getClass(), "isConstructor", false);
        setBooleanField(term87932, term87932.getClass(), "isInterface", false);
        setIntField(term87936, term87936.getClass(), "type", 83);
        setField(term87936, term87936.getClass(), "next", null);
        setField(term87936, term87936.getClass(), "first", null);
        setField(term87936, term87936.getClass(), "last", null);
        setField(term87936, term87936.getClass(), "propListHead", null);
        setIntField(term87936, term87936.getClass(), "sourcePosition", -1);
        setField(term87936, term87936.getClass(), "jsType", null);
        setField(term87936, term87936.getClass(), "parent", null);
        setField(term87932, term87932.getClass(), "parametersNode", term87936);
        setField(term87932, term87932.getClass(), "sourceNode", null);
        setField(term87932, term87932.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term87318;
        args[1] = null;
        Object retValue = callMethod(klass, "inferParameterTypes", argTypes, term87248, args);
        assertTrue(recursiveEquals(term87248, term87939));
        assertTrue(recursiveEquals(term87318, term87941));
        assertTrue(recursiveEquals(retValue, term87932));
    }

};


