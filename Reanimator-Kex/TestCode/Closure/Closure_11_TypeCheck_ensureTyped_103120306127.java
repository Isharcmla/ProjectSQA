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

public class TypeCheck_ensureTyped_103120306127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29300;
     Object term29370;
     Object term30051;
     Object term30052;

    public TypeCheck_ensureTyped_103120306127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29300 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term29370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term30051 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term30051, term30051.getClass(), "compiler", null);
        setField(term30051, term30051.getClass(), "validator", null);
        setField(term30051, term30051.getClass(), "reverseInterpreter", null);
        setField(term30051, term30051.getClass(), "typeRegistry", null);
        setField(term30051, term30051.getClass(), "topScope", null);
        setField(term30051, term30051.getClass(), "scopeCreator", null);
        setField(term30051, term30051.getClass(), "reportMissingOverride", null);
        setField(term30051, term30051.getClass(), "reportUnknownTypes", null);
        setBooleanField(term30051, term30051.getClass(), "reportMissingProperties", false);
        setField(term30051, term30051.getClass(), "inferJSDocInfo", null);
        setIntField(term30051, term30051.getClass(), "typedCount", 0);
        setIntField(term30051, term30051.getClass(), "nullCount", 0);
        setIntField(term30051, term30051.getClass(), "unknownCount", 0);
        setBooleanField(term30051, term30051.getClass(), "inExterns", false);
        setIntField(term30051, term30051.getClass(), "noTypeCheckSection", 0);
        term30052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30052, term30052.getClass(), "type", 0);
        setField(term30052, term30052.getClass(), "next", null);
        setField(term30052, term30052.getClass(), "first", null);
        setField(term30052, term30052.getClass(), "last", null);
        setField(term30052, term30052.getClass(), "propListHead", null);
        setIntField(term30052, term30052.getClass(), "sourcePosition", 0);
        setField(term30052, term30052.getClass(), "jsType", null);
        setField(term30052, term30052.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term29370;
        args[2] = null;
        callMethod(klass, "ensureTyped", argTypes, term29300, args);
        assertTrue(recursiveEquals(term29300, term30051));
        assertTrue(recursiveEquals(term29370, null));
    }

};


