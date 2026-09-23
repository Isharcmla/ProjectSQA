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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30534;
     Object term30634;
     Object term30868;
     Object term31655;
     Object term31660;
     Object term31663;
     Object term31643;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30534 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term30534, term30534.getClass(), "returnType", null);
        setBooleanField(term30534, term30534.getClass(), "returnTypeInferred", false);
        setField(term30534, term30534.getClass(), "typeRegistry", null);
        term30634 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term30728 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term30798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term30728, term30728.getClass(), "returnType", null);
        setBooleanField(term30728, term30728.getClass(), "returnTypeInferred", false);
        setField(term30798, term30798.getClass(), "first", term30798);
        setField(term30728, term30728.getClass(), "parameters", term30798);
        setField(term30634, term30634.getClass(), "call", term30728);
        term30868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term30868, term30868.getClass(), "first", term30938);
        term31655 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term31656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31657 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term31655, term31655.getClass(), "fnName", null);
        setField(term31655, term31655.getClass(), "compiler", null);
        setField(term31655, term31655.getClass(), "codingConvention", null);
        setField(term31655, term31655.getClass(), "typeRegistry", null);
        setField(term31655, term31655.getClass(), "errorRoot", null);
        setField(term31655, term31655.getClass(), "sourceName", null);
        setField(term31655, term31655.getClass(), "scope", null);
        setField(term31655, term31655.getClass(), "contents", null);
        setField(term31655, term31655.getClass(), "returnType", null);
        setBooleanField(term31655, term31655.getClass(), "returnTypeInferred", false);
        setField(term31655, term31655.getClass(), "implementedInterfaces", null);
        setField(term31655, term31655.getClass(), "extendedInterfaces", null);
        setField(term31655, term31655.getClass(), "baseType", null);
        setField(term31655, term31655.getClass(), "thisType", null);
        setBooleanField(term31655, term31655.getClass(), "isConstructor", false);
        setBooleanField(term31655, term31655.getClass(), "isInterface", false);
        setIntField(term31656, term31656.getClass(), "type", 83);
        setField(term31656, term31656.getClass(), "next", null);
        setField(term31657, term31657.getClass(), "str", "");
        setIntField(term31657, term31657.getClass(), "type", 38);
        setField(term31657, term31657.getClass(), "next", null);
        setField(term31657, term31657.getClass(), "first", null);
        setField(term31657, term31657.getClass(), "last", null);
        setField(term31657, term31657.getClass(), "propListHead", null);
        setIntField(term31657, term31657.getClass(), "sourcePosition", -1);
        setField(term31657, term31657.getClass(), "jsType", null);
        setField(term31657, term31657.getClass(), "parent", term31656);
        setField(term31656, term31656.getClass(), "first", term31657);
        setField(term31656, term31656.getClass(), "last", term31657);
        setField(term31656, term31656.getClass(), "propListHead", null);
        setIntField(term31656, term31656.getClass(), "sourcePosition", -1);
        setField(term31656, term31656.getClass(), "jsType", null);
        setField(term31656, term31656.getClass(), "parent", null);
        setField(term31655, term31655.getClass(), "parametersNode", term31656);
        setField(term31655, term31655.getClass(), "templateTypeName", null);
        term31660 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term31661 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term31662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31662, term31662.getClass(), "type", 0);
        setField(term31662, term31662.getClass(), "next", null);
        setField(term31662, term31662.getClass(), "first", term31662);
        setField(term31662, term31662.getClass(), "last", null);
        setField(term31662, term31662.getClass(), "propListHead", null);
        setIntField(term31662, term31662.getClass(), "sourcePosition", 0);
        setField(term31662, term31662.getClass(), "jsType", null);
        setField(term31662, term31662.getClass(), "parent", null);
        setField(term31661, term31661.getClass(), "parameters", term31662);
        setField(term31661, term31661.getClass(), "returnType", null);
        setBooleanField(term31661, term31661.getClass(), "returnTypeInferred", false);
        setBooleanField(term31661, term31661.getClass(), "resolved", false);
        setField(term31661, term31661.getClass(), "resolveResult", null);
        setField(term31661, term31661.getClass(), "registry", null);
        setField(term31660, term31660.getClass(), "call", term31661);
        setField(term31660, term31660.getClass(), "prototypeSlot", null);
        setField(term31660, term31660.getClass(), "kind", null);
        setField(term31660, term31660.getClass(), "typeOfThis", null);
        setField(term31660, term31660.getClass(), "source", null);
        setField(term31660, term31660.getClass(), "implementedInterfaces", null);
        setField(term31660, term31660.getClass(), "extendedInterfaces", null);
        setField(term31660, term31660.getClass(), "subTypes", null);
        setField(term31660, term31660.getClass(), "templateTypeName", null);
        setField(term31660, term31660.getClass(), "className", null);
        setField(term31660, term31660.getClass(), "properties", null);
        setBooleanField(term31660, term31660.getClass(), "nativeType", false);
        setField(term31660, term31660.getClass(), "implicitPrototypeFallback", null);
        setField(term31660, term31660.getClass(), "ownerFunction", null);
        setBooleanField(term31660, term31660.getClass(), "prettyPrint", false);
        setBooleanField(term31660, term31660.getClass(), "visited", false);
        setField(term31660, term31660.getClass(), "docInfo", null);
        setBooleanField(term31660, term31660.getClass(), "unknown", false);
        setBooleanField(term31660, term31660.getClass(), "resolved", false);
        setField(term31660, term31660.getClass(), "resolveResult", null);
        setField(term31660, term31660.getClass(), "registry", null);
        term31663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31663, term31663.getClass(), "type", 0);
        setField(term31663, term31663.getClass(), "next", null);
        setIntField(term31664, term31664.getClass(), "type", 0);
        setField(term31664, term31664.getClass(), "next", null);
        setField(term31664, term31664.getClass(), "first", null);
        setField(term31664, term31664.getClass(), "last", null);
        setField(term31664, term31664.getClass(), "propListHead", null);
        setIntField(term31664, term31664.getClass(), "sourcePosition", 0);
        setField(term31664, term31664.getClass(), "jsType", null);
        setField(term31664, term31664.getClass(), "parent", null);
        setField(term31663, term31663.getClass(), "first", term31664);
        setField(term31663, term31663.getClass(), "last", null);
        setField(term31663, term31663.getClass(), "propListHead", null);
        setIntField(term31663, term31663.getClass(), "sourcePosition", 0);
        setField(term31663, term31663.getClass(), "jsType", null);
        setField(term31663, term31663.getClass(), "parent", null);
        term31643 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term31647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31649 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term31643, term31643.getClass(), "fnName", null);
        setField(term31643, term31643.getClass(), "compiler", null);
        setField(term31643, term31643.getClass(), "codingConvention", null);
        setField(term31643, term31643.getClass(), "typeRegistry", null);
        setField(term31643, term31643.getClass(), "errorRoot", null);
        setField(term31643, term31643.getClass(), "sourceName", null);
        setField(term31643, term31643.getClass(), "scope", null);
        setField(term31643, term31643.getClass(), "contents", null);
        setField(term31643, term31643.getClass(), "returnType", null);
        setBooleanField(term31643, term31643.getClass(), "returnTypeInferred", false);
        setField(term31643, term31643.getClass(), "implementedInterfaces", null);
        setField(term31643, term31643.getClass(), "extendedInterfaces", null);
        setField(term31643, term31643.getClass(), "baseType", null);
        setField(term31643, term31643.getClass(), "thisType", null);
        setBooleanField(term31643, term31643.getClass(), "isConstructor", false);
        setBooleanField(term31643, term31643.getClass(), "isInterface", false);
        setIntField(term31647, term31647.getClass(), "type", 83);
        setField(term31647, term31647.getClass(), "next", null);
        setField(term31649, term31649.getClass(), "str", "");
        setIntField(term31649, term31649.getClass(), "type", 38);
        setField(term31649, term31649.getClass(), "next", null);
        setField(term31649, term31649.getClass(), "first", null);
        setField(term31649, term31649.getClass(), "last", null);
        setField(term31649, term31649.getClass(), "propListHead", null);
        setIntField(term31649, term31649.getClass(), "sourcePosition", -1);
        setField(term31649, term31649.getClass(), "jsType", null);
        setField(term31649, term31649.getClass(), "parent", term31647);
        setField(term31647, term31647.getClass(), "first", term31649);
        setField(term31647, term31647.getClass(), "last", term31649);
        setField(term31647, term31647.getClass(), "propListHead", null);
        setIntField(term31647, term31647.getClass(), "sourcePosition", -1);
        setField(term31647, term31647.getClass(), "jsType", null);
        setField(term31647, term31647.getClass(), "parent", null);
        setField(term31643, term31643.getClass(), "parametersNode", term31647);
        setField(term31643, term31643.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term30634;
        args[1] = term30868;
        Object retValue = callMethod(klass, "inferFromOverriddenFunction", argTypes, term30534, args);
        assertTrue(recursiveEquals(term30534, term31655));
        assertTrue(recursiveEquals(term30634, term31660));
        assertTrue(recursiveEquals(term30868, term31663));
        assertTrue(recursiveEquals(retValue, term31643));
    }

};


