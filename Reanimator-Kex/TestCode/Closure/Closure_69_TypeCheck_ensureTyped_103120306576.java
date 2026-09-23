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

public class TypeCheck_ensureTyped_103120306576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178913;
     Object term178983;
     Object term179106;
     Object term179107;

    public TypeCheck_ensureTyped_103120306576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178913 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term178983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term179079 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term178983, term178983.getClass(), "type", -106);
        setIntField(term179079, term179079.getClass(), "type", 29);
        setField(term178983, term178983.getClass(), "propListHead", term179079);
        term179106 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term179106, term179106.getClass(), "compiler", null);
        setField(term179106, term179106.getClass(), "validator", null);
        setField(term179106, term179106.getClass(), "reverseInterpreter", null);
        setField(term179106, term179106.getClass(), "typeRegistry", null);
        setField(term179106, term179106.getClass(), "topScope", null);
        setField(term179106, term179106.getClass(), "scopeCreator", null);
        setField(term179106, term179106.getClass(), "reportMissingOverride", null);
        setField(term179106, term179106.getClass(), "reportUnknownTypes", null);
        setBooleanField(term179106, term179106.getClass(), "reportMissingProperties", false);
        setField(term179106, term179106.getClass(), "inferJSDocInfo", null);
        setIntField(term179106, term179106.getClass(), "typedCount", 0);
        setIntField(term179106, term179106.getClass(), "nullCount", 0);
        setIntField(term179106, term179106.getClass(), "unknownCount", 0);
        setBooleanField(term179106, term179106.getClass(), "inExterns", false);
        setIntField(term179106, term179106.getClass(), "noTypeCheckSection", 0);
        term179107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term179108 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term179107, term179107.getClass(), "type", -106);
        setField(term179107, term179107.getClass(), "next", null);
        setField(term179107, term179107.getClass(), "first", null);
        setField(term179107, term179107.getClass(), "last", null);
        setField(term179108, term179108.getClass(), "next", null);
        setIntField(term179108, term179108.getClass(), "type", 29);
        setIntField(term179108, term179108.getClass(), "intValue", 0);
        setField(term179108, term179108.getClass(), "objectValue", null);
        setField(term179107, term179107.getClass(), "propListHead", term179108);
        setIntField(term179107, term179107.getClass(), "sourcePosition", 0);
        setField(term179107, term179107.getClass(), "jsType", null);
        setField(term179107, term179107.getClass(), "parent", null);
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
        args[1] = term178983;
        args[2] = null;
        callMethod(klass, "ensureTyped", argTypes, term178913, args);
        assertTrue(recursiveEquals(term178913, term179106));
        assertTrue(recursiveEquals(term178983, null));
    }

};


