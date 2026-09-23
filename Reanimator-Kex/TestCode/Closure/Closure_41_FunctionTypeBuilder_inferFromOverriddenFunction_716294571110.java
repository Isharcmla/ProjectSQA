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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33001;
     Object term33101;
     Object term33335;
     Object term33783;
     Object term33785;
     Object term33788;
     Object term33776;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33001 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term33001, term33001.getClass(), "returnType", null);
        setBooleanField(term33001, term33001.getClass(), "returnTypeInferred", false);
        setField(term33001, term33001.getClass(), "typeRegistry", null);
        term33101 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term33195 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term33265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term33195, term33195.getClass(), "returnType", null);
        setBooleanField(term33195, term33195.getClass(), "returnTypeInferred", false);
        setField(term33265, term33265.getClass(), "first", null);
        setField(term33195, term33195.getClass(), "parameters", term33265);
        setField(term33101, term33101.getClass(), "call", term33195);
        term33335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term33783 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term33784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term33783, term33783.getClass(), "fnName", null);
        setField(term33783, term33783.getClass(), "compiler", null);
        setField(term33783, term33783.getClass(), "codingConvention", null);
        setField(term33783, term33783.getClass(), "typeRegistry", null);
        setField(term33783, term33783.getClass(), "errorRoot", null);
        setField(term33783, term33783.getClass(), "sourceName", null);
        setField(term33783, term33783.getClass(), "scope", null);
        setField(term33783, term33783.getClass(), "contents", null);
        setField(term33783, term33783.getClass(), "returnType", null);
        setBooleanField(term33783, term33783.getClass(), "returnTypeInferred", false);
        setField(term33783, term33783.getClass(), "implementedInterfaces", null);
        setField(term33783, term33783.getClass(), "extendedInterfaces", null);
        setField(term33783, term33783.getClass(), "baseType", null);
        setField(term33783, term33783.getClass(), "thisType", null);
        setBooleanField(term33783, term33783.getClass(), "isConstructor", false);
        setBooleanField(term33783, term33783.getClass(), "isInterface", false);
        setIntField(term33784, term33784.getClass(), "type", 83);
        setField(term33784, term33784.getClass(), "next", null);
        setField(term33784, term33784.getClass(), "first", null);
        setField(term33784, term33784.getClass(), "last", null);
        setField(term33784, term33784.getClass(), "propListHead", null);
        setIntField(term33784, term33784.getClass(), "sourcePosition", -1);
        setField(term33784, term33784.getClass(), "jsType", null);
        setField(term33784, term33784.getClass(), "parent", null);
        setField(term33783, term33783.getClass(), "parametersNode", term33784);
        setField(term33783, term33783.getClass(), "templateTypeName", null);
        term33785 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term33786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term33787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33787, term33787.getClass(), "type", 0);
        setField(term33787, term33787.getClass(), "next", null);
        setField(term33787, term33787.getClass(), "first", null);
        setField(term33787, term33787.getClass(), "last", null);
        setField(term33787, term33787.getClass(), "propListHead", null);
        setIntField(term33787, term33787.getClass(), "sourcePosition", 0);
        setField(term33787, term33787.getClass(), "jsType", null);
        setField(term33787, term33787.getClass(), "parent", null);
        setField(term33786, term33786.getClass(), "parameters", term33787);
        setField(term33786, term33786.getClass(), "returnType", null);
        setBooleanField(term33786, term33786.getClass(), "returnTypeInferred", false);
        setBooleanField(term33786, term33786.getClass(), "resolved", false);
        setField(term33786, term33786.getClass(), "resolveResult", null);
        setField(term33786, term33786.getClass(), "registry", null);
        setField(term33785, term33785.getClass(), "call", term33786);
        setField(term33785, term33785.getClass(), "prototypeSlot", null);
        setField(term33785, term33785.getClass(), "kind", null);
        setField(term33785, term33785.getClass(), "typeOfThis", null);
        setField(term33785, term33785.getClass(), "source", null);
        setField(term33785, term33785.getClass(), "implementedInterfaces", null);
        setField(term33785, term33785.getClass(), "extendedInterfaces", null);
        setField(term33785, term33785.getClass(), "subTypes", null);
        setField(term33785, term33785.getClass(), "templateTypeName", null);
        setField(term33785, term33785.getClass(), "className", null);
        setField(term33785, term33785.getClass(), "properties", null);
        setBooleanField(term33785, term33785.getClass(), "nativeType", false);
        setField(term33785, term33785.getClass(), "implicitPrototypeFallback", null);
        setField(term33785, term33785.getClass(), "ownerFunction", null);
        setBooleanField(term33785, term33785.getClass(), "prettyPrint", false);
        setBooleanField(term33785, term33785.getClass(), "visited", false);
        setField(term33785, term33785.getClass(), "docInfo", null);
        setBooleanField(term33785, term33785.getClass(), "unknown", false);
        setBooleanField(term33785, term33785.getClass(), "resolved", false);
        setField(term33785, term33785.getClass(), "resolveResult", null);
        setField(term33785, term33785.getClass(), "registry", null);
        term33788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33788, term33788.getClass(), "type", 0);
        setField(term33788, term33788.getClass(), "next", null);
        setField(term33788, term33788.getClass(), "first", null);
        setField(term33788, term33788.getClass(), "last", null);
        setField(term33788, term33788.getClass(), "propListHead", null);
        setIntField(term33788, term33788.getClass(), "sourcePosition", 0);
        setField(term33788, term33788.getClass(), "jsType", null);
        setField(term33788, term33788.getClass(), "parent", null);
        term33776 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term33780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term33776, term33776.getClass(), "fnName", null);
        setField(term33776, term33776.getClass(), "compiler", null);
        setField(term33776, term33776.getClass(), "codingConvention", null);
        setField(term33776, term33776.getClass(), "typeRegistry", null);
        setField(term33776, term33776.getClass(), "errorRoot", null);
        setField(term33776, term33776.getClass(), "sourceName", null);
        setField(term33776, term33776.getClass(), "scope", null);
        setField(term33776, term33776.getClass(), "contents", null);
        setField(term33776, term33776.getClass(), "returnType", null);
        setBooleanField(term33776, term33776.getClass(), "returnTypeInferred", false);
        setField(term33776, term33776.getClass(), "implementedInterfaces", null);
        setField(term33776, term33776.getClass(), "extendedInterfaces", null);
        setField(term33776, term33776.getClass(), "baseType", null);
        setField(term33776, term33776.getClass(), "thisType", null);
        setBooleanField(term33776, term33776.getClass(), "isConstructor", false);
        setBooleanField(term33776, term33776.getClass(), "isInterface", false);
        setIntField(term33780, term33780.getClass(), "type", 83);
        setField(term33780, term33780.getClass(), "next", null);
        setField(term33780, term33780.getClass(), "first", null);
        setField(term33780, term33780.getClass(), "last", null);
        setField(term33780, term33780.getClass(), "propListHead", null);
        setIntField(term33780, term33780.getClass(), "sourcePosition", -1);
        setField(term33780, term33780.getClass(), "jsType", null);
        setField(term33780, term33780.getClass(), "parent", null);
        setField(term33776, term33776.getClass(), "parametersNode", term33780);
        setField(term33776, term33776.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term33101;
        args[1] = term33335;
        Object retValue = callMethod(klass, "inferFromOverriddenFunction", argTypes, term33001, args);
        assertTrue(recursiveEquals(term33001, term33783));
        assertTrue(recursiveEquals(term33101, term33785));
        assertTrue(recursiveEquals(term33335, term33788));
        assertTrue(recursiveEquals(retValue, term33776));
    }

};


