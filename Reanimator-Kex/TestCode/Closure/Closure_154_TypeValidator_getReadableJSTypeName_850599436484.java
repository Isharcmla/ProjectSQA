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

public class TypeValidator_getReadableJSTypeName_850599436484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249484;
     Object term249576;
     Object term249780;
     Object term249781;

    public TypeValidator_getReadableJSTypeName_850599436484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249484 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term249576 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term249672 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setIntField(term249576, term249576.getClass(), "type", 42);
        setField(term249576, term249576.getClass(), "jsType", term249672);
        term249780 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term249780, term249780.getClass(), "compiler", null);
        setField(term249780, term249780.getClass(), "typeRegistry", null);
        setField(term249780, term249780.getClass(), "allValueTypes", null);
        setBooleanField(term249780, term249780.getClass(), "shouldReport", false);
        setField(term249780, term249780.getClass(), "nullOrUndefined", null);
        setField(term249780, term249780.getClass(), "mismatches", null);
        term249781 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term249782 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setDoubleField(term249781, term249781.getClass(), "number", 0.0);
        setIntField(term249781, term249781.getClass(), "type", 42);
        setField(term249781, term249781.getClass(), "next", null);
        setField(term249781, term249781.getClass(), "first", null);
        setField(term249781, term249781.getClass(), "last", null);
        setField(term249781, term249781.getClass(), "propListHead", null);
        setIntField(term249781, term249781.getClass(), "sourcePosition", 0);
        setField(term249782, term249782.getClass(), "properties", null);
        setBooleanField(term249782, term249782.getClass(), "isFrozen", false);
        setField(term249782, term249782.getClass(), "className", null);
        setField(term249782, term249782.getClass(), "properties", null);
        setBooleanField(term249782, term249782.getClass(), "nativeType", false);
        setField(term249782, term249782.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term249782, term249782.getClass(), "prettyPrint", false);
        setBooleanField(term249782, term249782.getClass(), "visited", false);
        setField(term249782, term249782.getClass(), "docInfo", null);
        setBooleanField(term249782, term249782.getClass(), "unknown", false);
        setBooleanField(term249782, term249782.getClass(), "resolved", false);
        setField(term249782, term249782.getClass(), "resolveResult", null);
        setField(term249782, term249782.getClass(), "registry", null);
        setField(term249781, term249781.getClass(), "jsType", term249782);
        setField(term249781, term249781.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term249576;
        args[1] = true;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term249484, args);
        assertTrue(recursiveEquals(term249484, term249780));
        assertTrue(recursiveEquals(term249576, term249781));
        assertTrue(recursiveEquals(retValue, "this"));
    }

};


