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

public class FunctionTypeBuilder_inferFromOverriddenFunction_71629457167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41194;
     Object term41294;
     Object term41708;
     Object term41711;
     Object term41701;

    public FunctionTypeBuilder_inferFromOverriddenFunction_71629457167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41194 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term41194, term41194.getClass(), "returnType", null);
        setBooleanField(term41194, term41194.getClass(), "returnTypeInferred", false);
        term41294 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term41388 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term41482 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term41388, term41388.getClass(), "returnType", term41482);
        setBooleanField(term41388, term41388.getClass(), "returnTypeInferred", false);
        setField(term41294, term41294.getClass(), "call", term41388);
        term41708 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term41709 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term41710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term41708, term41708.getClass(), "fnName", null);
        setField(term41708, term41708.getClass(), "compiler", null);
        setField(term41708, term41708.getClass(), "codingConvention", null);
        setField(term41708, term41708.getClass(), "typeRegistry", null);
        setField(term41708, term41708.getClass(), "errorRoot", null);
        setField(term41708, term41708.getClass(), "sourceName", null);
        setField(term41708, term41708.getClass(), "scope", null);
        setField(term41709, term41709.getClass(), "parameters", null);
        setField(term41709, term41709.getClass(), "returnType", null);
        setBooleanField(term41709, term41709.getClass(), "returnTypeInferred", false);
        setBooleanField(term41709, term41709.getClass(), "resolved", false);
        setField(term41709, term41709.getClass(), "resolveResult", null);
        setField(term41709, term41709.getClass(), "registry", null);
        setField(term41708, term41708.getClass(), "returnType", term41709);
        setBooleanField(term41708, term41708.getClass(), "returnTypeInferred", false);
        setField(term41708, term41708.getClass(), "implementedInterfaces", null);
        setField(term41708, term41708.getClass(), "baseType", null);
        setField(term41708, term41708.getClass(), "thisType", null);
        setBooleanField(term41708, term41708.getClass(), "isConstructor", false);
        setBooleanField(term41708, term41708.getClass(), "isInterface", false);
        setIntField(term41710, term41710.getClass(), "type", 83);
        setField(term41710, term41710.getClass(), "next", null);
        setField(term41710, term41710.getClass(), "first", null);
        setField(term41710, term41710.getClass(), "last", null);
        setField(term41710, term41710.getClass(), "propListHead", null);
        setIntField(term41710, term41710.getClass(), "sourcePosition", -1);
        setField(term41710, term41710.getClass(), "jsType", null);
        setField(term41710, term41710.getClass(), "parent", null);
        setField(term41708, term41708.getClass(), "parametersNode", term41710);
        setField(term41708, term41708.getClass(), "sourceNode", null);
        setField(term41708, term41708.getClass(), "templateTypeName", null);
        term41711 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term41712 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term41713 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term41712, term41712.getClass(), "parameters", null);
        setField(term41713, term41713.getClass(), "parameters", null);
        setField(term41713, term41713.getClass(), "returnType", null);
        setBooleanField(term41713, term41713.getClass(), "returnTypeInferred", false);
        setBooleanField(term41713, term41713.getClass(), "resolved", false);
        setField(term41713, term41713.getClass(), "resolveResult", null);
        setField(term41713, term41713.getClass(), "registry", null);
        setField(term41712, term41712.getClass(), "returnType", term41713);
        setBooleanField(term41712, term41712.getClass(), "returnTypeInferred", false);
        setBooleanField(term41712, term41712.getClass(), "resolved", false);
        setField(term41712, term41712.getClass(), "resolveResult", null);
        setField(term41712, term41712.getClass(), "registry", null);
        setField(term41711, term41711.getClass(), "call", term41712);
        setField(term41711, term41711.getClass(), "prototype", null);
        setField(term41711, term41711.getClass(), "kind", null);
        setField(term41711, term41711.getClass(), "typeOfThis", null);
        setField(term41711, term41711.getClass(), "source", null);
        setField(term41711, term41711.getClass(), "implementedInterfaces", null);
        setField(term41711, term41711.getClass(), "subTypes", null);
        setField(term41711, term41711.getClass(), "templateTypeName", null);
        setField(term41711, term41711.getClass(), "className", null);
        setField(term41711, term41711.getClass(), "properties", null);
        setBooleanField(term41711, term41711.getClass(), "nativeType", false);
        setField(term41711, term41711.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term41711, term41711.getClass(), "prettyPrint", false);
        setBooleanField(term41711, term41711.getClass(), "visited", false);
        setField(term41711, term41711.getClass(), "docInfo", null);
        setBooleanField(term41711, term41711.getClass(), "unknown", false);
        setBooleanField(term41711, term41711.getClass(), "resolved", false);
        setField(term41711, term41711.getClass(), "resolveResult", null);
        setField(term41711, term41711.getClass(), "registry", null);
        term41701 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term41680 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term41705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term41701, term41701.getClass(), "fnName", null);
        setField(term41701, term41701.getClass(), "compiler", null);
        setField(term41701, term41701.getClass(), "codingConvention", null);
        setField(term41701, term41701.getClass(), "typeRegistry", null);
        setField(term41701, term41701.getClass(), "errorRoot", null);
        setField(term41701, term41701.getClass(), "sourceName", null);
        setField(term41701, term41701.getClass(), "scope", null);
        setField(term41680, term41680.getClass(), "parameters", null);
        setField(term41680, term41680.getClass(), "returnType", null);
        setBooleanField(term41680, term41680.getClass(), "returnTypeInferred", false);
        setBooleanField(term41680, term41680.getClass(), "resolved", false);
        setField(term41680, term41680.getClass(), "resolveResult", null);
        setField(term41680, term41680.getClass(), "registry", null);
        setField(term41701, term41701.getClass(), "returnType", term41680);
        setBooleanField(term41701, term41701.getClass(), "returnTypeInferred", false);
        setField(term41701, term41701.getClass(), "implementedInterfaces", null);
        setField(term41701, term41701.getClass(), "baseType", null);
        setField(term41701, term41701.getClass(), "thisType", null);
        setBooleanField(term41701, term41701.getClass(), "isConstructor", false);
        setBooleanField(term41701, term41701.getClass(), "isInterface", false);
        setIntField(term41705, term41705.getClass(), "type", 83);
        setField(term41705, term41705.getClass(), "next", null);
        setField(term41705, term41705.getClass(), "first", null);
        setField(term41705, term41705.getClass(), "last", null);
        setField(term41705, term41705.getClass(), "propListHead", null);
        setIntField(term41705, term41705.getClass(), "sourcePosition", -1);
        setField(term41705, term41705.getClass(), "jsType", null);
        setField(term41705, term41705.getClass(), "parent", null);
        setField(term41701, term41701.getClass(), "parametersNode", term41705);
        setField(term41701, term41701.getClass(), "sourceNode", null);
        setField(term41701, term41701.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term41294;
        args[1] = null;
        Object retValue = callMethod(klass, "inferFromOverriddenFunction", argTypes, term41194, args);
        assertTrue(recursiveEquals(term41194, term41708));
        assertTrue(recursiveEquals(term41294, term41711));
        assertTrue(recursiveEquals(retValue, term41701));
    }

};


