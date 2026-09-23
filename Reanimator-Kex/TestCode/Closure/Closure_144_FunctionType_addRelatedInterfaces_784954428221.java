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

public class FunctionType_addRelatedInterfaces_784954428221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116006;
     Object term116116;
     Object term116136;
     Object term116137;

    public FunctionType_addRelatedInterfaces_784954428221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116006 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term116116 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term116136 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term116136, term116136.getClass(), "call", null);
        setField(term116136, term116136.getClass(), "prototype", null);
        setField(term116136, term116136.getClass(), "kind", null);
        setField(term116136, term116136.getClass(), "typeOfThis", null);
        setField(term116136, term116136.getClass(), "source", null);
        setField(term116136, term116136.getClass(), "implementedInterfaces", null);
        setField(term116136, term116136.getClass(), "subTypes", null);
        setField(term116136, term116136.getClass(), "templateTypeName", null);
        setField(term116136, term116136.getClass(), "className", null);
        setField(term116136, term116136.getClass(), "properties", null);
        setField(term116136, term116136.getClass(), "implicitPrototype", null);
        setBooleanField(term116136, term116136.getClass(), "nativeType", false);
        setBooleanField(term116136, term116136.getClass(), "prettyPrint", false);
        setBooleanField(term116136, term116136.getClass(), "visited", false);
        setField(term116136, term116136.getClass(), "docInfo", null);
        setBooleanField(term116136, term116136.getClass(), "unknown", false);
        setBooleanField(term116136, term116136.getClass(), "resolved", false);
        setField(term116136, term116136.getClass(), "resolveResult", null);
        setField(term116136, term116136.getClass(), "registry", null);
        term116137 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term116137, term116137.getClass(), "call", null);
        setField(term116137, term116137.getClass(), "prototype", null);
        setField(term116137, term116137.getClass(), "kind", null);
        setField(term116137, term116137.getClass(), "typeOfThis", null);
        setField(term116137, term116137.getClass(), "source", null);
        setField(term116137, term116137.getClass(), "implementedInterfaces", null);
        setField(term116137, term116137.getClass(), "subTypes", null);
        setField(term116137, term116137.getClass(), "templateTypeName", null);
        setField(term116137, term116137.getClass(), "className", null);
        setField(term116137, term116137.getClass(), "properties", null);
        setField(term116137, term116137.getClass(), "implicitPrototype", null);
        setBooleanField(term116137, term116137.getClass(), "nativeType", false);
        setBooleanField(term116137, term116137.getClass(), "prettyPrint", false);
        setBooleanField(term116137, term116137.getClass(), "visited", false);
        setField(term116137, term116137.getClass(), "docInfo", null);
        setBooleanField(term116137, term116137.getClass(), "unknown", false);
        setBooleanField(term116137, term116137.getClass(), "resolved", false);
        setField(term116137, term116137.getClass(), "resolveResult", null);
        setField(term116137, term116137.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term116116;
        args[1] = null;
        callMethod(klass, "addRelatedInterfaces", argTypes, term116006, args);
        assertTrue(recursiveEquals(term116006, term116136));
        assertTrue(recursiveEquals(term116116, term116137));
    }

};


