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

public class FunctionType_setPrototypeBasedOn_1012666130335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225494;
     Object term225639;

    public FunctionType_setPrototypeBasedOn_1012666130335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225494 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term225612 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term225612, term225612.getClass(), "unknown", true);
        setField(term225494, term225494.getClass(), "prototype", term225612);
        term225639 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term225640 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term225639, term225639.getClass(), "call", null);
        setField(term225640, term225640.getClass(), "ownerFunction", null);
        setField(term225640, term225640.getClass(), "className", null);
        setField(term225640, term225640.getClass(), "properties", null);
        setBooleanField(term225640, term225640.getClass(), "nativeType", false);
        setField(term225640, term225640.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term225640, term225640.getClass(), "prettyPrint", false);
        setBooleanField(term225640, term225640.getClass(), "visited", false);
        setField(term225640, term225640.getClass(), "docInfo", null);
        setBooleanField(term225640, term225640.getClass(), "unknown", true);
        setBooleanField(term225640, term225640.getClass(), "resolved", false);
        setField(term225640, term225640.getClass(), "resolveResult", null);
        setField(term225640, term225640.getClass(), "registry", null);
        setField(term225639, term225639.getClass(), "prototype", term225640);
        setField(term225639, term225639.getClass(), "kind", null);
        setField(term225639, term225639.getClass(), "typeOfThis", null);
        setField(term225639, term225639.getClass(), "source", null);
        setField(term225639, term225639.getClass(), "implementedInterfaces", null);
        setField(term225639, term225639.getClass(), "subTypes", null);
        setField(term225639, term225639.getClass(), "templateTypeName", null);
        setField(term225639, term225639.getClass(), "className", null);
        setField(term225639, term225639.getClass(), "properties", null);
        setBooleanField(term225639, term225639.getClass(), "nativeType", false);
        setField(term225639, term225639.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term225639, term225639.getClass(), "prettyPrint", false);
        setBooleanField(term225639, term225639.getClass(), "visited", false);
        setField(term225639, term225639.getClass(), "docInfo", null);
        setBooleanField(term225639, term225639.getClass(), "unknown", false);
        setBooleanField(term225639, term225639.getClass(), "resolved", false);
        setField(term225639, term225639.getClass(), "resolveResult", null);
        setField(term225639, term225639.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term225494, args);
        assertTrue(recursiveEquals(term225494, term225639));
    }

};


