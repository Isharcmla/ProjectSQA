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
import java.lang.Object;

public class PeepholeSubstituteAlternateSyntax_tryFoldSimpleFunctionCall_168184524722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32;
     Object term34;

    public PeepholeSubstituteAlternateSyntax_tryFoldSimpleFunctionCall_168184524722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term32, term32.getClass(), "late", false);
        setField(term32, term32.getClass(), "compiler", null);
        term34 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34, term34.getClass(), "type", 1725571209);
        setIntField(term36, term36.getClass(), "type", -522618178);
        setIntField(term38, term38.getClass(), "type", 1134449235);
        setIntField(term40, term40.getClass(), "type", -883034806);
        setIntField(term42, term42.getClass(), "type", 1585847225);
        setField(term42, term42.getClass(), "next", null);
        setField(term42, term42.getClass(), "first", null);
        setField(term42, term42.getClass(), "last", null);
        setField(term42, term42.getClass(), "propListHead", null);
        setIntField(term42, term42.getClass(), "sourcePosition", 0);
        setField(term42, term42.getClass(), "jsType", null);
        setField(term42, term42.getClass(), "parent", null);
        setField(term40, term40.getClass(), "next", term42);
        setIntField(term45, term45.getClass(), "type", 597278769);
        setField(term45, term45.getClass(), "next", null);
        setField(term45, term45.getClass(), "first", null);
        setField(term45, term45.getClass(), "last", term42);
        setField(term45, term45.getClass(), "propListHead", null);
        setIntField(term45, term45.getClass(), "sourcePosition", 0);
        setField(term45, term45.getClass(), "jsType", null);
        setField(term45, term45.getClass(), "parent", null);
        setField(term40, term40.getClass(), "first", term45);
        setField(term40, term40.getClass(), "last", term38);
        setField(term40, term40.getClass(), "propListHead", null);
        setIntField(term40, term40.getClass(), "sourcePosition", 0);
        setField(term40, term40.getClass(), "jsType", null);
        setField(term40, term40.getClass(), "parent", null);
        setField(term38, term38.getClass(), "next", term40);
        setField(term38, term38.getClass(), "first", term42);
        setIntField(term49, term49.getClass(), "type", -1456670397);
        setIntField(term51, term51.getClass(), "type", 1622346318);
        setField(term51, term51.getClass(), "next", null);
        setField(term51, term51.getClass(), "first", term45);
        setField(term51, term51.getClass(), "last", term40);
        setField(term51, term51.getClass(), "propListHead", null);
        setIntField(term51, term51.getClass(), "sourcePosition", 0);
        setField(term51, term51.getClass(), "jsType", null);
        setField(term51, term51.getClass(), "parent", null);
        setField(term49, term49.getClass(), "next", term51);
        setField(term49, term49.getClass(), "first", term36);
        setField(term49, term49.getClass(), "last", term36);
        setField(term49, term49.getClass(), "propListHead", null);
        setIntField(term49, term49.getClass(), "sourcePosition", 0);
        setField(term49, term49.getClass(), "jsType", null);
        setField(term49, term49.getClass(), "parent", null);
        setField(term38, term38.getClass(), "last", term49);
        setField(term38, term38.getClass(), "propListHead", null);
        setIntField(term38, term38.getClass(), "sourcePosition", 0);
        setField(term38, term38.getClass(), "jsType", null);
        setField(term38, term38.getClass(), "parent", null);
        setField(term36, term36.getClass(), "next", term38);
        setIntField(term56, term56.getClass(), "type", 1048535127);
        setField(term56, term56.getClass(), "next", term49);
        setField(term56, term56.getClass(), "first", term51);
        setField(term56, term56.getClass(), "last", term34);
        setField(term56, term56.getClass(), "propListHead", null);
        setIntField(term56, term56.getClass(), "sourcePosition", 0);
        setField(term56, term56.getClass(), "jsType", null);
        setField(term56, term56.getClass(), "parent", null);
        setField(term36, term36.getClass(), "first", term56);
        setField(term36, term36.getClass(), "last", term56);
        setField(term36, term36.getClass(), "propListHead", null);
        setIntField(term36, term36.getClass(), "sourcePosition", 0);
        setField(term36, term36.getClass(), "jsType", null);
        setField(term36, term36.getClass(), "parent", null);
        setField(term34, term34.getClass(), "next", term36);
        setField(term34, term34.getClass(), "first", term40);
        setField(term34, term34.getClass(), "last", term42);
        setField(term34, term34.getClass(), "propListHead", null);
        setIntField(term34, term34.getClass(), "sourcePosition", 0);
        setField(term34, term34.getClass(), "jsType", null);
        setField(term34, term34.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34;
        try {
            callMethod(klass, "tryFoldSimpleFunctionCall", argTypes, term32, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


