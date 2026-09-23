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

public class TypeCheck_ensureTyped_103120306137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40087;
     Object term40157;
     Object term40379;
     Object term40380;

    public TypeCheck_ensureTyped_103120306137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40087 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term40157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40253 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term40349 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term40157, term40157.getClass(), "type", -106);
        setIntField(term40253, term40253.getClass(), "type", -30);
        setField(term40253, term40253.getClass(), "next", term40349);
        setField(term40157, term40157.getClass(), "propListHead", term40253);
        term40379 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term40379, term40379.getClass(), "compiler", null);
        setField(term40379, term40379.getClass(), "validator", null);
        setField(term40379, term40379.getClass(), "reverseInterpreter", null);
        setField(term40379, term40379.getClass(), "typeRegistry", null);
        setField(term40379, term40379.getClass(), "topScope", null);
        setField(term40379, term40379.getClass(), "scopeCreator", null);
        setField(term40379, term40379.getClass(), "reportMissingOverride", null);
        setField(term40379, term40379.getClass(), "reportUnknownTypes", null);
        setBooleanField(term40379, term40379.getClass(), "reportMissingProperties", false);
        setField(term40379, term40379.getClass(), "inferJSDocInfo", null);
        setIntField(term40379, term40379.getClass(), "typedCount", 0);
        setIntField(term40379, term40379.getClass(), "nullCount", 0);
        setIntField(term40379, term40379.getClass(), "unknownCount", 0);
        setBooleanField(term40379, term40379.getClass(), "inExterns", false);
        setIntField(term40379, term40379.getClass(), "noTypeCheckSection", 0);
        term40380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40381 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term40382 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term40380, term40380.getClass(), "type", -106);
        setField(term40380, term40380.getClass(), "next", null);
        setField(term40380, term40380.getClass(), "first", null);
        setField(term40380, term40380.getClass(), "last", null);
        setField(term40382, term40382.getClass(), "next", null);
        setIntField(term40382, term40382.getClass(), "type", 0);
        setIntField(term40382, term40382.getClass(), "intValue", 0);
        setField(term40382, term40382.getClass(), "objectValue", null);
        setField(term40381, term40381.getClass(), "next", term40382);
        setIntField(term40381, term40381.getClass(), "type", -30);
        setIntField(term40381, term40381.getClass(), "intValue", 0);
        setField(term40381, term40381.getClass(), "objectValue", null);
        setField(term40380, term40380.getClass(), "propListHead", term40381);
        setIntField(term40380, term40380.getClass(), "sourcePosition", 0);
        setField(term40380, term40380.getClass(), "jsType", null);
        setField(term40380, term40380.getClass(), "parent", null);
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
        args[1] = term40157;
        args[2] = null;
        callMethod(klass, "ensureTyped", argTypes, term40087, args);
        assertTrue(recursiveEquals(term40087, term40379));
        assertTrue(recursiveEquals(term40157, null));
    }

};


