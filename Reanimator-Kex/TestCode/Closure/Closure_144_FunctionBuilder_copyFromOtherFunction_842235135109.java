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
import java.lang.String;

public class FunctionBuilder_copyFromOtherFunction_842235135109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77843;
     Object term78007;
     Object term78790;
     Object term78793;
     Object term78786;

    public FunctionBuilder_copyFromOtherFunction_842235135109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term77843, term77843.getClass(), "name", "");
        setField(term77843, term77843.getClass(), "sourceNode", null);
        setField(term77843, term77843.getClass(), "parametersNode", null);
        setField(term77843, term77843.getClass(), "returnType", null);
        setField(term77843, term77843.getClass(), "typeOfThis", null);
        setField(term77843, term77843.getClass(), "templateTypeName", "");
        Class<? extends Object> term78801 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term78800 = ((Class) term78801).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term78800).setAccessible(true);
        Object enum126 = ((Field) term78800).get((Object) null);
        term78007 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term78077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78171 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term78283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term78007, term78007.getClass(), "source", term78077);
        setField(term78171, term78171.getClass(), "parameters", null);
        setField(term78171, term78171.getClass(), "returnType", null);
        setField(term78007, term78007.getClass(), "call", term78171);
        setField(term78007, term78007.getClass(), "typeOfThis", term78283);
        setField(term78007, term78007.getClass(), "templateTypeName", null);
        setField(term78007, term78007.getClass(), "kind", enum126);
        term78790 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term78791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78792 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term78790, term78790.getClass(), "registry", null);
        setField(term78790, term78790.getClass(), "name", null);
        setIntField(term78791, term78791.getClass(), "type", 0);
        setField(term78791, term78791.getClass(), "next", null);
        setField(term78791, term78791.getClass(), "first", null);
        setField(term78791, term78791.getClass(), "last", null);
        setField(term78791, term78791.getClass(), "propListHead", null);
        setIntField(term78791, term78791.getClass(), "sourcePosition", 0);
        setField(term78791, term78791.getClass(), "jsType", null);
        setField(term78791, term78791.getClass(), "parent", null);
        setField(term78790, term78790.getClass(), "sourceNode", term78791);
        setField(term78790, term78790.getClass(), "parametersNode", null);
        setField(term78790, term78790.getClass(), "returnType", null);
        setField(term78792, term78792.getClass(), "constructor", null);
        setField(term78792, term78792.getClass(), "className", null);
        setField(term78792, term78792.getClass(), "properties", null);
        setField(term78792, term78792.getClass(), "implicitPrototype", null);
        setBooleanField(term78792, term78792.getClass(), "nativeType", false);
        setBooleanField(term78792, term78792.getClass(), "prettyPrint", false);
        setBooleanField(term78792, term78792.getClass(), "visited", false);
        setField(term78792, term78792.getClass(), "docInfo", null);
        setBooleanField(term78792, term78792.getClass(), "unknown", false);
        setBooleanField(term78792, term78792.getClass(), "resolved", false);
        setField(term78792, term78792.getClass(), "resolveResult", null);
        setField(term78792, term78792.getClass(), "registry", null);
        setField(term78790, term78790.getClass(), "typeOfThis", term78792);
        setField(term78790, term78790.getClass(), "templateTypeName", null);
        setBooleanField(term78790, term78790.getClass(), "inferredReturnType", false);
        setBooleanField(term78790, term78790.getClass(), "isConstructor", true);
        setBooleanField(term78790, term78790.getClass(), "isNativeType", false);
        Class<? extends Object> term79101 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term79100 = ((Class) term79101).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term79100).setAccessible(true);
        Object enum127 = ((Field) term79100).get((Object) null);
        term78793 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term78794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term78798 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        Object term78799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term78793, term78793.getClass(), "leastSupertypeVisitor", null);
        setField(term78793, term78793.getClass(), "greatestSubtypeVisitor", null);
        setField(term78794, term78794.getClass(), "parameters", null);
        setField(term78794, term78794.getClass(), "returnType", null);
        setBooleanField(term78794, term78794.getClass(), "returnTypeInferred", false);
        setBooleanField(term78794, term78794.getClass(), "resolved", false);
        setField(term78794, term78794.getClass(), "resolveResult", null);
        setField(term78794, term78794.getClass(), "registry", null);
        setField(term78793, term78793.getClass(), "call", term78794);
        setField(term78793, term78793.getClass(), "prototype", null);
        setField(term78793, term78793.getClass(), "kind", enum127);
        setField(term78798, term78798.getClass(), "constructor", null);
        setField(term78798, term78798.getClass(), "className", null);
        setField(term78798, term78798.getClass(), "properties", null);
        setField(term78798, term78798.getClass(), "implicitPrototype", null);
        setBooleanField(term78798, term78798.getClass(), "nativeType", false);
        setBooleanField(term78798, term78798.getClass(), "prettyPrint", false);
        setBooleanField(term78798, term78798.getClass(), "visited", false);
        setField(term78798, term78798.getClass(), "docInfo", null);
        setBooleanField(term78798, term78798.getClass(), "unknown", false);
        setBooleanField(term78798, term78798.getClass(), "resolved", false);
        setField(term78798, term78798.getClass(), "resolveResult", null);
        setField(term78798, term78798.getClass(), "registry", null);
        setField(term78793, term78793.getClass(), "typeOfThis", term78798);
        setIntField(term78799, term78799.getClass(), "type", 0);
        setField(term78799, term78799.getClass(), "next", null);
        setField(term78799, term78799.getClass(), "first", null);
        setField(term78799, term78799.getClass(), "last", null);
        setField(term78799, term78799.getClass(), "propListHead", null);
        setIntField(term78799, term78799.getClass(), "sourcePosition", 0);
        setField(term78799, term78799.getClass(), "jsType", null);
        setField(term78799, term78799.getClass(), "parent", null);
        setField(term78793, term78793.getClass(), "source", term78799);
        setField(term78793, term78793.getClass(), "implementedInterfaces", null);
        setField(term78793, term78793.getClass(), "subTypes", null);
        setField(term78793, term78793.getClass(), "templateTypeName", null);
        setField(term78793, term78793.getClass(), "className", null);
        setField(term78793, term78793.getClass(), "properties", null);
        setField(term78793, term78793.getClass(), "implicitPrototype", null);
        setBooleanField(term78793, term78793.getClass(), "nativeType", false);
        setBooleanField(term78793, term78793.getClass(), "prettyPrint", false);
        setBooleanField(term78793, term78793.getClass(), "visited", false);
        setField(term78793, term78793.getClass(), "docInfo", null);
        setBooleanField(term78793, term78793.getClass(), "unknown", false);
        setBooleanField(term78793, term78793.getClass(), "resolved", false);
        setField(term78793, term78793.getClass(), "resolveResult", null);
        setField(term78793, term78793.getClass(), "registry", null);
        term78786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term78757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78751 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term78786, term78786.getClass(), "registry", null);
        setField(term78786, term78786.getClass(), "name", null);
        setIntField(term78757, term78757.getClass(), "type", 0);
        setField(term78757, term78757.getClass(), "next", null);
        setField(term78757, term78757.getClass(), "first", null);
        setField(term78757, term78757.getClass(), "last", null);
        setField(term78757, term78757.getClass(), "propListHead", null);
        setIntField(term78757, term78757.getClass(), "sourcePosition", 0);
        setField(term78757, term78757.getClass(), "jsType", null);
        setField(term78757, term78757.getClass(), "parent", null);
        setField(term78786, term78786.getClass(), "sourceNode", term78757);
        setField(term78786, term78786.getClass(), "parametersNode", null);
        setField(term78786, term78786.getClass(), "returnType", null);
        setField(term78751, term78751.getClass(), "constructor", null);
        setField(term78751, term78751.getClass(), "className", null);
        setField(term78751, term78751.getClass(), "properties", null);
        setField(term78751, term78751.getClass(), "implicitPrototype", null);
        setBooleanField(term78751, term78751.getClass(), "nativeType", false);
        setBooleanField(term78751, term78751.getClass(), "prettyPrint", false);
        setBooleanField(term78751, term78751.getClass(), "visited", false);
        setField(term78751, term78751.getClass(), "docInfo", null);
        setBooleanField(term78751, term78751.getClass(), "unknown", false);
        setBooleanField(term78751, term78751.getClass(), "resolved", false);
        setField(term78751, term78751.getClass(), "resolveResult", null);
        setField(term78751, term78751.getClass(), "registry", null);
        setField(term78786, term78786.getClass(), "typeOfThis", term78751);
        setField(term78786, term78786.getClass(), "templateTypeName", null);
        setBooleanField(term78786, term78786.getClass(), "inferredReturnType", false);
        setBooleanField(term78786, term78786.getClass(), "isConstructor", true);
        setBooleanField(term78786, term78786.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term78007;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term77843, args);
        assertTrue(recursiveEquals(term77843, term78790));
        assertTrue(recursiveEquals(term78007, term78793));
        assertTrue(recursiveEquals(retValue, term78786));
    }

};


