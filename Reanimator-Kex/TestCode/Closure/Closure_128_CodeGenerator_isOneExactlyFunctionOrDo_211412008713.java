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
import java.util.HashMap;
import java.lang.Object;

public class CodeGenerator_isOneExactlyFunctionOrDo_211412008713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6331;
     Object term6344;

    public CodeGenerator_isOneExactlyFunctionOrDo_211412008713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6332 = new HashMap();
        term6331 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term6331, term6331.getClass(), "ESCAPED_JS_STRINGS", term6332);
        setField(term6331, term6331.getClass(), "cc", null);
        setField(term6331, term6331.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term6331, term6331.getClass(), "preferSingleQuotes", true);
        setBooleanField(term6331, term6331.getClass(), "trustedStrings", true);
        term6344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6344, term6344.getClass(), "type", 2055867847);
        setIntField(term6346, term6346.getClass(), "type", -1048298087);
        setIntField(term6348, term6348.getClass(), "type", 292681826);
        setIntField(term6350, term6350.getClass(), "type", 458147407);
        setIntField(term6352, term6352.getClass(), "type", -184153539);
        setField(term6352, term6352.getClass(), "next", null);
        setField(term6352, term6352.getClass(), "first", null);
        setField(term6352, term6352.getClass(), "last", null);
        setField(term6352, term6352.getClass(), "propListHead", null);
        setIntField(term6352, term6352.getClass(), "sourcePosition", 0);
        setField(term6352, term6352.getClass(), "jsType", null);
        setField(term6352, term6352.getClass(), "parent", null);
        setField(term6350, term6350.getClass(), "next", term6352);
        setIntField(term6355, term6355.getClass(), "type", 493620644);
        setField(term6355, term6355.getClass(), "next", null);
        setField(term6355, term6355.getClass(), "first", null);
        setField(term6355, term6355.getClass(), "last", term6352);
        setField(term6355, term6355.getClass(), "propListHead", null);
        setIntField(term6355, term6355.getClass(), "sourcePosition", 0);
        setField(term6355, term6355.getClass(), "jsType", null);
        setField(term6355, term6355.getClass(), "parent", null);
        setField(term6350, term6350.getClass(), "first", term6355);
        setField(term6350, term6350.getClass(), "last", term6348);
        setField(term6350, term6350.getClass(), "propListHead", null);
        setIntField(term6350, term6350.getClass(), "sourcePosition", 0);
        setField(term6350, term6350.getClass(), "jsType", null);
        setField(term6350, term6350.getClass(), "parent", null);
        setField(term6348, term6348.getClass(), "next", term6350);
        setField(term6348, term6348.getClass(), "first", term6352);
        setIntField(term6359, term6359.getClass(), "type", 1596070772);
        setIntField(term6361, term6361.getClass(), "type", 97029295);
        setField(term6361, term6361.getClass(), "next", null);
        setField(term6361, term6361.getClass(), "first", term6355);
        setField(term6361, term6361.getClass(), "last", term6350);
        setField(term6361, term6361.getClass(), "propListHead", null);
        setIntField(term6361, term6361.getClass(), "sourcePosition", 0);
        setField(term6361, term6361.getClass(), "jsType", null);
        setField(term6361, term6361.getClass(), "parent", null);
        setField(term6359, term6359.getClass(), "next", term6361);
        setField(term6359, term6359.getClass(), "first", term6346);
        setField(term6359, term6359.getClass(), "last", term6346);
        setField(term6359, term6359.getClass(), "propListHead", null);
        setIntField(term6359, term6359.getClass(), "sourcePosition", 0);
        setField(term6359, term6359.getClass(), "jsType", null);
        setField(term6359, term6359.getClass(), "parent", null);
        setField(term6348, term6348.getClass(), "last", term6359);
        setField(term6348, term6348.getClass(), "propListHead", null);
        setIntField(term6348, term6348.getClass(), "sourcePosition", 0);
        setField(term6348, term6348.getClass(), "jsType", null);
        setField(term6348, term6348.getClass(), "parent", null);
        setField(term6346, term6346.getClass(), "next", term6348);
        setIntField(term6366, term6366.getClass(), "type", -1371869594);
        setField(term6366, term6366.getClass(), "next", term6359);
        setField(term6366, term6366.getClass(), "first", term6361);
        setField(term6366, term6366.getClass(), "last", term6344);
        setField(term6366, term6366.getClass(), "propListHead", null);
        setIntField(term6366, term6366.getClass(), "sourcePosition", 0);
        setField(term6366, term6366.getClass(), "jsType", null);
        setField(term6366, term6366.getClass(), "parent", null);
        setField(term6346, term6346.getClass(), "first", term6366);
        setField(term6346, term6346.getClass(), "last", term6366);
        setField(term6346, term6346.getClass(), "propListHead", null);
        setIntField(term6346, term6346.getClass(), "sourcePosition", 0);
        setField(term6346, term6346.getClass(), "jsType", null);
        setField(term6346, term6346.getClass(), "parent", null);
        setField(term6344, term6344.getClass(), "next", term6346);
        setField(term6344, term6344.getClass(), "first", term6350);
        setField(term6344, term6344.getClass(), "last", term6352);
        setField(term6344, term6344.getClass(), "propListHead", null);
        setIntField(term6344, term6344.getClass(), "sourcePosition", 0);
        setField(term6344, term6344.getClass(), "jsType", null);
        setField(term6344, term6344.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term6344;
        callMethod(klass, "isOneExactlyFunctionOrDo", argTypes, term6331, args);
    }

};


