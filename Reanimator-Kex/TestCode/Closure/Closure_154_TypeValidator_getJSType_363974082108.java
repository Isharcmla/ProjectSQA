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

public class TypeValidator_getJSType_363974082108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25235;
     Object term25305;
     Object term25436;
     Object term25437;
     Object term25427;

    public TypeValidator_getJSType_363974082108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25235 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term25305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25417 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term25305, term25305.getClass(), "jsType", term25417);
        term25436 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term25436, term25436.getClass(), "compiler", null);
        setField(term25436, term25436.getClass(), "typeRegistry", null);
        setField(term25436, term25436.getClass(), "allValueTypes", null);
        setBooleanField(term25436, term25436.getClass(), "shouldReport", false);
        setField(term25436, term25436.getClass(), "nullOrUndefined", null);
        setField(term25436, term25436.getClass(), "mismatches", null);
        term25437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25438 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setIntField(term25437, term25437.getClass(), "type", 0);
        setField(term25437, term25437.getClass(), "next", null);
        setField(term25437, term25437.getClass(), "first", null);
        setField(term25437, term25437.getClass(), "last", null);
        setField(term25437, term25437.getClass(), "propListHead", null);
        setIntField(term25437, term25437.getClass(), "sourcePosition", 0);
        setField(term25438, term25438.getClass(), "constructor", null);
        setField(term25438, term25438.getClass(), "className", null);
        setField(term25438, term25438.getClass(), "properties", null);
        setBooleanField(term25438, term25438.getClass(), "nativeType", false);
        setField(term25438, term25438.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term25438, term25438.getClass(), "prettyPrint", false);
        setBooleanField(term25438, term25438.getClass(), "visited", false);
        setField(term25438, term25438.getClass(), "docInfo", null);
        setBooleanField(term25438, term25438.getClass(), "unknown", false);
        setBooleanField(term25438, term25438.getClass(), "resolved", false);
        setField(term25438, term25438.getClass(), "resolveResult", null);
        setField(term25438, term25438.getClass(), "registry", null);
        setField(term25437, term25437.getClass(), "jsType", term25438);
        setField(term25437, term25437.getClass(), "parent", null);
        term25427 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term25427, term25427.getClass(), "constructor", null);
        setField(term25427, term25427.getClass(), "className", null);
        setField(term25427, term25427.getClass(), "properties", null);
        setBooleanField(term25427, term25427.getClass(), "nativeType", false);
        setField(term25427, term25427.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term25427, term25427.getClass(), "prettyPrint", false);
        setBooleanField(term25427, term25427.getClass(), "visited", false);
        setField(term25427, term25427.getClass(), "docInfo", null);
        setBooleanField(term25427, term25427.getClass(), "unknown", false);
        setBooleanField(term25427, term25427.getClass(), "resolved", false);
        setField(term25427, term25427.getClass(), "resolveResult", null);
        setField(term25427, term25427.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term25305;
        Object retValue = callMethod(klass, "getJSType", argTypes, term25235, args);
        assertTrue(recursiveEquals(term25235, term25436));
        assertTrue(recursiveEquals(term25305, term25437));
        assertTrue(recursiveEquals(retValue, term25427));
    }

};


