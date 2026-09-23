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

public class TypeCheck_isPropertyTest_657275882292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71580;
     Object term71650;
     Object term71938;
     Object term71939;

    public TypeCheck_isPropertyTest_657275882292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71580 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term71650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term71650, term71650.getClass(), "parent", term71650);
        setIntField(term71650, term71650.getClass(), "type", 26);
        term71938 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term71938, term71938.getClass(), "compiler", null);
        setField(term71938, term71938.getClass(), "validator", null);
        setField(term71938, term71938.getClass(), "reverseInterpreter", null);
        setField(term71938, term71938.getClass(), "typeRegistry", null);
        setField(term71938, term71938.getClass(), "topScope", null);
        setField(term71938, term71938.getClass(), "scopeCreator", null);
        setField(term71938, term71938.getClass(), "reportMissingOverride", null);
        setField(term71938, term71938.getClass(), "reportUnknownTypes", null);
        setBooleanField(term71938, term71938.getClass(), "reportMissingProperties", false);
        setField(term71938, term71938.getClass(), "inferJSDocInfo", null);
        setIntField(term71938, term71938.getClass(), "typedCount", 0);
        setIntField(term71938, term71938.getClass(), "nullCount", 0);
        setIntField(term71938, term71938.getClass(), "unknownCount", 0);
        setBooleanField(term71938, term71938.getClass(), "inExterns", false);
        setIntField(term71938, term71938.getClass(), "noTypeCheckSection", 0);
        term71939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term71939, term71939.getClass(), "type", 26);
        setField(term71939, term71939.getClass(), "next", null);
        setField(term71939, term71939.getClass(), "first", null);
        setField(term71939, term71939.getClass(), "last", null);
        setField(term71939, term71939.getClass(), "propListHead", null);
        setIntField(term71939, term71939.getClass(), "sourcePosition", 0);
        setField(term71939, term71939.getClass(), "jsType", null);
        setField(term71939, term71939.getClass(), "parent", term71939);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term71650;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term71580, args);
        assertTrue(recursiveEquals(term71580, term71938));
        assertTrue(recursiveEquals(term71650, term71939));
        assertTrue(recursiveEquals(retValue, false));
    }

};


