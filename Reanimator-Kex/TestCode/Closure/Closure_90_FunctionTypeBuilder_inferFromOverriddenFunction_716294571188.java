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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75789;
     Object term75889;
     Object term76123;
     Object term76168;
     Object term76170;
     Object term76173;
     Object term76161;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75789 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term75789, term75789.getClass(), "returnType", null);
        setBooleanField(term75789, term75789.getClass(), "returnTypeInferred", false);
        setField(term75789, term75789.getClass(), "typeRegistry", null);
        term75889 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term75983 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term76053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term75983, term75983.getClass(), "returnType", null);
        setBooleanField(term75983, term75983.getClass(), "returnTypeInferred", false);
        setField(term76053, term76053.getClass(), "first", null);
        setField(term75983, term75983.getClass(), "parameters", term76053);
        setField(term75889, term75889.getClass(), "call", term75983);
        term76123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term76168 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term76169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term76168, term76168.getClass(), "fnName", null);
        setField(term76168, term76168.getClass(), "compiler", null);
        setField(term76168, term76168.getClass(), "codingConvention", null);
        setField(term76168, term76168.getClass(), "typeRegistry", null);
        setField(term76168, term76168.getClass(), "errorRoot", null);
        setField(term76168, term76168.getClass(), "sourceName", null);
        setField(term76168, term76168.getClass(), "scope", null);
        setField(term76168, term76168.getClass(), "returnType", null);
        setBooleanField(term76168, term76168.getClass(), "returnTypeInferred", false);
        setField(term76168, term76168.getClass(), "implementedInterfaces", null);
        setField(term76168, term76168.getClass(), "baseType", null);
        setField(term76168, term76168.getClass(), "thisType", null);
        setBooleanField(term76168, term76168.getClass(), "isConstructor", false);
        setBooleanField(term76168, term76168.getClass(), "isInterface", false);
        setIntField(term76169, term76169.getClass(), "type", 83);
        setField(term76169, term76169.getClass(), "next", null);
        setField(term76169, term76169.getClass(), "first", null);
        setField(term76169, term76169.getClass(), "last", null);
        setField(term76169, term76169.getClass(), "propListHead", null);
        setIntField(term76169, term76169.getClass(), "sourcePosition", -1);
        setField(term76169, term76169.getClass(), "jsType", null);
        setField(term76169, term76169.getClass(), "parent", null);
        setField(term76168, term76168.getClass(), "parametersNode", term76169);
        setField(term76168, term76168.getClass(), "sourceNode", null);
        setField(term76168, term76168.getClass(), "templateTypeName", null);
        term76170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term76171 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term76172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76172, term76172.getClass(), "type", 0);
        setField(term76172, term76172.getClass(), "next", null);
        setField(term76172, term76172.getClass(), "first", null);
        setField(term76172, term76172.getClass(), "last", null);
        setField(term76172, term76172.getClass(), "propListHead", null);
        setIntField(term76172, term76172.getClass(), "sourcePosition", 0);
        setField(term76172, term76172.getClass(), "jsType", null);
        setField(term76172, term76172.getClass(), "parent", null);
        setField(term76171, term76171.getClass(), "parameters", term76172);
        setField(term76171, term76171.getClass(), "returnType", null);
        setBooleanField(term76171, term76171.getClass(), "returnTypeInferred", false);
        setBooleanField(term76171, term76171.getClass(), "resolved", false);
        setField(term76171, term76171.getClass(), "resolveResult", null);
        setField(term76171, term76171.getClass(), "registry", null);
        setField(term76170, term76170.getClass(), "call", term76171);
        setField(term76170, term76170.getClass(), "prototype", null);
        setField(term76170, term76170.getClass(), "kind", null);
        setField(term76170, term76170.getClass(), "typeOfThis", null);
        setField(term76170, term76170.getClass(), "source", null);
        setField(term76170, term76170.getClass(), "implementedInterfaces", null);
        setField(term76170, term76170.getClass(), "subTypes", null);
        setField(term76170, term76170.getClass(), "templateTypeName", null);
        setField(term76170, term76170.getClass(), "className", null);
        setField(term76170, term76170.getClass(), "properties", null);
        setBooleanField(term76170, term76170.getClass(), "nativeType", false);
        setField(term76170, term76170.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term76170, term76170.getClass(), "prettyPrint", false);
        setBooleanField(term76170, term76170.getClass(), "visited", false);
        setField(term76170, term76170.getClass(), "docInfo", null);
        setBooleanField(term76170, term76170.getClass(), "unknown", false);
        setBooleanField(term76170, term76170.getClass(), "resolved", false);
        setField(term76170, term76170.getClass(), "resolveResult", null);
        setField(term76170, term76170.getClass(), "registry", null);
        term76173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76173, term76173.getClass(), "type", 0);
        setField(term76173, term76173.getClass(), "next", null);
        setField(term76173, term76173.getClass(), "first", null);
        setField(term76173, term76173.getClass(), "last", null);
        setField(term76173, term76173.getClass(), "propListHead", null);
        setIntField(term76173, term76173.getClass(), "sourcePosition", 0);
        setField(term76173, term76173.getClass(), "jsType", null);
        setField(term76173, term76173.getClass(), "parent", null);
        term76161 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term76165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term76161, term76161.getClass(), "fnName", null);
        setField(term76161, term76161.getClass(), "compiler", null);
        setField(term76161, term76161.getClass(), "codingConvention", null);
        setField(term76161, term76161.getClass(), "typeRegistry", null);
        setField(term76161, term76161.getClass(), "errorRoot", null);
        setField(term76161, term76161.getClass(), "sourceName", null);
        setField(term76161, term76161.getClass(), "scope", null);
        setField(term76161, term76161.getClass(), "returnType", null);
        setBooleanField(term76161, term76161.getClass(), "returnTypeInferred", false);
        setField(term76161, term76161.getClass(), "implementedInterfaces", null);
        setField(term76161, term76161.getClass(), "baseType", null);
        setField(term76161, term76161.getClass(), "thisType", null);
        setBooleanField(term76161, term76161.getClass(), "isConstructor", false);
        setBooleanField(term76161, term76161.getClass(), "isInterface", false);
        setIntField(term76165, term76165.getClass(), "type", 83);
        setField(term76165, term76165.getClass(), "next", null);
        setField(term76165, term76165.getClass(), "first", null);
        setField(term76165, term76165.getClass(), "last", null);
        setField(term76165, term76165.getClass(), "propListHead", null);
        setIntField(term76165, term76165.getClass(), "sourcePosition", -1);
        setField(term76165, term76165.getClass(), "jsType", null);
        setField(term76165, term76165.getClass(), "parent", null);
        setField(term76161, term76161.getClass(), "parametersNode", term76165);
        setField(term76161, term76161.getClass(), "sourceNode", null);
        setField(term76161, term76161.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term75889;
        args[1] = term76123;
        Object retValue = callMethod(klass, "inferFromOverriddenFunction", argTypes, term75789, args);
        assertTrue(recursiveEquals(term75789, term76168));
        assertTrue(recursiveEquals(term75889, term76170));
        assertTrue(recursiveEquals(term76123, term76173));
        assertTrue(recursiveEquals(retValue, term76161));
    }

};


