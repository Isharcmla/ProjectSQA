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

public class TypeCheck_checkNoTypeCheckSection_1637574393240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59107;
     Object term59267;
     Object term59290;
     Object term59292;

    public TypeCheck_checkNoTypeCheckSection_1637574393240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59107 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term59197 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term59107, term59107.getClass(), "validator", term59197);
        setIntField(term59107, term59107.getClass(), "noTypeCheckSection", 0);
        term59267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59267, term59267.getClass(), "type", 118);
        setField(term59267, term59267.getClass(), "propListHead", null);
        term59290 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term59291 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term59290, term59290.getClass(), "compiler", null);
        setField(term59291, term59291.getClass(), "compiler", null);
        setField(term59291, term59291.getClass(), "typeRegistry", null);
        setField(term59291, term59291.getClass(), "allValueTypes", null);
        setBooleanField(term59291, term59291.getClass(), "shouldReport", true);
        setField(term59291, term59291.getClass(), "nullOrUndefined", null);
        setField(term59291, term59291.getClass(), "mismatches", null);
        setField(term59290, term59290.getClass(), "validator", term59291);
        setField(term59290, term59290.getClass(), "reverseInterpreter", null);
        setField(term59290, term59290.getClass(), "typeRegistry", null);
        setField(term59290, term59290.getClass(), "topScope", null);
        setField(term59290, term59290.getClass(), "scopeCreator", null);
        setField(term59290, term59290.getClass(), "reportMissingOverride", null);
        setField(term59290, term59290.getClass(), "reportUnknownTypes", null);
        setBooleanField(term59290, term59290.getClass(), "reportMissingProperties", false);
        setField(term59290, term59290.getClass(), "inferJSDocInfo", null);
        setIntField(term59290, term59290.getClass(), "typedCount", 0);
        setIntField(term59290, term59290.getClass(), "nullCount", 0);
        setIntField(term59290, term59290.getClass(), "unknownCount", 0);
        setBooleanField(term59290, term59290.getClass(), "inExterns", false);
        setIntField(term59290, term59290.getClass(), "noTypeCheckSection", 0);
        term59292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59292, term59292.getClass(), "type", 118);
        setField(term59292, term59292.getClass(), "next", null);
        setField(term59292, term59292.getClass(), "first", null);
        setField(term59292, term59292.getClass(), "last", null);
        setField(term59292, term59292.getClass(), "propListHead", null);
        setIntField(term59292, term59292.getClass(), "sourcePosition", 0);
        setField(term59292, term59292.getClass(), "jsType", null);
        setField(term59292, term59292.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term59267;
        args[1] = false;
        callMethod(klass, "checkNoTypeCheckSection", argTypes, term59107, args);
        assertTrue(recursiveEquals(term59107, term59290));
        assertTrue(recursiveEquals(term59267, term59292));
    }

};


