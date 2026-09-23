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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36091;
     Object term36191;
     Object term36425;
     Object term36982;
     Object term36987;
     Object term36990;
     Object term36970;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36091 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term36091, term36091.getClass(), "returnType", null);
        setBooleanField(term36091, term36091.getClass(), "returnTypeInferred", false);
        setField(term36091, term36091.getClass(), "typeRegistry", null);
        term36191 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term36285 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term36355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term36285, term36285.getClass(), "returnType", null);
        setBooleanField(term36285, term36285.getClass(), "returnTypeInferred", false);
        setField(term36355, term36355.getClass(), "first", term36355);
        setField(term36285, term36285.getClass(), "parameters", term36355);
        setField(term36191, term36191.getClass(), "call", term36285);
        term36425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term36425, term36425.getClass(), "first", term36425);
        setField(term36425, term36425.getClass(), "next", null);
        setField(term36425, term36425.getClass(), "jsType", null);
        setField(term36425, term36425.getClass(), "propListHead", null);
        term36982 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term36983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36984 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term36982, term36982.getClass(), "fnName", null);
        setField(term36982, term36982.getClass(), "compiler", null);
        setField(term36982, term36982.getClass(), "codingConvention", null);
        setField(term36982, term36982.getClass(), "typeRegistry", null);
        setField(term36982, term36982.getClass(), "errorRoot", null);
        setField(term36982, term36982.getClass(), "sourceName", null);
        setField(term36982, term36982.getClass(), "scope", null);
        setField(term36982, term36982.getClass(), "contents", null);
        setField(term36982, term36982.getClass(), "returnType", null);
        setBooleanField(term36982, term36982.getClass(), "returnTypeInferred", false);
        setField(term36982, term36982.getClass(), "implementedInterfaces", null);
        setField(term36982, term36982.getClass(), "extendedInterfaces", null);
        setField(term36982, term36982.getClass(), "baseType", null);
        setField(term36982, term36982.getClass(), "thisType", null);
        setBooleanField(term36982, term36982.getClass(), "isConstructor", false);
        setBooleanField(term36982, term36982.getClass(), "isInterface", false);
        setIntField(term36983, term36983.getClass(), "type", 83);
        setField(term36983, term36983.getClass(), "next", null);
        setField(term36984, term36984.getClass(), "str", "");
        setIntField(term36984, term36984.getClass(), "type", 38);
        setField(term36984, term36984.getClass(), "next", null);
        setField(term36984, term36984.getClass(), "first", null);
        setField(term36984, term36984.getClass(), "last", null);
        setField(term36984, term36984.getClass(), "propListHead", null);
        setIntField(term36984, term36984.getClass(), "sourcePosition", -1);
        setField(term36984, term36984.getClass(), "jsType", null);
        setField(term36984, term36984.getClass(), "parent", term36983);
        setField(term36983, term36983.getClass(), "first", term36984);
        setField(term36983, term36983.getClass(), "last", term36984);
        setField(term36983, term36983.getClass(), "propListHead", null);
        setIntField(term36983, term36983.getClass(), "sourcePosition", -1);
        setField(term36983, term36983.getClass(), "jsType", null);
        setField(term36983, term36983.getClass(), "parent", null);
        setField(term36982, term36982.getClass(), "parametersNode", term36983);
        setField(term36982, term36982.getClass(), "templateTypeName", null);
        term36987 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term36988 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term36989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36989, term36989.getClass(), "type", 0);
        setField(term36989, term36989.getClass(), "next", null);
        setField(term36989, term36989.getClass(), "first", term36989);
        setField(term36989, term36989.getClass(), "last", null);
        setField(term36989, term36989.getClass(), "propListHead", null);
        setIntField(term36989, term36989.getClass(), "sourcePosition", 0);
        setField(term36989, term36989.getClass(), "jsType", null);
        setField(term36989, term36989.getClass(), "parent", null);
        setField(term36988, term36988.getClass(), "parameters", term36989);
        setField(term36988, term36988.getClass(), "returnType", null);
        setBooleanField(term36988, term36988.getClass(), "returnTypeInferred", false);
        setBooleanField(term36988, term36988.getClass(), "resolved", false);
        setField(term36988, term36988.getClass(), "resolveResult", null);
        setField(term36988, term36988.getClass(), "registry", null);
        setField(term36987, term36987.getClass(), "call", term36988);
        setField(term36987, term36987.getClass(), "prototypeSlot", null);
        setField(term36987, term36987.getClass(), "kind", null);
        setField(term36987, term36987.getClass(), "typeOfThis", null);
        setField(term36987, term36987.getClass(), "source", null);
        setField(term36987, term36987.getClass(), "implementedInterfaces", null);
        setField(term36987, term36987.getClass(), "extendedInterfaces", null);
        setField(term36987, term36987.getClass(), "subTypes", null);
        setField(term36987, term36987.getClass(), "templateTypeName", null);
        setField(term36987, term36987.getClass(), "className", null);
        setField(term36987, term36987.getClass(), "properties", null);
        setBooleanField(term36987, term36987.getClass(), "nativeType", false);
        setField(term36987, term36987.getClass(), "implicitPrototypeFallback", null);
        setField(term36987, term36987.getClass(), "ownerFunction", null);
        setBooleanField(term36987, term36987.getClass(), "prettyPrint", false);
        setBooleanField(term36987, term36987.getClass(), "visited", false);
        setField(term36987, term36987.getClass(), "docInfo", null);
        setBooleanField(term36987, term36987.getClass(), "unknown", false);
        setBooleanField(term36987, term36987.getClass(), "resolved", false);
        setField(term36987, term36987.getClass(), "resolveResult", null);
        setField(term36987, term36987.getClass(), "registry", null);
        term36990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36990, term36990.getClass(), "type", 0);
        setField(term36990, term36990.getClass(), "next", null);
        setField(term36990, term36990.getClass(), "first", term36990);
        setField(term36990, term36990.getClass(), "last", null);
        setField(term36990, term36990.getClass(), "propListHead", null);
        setIntField(term36990, term36990.getClass(), "sourcePosition", 0);
        setField(term36990, term36990.getClass(), "jsType", null);
        setField(term36990, term36990.getClass(), "parent", null);
        term36970 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term36974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36976 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term36970, term36970.getClass(), "fnName", null);
        setField(term36970, term36970.getClass(), "compiler", null);
        setField(term36970, term36970.getClass(), "codingConvention", null);
        setField(term36970, term36970.getClass(), "typeRegistry", null);
        setField(term36970, term36970.getClass(), "errorRoot", null);
        setField(term36970, term36970.getClass(), "sourceName", null);
        setField(term36970, term36970.getClass(), "scope", null);
        setField(term36970, term36970.getClass(), "contents", null);
        setField(term36970, term36970.getClass(), "returnType", null);
        setBooleanField(term36970, term36970.getClass(), "returnTypeInferred", false);
        setField(term36970, term36970.getClass(), "implementedInterfaces", null);
        setField(term36970, term36970.getClass(), "extendedInterfaces", null);
        setField(term36970, term36970.getClass(), "baseType", null);
        setField(term36970, term36970.getClass(), "thisType", null);
        setBooleanField(term36970, term36970.getClass(), "isConstructor", false);
        setBooleanField(term36970, term36970.getClass(), "isInterface", false);
        setIntField(term36974, term36974.getClass(), "type", 83);
        setField(term36974, term36974.getClass(), "next", null);
        setField(term36976, term36976.getClass(), "str", "");
        setIntField(term36976, term36976.getClass(), "type", 38);
        setField(term36976, term36976.getClass(), "next", null);
        setField(term36976, term36976.getClass(), "first", null);
        setField(term36976, term36976.getClass(), "last", null);
        setField(term36976, term36976.getClass(), "propListHead", null);
        setIntField(term36976, term36976.getClass(), "sourcePosition", -1);
        setField(term36976, term36976.getClass(), "jsType", null);
        setField(term36976, term36976.getClass(), "parent", term36974);
        setField(term36974, term36974.getClass(), "first", term36976);
        setField(term36974, term36974.getClass(), "last", term36976);
        setField(term36974, term36974.getClass(), "propListHead", null);
        setIntField(term36974, term36974.getClass(), "sourcePosition", -1);
        setField(term36974, term36974.getClass(), "jsType", null);
        setField(term36974, term36974.getClass(), "parent", null);
        setField(term36970, term36970.getClass(), "parametersNode", term36974);
        setField(term36970, term36970.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term36191;
        args[1] = term36425;
        Object retValue = callMethod(klass, "inferFromOverriddenFunction", argTypes, term36091, args);
        assertTrue(recursiveEquals(term36091, term36982));
        assertTrue(recursiveEquals(term36191, term36987));
        assertTrue(recursiveEquals(term36425, term36990));
        assertTrue(recursiveEquals(retValue, term36970));
    }

};


