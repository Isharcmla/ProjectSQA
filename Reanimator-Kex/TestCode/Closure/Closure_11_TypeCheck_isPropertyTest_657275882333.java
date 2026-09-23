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

public class TypeCheck_isPropertyTest_657275882333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81331;
     Object term81401;
     Object term81912;
     Object term81913;

    public TypeCheck_isPropertyTest_657275882333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81331 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term81401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81401, term81401.getClass(), "parent", term81401);
        setIntField(term81401, term81401.getClass(), "type", 114);
        term81912 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term81912, term81912.getClass(), "compiler", null);
        setField(term81912, term81912.getClass(), "validator", null);
        setField(term81912, term81912.getClass(), "reverseInterpreter", null);
        setField(term81912, term81912.getClass(), "typeRegistry", null);
        setField(term81912, term81912.getClass(), "topScope", null);
        setField(term81912, term81912.getClass(), "scopeCreator", null);
        setField(term81912, term81912.getClass(), "reportMissingOverride", null);
        setField(term81912, term81912.getClass(), "reportUnknownTypes", null);
        setBooleanField(term81912, term81912.getClass(), "reportMissingProperties", false);
        setField(term81912, term81912.getClass(), "inferJSDocInfo", null);
        setIntField(term81912, term81912.getClass(), "typedCount", 0);
        setIntField(term81912, term81912.getClass(), "nullCount", 0);
        setIntField(term81912, term81912.getClass(), "unknownCount", 0);
        setBooleanField(term81912, term81912.getClass(), "inExterns", false);
        setIntField(term81912, term81912.getClass(), "noTypeCheckSection", 0);
        term81913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term81913, term81913.getClass(), "type", 114);
        setField(term81913, term81913.getClass(), "next", null);
        setField(term81913, term81913.getClass(), "first", null);
        setField(term81913, term81913.getClass(), "last", null);
        setField(term81913, term81913.getClass(), "propListHead", null);
        setIntField(term81913, term81913.getClass(), "sourcePosition", 0);
        setField(term81913, term81913.getClass(), "jsType", null);
        setField(term81913, term81913.getClass(), "parent", term81913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term81401;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term81331, args);
        assertTrue(recursiveEquals(term81331, term81912));
        assertTrue(recursiveEquals(term81401, term81913));
        assertTrue(recursiveEquals(retValue, false));
    }

};


