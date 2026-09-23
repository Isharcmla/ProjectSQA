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

public class TypeCheck_checkNoTypeCheckSection_1637574393196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48308;
     Object term48468;
     Object term48507;
     Object term48509;

    public TypeCheck_checkNoTypeCheckSection_1637574393196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48308 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term48398 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term48308, term48308.getClass(), "validator", term48398);
        setIntField(term48308, term48308.getClass(), "noTypeCheckSection", 0);
        term48468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48468, term48468.getClass(), "type", 125);
        setField(term48468, term48468.getClass(), "propListHead", null);
        term48507 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term48508 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term48507, term48507.getClass(), "compiler", null);
        setField(term48508, term48508.getClass(), "compiler", null);
        setField(term48508, term48508.getClass(), "typeRegistry", null);
        setField(term48508, term48508.getClass(), "allValueTypes", null);
        setBooleanField(term48508, term48508.getClass(), "shouldReport", true);
        setField(term48508, term48508.getClass(), "nullOrUndefined", null);
        setField(term48508, term48508.getClass(), "mismatches", null);
        setField(term48507, term48507.getClass(), "validator", term48508);
        setField(term48507, term48507.getClass(), "reverseInterpreter", null);
        setField(term48507, term48507.getClass(), "typeRegistry", null);
        setField(term48507, term48507.getClass(), "topScope", null);
        setField(term48507, term48507.getClass(), "scopeCreator", null);
        setField(term48507, term48507.getClass(), "reportMissingOverride", null);
        setField(term48507, term48507.getClass(), "reportUnknownTypes", null);
        setBooleanField(term48507, term48507.getClass(), "reportMissingProperties", false);
        setField(term48507, term48507.getClass(), "inferJSDocInfo", null);
        setIntField(term48507, term48507.getClass(), "typedCount", 0);
        setIntField(term48507, term48507.getClass(), "nullCount", 0);
        setIntField(term48507, term48507.getClass(), "unknownCount", 0);
        setBooleanField(term48507, term48507.getClass(), "inExterns", false);
        setIntField(term48507, term48507.getClass(), "noTypeCheckSection", 0);
        term48509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48509, term48509.getClass(), "type", 125);
        setField(term48509, term48509.getClass(), "next", null);
        setField(term48509, term48509.getClass(), "first", null);
        setField(term48509, term48509.getClass(), "last", null);
        setField(term48509, term48509.getClass(), "propListHead", null);
        setIntField(term48509, term48509.getClass(), "sourcePosition", 0);
        setField(term48509, term48509.getClass(), "jsType", null);
        setField(term48509, term48509.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term48468;
        args[1] = false;
        callMethod(klass, "checkNoTypeCheckSection", argTypes, term48308, args);
        assertTrue(recursiveEquals(term48308, term48507));
        assertTrue(recursiveEquals(term48468, term48509));
    }

};


