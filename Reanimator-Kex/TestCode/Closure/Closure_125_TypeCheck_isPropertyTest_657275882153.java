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

public class TypeCheck_isPropertyTest_657275882153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36454;
     Object term36524;
     Object term36705;
     Object term36706;

    public TypeCheck_isPropertyTest_657275882153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36454 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term36524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term36524, term36524.getClass(), "parent", term36524);
        term36705 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term36705, term36705.getClass(), "compiler", null);
        setField(term36705, term36705.getClass(), "validator", null);
        setField(term36705, term36705.getClass(), "reverseInterpreter", null);
        setField(term36705, term36705.getClass(), "typeRegistry", null);
        setField(term36705, term36705.getClass(), "topScope", null);
        setField(term36705, term36705.getClass(), "scopeCreator", null);
        setField(term36705, term36705.getClass(), "reportMissingOverride", null);
        setBooleanField(term36705, term36705.getClass(), "reportUnknownTypes", false);
        setBooleanField(term36705, term36705.getClass(), "reportMissingProperties", false);
        setField(term36705, term36705.getClass(), "inferJSDocInfo", null);
        setIntField(term36705, term36705.getClass(), "typedCount", 0);
        setIntField(term36705, term36705.getClass(), "nullCount", 0);
        setIntField(term36705, term36705.getClass(), "unknownCount", 0);
        setBooleanField(term36705, term36705.getClass(), "inExterns", false);
        setIntField(term36705, term36705.getClass(), "noTypeCheckSection", 0);
        setField(term36705, term36705.getClass(), "editDistance", null);
        term36706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36706, term36706.getClass(), "type", 0);
        setField(term36706, term36706.getClass(), "next", null);
        setField(term36706, term36706.getClass(), "first", null);
        setField(term36706, term36706.getClass(), "last", null);
        setField(term36706, term36706.getClass(), "propListHead", null);
        setIntField(term36706, term36706.getClass(), "sourcePosition", 0);
        setField(term36706, term36706.getClass(), "jsType", null);
        setField(term36706, term36706.getClass(), "parent", term36706);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term36524;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term36454, args);
        assertTrue(recursiveEquals(term36454, term36705));
        assertTrue(recursiveEquals(term36524, term36706));
        assertTrue(recursiveEquals(retValue, false));
    }

};


