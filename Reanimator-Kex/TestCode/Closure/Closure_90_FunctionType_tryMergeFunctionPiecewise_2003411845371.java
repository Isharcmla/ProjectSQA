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

public class FunctionType_tryMergeFunctionPiecewise_2003411845371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268939;
     Object term269273;
     Object term269665;
     Object term269669;

    public FunctionType_tryMergeFunctionPiecewise_2003411845371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268939 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term269033 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term269103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term269173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term269173, term269173.getClass(), "jsType", null);
        setField(term269173, term269173.getClass(), "next", null);
        setField(term269103, term269103.getClass(), "first", term269173);
        setField(term269033, term269033.getClass(), "parameters", term269103);
        setField(term268939, term268939.getClass(), "call", term269033);
        term269273 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term269367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term269437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term269507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term269577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term269507, term269507.getClass(), "jsType", null);
        setField(term269507, term269507.getClass(), "next", term269577);
        setField(term269437, term269437.getClass(), "first", term269507);
        setField(term269367, term269367.getClass(), "parameters", term269437);
        setField(term269273, term269273.getClass(), "call", term269367);
        term269665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term269666 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term269667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term269668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term269667, term269667.getClass(), "type", 0);
        setField(term269667, term269667.getClass(), "next", null);
        setIntField(term269668, term269668.getClass(), "type", 0);
        setField(term269668, term269668.getClass(), "next", null);
        setField(term269668, term269668.getClass(), "first", null);
        setField(term269668, term269668.getClass(), "last", null);
        setField(term269668, term269668.getClass(), "propListHead", null);
        setIntField(term269668, term269668.getClass(), "sourcePosition", 0);
        setField(term269668, term269668.getClass(), "jsType", null);
        setField(term269668, term269668.getClass(), "parent", null);
        setField(term269667, term269667.getClass(), "first", term269668);
        setField(term269667, term269667.getClass(), "last", null);
        setField(term269667, term269667.getClass(), "propListHead", null);
        setIntField(term269667, term269667.getClass(), "sourcePosition", 0);
        setField(term269667, term269667.getClass(), "jsType", null);
        setField(term269667, term269667.getClass(), "parent", null);
        setField(term269666, term269666.getClass(), "parameters", term269667);
        setField(term269666, term269666.getClass(), "returnType", null);
        setBooleanField(term269666, term269666.getClass(), "returnTypeInferred", false);
        setBooleanField(term269666, term269666.getClass(), "resolved", false);
        setField(term269666, term269666.getClass(), "resolveResult", null);
        setField(term269666, term269666.getClass(), "registry", null);
        setField(term269665, term269665.getClass(), "call", term269666);
        setField(term269665, term269665.getClass(), "prototype", null);
        setField(term269665, term269665.getClass(), "kind", null);
        setField(term269665, term269665.getClass(), "typeOfThis", null);
        setField(term269665, term269665.getClass(), "source", null);
        setField(term269665, term269665.getClass(), "implementedInterfaces", null);
        setField(term269665, term269665.getClass(), "subTypes", null);
        setField(term269665, term269665.getClass(), "templateTypeName", null);
        setField(term269665, term269665.getClass(), "className", null);
        setField(term269665, term269665.getClass(), "properties", null);
        setBooleanField(term269665, term269665.getClass(), "nativeType", false);
        setField(term269665, term269665.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term269665, term269665.getClass(), "prettyPrint", false);
        setBooleanField(term269665, term269665.getClass(), "visited", false);
        setField(term269665, term269665.getClass(), "docInfo", null);
        setBooleanField(term269665, term269665.getClass(), "unknown", false);
        setBooleanField(term269665, term269665.getClass(), "resolved", false);
        setField(term269665, term269665.getClass(), "resolveResult", null);
        setField(term269665, term269665.getClass(), "registry", null);
        term269669 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term269670 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term269671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term269672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term269673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term269671, term269671.getClass(), "type", 0);
        setField(term269671, term269671.getClass(), "next", null);
        setIntField(term269672, term269672.getClass(), "type", 0);
        setIntField(term269673, term269673.getClass(), "type", 0);
        setField(term269673, term269673.getClass(), "next", null);
        setField(term269673, term269673.getClass(), "first", null);
        setField(term269673, term269673.getClass(), "last", null);
        setField(term269673, term269673.getClass(), "propListHead", null);
        setIntField(term269673, term269673.getClass(), "sourcePosition", 0);
        setField(term269673, term269673.getClass(), "jsType", null);
        setField(term269673, term269673.getClass(), "parent", null);
        setField(term269672, term269672.getClass(), "next", term269673);
        setField(term269672, term269672.getClass(), "first", null);
        setField(term269672, term269672.getClass(), "last", null);
        setField(term269672, term269672.getClass(), "propListHead", null);
        setIntField(term269672, term269672.getClass(), "sourcePosition", 0);
        setField(term269672, term269672.getClass(), "jsType", null);
        setField(term269672, term269672.getClass(), "parent", null);
        setField(term269671, term269671.getClass(), "first", term269672);
        setField(term269671, term269671.getClass(), "last", null);
        setField(term269671, term269671.getClass(), "propListHead", null);
        setIntField(term269671, term269671.getClass(), "sourcePosition", 0);
        setField(term269671, term269671.getClass(), "jsType", null);
        setField(term269671, term269671.getClass(), "parent", null);
        setField(term269670, term269670.getClass(), "parameters", term269671);
        setField(term269670, term269670.getClass(), "returnType", null);
        setBooleanField(term269670, term269670.getClass(), "returnTypeInferred", false);
        setBooleanField(term269670, term269670.getClass(), "resolved", false);
        setField(term269670, term269670.getClass(), "resolveResult", null);
        setField(term269670, term269670.getClass(), "registry", null);
        setField(term269669, term269669.getClass(), "call", term269670);
        setField(term269669, term269669.getClass(), "prototype", null);
        setField(term269669, term269669.getClass(), "kind", null);
        setField(term269669, term269669.getClass(), "typeOfThis", null);
        setField(term269669, term269669.getClass(), "source", null);
        setField(term269669, term269669.getClass(), "implementedInterfaces", null);
        setField(term269669, term269669.getClass(), "subTypes", null);
        setField(term269669, term269669.getClass(), "templateTypeName", null);
        setField(term269669, term269669.getClass(), "className", null);
        setField(term269669, term269669.getClass(), "properties", null);
        setBooleanField(term269669, term269669.getClass(), "nativeType", false);
        setField(term269669, term269669.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term269669, term269669.getClass(), "prettyPrint", false);
        setBooleanField(term269669, term269669.getClass(), "visited", false);
        setField(term269669, term269669.getClass(), "docInfo", null);
        setBooleanField(term269669, term269669.getClass(), "unknown", false);
        setBooleanField(term269669, term269669.getClass(), "resolved", false);
        setField(term269669, term269669.getClass(), "resolveResult", null);
        setField(term269669, term269669.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term269273;
        args[1] = false;
        Object retValue = callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term268939, args);
        assertTrue(recursiveEquals(term268939, term269665));
        assertTrue(recursiveEquals(term269273, term269669));
        assertTrue(recursiveEquals(retValue, null));
    }

};


