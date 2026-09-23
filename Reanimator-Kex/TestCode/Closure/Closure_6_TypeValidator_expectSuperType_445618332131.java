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

public class TypeValidator_expectSuperType_445618332131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31076;
     Object term31182;
     Object term31383;
     Object term31384;

    public TypeValidator_expectSuperType_445618332131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31076 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term31182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        term31383 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term31383, term31383.getClass(), "compiler", null);
        setField(term31383, term31383.getClass(), "typeRegistry", null);
        setField(term31383, term31383.getClass(), "allValueTypes", null);
        setBooleanField(term31383, term31383.getClass(), "shouldReport", false);
        setField(term31383, term31383.getClass(), "nullOrUndefined", null);
        setField(term31383, term31383.getClass(), "mismatches", null);
        term31384 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term31384, term31384.getClass(), "referencedType", null);
        setField(term31384, term31384.getClass(), "referencedObjType", null);
        setBooleanField(term31384, term31384.getClass(), "visited", false);
        setField(term31384, term31384.getClass(), "docInfo", null);
        setBooleanField(term31384, term31384.getClass(), "unknown", false);
        setBooleanField(term31384, term31384.getClass(), "resolved", false);
        setField(term31384, term31384.getClass(), "resolveResult", null);
        setField(term31384, term31384.getClass(), "templateKeys", null);
        setField(term31384, term31384.getClass(), "templatizedTypes", null);
        setBooleanField(term31384, term31384.getClass(), "inTemplatedCheckVisit", false);
        setField(term31384, term31384.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term31182;
        callMethod(klass, "expectSuperType", argTypes, term31076, args);
        assertTrue(recursiveEquals(term31076, term31383));
        assertTrue(recursiveEquals(term31182, null));
    }

};


