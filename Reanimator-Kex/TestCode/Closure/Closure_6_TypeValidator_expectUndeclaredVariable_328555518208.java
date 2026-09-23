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

public class TypeValidator_expectUndeclaredVariable_328555518208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57844;
     Object term57914;
     Object term57984;
     Object term58066;
     Object term58268;
     Object term58269;
     Object term58270;
     Object term58271;
     Object term58260;

    public TypeValidator_expectUndeclaredVariable_328555518208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57844 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term57914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57914, term57914.getClass(), "type", 148);
        setField(term57914, term57914.getClass(), "propListHead", null);
        term57984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term57984, term57984.getClass(), "propListHead", null);
        term58066 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        term58268 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term58268, term58268.getClass(), "compiler", null);
        setField(term58268, term58268.getClass(), "typeRegistry", null);
        setField(term58268, term58268.getClass(), "allValueTypes", null);
        setBooleanField(term58268, term58268.getClass(), "shouldReport", false);
        setField(term58268, term58268.getClass(), "nullOrUndefined", null);
        setField(term58268, term58268.getClass(), "mismatches", null);
        term58269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58269, term58269.getClass(), "type", 148);
        setField(term58269, term58269.getClass(), "next", null);
        setField(term58269, term58269.getClass(), "first", null);
        setField(term58269, term58269.getClass(), "last", null);
        setField(term58269, term58269.getClass(), "propListHead", null);
        setIntField(term58269, term58269.getClass(), "sourcePosition", 0);
        setField(term58269, term58269.getClass(), "jsType", null);
        setField(term58269, term58269.getClass(), "parent", null);
        term58270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58270, term58270.getClass(), "type", 0);
        setField(term58270, term58270.getClass(), "next", null);
        setField(term58270, term58270.getClass(), "first", null);
        setField(term58270, term58270.getClass(), "last", null);
        setField(term58270, term58270.getClass(), "propListHead", null);
        setIntField(term58270, term58270.getClass(), "sourcePosition", 0);
        setField(term58270, term58270.getClass(), "jsType", null);
        setField(term58270, term58270.getClass(), "parent", null);
        term58271 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        setField(term58271, term58271.getClass(), "name", null);
        setField(term58271, term58271.getClass(), "nameNode", null);
        setField(term58271, term58271.getClass(), "type", null);
        setBooleanField(term58271, term58271.getClass(), "typeInferred", false);
        setField(term58271, term58271.getClass(), "input", null);
        setIntField(term58271, term58271.getClass(), "index", 0);
        setField(term58271, term58271.getClass(), "scope", null);
        setBooleanField(term58271, term58271.getClass(), "markedEscaped", false);
        setBooleanField(term58271, term58271.getClass(), "markedAssignedExactlyOnce", false);
        term58260 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        setField(term58260, term58260.getClass(), "name", null);
        setField(term58260, term58260.getClass(), "nameNode", null);
        setField(term58260, term58260.getClass(), "type", null);
        setBooleanField(term58260, term58260.getClass(), "typeInferred", false);
        setField(term58260, term58260.getClass(), "input", null);
        setIntField(term58260, term58260.getClass(), "index", 0);
        setField(term58260, term58260.getClass(), "scope", null);
        setBooleanField(term58260, term58260.getClass(), "markedEscaped", false);
        setBooleanField(term58260, term58260.getClass(), "markedAssignedExactlyOnce", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CompilerInput");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[4] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = null;
        args[2] = term57914;
        args[3] = term57984;
        args[4] = term58066;
        args[5] = null;
        args[6] = null;
        Object retValue = callMethod(klass, "expectUndeclaredVariable", argTypes, term57844, args);
        assertTrue(recursiveEquals(term57844, term58268));
        assertTrue(recursiveEquals(term57914, term58271));
        assertTrue(recursiveEquals(term57984, null));
        assertTrue(recursiveEquals(term58066, null));
        assertTrue(recursiveEquals(retValue, term58260));
    }

};


