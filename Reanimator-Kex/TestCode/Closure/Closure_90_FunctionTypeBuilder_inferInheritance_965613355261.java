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
import java.util.ArrayList;

public class FunctionTypeBuilder_inferInheritance_965613355261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100216;
     Object term100406;
     Object term100460;
     Object term100464;
     Object term100446;

    public FunctionTypeBuilder_inferInheritance_965613355261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100216 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term100326 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term100216, term100216.getClass(), "isConstructor", false);
        setBooleanField(term100216, term100216.getClass(), "isInterface", false);
        setField(term100216, term100216.getClass(), "implementedInterfaces", null);
        setField(term100216, term100216.getClass(), "baseType", term100326);
        term100406 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term100406, term100406.getClass(), "bitset", 2);
        setField(term100406, term100406.getClass(), "info", null);
        ArrayList term100461 = new ArrayList();
        term100460 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term100463 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term100460, term100460.getClass(), "fnName", null);
        setField(term100460, term100460.getClass(), "compiler", null);
        setField(term100460, term100460.getClass(), "codingConvention", null);
        setField(term100460, term100460.getClass(), "typeRegistry", null);
        setField(term100460, term100460.getClass(), "errorRoot", null);
        setField(term100460, term100460.getClass(), "sourceName", null);
        setField(term100460, term100460.getClass(), "scope", null);
        setField(term100460, term100460.getClass(), "returnType", null);
        setBooleanField(term100460, term100460.getClass(), "returnTypeInferred", false);
        setField(term100460, term100460.getClass(), "implementedInterfaces", term100461);
        setField(term100463, term100463.getClass(), "call", null);
        setField(term100463, term100463.getClass(), "prototype", null);
        setField(term100463, term100463.getClass(), "kind", null);
        setField(term100463, term100463.getClass(), "typeOfThis", null);
        setField(term100463, term100463.getClass(), "source", null);
        setField(term100463, term100463.getClass(), "implementedInterfaces", null);
        setField(term100463, term100463.getClass(), "subTypes", null);
        setField(term100463, term100463.getClass(), "templateTypeName", null);
        setField(term100463, term100463.getClass(), "className", null);
        setField(term100463, term100463.getClass(), "properties", null);
        setBooleanField(term100463, term100463.getClass(), "nativeType", false);
        setField(term100463, term100463.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term100463, term100463.getClass(), "prettyPrint", false);
        setBooleanField(term100463, term100463.getClass(), "visited", false);
        setField(term100463, term100463.getClass(), "docInfo", null);
        setBooleanField(term100463, term100463.getClass(), "unknown", false);
        setBooleanField(term100463, term100463.getClass(), "resolved", false);
        setField(term100463, term100463.getClass(), "resolveResult", null);
        setField(term100463, term100463.getClass(), "registry", null);
        setField(term100460, term100460.getClass(), "baseType", term100463);
        setField(term100460, term100460.getClass(), "thisType", null);
        setBooleanField(term100460, term100460.getClass(), "isConstructor", true);
        setBooleanField(term100460, term100460.getClass(), "isInterface", false);
        setField(term100460, term100460.getClass(), "parametersNode", null);
        setField(term100460, term100460.getClass(), "sourceNode", null);
        setField(term100460, term100460.getClass(), "templateTypeName", null);
        term100464 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term100464, term100464.getClass(), "info", null);
        setField(term100464, term100464.getClass(), "documentation", null);
        setField(term100464, term100464.getClass(), "sourceName", null);
        setField(term100464, term100464.getClass(), "visibility", null);
        setIntField(term100464, term100464.getClass(), "bitset", 2);
        setField(term100464, term100464.getClass(), "type", null);
        setField(term100464, term100464.getClass(), "thisType", null);
        setBooleanField(term100464, term100464.getClass(), "includeDocumentation", false);
        ArrayList term100448 = new ArrayList();
        term100446 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term100452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term100446, term100446.getClass(), "fnName", null);
        setField(term100446, term100446.getClass(), "compiler", null);
        setField(term100446, term100446.getClass(), "codingConvention", null);
        setField(term100446, term100446.getClass(), "typeRegistry", null);
        setField(term100446, term100446.getClass(), "errorRoot", null);
        setField(term100446, term100446.getClass(), "sourceName", null);
        setField(term100446, term100446.getClass(), "scope", null);
        setField(term100446, term100446.getClass(), "returnType", null);
        setBooleanField(term100446, term100446.getClass(), "returnTypeInferred", false);
        setField(term100446, term100446.getClass(), "implementedInterfaces", term100448);
        setField(term100452, term100452.getClass(), "call", null);
        setField(term100452, term100452.getClass(), "prototype", null);
        setField(term100452, term100452.getClass(), "kind", null);
        setField(term100452, term100452.getClass(), "typeOfThis", null);
        setField(term100452, term100452.getClass(), "source", null);
        setField(term100452, term100452.getClass(), "implementedInterfaces", null);
        setField(term100452, term100452.getClass(), "subTypes", null);
        setField(term100452, term100452.getClass(), "templateTypeName", null);
        setField(term100452, term100452.getClass(), "className", null);
        setField(term100452, term100452.getClass(), "properties", null);
        setBooleanField(term100452, term100452.getClass(), "nativeType", false);
        setField(term100452, term100452.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term100452, term100452.getClass(), "prettyPrint", false);
        setBooleanField(term100452, term100452.getClass(), "visited", false);
        setField(term100452, term100452.getClass(), "docInfo", null);
        setBooleanField(term100452, term100452.getClass(), "unknown", false);
        setBooleanField(term100452, term100452.getClass(), "resolved", false);
        setField(term100452, term100452.getClass(), "resolveResult", null);
        setField(term100452, term100452.getClass(), "registry", null);
        setField(term100446, term100446.getClass(), "baseType", term100452);
        setField(term100446, term100446.getClass(), "thisType", null);
        setBooleanField(term100446, term100446.getClass(), "isConstructor", true);
        setBooleanField(term100446, term100446.getClass(), "isInterface", false);
        setField(term100446, term100446.getClass(), "parametersNode", null);
        setField(term100446, term100446.getClass(), "sourceNode", null);
        setField(term100446, term100446.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term100406;
        Object retValue = callMethod(klass, "inferInheritance", argTypes, term100216, args);
        assertTrue(recursiveEquals(term100216, term100460));
        assertTrue(recursiveEquals(term100406, term100464));
        assertTrue(recursiveEquals(retValue, term100446));
    }

};


