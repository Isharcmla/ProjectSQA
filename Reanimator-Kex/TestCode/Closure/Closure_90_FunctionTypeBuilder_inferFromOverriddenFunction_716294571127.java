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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55197;
     Object term55297;
     Object term55531;
     Object term56077;
     Object term56082;
     Object term56085;
     Object term56065;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55197 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term55197, term55197.getClass(), "returnType", null);
        setBooleanField(term55197, term55197.getClass(), "returnTypeInferred", false);
        setField(term55197, term55197.getClass(), "typeRegistry", null);
        term55297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term55391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term55461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term55391, term55391.getClass(), "returnType", null);
        setBooleanField(term55391, term55391.getClass(), "returnTypeInferred", false);
        setField(term55461, term55461.getClass(), "first", term55461);
        setField(term55391, term55391.getClass(), "parameters", term55461);
        setField(term55297, term55297.getClass(), "call", term55391);
        term55531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term55531, term55531.getClass(), "first", term55601);
        term56077 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term56078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56079 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term56077, term56077.getClass(), "fnName", null);
        setField(term56077, term56077.getClass(), "compiler", null);
        setField(term56077, term56077.getClass(), "codingConvention", null);
        setField(term56077, term56077.getClass(), "typeRegistry", null);
        setField(term56077, term56077.getClass(), "errorRoot", null);
        setField(term56077, term56077.getClass(), "sourceName", null);
        setField(term56077, term56077.getClass(), "scope", null);
        setField(term56077, term56077.getClass(), "returnType", null);
        setBooleanField(term56077, term56077.getClass(), "returnTypeInferred", false);
        setField(term56077, term56077.getClass(), "implementedInterfaces", null);
        setField(term56077, term56077.getClass(), "baseType", null);
        setField(term56077, term56077.getClass(), "thisType", null);
        setBooleanField(term56077, term56077.getClass(), "isConstructor", false);
        setBooleanField(term56077, term56077.getClass(), "isInterface", false);
        setIntField(term56078, term56078.getClass(), "type", 83);
        setField(term56078, term56078.getClass(), "next", null);
        setField(term56079, term56079.getClass(), "str", "");
        setIntField(term56079, term56079.getClass(), "type", 38);
        setField(term56079, term56079.getClass(), "next", null);
        setField(term56079, term56079.getClass(), "first", null);
        setField(term56079, term56079.getClass(), "last", null);
        setField(term56079, term56079.getClass(), "propListHead", null);
        setIntField(term56079, term56079.getClass(), "sourcePosition", -1);
        setField(term56079, term56079.getClass(), "jsType", null);
        setField(term56079, term56079.getClass(), "parent", term56078);
        setField(term56078, term56078.getClass(), "first", term56079);
        setField(term56078, term56078.getClass(), "last", term56079);
        setField(term56078, term56078.getClass(), "propListHead", null);
        setIntField(term56078, term56078.getClass(), "sourcePosition", -1);
        setField(term56078, term56078.getClass(), "jsType", null);
        setField(term56078, term56078.getClass(), "parent", null);
        setField(term56077, term56077.getClass(), "parametersNode", term56078);
        setField(term56077, term56077.getClass(), "sourceNode", null);
        setField(term56077, term56077.getClass(), "templateTypeName", null);
        term56082 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term56083 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term56084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56084, term56084.getClass(), "type", 0);
        setField(term56084, term56084.getClass(), "next", null);
        setField(term56084, term56084.getClass(), "first", term56084);
        setField(term56084, term56084.getClass(), "last", null);
        setField(term56084, term56084.getClass(), "propListHead", null);
        setIntField(term56084, term56084.getClass(), "sourcePosition", 0);
        setField(term56084, term56084.getClass(), "jsType", null);
        setField(term56084, term56084.getClass(), "parent", null);
        setField(term56083, term56083.getClass(), "parameters", term56084);
        setField(term56083, term56083.getClass(), "returnType", null);
        setBooleanField(term56083, term56083.getClass(), "returnTypeInferred", false);
        setBooleanField(term56083, term56083.getClass(), "resolved", false);
        setField(term56083, term56083.getClass(), "resolveResult", null);
        setField(term56083, term56083.getClass(), "registry", null);
        setField(term56082, term56082.getClass(), "call", term56083);
        setField(term56082, term56082.getClass(), "prototype", null);
        setField(term56082, term56082.getClass(), "kind", null);
        setField(term56082, term56082.getClass(), "typeOfThis", null);
        setField(term56082, term56082.getClass(), "source", null);
        setField(term56082, term56082.getClass(), "implementedInterfaces", null);
        setField(term56082, term56082.getClass(), "subTypes", null);
        setField(term56082, term56082.getClass(), "templateTypeName", null);
        setField(term56082, term56082.getClass(), "className", null);
        setField(term56082, term56082.getClass(), "properties", null);
        setBooleanField(term56082, term56082.getClass(), "nativeType", false);
        setField(term56082, term56082.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term56082, term56082.getClass(), "prettyPrint", false);
        setBooleanField(term56082, term56082.getClass(), "visited", false);
        setField(term56082, term56082.getClass(), "docInfo", null);
        setBooleanField(term56082, term56082.getClass(), "unknown", false);
        setBooleanField(term56082, term56082.getClass(), "resolved", false);
        setField(term56082, term56082.getClass(), "resolveResult", null);
        setField(term56082, term56082.getClass(), "registry", null);
        term56085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56085, term56085.getClass(), "type", 0);
        setField(term56085, term56085.getClass(), "next", null);
        setIntField(term56086, term56086.getClass(), "type", 0);
        setField(term56086, term56086.getClass(), "next", null);
        setField(term56086, term56086.getClass(), "first", null);
        setField(term56086, term56086.getClass(), "last", null);
        setField(term56086, term56086.getClass(), "propListHead", null);
        setIntField(term56086, term56086.getClass(), "sourcePosition", 0);
        setField(term56086, term56086.getClass(), "jsType", null);
        setField(term56086, term56086.getClass(), "parent", null);
        setField(term56085, term56085.getClass(), "first", term56086);
        setField(term56085, term56085.getClass(), "last", null);
        setField(term56085, term56085.getClass(), "propListHead", null);
        setIntField(term56085, term56085.getClass(), "sourcePosition", 0);
        setField(term56085, term56085.getClass(), "jsType", null);
        setField(term56085, term56085.getClass(), "parent", null);
        term56065 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term56069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56071 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term56065, term56065.getClass(), "fnName", null);
        setField(term56065, term56065.getClass(), "compiler", null);
        setField(term56065, term56065.getClass(), "codingConvention", null);
        setField(term56065, term56065.getClass(), "typeRegistry", null);
        setField(term56065, term56065.getClass(), "errorRoot", null);
        setField(term56065, term56065.getClass(), "sourceName", null);
        setField(term56065, term56065.getClass(), "scope", null);
        setField(term56065, term56065.getClass(), "returnType", null);
        setBooleanField(term56065, term56065.getClass(), "returnTypeInferred", false);
        setField(term56065, term56065.getClass(), "implementedInterfaces", null);
        setField(term56065, term56065.getClass(), "baseType", null);
        setField(term56065, term56065.getClass(), "thisType", null);
        setBooleanField(term56065, term56065.getClass(), "isConstructor", false);
        setBooleanField(term56065, term56065.getClass(), "isInterface", false);
        setIntField(term56069, term56069.getClass(), "type", 83);
        setField(term56069, term56069.getClass(), "next", null);
        setField(term56071, term56071.getClass(), "str", "");
        setIntField(term56071, term56071.getClass(), "type", 38);
        setField(term56071, term56071.getClass(), "next", null);
        setField(term56071, term56071.getClass(), "first", null);
        setField(term56071, term56071.getClass(), "last", null);
        setField(term56071, term56071.getClass(), "propListHead", null);
        setIntField(term56071, term56071.getClass(), "sourcePosition", -1);
        setField(term56071, term56071.getClass(), "jsType", null);
        setField(term56071, term56071.getClass(), "parent", term56069);
        setField(term56069, term56069.getClass(), "first", term56071);
        setField(term56069, term56069.getClass(), "last", term56071);
        setField(term56069, term56069.getClass(), "propListHead", null);
        setIntField(term56069, term56069.getClass(), "sourcePosition", -1);
        setField(term56069, term56069.getClass(), "jsType", null);
        setField(term56069, term56069.getClass(), "parent", null);
        setField(term56065, term56065.getClass(), "parametersNode", term56069);
        setField(term56065, term56065.getClass(), "sourceNode", null);
        setField(term56065, term56065.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term55297;
        args[1] = term55531;
        Object retValue = callMethod(klass, "inferFromOverriddenFunction", argTypes, term55197, args);
        assertTrue(recursiveEquals(term55197, term56077));
        assertTrue(recursiveEquals(term55297, term56082));
        assertTrue(recursiveEquals(term55531, term56085));
        assertTrue(recursiveEquals(retValue, term56065));
    }

};


