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
import java.lang.String;
import java.lang.Object;

public class FunctionType_setPrototype_1918602805118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64607;
     Object term64932;
     Object term65484;
     Object term65489;

    public FunctionType_setPrototype_1918602805118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65492 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term65491 = ((Class) term65492).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term65491).setAccessible(true);
        Object enum162 = ((Field) term65491).get((Object) null);
        term64607 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term64932 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term64607, term64607.getClass(), "kind", enum162);
        setField(term64607, term64607.getClass(), "typeOfThis", term64932);
        Class<? extends Object> term65792 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term65791 = ((Class) term65792).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term65791).setAccessible(true);
        Object enum163 = ((Field) term65791).get((Object) null);
        term65484 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term65488 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term65484, term65484.getClass(), "call", null);
        setField(term65484, term65484.getClass(), "prototype", null);
        setField(term65484, term65484.getClass(), "kind", enum163);
        setField(term65488, term65488.getClass(), "ownerFunction", null);
        setField(term65488, term65488.getClass(), "className", null);
        setField(term65488, term65488.getClass(), "properties", null);
        setBooleanField(term65488, term65488.getClass(), "nativeType", false);
        setField(term65488, term65488.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term65488, term65488.getClass(), "prettyPrint", false);
        setBooleanField(term65488, term65488.getClass(), "visited", false);
        setField(term65488, term65488.getClass(), "docInfo", null);
        setBooleanField(term65488, term65488.getClass(), "unknown", false);
        setBooleanField(term65488, term65488.getClass(), "resolved", false);
        setField(term65488, term65488.getClass(), "resolveResult", null);
        setField(term65488, term65488.getClass(), "registry", null);
        setField(term65484, term65484.getClass(), "typeOfThis", term65488);
        setField(term65484, term65484.getClass(), "source", null);
        setField(term65484, term65484.getClass(), "implementedInterfaces", null);
        setField(term65484, term65484.getClass(), "subTypes", null);
        setField(term65484, term65484.getClass(), "templateTypeName", null);
        setField(term65484, term65484.getClass(), "className", null);
        setField(term65484, term65484.getClass(), "properties", null);
        setBooleanField(term65484, term65484.getClass(), "nativeType", false);
        setField(term65484, term65484.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term65484, term65484.getClass(), "prettyPrint", false);
        setBooleanField(term65484, term65484.getClass(), "visited", false);
        setField(term65484, term65484.getClass(), "docInfo", null);
        setBooleanField(term65484, term65484.getClass(), "unknown", false);
        setBooleanField(term65484, term65484.getClass(), "resolved", false);
        setField(term65484, term65484.getClass(), "resolveResult", null);
        setField(term65484, term65484.getClass(), "registry", null);
        term65489 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term65489, term65489.getClass(), "ownerFunction", null);
        setField(term65489, term65489.getClass(), "className", null);
        setField(term65489, term65489.getClass(), "properties", null);
        setBooleanField(term65489, term65489.getClass(), "nativeType", false);
        setField(term65489, term65489.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term65489, term65489.getClass(), "prettyPrint", false);
        setBooleanField(term65489, term65489.getClass(), "visited", false);
        setField(term65489, term65489.getClass(), "docInfo", null);
        setBooleanField(term65489, term65489.getClass(), "unknown", false);
        setBooleanField(term65489, term65489.getClass(), "resolved", false);
        setField(term65489, term65489.getClass(), "resolveResult", null);
        setField(term65489, term65489.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = term64932;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term64607, args);
        assertTrue(recursiveEquals(term64607, term65484));
        assertTrue(recursiveEquals(term64932, term65489));
        assertTrue(recursiveEquals(retValue, false));
    }

};


