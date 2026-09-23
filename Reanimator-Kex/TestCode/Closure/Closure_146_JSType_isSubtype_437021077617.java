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

public class JSType_isSubtype_437021077617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174134;
     Object term174228;
     Object term174388;
     Object term174390;

    public JSType_isSubtype_437021077617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174134 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term174228 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term174338 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term174228, term174228.getClass(), "referencedType", term174338);
        term174388 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term174389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term174388, term174388.getClass(), "reference", null);
        setField(term174388, term174388.getClass(), "sourceName", null);
        setIntField(term174388, term174388.getClass(), "lineno", 0);
        setIntField(term174388, term174388.getClass(), "charno", 0);
        setBooleanField(term174388, term174388.getClass(), "forgiving", false);
        setField(term174389, term174389.getClass(), "call", null);
        setField(term174389, term174389.getClass(), "prototype", null);
        setField(term174389, term174389.getClass(), "kind", null);
        setField(term174389, term174389.getClass(), "typeOfThis", null);
        setField(term174389, term174389.getClass(), "source", null);
        setField(term174389, term174389.getClass(), "implementedInterfaces", null);
        setField(term174389, term174389.getClass(), "subTypes", null);
        setField(term174389, term174389.getClass(), "templateTypeName", null);
        setField(term174389, term174389.getClass(), "className", null);
        setField(term174389, term174389.getClass(), "properties", null);
        setField(term174389, term174389.getClass(), "implicitPrototype", null);
        setBooleanField(term174389, term174389.getClass(), "nativeType", false);
        setBooleanField(term174389, term174389.getClass(), "prettyPrint", false);
        setBooleanField(term174389, term174389.getClass(), "visited", false);
        setField(term174389, term174389.getClass(), "docInfo", null);
        setBooleanField(term174389, term174389.getClass(), "unknown", false);
        setBooleanField(term174389, term174389.getClass(), "resolved", false);
        setField(term174389, term174389.getClass(), "resolveResult", null);
        setField(term174389, term174389.getClass(), "registry", null);
        setField(term174388, term174388.getClass(), "referencedType", term174389);
        setBooleanField(term174388, term174388.getClass(), "visited", false);
        setField(term174388, term174388.getClass(), "docInfo", null);
        setBooleanField(term174388, term174388.getClass(), "unknown", false);
        setBooleanField(term174388, term174388.getClass(), "resolved", false);
        setField(term174388, term174388.getClass(), "resolveResult", null);
        setField(term174388, term174388.getClass(), "registry", null);
        term174390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term174390, term174390.getClass(), "resolved", false);
        setField(term174390, term174390.getClass(), "resolveResult", null);
        setField(term174390, term174390.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term174134;
        args[1] = term174228;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term174134, term174388));
        assertTrue(recursiveEquals(term174228, term174390));
        assertTrue(recursiveEquals(retValue, false));
    }

};


