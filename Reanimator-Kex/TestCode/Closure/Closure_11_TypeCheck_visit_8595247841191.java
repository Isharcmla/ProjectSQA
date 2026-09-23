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

public class TypeCheck_visit_8595247841191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345360;
     Object term345430;
     Object term345618;
     Object term345619;

    public TypeCheck_visit_8595247841191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term345360 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term345430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term345430, term345430.getClass(), "type", 117);
        term345618 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term345618, term345618.getClass(), "compiler", null);
        setField(term345618, term345618.getClass(), "validator", null);
        setField(term345618, term345618.getClass(), "reverseInterpreter", null);
        setField(term345618, term345618.getClass(), "typeRegistry", null);
        setField(term345618, term345618.getClass(), "topScope", null);
        setField(term345618, term345618.getClass(), "scopeCreator", null);
        setField(term345618, term345618.getClass(), "reportMissingOverride", null);
        setField(term345618, term345618.getClass(), "reportUnknownTypes", null);
        setBooleanField(term345618, term345618.getClass(), "reportMissingProperties", false);
        setField(term345618, term345618.getClass(), "inferJSDocInfo", null);
        setIntField(term345618, term345618.getClass(), "typedCount", 0);
        setIntField(term345618, term345618.getClass(), "nullCount", 0);
        setIntField(term345618, term345618.getClass(), "unknownCount", 0);
        setBooleanField(term345618, term345618.getClass(), "inExterns", false);
        setIntField(term345618, term345618.getClass(), "noTypeCheckSection", 0);
        term345619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term345619, term345619.getClass(), "type", 117);
        setField(term345619, term345619.getClass(), "next", null);
        setField(term345619, term345619.getClass(), "first", null);
        setField(term345619, term345619.getClass(), "last", null);
        setField(term345619, term345619.getClass(), "propListHead", null);
        setIntField(term345619, term345619.getClass(), "sourcePosition", 0);
        setField(term345619, term345619.getClass(), "jsType", null);
        setField(term345619, term345619.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term345430;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term345360, args);
        assertTrue(recursiveEquals(term345360, term345618));
        assertTrue(recursiveEquals(term345430, null));
    }

};


