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

public class TypeCheck_getJSType_1628208716135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31953;
     Object term32023;
     Object term32359;
     Object term32360;
     Object term32343;

    public TypeCheck_getJSType_1628208716135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31953 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term32023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32137 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term32023, term32023.getClass(), "jsType", term32137);
        term32359 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term32359, term32359.getClass(), "compiler", null);
        setField(term32359, term32359.getClass(), "validator", null);
        setField(term32359, term32359.getClass(), "reverseInterpreter", null);
        setField(term32359, term32359.getClass(), "typeRegistry", null);
        setField(term32359, term32359.getClass(), "topScope", null);
        setField(term32359, term32359.getClass(), "scopeCreator", null);
        setField(term32359, term32359.getClass(), "reportMissingOverride", null);
        setBooleanField(term32359, term32359.getClass(), "reportUnknownTypes", false);
        setBooleanField(term32359, term32359.getClass(), "reportMissingProperties", false);
        setField(term32359, term32359.getClass(), "inferJSDocInfo", null);
        setIntField(term32359, term32359.getClass(), "typedCount", 0);
        setIntField(term32359, term32359.getClass(), "nullCount", 0);
        setIntField(term32359, term32359.getClass(), "unknownCount", 0);
        setBooleanField(term32359, term32359.getClass(), "inExterns", false);
        setIntField(term32359, term32359.getClass(), "noTypeCheckSection", 0);
        setField(term32359, term32359.getClass(), "editDistance", null);
        term32360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32361 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setIntField(term32360, term32360.getClass(), "type", 0);
        setField(term32360, term32360.getClass(), "next", null);
        setField(term32360, term32360.getClass(), "first", null);
        setField(term32360, term32360.getClass(), "last", null);
        setField(term32360, term32360.getClass(), "propListHead", null);
        setIntField(term32360, term32360.getClass(), "sourcePosition", 0);
        setField(term32361, term32361.getClass(), "className", null);
        setField(term32361, term32361.getClass(), "properties", null);
        setBooleanField(term32361, term32361.getClass(), "nativeType", false);
        setField(term32361, term32361.getClass(), "implicitPrototypeFallback", null);
        setField(term32361, term32361.getClass(), "ownerFunction", null);
        setBooleanField(term32361, term32361.getClass(), "prettyPrint", false);
        setBooleanField(term32361, term32361.getClass(), "visited", false);
        setField(term32361, term32361.getClass(), "docInfo", null);
        setBooleanField(term32361, term32361.getClass(), "unknown", false);
        setBooleanField(term32361, term32361.getClass(), "resolved", false);
        setField(term32361, term32361.getClass(), "resolveResult", null);
        setField(term32361, term32361.getClass(), "templateTypeMap", null);
        setBooleanField(term32361, term32361.getClass(), "inTemplatedCheckVisit", false);
        setField(term32361, term32361.getClass(), "registry", null);
        setField(term32360, term32360.getClass(), "jsType", term32361);
        setField(term32360, term32360.getClass(), "parent", null);
        term32343 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term32343, term32343.getClass(), "className", null);
        setField(term32343, term32343.getClass(), "properties", null);
        setBooleanField(term32343, term32343.getClass(), "nativeType", false);
        setField(term32343, term32343.getClass(), "implicitPrototypeFallback", null);
        setField(term32343, term32343.getClass(), "ownerFunction", null);
        setBooleanField(term32343, term32343.getClass(), "prettyPrint", false);
        setBooleanField(term32343, term32343.getClass(), "visited", false);
        setField(term32343, term32343.getClass(), "docInfo", null);
        setBooleanField(term32343, term32343.getClass(), "unknown", false);
        setBooleanField(term32343, term32343.getClass(), "resolved", false);
        setField(term32343, term32343.getClass(), "resolveResult", null);
        setField(term32343, term32343.getClass(), "templateTypeMap", null);
        setBooleanField(term32343, term32343.getClass(), "inTemplatedCheckVisit", false);
        setField(term32343, term32343.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term32023;
        Object retValue = callMethod(klass, "getJSType", argTypes, term31953, args);
        assertTrue(recursiveEquals(term31953, term32359));
        assertTrue(recursiveEquals(term32023, term32360));
        assertTrue(recursiveEquals(retValue, term32343));
    }

};


