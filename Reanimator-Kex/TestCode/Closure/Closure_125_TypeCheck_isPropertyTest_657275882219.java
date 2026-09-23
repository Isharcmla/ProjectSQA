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

public class TypeCheck_isPropertyTest_657275882219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52652;
     Object term52722;
     Object term53163;
     Object term53164;

    public TypeCheck_isPropertyTest_657275882219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52652 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term52722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term52722, term52722.getClass(), "parent", term52722);
        setIntField(term52722, term52722.getClass(), "type", 113);
        term53163 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term53163, term53163.getClass(), "compiler", null);
        setField(term53163, term53163.getClass(), "validator", null);
        setField(term53163, term53163.getClass(), "reverseInterpreter", null);
        setField(term53163, term53163.getClass(), "typeRegistry", null);
        setField(term53163, term53163.getClass(), "topScope", null);
        setField(term53163, term53163.getClass(), "scopeCreator", null);
        setField(term53163, term53163.getClass(), "reportMissingOverride", null);
        setBooleanField(term53163, term53163.getClass(), "reportUnknownTypes", false);
        setBooleanField(term53163, term53163.getClass(), "reportMissingProperties", false);
        setField(term53163, term53163.getClass(), "inferJSDocInfo", null);
        setIntField(term53163, term53163.getClass(), "typedCount", 0);
        setIntField(term53163, term53163.getClass(), "nullCount", 0);
        setIntField(term53163, term53163.getClass(), "unknownCount", 0);
        setBooleanField(term53163, term53163.getClass(), "inExterns", false);
        setIntField(term53163, term53163.getClass(), "noTypeCheckSection", 0);
        setField(term53163, term53163.getClass(), "editDistance", null);
        term53164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53164, term53164.getClass(), "type", 113);
        setField(term53164, term53164.getClass(), "next", null);
        setField(term53164, term53164.getClass(), "first", null);
        setField(term53164, term53164.getClass(), "last", null);
        setField(term53164, term53164.getClass(), "propListHead", null);
        setIntField(term53164, term53164.getClass(), "sourcePosition", 0);
        setField(term53164, term53164.getClass(), "jsType", null);
        setField(term53164, term53164.getClass(), "parent", term53164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term52722;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term52652, args);
        assertTrue(recursiveEquals(term52652, term53163));
        assertTrue(recursiveEquals(term52722, term53164));
        assertTrue(recursiveEquals(retValue, false));
    }

};


