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

public class FunctionTypeBuilder_inferFromOverriddenFunction_71629457153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42955;
     Object term43055;
     Object term43289;
     Object term43590;
     Object term43592;
     Object term43595;
     Object term43584;

    public FunctionTypeBuilder_inferFromOverriddenFunction_71629457153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42955 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term42955, term42955.getClass(), "returnType", null);
        setField(term42955, term42955.getClass(), "typeRegistry", null);
        term43055 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term43149 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term43219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term43149, term43149.getClass(), "returnType", null);
        setField(term43219, term43219.getClass(), "first", null);
        setField(term43149, term43149.getClass(), "parameters", term43219);
        setField(term43055, term43055.getClass(), "call", term43149);
        term43289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term43590 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term43591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term43590, term43590.getClass(), "fnName", null);
        setField(term43590, term43590.getClass(), "compiler", null);
        setField(term43590, term43590.getClass(), "codingConvention", null);
        setField(term43590, term43590.getClass(), "typeRegistry", null);
        setField(term43590, term43590.getClass(), "errorRoot", null);
        setField(term43590, term43590.getClass(), "sourceName", null);
        setField(term43590, term43590.getClass(), "scope", null);
        setField(term43590, term43590.getClass(), "returnType", null);
        setField(term43590, term43590.getClass(), "implementedInterfaces", null);
        setField(term43590, term43590.getClass(), "baseType", null);
        setField(term43590, term43590.getClass(), "thisType", null);
        setBooleanField(term43590, term43590.getClass(), "isConstructor", false);
        setBooleanField(term43590, term43590.getClass(), "isInterface", false);
        setIntField(term43591, term43591.getClass(), "type", 83);
        setField(term43591, term43591.getClass(), "next", null);
        setField(term43591, term43591.getClass(), "first", null);
        setField(term43591, term43591.getClass(), "last", null);
        setField(term43591, term43591.getClass(), "propListHead", null);
        setIntField(term43591, term43591.getClass(), "sourcePosition", -1);
        setField(term43591, term43591.getClass(), "jsType", null);
        setField(term43591, term43591.getClass(), "parent", null);
        setField(term43590, term43590.getClass(), "parametersNode", term43591);
        setField(term43590, term43590.getClass(), "sourceNode", null);
        setField(term43590, term43590.getClass(), "templateTypeName", null);
        term43592 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term43593 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term43594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43594, term43594.getClass(), "type", 0);
        setField(term43594, term43594.getClass(), "next", null);
        setField(term43594, term43594.getClass(), "first", null);
        setField(term43594, term43594.getClass(), "last", null);
        setField(term43594, term43594.getClass(), "propListHead", null);
        setIntField(term43594, term43594.getClass(), "sourcePosition", 0);
        setField(term43594, term43594.getClass(), "jsType", null);
        setField(term43594, term43594.getClass(), "parent", null);
        setField(term43593, term43593.getClass(), "parameters", term43594);
        setField(term43593, term43593.getClass(), "returnType", null);
        setBooleanField(term43593, term43593.getClass(), "returnTypeInferred", false);
        setBooleanField(term43593, term43593.getClass(), "resolved", false);
        setField(term43593, term43593.getClass(), "resolveResult", null);
        setField(term43593, term43593.getClass(), "registry", null);
        setField(term43592, term43592.getClass(), "call", term43593);
        setField(term43592, term43592.getClass(), "prototype", null);
        setField(term43592, term43592.getClass(), "kind", null);
        setField(term43592, term43592.getClass(), "typeOfThis", null);
        setField(term43592, term43592.getClass(), "source", null);
        setField(term43592, term43592.getClass(), "implementedInterfaces", null);
        setField(term43592, term43592.getClass(), "subTypes", null);
        setField(term43592, term43592.getClass(), "templateTypeName", null);
        setField(term43592, term43592.getClass(), "className", null);
        setField(term43592, term43592.getClass(), "properties", null);
        setField(term43592, term43592.getClass(), "implicitPrototype", null);
        setBooleanField(term43592, term43592.getClass(), "nativeType", false);
        setBooleanField(term43592, term43592.getClass(), "prettyPrint", false);
        setBooleanField(term43592, term43592.getClass(), "visited", false);
        setField(term43592, term43592.getClass(), "docInfo", null);
        setBooleanField(term43592, term43592.getClass(), "unknown", false);
        setBooleanField(term43592, term43592.getClass(), "resolved", false);
        setField(term43592, term43592.getClass(), "resolveResult", null);
        setField(term43592, term43592.getClass(), "registry", null);
        term43595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43595, term43595.getClass(), "type", 0);
        setField(term43595, term43595.getClass(), "next", null);
        setField(term43595, term43595.getClass(), "first", null);
        setField(term43595, term43595.getClass(), "last", null);
        setField(term43595, term43595.getClass(), "propListHead", null);
        setIntField(term43595, term43595.getClass(), "sourcePosition", 0);
        setField(term43595, term43595.getClass(), "jsType", null);
        setField(term43595, term43595.getClass(), "parent", null);
        term43584 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term43587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term43584, term43584.getClass(), "fnName", null);
        setField(term43584, term43584.getClass(), "compiler", null);
        setField(term43584, term43584.getClass(), "codingConvention", null);
        setField(term43584, term43584.getClass(), "typeRegistry", null);
        setField(term43584, term43584.getClass(), "errorRoot", null);
        setField(term43584, term43584.getClass(), "sourceName", null);
        setField(term43584, term43584.getClass(), "scope", null);
        setField(term43584, term43584.getClass(), "returnType", null);
        setField(term43584, term43584.getClass(), "implementedInterfaces", null);
        setField(term43584, term43584.getClass(), "baseType", null);
        setField(term43584, term43584.getClass(), "thisType", null);
        setBooleanField(term43584, term43584.getClass(), "isConstructor", false);
        setBooleanField(term43584, term43584.getClass(), "isInterface", false);
        setIntField(term43587, term43587.getClass(), "type", 83);
        setField(term43587, term43587.getClass(), "next", null);
        setField(term43587, term43587.getClass(), "first", null);
        setField(term43587, term43587.getClass(), "last", null);
        setField(term43587, term43587.getClass(), "propListHead", null);
        setIntField(term43587, term43587.getClass(), "sourcePosition", -1);
        setField(term43587, term43587.getClass(), "jsType", null);
        setField(term43587, term43587.getClass(), "parent", null);
        setField(term43584, term43584.getClass(), "parametersNode", term43587);
        setField(term43584, term43584.getClass(), "sourceNode", null);
        setField(term43584, term43584.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term43055;
        args[1] = term43289;
        Object retValue = callMethod(klass, "inferFromOverriddenFunction", argTypes, term42955, args);
        assertTrue(recursiveEquals(term42955, term43590));
        assertTrue(recursiveEquals(term43055, term43592));
        assertTrue(recursiveEquals(term43289, term43595));
        assertTrue(recursiveEquals(retValue, term43584));
    }

};


