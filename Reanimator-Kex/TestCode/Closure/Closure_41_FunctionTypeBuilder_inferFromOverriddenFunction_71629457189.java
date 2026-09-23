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

public class FunctionTypeBuilder_inferFromOverriddenFunction_71629457189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28222;
     Object term28322;
     Object term28545;
     Object term28548;
     Object term28538;

    public FunctionTypeBuilder_inferFromOverriddenFunction_71629457189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28222 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term28222, term28222.getClass(), "returnType", null);
        setBooleanField(term28222, term28222.getClass(), "returnTypeInferred", false);
        term28322 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term28416 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term28510 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term28416, term28416.getClass(), "returnType", term28510);
        setBooleanField(term28416, term28416.getClass(), "returnTypeInferred", false);
        setField(term28322, term28322.getClass(), "call", term28416);
        term28545 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term28546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term28547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term28545, term28545.getClass(), "fnName", null);
        setField(term28545, term28545.getClass(), "compiler", null);
        setField(term28545, term28545.getClass(), "codingConvention", null);
        setField(term28545, term28545.getClass(), "typeRegistry", null);
        setField(term28545, term28545.getClass(), "errorRoot", null);
        setField(term28545, term28545.getClass(), "sourceName", null);
        setField(term28545, term28545.getClass(), "scope", null);
        setField(term28545, term28545.getClass(), "contents", null);
        setField(term28546, term28546.getClass(), "parameters", null);
        setField(term28546, term28546.getClass(), "returnType", null);
        setBooleanField(term28546, term28546.getClass(), "returnTypeInferred", false);
        setBooleanField(term28546, term28546.getClass(), "resolved", false);
        setField(term28546, term28546.getClass(), "resolveResult", null);
        setField(term28546, term28546.getClass(), "registry", null);
        setField(term28545, term28545.getClass(), "returnType", term28546);
        setBooleanField(term28545, term28545.getClass(), "returnTypeInferred", false);
        setField(term28545, term28545.getClass(), "implementedInterfaces", null);
        setField(term28545, term28545.getClass(), "extendedInterfaces", null);
        setField(term28545, term28545.getClass(), "baseType", null);
        setField(term28545, term28545.getClass(), "thisType", null);
        setBooleanField(term28545, term28545.getClass(), "isConstructor", false);
        setBooleanField(term28545, term28545.getClass(), "isInterface", false);
        setIntField(term28547, term28547.getClass(), "type", 83);
        setField(term28547, term28547.getClass(), "next", null);
        setField(term28547, term28547.getClass(), "first", null);
        setField(term28547, term28547.getClass(), "last", null);
        setField(term28547, term28547.getClass(), "propListHead", null);
        setIntField(term28547, term28547.getClass(), "sourcePosition", -1);
        setField(term28547, term28547.getClass(), "jsType", null);
        setField(term28547, term28547.getClass(), "parent", null);
        setField(term28545, term28545.getClass(), "parametersNode", term28547);
        setField(term28545, term28545.getClass(), "templateTypeName", null);
        term28548 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term28549 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term28550 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term28549, term28549.getClass(), "parameters", null);
        setField(term28550, term28550.getClass(), "parameters", null);
        setField(term28550, term28550.getClass(), "returnType", null);
        setBooleanField(term28550, term28550.getClass(), "returnTypeInferred", false);
        setBooleanField(term28550, term28550.getClass(), "resolved", false);
        setField(term28550, term28550.getClass(), "resolveResult", null);
        setField(term28550, term28550.getClass(), "registry", null);
        setField(term28549, term28549.getClass(), "returnType", term28550);
        setBooleanField(term28549, term28549.getClass(), "returnTypeInferred", false);
        setBooleanField(term28549, term28549.getClass(), "resolved", false);
        setField(term28549, term28549.getClass(), "resolveResult", null);
        setField(term28549, term28549.getClass(), "registry", null);
        setField(term28548, term28548.getClass(), "call", term28549);
        setField(term28548, term28548.getClass(), "prototypeSlot", null);
        setField(term28548, term28548.getClass(), "kind", null);
        setField(term28548, term28548.getClass(), "typeOfThis", null);
        setField(term28548, term28548.getClass(), "source", null);
        setField(term28548, term28548.getClass(), "implementedInterfaces", null);
        setField(term28548, term28548.getClass(), "extendedInterfaces", null);
        setField(term28548, term28548.getClass(), "subTypes", null);
        setField(term28548, term28548.getClass(), "templateTypeName", null);
        setField(term28548, term28548.getClass(), "className", null);
        setField(term28548, term28548.getClass(), "properties", null);
        setBooleanField(term28548, term28548.getClass(), "nativeType", false);
        setField(term28548, term28548.getClass(), "implicitPrototypeFallback", null);
        setField(term28548, term28548.getClass(), "ownerFunction", null);
        setBooleanField(term28548, term28548.getClass(), "prettyPrint", false);
        setBooleanField(term28548, term28548.getClass(), "visited", false);
        setField(term28548, term28548.getClass(), "docInfo", null);
        setBooleanField(term28548, term28548.getClass(), "unknown", false);
        setBooleanField(term28548, term28548.getClass(), "resolved", false);
        setField(term28548, term28548.getClass(), "resolveResult", null);
        setField(term28548, term28548.getClass(), "registry", null);
        term28538 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term28517 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term28542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term28538, term28538.getClass(), "fnName", null);
        setField(term28538, term28538.getClass(), "compiler", null);
        setField(term28538, term28538.getClass(), "codingConvention", null);
        setField(term28538, term28538.getClass(), "typeRegistry", null);
        setField(term28538, term28538.getClass(), "errorRoot", null);
        setField(term28538, term28538.getClass(), "sourceName", null);
        setField(term28538, term28538.getClass(), "scope", null);
        setField(term28538, term28538.getClass(), "contents", null);
        setField(term28517, term28517.getClass(), "parameters", null);
        setField(term28517, term28517.getClass(), "returnType", null);
        setBooleanField(term28517, term28517.getClass(), "returnTypeInferred", false);
        setBooleanField(term28517, term28517.getClass(), "resolved", false);
        setField(term28517, term28517.getClass(), "resolveResult", null);
        setField(term28517, term28517.getClass(), "registry", null);
        setField(term28538, term28538.getClass(), "returnType", term28517);
        setBooleanField(term28538, term28538.getClass(), "returnTypeInferred", false);
        setField(term28538, term28538.getClass(), "implementedInterfaces", null);
        setField(term28538, term28538.getClass(), "extendedInterfaces", null);
        setField(term28538, term28538.getClass(), "baseType", null);
        setField(term28538, term28538.getClass(), "thisType", null);
        setBooleanField(term28538, term28538.getClass(), "isConstructor", false);
        setBooleanField(term28538, term28538.getClass(), "isInterface", false);
        setIntField(term28542, term28542.getClass(), "type", 83);
        setField(term28542, term28542.getClass(), "next", null);
        setField(term28542, term28542.getClass(), "first", null);
        setField(term28542, term28542.getClass(), "last", null);
        setField(term28542, term28542.getClass(), "propListHead", null);
        setIntField(term28542, term28542.getClass(), "sourcePosition", -1);
        setField(term28542, term28542.getClass(), "jsType", null);
        setField(term28542, term28542.getClass(), "parent", null);
        setField(term28538, term28538.getClass(), "parametersNode", term28542);
        setField(term28538, term28538.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term28322;
        args[1] = null;
        Object retValue = callMethod(klass, "inferFromOverriddenFunction", argTypes, term28222, args);
        assertTrue(recursiveEquals(term28222, term28545));
        assertTrue(recursiveEquals(term28322, term28548));
        assertTrue(recursiveEquals(retValue, term28538));
    }

};


