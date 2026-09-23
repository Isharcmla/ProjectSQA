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

public class FunctionTypeBuilder_inferFromOverriddenFunction_71629457173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48082;
     Object term48182;
     Object term48661;
     Object term48664;
     Object term48655;

    public FunctionTypeBuilder_inferFromOverriddenFunction_71629457173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48082 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term48082, term48082.getClass(), "returnType", null);
        term48182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term48276 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term48370 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term48276, term48276.getClass(), "returnType", term48370);
        setField(term48182, term48182.getClass(), "call", term48276);
        term48661 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term48662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term48663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term48661, term48661.getClass(), "fnName", null);
        setField(term48661, term48661.getClass(), "compiler", null);
        setField(term48661, term48661.getClass(), "codingConvention", null);
        setField(term48661, term48661.getClass(), "typeRegistry", null);
        setField(term48661, term48661.getClass(), "errorRoot", null);
        setField(term48661, term48661.getClass(), "sourceName", null);
        setField(term48661, term48661.getClass(), "scope", null);
        setField(term48662, term48662.getClass(), "parameters", null);
        setField(term48662, term48662.getClass(), "returnType", null);
        setBooleanField(term48662, term48662.getClass(), "returnTypeInferred", false);
        setBooleanField(term48662, term48662.getClass(), "resolved", false);
        setField(term48662, term48662.getClass(), "resolveResult", null);
        setField(term48662, term48662.getClass(), "registry", null);
        setField(term48661, term48661.getClass(), "returnType", term48662);
        setField(term48661, term48661.getClass(), "implementedInterfaces", null);
        setField(term48661, term48661.getClass(), "baseType", null);
        setField(term48661, term48661.getClass(), "thisType", null);
        setBooleanField(term48661, term48661.getClass(), "isConstructor", false);
        setBooleanField(term48661, term48661.getClass(), "isInterface", false);
        setIntField(term48663, term48663.getClass(), "type", 83);
        setField(term48663, term48663.getClass(), "next", null);
        setField(term48663, term48663.getClass(), "first", null);
        setField(term48663, term48663.getClass(), "last", null);
        setField(term48663, term48663.getClass(), "propListHead", null);
        setIntField(term48663, term48663.getClass(), "sourcePosition", -1);
        setField(term48663, term48663.getClass(), "jsType", null);
        setField(term48663, term48663.getClass(), "parent", null);
        setField(term48661, term48661.getClass(), "parametersNode", term48663);
        setField(term48661, term48661.getClass(), "sourceNode", null);
        setField(term48661, term48661.getClass(), "templateTypeName", null);
        term48664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term48665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term48666 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term48665, term48665.getClass(), "parameters", null);
        setField(term48666, term48666.getClass(), "parameters", null);
        setField(term48666, term48666.getClass(), "returnType", null);
        setBooleanField(term48666, term48666.getClass(), "returnTypeInferred", false);
        setBooleanField(term48666, term48666.getClass(), "resolved", false);
        setField(term48666, term48666.getClass(), "resolveResult", null);
        setField(term48666, term48666.getClass(), "registry", null);
        setField(term48665, term48665.getClass(), "returnType", term48666);
        setBooleanField(term48665, term48665.getClass(), "returnTypeInferred", false);
        setBooleanField(term48665, term48665.getClass(), "resolved", false);
        setField(term48665, term48665.getClass(), "resolveResult", null);
        setField(term48665, term48665.getClass(), "registry", null);
        setField(term48664, term48664.getClass(), "call", term48665);
        setField(term48664, term48664.getClass(), "prototype", null);
        setField(term48664, term48664.getClass(), "kind", null);
        setField(term48664, term48664.getClass(), "typeOfThis", null);
        setField(term48664, term48664.getClass(), "source", null);
        setField(term48664, term48664.getClass(), "implementedInterfaces", null);
        setField(term48664, term48664.getClass(), "subTypes", null);
        setField(term48664, term48664.getClass(), "templateTypeName", null);
        setField(term48664, term48664.getClass(), "className", null);
        setField(term48664, term48664.getClass(), "properties", null);
        setField(term48664, term48664.getClass(), "implicitPrototype", null);
        setBooleanField(term48664, term48664.getClass(), "nativeType", false);
        setBooleanField(term48664, term48664.getClass(), "prettyPrint", false);
        setBooleanField(term48664, term48664.getClass(), "visited", false);
        setField(term48664, term48664.getClass(), "docInfo", null);
        setBooleanField(term48664, term48664.getClass(), "unknown", false);
        setBooleanField(term48664, term48664.getClass(), "resolved", false);
        setField(term48664, term48664.getClass(), "resolveResult", null);
        setField(term48664, term48664.getClass(), "registry", null);
        term48655 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term48635 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term48658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term48655, term48655.getClass(), "fnName", null);
        setField(term48655, term48655.getClass(), "compiler", null);
        setField(term48655, term48655.getClass(), "codingConvention", null);
        setField(term48655, term48655.getClass(), "typeRegistry", null);
        setField(term48655, term48655.getClass(), "errorRoot", null);
        setField(term48655, term48655.getClass(), "sourceName", null);
        setField(term48655, term48655.getClass(), "scope", null);
        setField(term48635, term48635.getClass(), "parameters", null);
        setField(term48635, term48635.getClass(), "returnType", null);
        setBooleanField(term48635, term48635.getClass(), "returnTypeInferred", false);
        setBooleanField(term48635, term48635.getClass(), "resolved", false);
        setField(term48635, term48635.getClass(), "resolveResult", null);
        setField(term48635, term48635.getClass(), "registry", null);
        setField(term48655, term48655.getClass(), "returnType", term48635);
        setField(term48655, term48655.getClass(), "implementedInterfaces", null);
        setField(term48655, term48655.getClass(), "baseType", null);
        setField(term48655, term48655.getClass(), "thisType", null);
        setBooleanField(term48655, term48655.getClass(), "isConstructor", false);
        setBooleanField(term48655, term48655.getClass(), "isInterface", false);
        setIntField(term48658, term48658.getClass(), "type", 83);
        setField(term48658, term48658.getClass(), "next", null);
        setField(term48658, term48658.getClass(), "first", null);
        setField(term48658, term48658.getClass(), "last", null);
        setField(term48658, term48658.getClass(), "propListHead", null);
        setIntField(term48658, term48658.getClass(), "sourcePosition", -1);
        setField(term48658, term48658.getClass(), "jsType", null);
        setField(term48658, term48658.getClass(), "parent", null);
        setField(term48655, term48655.getClass(), "parametersNode", term48658);
        setField(term48655, term48655.getClass(), "sourceNode", null);
        setField(term48655, term48655.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term48182;
        args[1] = null;
        Object retValue = callMethod(klass, "inferFromOverriddenFunction", argTypes, term48082, args);
        assertTrue(recursiveEquals(term48082, term48661));
        assertTrue(recursiveEquals(term48182, term48664));
        assertTrue(recursiveEquals(retValue, term48655));
    }

};


