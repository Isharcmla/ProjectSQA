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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105596;
     Object term105696;
     Object term106092;
     Object term106163;
     Object term106166;
     Object term106171;
     Object term106157;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105596 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term105596, term105596.getClass(), "returnType", null);
        setField(term105596, term105596.getClass(), "typeRegistry", null);
        term105696 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term105790 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term105882 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        Object term105952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term105790, term105790.getClass(), "returnType", term105882);
        setIntField(term106022, term106022.getClass(), "type", 0);
        setField(term106022, term106022.getClass(), "parent", null);
        setIntField(term106022, term106022.getClass(), "sourcePosition", 0);
        setField(term106022, term106022.getClass(), "first", null);
        setField(term105952, term105952.getClass(), "first", term106022);
        setField(term105790, term105790.getClass(), "parameters", term105952);
        setField(term105696, term105696.getClass(), "call", term105790);
        term106092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term106092, term106092.getClass(), "first", null);
        term106163 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term106164 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        Object term106165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term106163, term106163.getClass(), "fnName", null);
        setField(term106163, term106163.getClass(), "compiler", null);
        setField(term106163, term106163.getClass(), "codingConvention", null);
        setField(term106163, term106163.getClass(), "typeRegistry", null);
        setField(term106163, term106163.getClass(), "errorRoot", null);
        setField(term106163, term106163.getClass(), "sourceName", null);
        setField(term106163, term106163.getClass(), "scope", null);
        setBooleanField(term106164, term106164.getClass(), "resolved", false);
        setField(term106164, term106164.getClass(), "resolveResult", null);
        setField(term106164, term106164.getClass(), "registry", null);
        setField(term106163, term106163.getClass(), "returnType", term106164);
        setField(term106163, term106163.getClass(), "implementedInterfaces", null);
        setField(term106163, term106163.getClass(), "baseType", null);
        setField(term106163, term106163.getClass(), "thisType", null);
        setBooleanField(term106163, term106163.getClass(), "isConstructor", false);
        setBooleanField(term106163, term106163.getClass(), "isInterface", false);
        setIntField(term106165, term106165.getClass(), "type", 83);
        setField(term106165, term106165.getClass(), "next", null);
        setField(term106165, term106165.getClass(), "first", null);
        setField(term106165, term106165.getClass(), "last", null);
        setField(term106165, term106165.getClass(), "propListHead", null);
        setIntField(term106165, term106165.getClass(), "sourcePosition", -1);
        setField(term106165, term106165.getClass(), "jsType", null);
        setField(term106165, term106165.getClass(), "parent", null);
        setField(term106163, term106163.getClass(), "parametersNode", term106165);
        setField(term106163, term106163.getClass(), "sourceNode", null);
        setField(term106163, term106163.getClass(), "templateTypeName", null);
        term106166 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term106167 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term106168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setIntField(term106168, term106168.getClass(), "type", 0);
        setField(term106168, term106168.getClass(), "next", null);
        setIntField(term106169, term106169.getClass(), "type", 0);
        setField(term106169, term106169.getClass(), "next", null);
        setField(term106169, term106169.getClass(), "first", null);
        setField(term106169, term106169.getClass(), "last", null);
        setField(term106169, term106169.getClass(), "propListHead", null);
        setIntField(term106169, term106169.getClass(), "sourcePosition", 0);
        setField(term106169, term106169.getClass(), "jsType", null);
        setField(term106169, term106169.getClass(), "parent", null);
        setField(term106168, term106168.getClass(), "first", term106169);
        setField(term106168, term106168.getClass(), "last", null);
        setField(term106168, term106168.getClass(), "propListHead", null);
        setIntField(term106168, term106168.getClass(), "sourcePosition", 0);
        setField(term106168, term106168.getClass(), "jsType", null);
        setField(term106168, term106168.getClass(), "parent", null);
        setField(term106167, term106167.getClass(), "parameters", term106168);
        setBooleanField(term106170, term106170.getClass(), "resolved", false);
        setField(term106170, term106170.getClass(), "resolveResult", null);
        setField(term106170, term106170.getClass(), "registry", null);
        setField(term106167, term106167.getClass(), "returnType", term106170);
        setBooleanField(term106167, term106167.getClass(), "returnTypeInferred", false);
        setBooleanField(term106167, term106167.getClass(), "resolved", false);
        setField(term106167, term106167.getClass(), "resolveResult", null);
        setField(term106167, term106167.getClass(), "registry", null);
        setField(term106166, term106166.getClass(), "call", term106167);
        setField(term106166, term106166.getClass(), "prototype", null);
        setField(term106166, term106166.getClass(), "kind", null);
        setField(term106166, term106166.getClass(), "typeOfThis", null);
        setField(term106166, term106166.getClass(), "source", null);
        setField(term106166, term106166.getClass(), "implementedInterfaces", null);
        setField(term106166, term106166.getClass(), "subTypes", null);
        setField(term106166, term106166.getClass(), "templateTypeName", null);
        setField(term106166, term106166.getClass(), "className", null);
        setField(term106166, term106166.getClass(), "properties", null);
        setField(term106166, term106166.getClass(), "implicitPrototype", null);
        setBooleanField(term106166, term106166.getClass(), "nativeType", false);
        setBooleanField(term106166, term106166.getClass(), "prettyPrint", false);
        setBooleanField(term106166, term106166.getClass(), "visited", false);
        setField(term106166, term106166.getClass(), "docInfo", null);
        setBooleanField(term106166, term106166.getClass(), "unknown", false);
        setBooleanField(term106166, term106166.getClass(), "resolved", false);
        setField(term106166, term106166.getClass(), "resolveResult", null);
        setField(term106166, term106166.getClass(), "registry", null);
        term106171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106171, term106171.getClass(), "type", 0);
        setField(term106171, term106171.getClass(), "next", null);
        setField(term106171, term106171.getClass(), "first", null);
        setField(term106171, term106171.getClass(), "last", null);
        setField(term106171, term106171.getClass(), "propListHead", null);
        setIntField(term106171, term106171.getClass(), "sourcePosition", 0);
        setField(term106171, term106171.getClass(), "jsType", null);
        setField(term106171, term106171.getClass(), "parent", null);
        term106157 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term106103 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        Object term106160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term106157, term106157.getClass(), "fnName", null);
        setField(term106157, term106157.getClass(), "compiler", null);
        setField(term106157, term106157.getClass(), "codingConvention", null);
        setField(term106157, term106157.getClass(), "typeRegistry", null);
        setField(term106157, term106157.getClass(), "errorRoot", null);
        setField(term106157, term106157.getClass(), "sourceName", null);
        setField(term106157, term106157.getClass(), "scope", null);
        setBooleanField(term106103, term106103.getClass(), "resolved", false);
        setField(term106103, term106103.getClass(), "resolveResult", null);
        setField(term106103, term106103.getClass(), "registry", null);
        setField(term106157, term106157.getClass(), "returnType", term106103);
        setField(term106157, term106157.getClass(), "implementedInterfaces", null);
        setField(term106157, term106157.getClass(), "baseType", null);
        setField(term106157, term106157.getClass(), "thisType", null);
        setBooleanField(term106157, term106157.getClass(), "isConstructor", false);
        setBooleanField(term106157, term106157.getClass(), "isInterface", false);
        setIntField(term106160, term106160.getClass(), "type", 83);
        setField(term106160, term106160.getClass(), "next", null);
        setField(term106160, term106160.getClass(), "first", null);
        setField(term106160, term106160.getClass(), "last", null);
        setField(term106160, term106160.getClass(), "propListHead", null);
        setIntField(term106160, term106160.getClass(), "sourcePosition", -1);
        setField(term106160, term106160.getClass(), "jsType", null);
        setField(term106160, term106160.getClass(), "parent", null);
        setField(term106157, term106157.getClass(), "parametersNode", term106160);
        setField(term106157, term106157.getClass(), "sourceNode", null);
        setField(term106157, term106157.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term105696;
        args[1] = term106092;
        Object retValue = callMethod(klass, "inferFromOverriddenFunction", argTypes, term105596, args);
        assertTrue(recursiveEquals(term105596, term106163));
        assertTrue(recursiveEquals(term105696, term106166));
        assertTrue(recursiveEquals(term106092, term106171));
        assertTrue(recursiveEquals(retValue, term106157));
    }

};


