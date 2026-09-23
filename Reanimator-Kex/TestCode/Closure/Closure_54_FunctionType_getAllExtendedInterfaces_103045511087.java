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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FunctionType_getAllExtendedInterfaces_103045511087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8523;

    public FunctionType_getAllExtendedInterfaces_103045511087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38468 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term38467 = ((Class) term38468).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term38467).setAccessible(true);
        Object enum100 = ((Field) term38467).get((Object) null);
        term8523 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8524 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term8525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8548 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term8554 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term8525, term8525.getClass(), "type", 534834644);
        setIntField(term8527, term8527.getClass(), "type", 252575029);
        setIntField(term8529, term8529.getClass(), "type", 0);
        setField(term8529, term8529.getClass(), "next", null);
        setField(term8529, term8529.getClass(), "first", null);
        setField(term8529, term8529.getClass(), "last", null);
        setField(term8529, term8529.getClass(), "propListHead", null);
        setIntField(term8529, term8529.getClass(), "sourcePosition", 0);
        setField(term8529, term8529.getClass(), "jsType", null);
        setField(term8529, term8529.getClass(), "parent", null);
        setField(term8527, term8527.getClass(), "next", term8529);
        setIntField(term8532, term8532.getClass(), "type", 0);
        setField(term8532, term8532.getClass(), "next", null);
        setField(term8532, term8532.getClass(), "first", null);
        setField(term8532, term8532.getClass(), "last", null);
        setField(term8532, term8532.getClass(), "propListHead", null);
        setIntField(term8532, term8532.getClass(), "sourcePosition", 0);
        setField(term8532, term8532.getClass(), "jsType", null);
        setField(term8532, term8532.getClass(), "parent", null);
        setField(term8527, term8527.getClass(), "first", term8532);
        setIntField(term8535, term8535.getClass(), "type", 0);
        setField(term8535, term8535.getClass(), "next", null);
        setField(term8535, term8535.getClass(), "first", null);
        setField(term8535, term8535.getClass(), "last", null);
        setField(term8535, term8535.getClass(), "propListHead", null);
        setIntField(term8535, term8535.getClass(), "sourcePosition", 0);
        setField(term8535, term8535.getClass(), "jsType", null);
        setField(term8535, term8535.getClass(), "parent", null);
        setField(term8527, term8527.getClass(), "last", term8535);
        setField(term8527, term8527.getClass(), "propListHead", null);
        setIntField(term8527, term8527.getClass(), "sourcePosition", 0);
        setField(term8527, term8527.getClass(), "jsType", null);
        setField(term8527, term8527.getClass(), "parent", null);
        setField(term8525, term8525.getClass(), "next", term8527);
        setIntField(term8539, term8539.getClass(), "type", 0);
        setField(term8539, term8539.getClass(), "next", null);
        setField(term8539, term8539.getClass(), "first", null);
        setField(term8539, term8539.getClass(), "last", null);
        setField(term8539, term8539.getClass(), "propListHead", null);
        setIntField(term8539, term8539.getClass(), "sourcePosition", 0);
        setField(term8539, term8539.getClass(), "jsType", null);
        setField(term8539, term8539.getClass(), "parent", null);
        setField(term8525, term8525.getClass(), "first", term8539);
        setIntField(term8542, term8542.getClass(), "type", 0);
        setField(term8542, term8542.getClass(), "next", null);
        setField(term8542, term8542.getClass(), "first", null);
        setField(term8542, term8542.getClass(), "last", null);
        setField(term8542, term8542.getClass(), "propListHead", null);
        setIntField(term8542, term8542.getClass(), "sourcePosition", 0);
        setField(term8542, term8542.getClass(), "jsType", null);
        setField(term8542, term8542.getClass(), "parent", null);
        setField(term8525, term8525.getClass(), "last", term8542);
        setField(term8525, term8525.getClass(), "propListHead", null);
        setIntField(term8525, term8525.getClass(), "sourcePosition", 0);
        setField(term8525, term8525.getClass(), "jsType", null);
        setField(term8525, term8525.getClass(), "parent", null);
        setField(term8524, term8524.getClass(), "parameters", term8525);
        setField(term8524, term8524.getClass(), "returnType", null);
        setBooleanField(term8524, term8524.getClass(), "returnTypeInferred", false);
        setBooleanField(term8524, term8524.getClass(), "resolved", false);
        setField(term8524, term8524.getClass(), "resolveResult", null);
        setField(term8524, term8524.getClass(), "registry", null);
        setField(term8523, term8523.getClass(), "call", term8524);
        setField(term8548, term8548.getClass(), "className", null);
        setField(term8548, term8548.getClass(), "properties", null);
        setBooleanField(term8548, term8548.getClass(), "nativeType", false);
        setField(term8548, term8548.getClass(), "implicitPrototypeFallback", null);
        setField(term8548, term8548.getClass(), "ownerFunction", null);
        setBooleanField(term8548, term8548.getClass(), "prettyPrint", false);
        setBooleanField(term8548, term8548.getClass(), "visited", false);
        setField(term8548, term8548.getClass(), "docInfo", null);
        setBooleanField(term8548, term8548.getClass(), "unknown", false);
        setBooleanField(term8548, term8548.getClass(), "resolved", false);
        setField(term8548, term8548.getClass(), "resolveResult", null);
        setField(term8548, term8548.getClass(), "registry", null);
        setField(term8523, term8523.getClass(), "prototype", term8548);
        setField(term8554, term8554.getClass(), "name", null);
        setField(term8554, term8554.getClass(), "type", null);
        setBooleanField(term8554, term8554.getClass(), "inferred", false);
        setField(term8523, term8523.getClass(), "prototypeSlot", term8554);
        setField(term8523, term8523.getClass(), "kind", enum100);
        setField(term8523, term8523.getClass(), "typeOfThis", null);
        setField(term8523, term8523.getClass(), "source", null);
        setField(term8523, term8523.getClass(), "implementedInterfaces", null);
        setField(term8523, term8523.getClass(), "extendedInterfaces", null);
        setField(term8523, term8523.getClass(), "subTypes", null);
        setField(term8523, term8523.getClass(), "templateTypeName", null);
        setField(term8523, term8523.getClass(), "className", null);
        setField(term8523, term8523.getClass(), "properties", null);
        setBooleanField(term8523, term8523.getClass(), "nativeType", false);
        setField(term8523, term8523.getClass(), "implicitPrototypeFallback", null);
        setField(term8523, term8523.getClass(), "ownerFunction", null);
        setBooleanField(term8523, term8523.getClass(), "prettyPrint", false);
        setBooleanField(term8523, term8523.getClass(), "visited", false);
        setField(term8523, term8523.getClass(), "docInfo", null);
        setBooleanField(term8523, term8523.getClass(), "unknown", false);
        setBooleanField(term8523, term8523.getClass(), "resolved", false);
        setField(term8523, term8523.getClass(), "resolveResult", null);
        setField(term8523, term8523.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllExtendedInterfaces", argTypes, term8523, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


