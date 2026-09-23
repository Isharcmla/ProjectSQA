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

public class TypeCheck_checkNoTypeCheckSection_1637574393248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70966;
     Object term71126;
     Object term71405;
     Object term71407;

    public TypeCheck_checkNoTypeCheckSection_1637574393248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70966 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term71056 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term70966, term70966.getClass(), "validator", term71056);
        setIntField(term70966, term70966.getClass(), "noTypeCheckSection", 0);
        term71126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term71126, term71126.getClass(), "type", 86);
        setField(term71126, term71126.getClass(), "propListHead", null);
        term71405 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term71406 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term71405, term71405.getClass(), "compiler", null);
        setField(term71406, term71406.getClass(), "compiler", null);
        setField(term71406, term71406.getClass(), "typeRegistry", null);
        setField(term71406, term71406.getClass(), "allValueTypes", null);
        setBooleanField(term71406, term71406.getClass(), "shouldReport", true);
        setField(term71406, term71406.getClass(), "nullOrUndefined", null);
        setField(term71406, term71406.getClass(), "mismatches", null);
        setField(term71405, term71405.getClass(), "validator", term71406);
        setField(term71405, term71405.getClass(), "reverseInterpreter", null);
        setField(term71405, term71405.getClass(), "typeRegistry", null);
        setField(term71405, term71405.getClass(), "topScope", null);
        setField(term71405, term71405.getClass(), "scopeCreator", null);
        setField(term71405, term71405.getClass(), "reportMissingOverride", null);
        setField(term71405, term71405.getClass(), "reportUnknownTypes", null);
        setBooleanField(term71405, term71405.getClass(), "reportMissingProperties", false);
        setField(term71405, term71405.getClass(), "inferJSDocInfo", null);
        setIntField(term71405, term71405.getClass(), "typedCount", 0);
        setIntField(term71405, term71405.getClass(), "nullCount", 0);
        setIntField(term71405, term71405.getClass(), "unknownCount", 0);
        setBooleanField(term71405, term71405.getClass(), "inExterns", false);
        setIntField(term71405, term71405.getClass(), "noTypeCheckSection", 0);
        term71407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term71407, term71407.getClass(), "type", 86);
        setField(term71407, term71407.getClass(), "next", null);
        setField(term71407, term71407.getClass(), "first", null);
        setField(term71407, term71407.getClass(), "last", null);
        setField(term71407, term71407.getClass(), "propListHead", null);
        setIntField(term71407, term71407.getClass(), "sourcePosition", 0);
        setField(term71407, term71407.getClass(), "jsType", null);
        setField(term71407, term71407.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term71126;
        args[1] = false;
        callMethod(klass, "checkNoTypeCheckSection", argTypes, term70966, args);
        assertTrue(recursiveEquals(term70966, term71405));
        assertTrue(recursiveEquals(term71126, term71407));
    }

};


