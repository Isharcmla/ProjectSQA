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

public class FunctionType_addRelatedInterfaces_784954428147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77617;
     Object term77717;
     Object term77755;
     Object term77756;

    public FunctionType_addRelatedInterfaces_784954428147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term77717 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term77755 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term77755, term77755.getClass(), "call", null);
        setField(term77755, term77755.getClass(), "prototype", null);
        setField(term77755, term77755.getClass(), "kind", null);
        setField(term77755, term77755.getClass(), "typeOfThis", null);
        setField(term77755, term77755.getClass(), "source", null);
        setField(term77755, term77755.getClass(), "implementedInterfaces", null);
        setField(term77755, term77755.getClass(), "subTypes", null);
        setField(term77755, term77755.getClass(), "templateTypeName", null);
        setField(term77755, term77755.getClass(), "className", null);
        setField(term77755, term77755.getClass(), "properties", null);
        setBooleanField(term77755, term77755.getClass(), "nativeType", false);
        setField(term77755, term77755.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term77755, term77755.getClass(), "prettyPrint", false);
        setBooleanField(term77755, term77755.getClass(), "visited", false);
        setField(term77755, term77755.getClass(), "docInfo", null);
        setBooleanField(term77755, term77755.getClass(), "unknown", false);
        setBooleanField(term77755, term77755.getClass(), "resolved", false);
        setField(term77755, term77755.getClass(), "resolveResult", null);
        setField(term77755, term77755.getClass(), "registry", null);
        term77756 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term77756, term77756.getClass(), "call", null);
        setField(term77756, term77756.getClass(), "prototype", null);
        setField(term77756, term77756.getClass(), "kind", null);
        setField(term77756, term77756.getClass(), "typeOfThis", null);
        setField(term77756, term77756.getClass(), "source", null);
        setField(term77756, term77756.getClass(), "implementedInterfaces", null);
        setField(term77756, term77756.getClass(), "subTypes", null);
        setField(term77756, term77756.getClass(), "templateTypeName", null);
        setField(term77756, term77756.getClass(), "className", null);
        setField(term77756, term77756.getClass(), "properties", null);
        setBooleanField(term77756, term77756.getClass(), "nativeType", false);
        setField(term77756, term77756.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term77756, term77756.getClass(), "prettyPrint", false);
        setBooleanField(term77756, term77756.getClass(), "visited", false);
        setField(term77756, term77756.getClass(), "docInfo", null);
        setBooleanField(term77756, term77756.getClass(), "unknown", false);
        setBooleanField(term77756, term77756.getClass(), "resolved", false);
        setField(term77756, term77756.getClass(), "resolveResult", null);
        setField(term77756, term77756.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term77717;
        args[1] = null;
        callMethod(klass, "addRelatedInterfaces", argTypes, term77617, args);
        assertTrue(recursiveEquals(term77617, term77755));
        assertTrue(recursiveEquals(term77717, term77756));
    }

};


