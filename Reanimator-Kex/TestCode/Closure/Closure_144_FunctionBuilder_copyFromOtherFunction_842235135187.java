package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class FunctionBuilder_copyFromOtherFunction_842235135187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129125;
     Object term129235;
     Object term129506;
     Object term129510;
     Object term129500;

    public FunctionBuilder_copyFromOtherFunction_842235135187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129125 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term129125, term129125.getClass(), "name", null);
        setField(term129125, term129125.getClass(), "sourceNode", null);
        setField(term129125, term129125.getClass(), "parametersNode", null);
        setField(term129125, term129125.getClass(), "returnType", null);
        term129235 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term129367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term129465 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term129235, term129235.getClass(), "className", "");
        setField(term129235, term129235.getClass(), "source", null);
        setField(term129367, term129367.getClass(), "parameters", null);
        setField(term129367, term129367.getClass(), "returnType", null);
        setField(term129235, term129235.getClass(), "call", term129367);
        setField(term129235, term129235.getClass(), "typeOfThis", term129465);
        term129506 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term129509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term129506, term129506.getClass(), "registry", null);
        setField(term129506, term129506.getClass(), "name", "");
        setField(term129506, term129506.getClass(), "sourceNode", null);
        setField(term129506, term129506.getClass(), "parametersNode", null);
        setField(term129506, term129506.getClass(), "returnType", null);
        setField(term129509, term129509.getClass(), "indexType", null);
        setField(term129509, term129509.getClass(), "referencedType", null);
        setBooleanField(term129509, term129509.getClass(), "visited", false);
        setField(term129509, term129509.getClass(), "docInfo", null);
        setBooleanField(term129509, term129509.getClass(), "unknown", false);
        setBooleanField(term129509, term129509.getClass(), "resolved", false);
        setField(term129509, term129509.getClass(), "resolveResult", null);
        setField(term129509, term129509.getClass(), "registry", null);
        setField(term129506, term129506.getClass(), "typeOfThis", term129509);
        setField(term129506, term129506.getClass(), "templateTypeName", null);
        setBooleanField(term129506, term129506.getClass(), "inferredReturnType", false);
        setBooleanField(term129506, term129506.getClass(), "isConstructor", false);
        setBooleanField(term129506, term129506.getClass(), "isNativeType", false);
        term129510 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term129511 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term129512 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term129511, term129511.getClass(), "parameters", null);
        setField(term129511, term129511.getClass(), "returnType", null);
        setBooleanField(term129511, term129511.getClass(), "returnTypeInferred", false);
        setBooleanField(term129511, term129511.getClass(), "resolved", false);
        setField(term129511, term129511.getClass(), "resolveResult", null);
        setField(term129511, term129511.getClass(), "registry", null);
        setField(term129510, term129510.getClass(), "call", term129511);
        setField(term129510, term129510.getClass(), "prototype", null);
        setField(term129510, term129510.getClass(), "kind", null);
        setField(term129512, term129512.getClass(), "indexType", null);
        setField(term129512, term129512.getClass(), "referencedType", null);
        setBooleanField(term129512, term129512.getClass(), "visited", false);
        setField(term129512, term129512.getClass(), "docInfo", null);
        setBooleanField(term129512, term129512.getClass(), "unknown", false);
        setBooleanField(term129512, term129512.getClass(), "resolved", false);
        setField(term129512, term129512.getClass(), "resolveResult", null);
        setField(term129512, term129512.getClass(), "registry", null);
        setField(term129510, term129510.getClass(), "typeOfThis", term129512);
        setField(term129510, term129510.getClass(), "source", null);
        setField(term129510, term129510.getClass(), "implementedInterfaces", null);
        setField(term129510, term129510.getClass(), "subTypes", null);
        setField(term129510, term129510.getClass(), "templateTypeName", null);
        setField(term129510, term129510.getClass(), "className", "");
        setField(term129510, term129510.getClass(), "properties", null);
        setField(term129510, term129510.getClass(), "implicitPrototype", null);
        setBooleanField(term129510, term129510.getClass(), "nativeType", false);
        setBooleanField(term129510, term129510.getClass(), "prettyPrint", false);
        setBooleanField(term129510, term129510.getClass(), "visited", false);
        setField(term129510, term129510.getClass(), "docInfo", null);
        setBooleanField(term129510, term129510.getClass(), "unknown", false);
        setBooleanField(term129510, term129510.getClass(), "resolved", false);
        setField(term129510, term129510.getClass(), "resolveResult", null);
        setField(term129510, term129510.getClass(), "registry", null);
        term129500 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term129473 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term129500, term129500.getClass(), "registry", null);
        setField(term129500, term129500.getClass(), "name", "");
        setField(term129500, term129500.getClass(), "sourceNode", null);
        setField(term129500, term129500.getClass(), "parametersNode", null);
        setField(term129500, term129500.getClass(), "returnType", null);
        setField(term129473, term129473.getClass(), "indexType", null);
        setField(term129473, term129473.getClass(), "referencedType", null);
        setBooleanField(term129473, term129473.getClass(), "visited", false);
        setField(term129473, term129473.getClass(), "docInfo", null);
        setBooleanField(term129473, term129473.getClass(), "unknown", false);
        setBooleanField(term129473, term129473.getClass(), "resolved", false);
        setField(term129473, term129473.getClass(), "resolveResult", null);
        setField(term129473, term129473.getClass(), "registry", null);
        setField(term129500, term129500.getClass(), "typeOfThis", term129473);
        setField(term129500, term129500.getClass(), "templateTypeName", null);
        setBooleanField(term129500, term129500.getClass(), "inferredReturnType", false);
        setBooleanField(term129500, term129500.getClass(), "isConstructor", false);
        setBooleanField(term129500, term129500.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term129235;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term129125, args);
        assertTrue(recursiveEquals(term129125, term129506));
        assertTrue(recursiveEquals(term129235, term129510));
        assertTrue(recursiveEquals(retValue, term129500));
    }

};


