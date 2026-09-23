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

public class CheckSideEffects_hotSwapScript_77035414258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26547;
     Object term26617;
     Object term27107;
     Object term27108;

    public CheckSideEffects_hotSwapScript_77035414258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26547 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term26547, term26547.getClass(), "compiler", null);
        term26617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26617, term26617.getClass(), "type", 115);
        setField(term26617, term26617.getClass(), "parent", null);
        setField(term26687, term26687.getClass(), "next", term26757);
        setIntField(term26687, term26687.getClass(), "type", 0);
        setField(term26687, term26687.getClass(), "first", null);
        setField(term26617, term26617.getClass(), "first", term26687);
        term27107 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term27107, term27107.getClass(), "level", null);
        setField(term27107, term27107.getClass(), "problemNodes", null);
        setField(term27107, term27107.getClass(), "compiler", null);
        setBooleanField(term27107, term27107.getClass(), "protectSideEffectFreeCode", false);
        term27108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27108, term27108.getClass(), "type", 115);
        setField(term27108, term27108.getClass(), "next", null);
        setIntField(term27109, term27109.getClass(), "type", 0);
        setIntField(term27110, term27110.getClass(), "type", 0);
        setField(term27110, term27110.getClass(), "next", null);
        setField(term27110, term27110.getClass(), "first", null);
        setField(term27110, term27110.getClass(), "last", null);
        setField(term27110, term27110.getClass(), "propListHead", null);
        setIntField(term27110, term27110.getClass(), "sourcePosition", 0);
        setField(term27110, term27110.getClass(), "jsType", null);
        setField(term27110, term27110.getClass(), "parent", null);
        setField(term27109, term27109.getClass(), "next", term27110);
        setField(term27109, term27109.getClass(), "first", null);
        setField(term27109, term27109.getClass(), "last", null);
        setField(term27109, term27109.getClass(), "propListHead", null);
        setIntField(term27109, term27109.getClass(), "sourcePosition", 0);
        setField(term27109, term27109.getClass(), "jsType", null);
        setField(term27109, term27109.getClass(), "parent", null);
        setField(term27108, term27108.getClass(), "first", term27109);
        setField(term27108, term27108.getClass(), "last", null);
        setField(term27108, term27108.getClass(), "propListHead", null);
        setIntField(term27108, term27108.getClass(), "sourcePosition", 0);
        setField(term27108, term27108.getClass(), "jsType", null);
        setField(term27108, term27108.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term26617;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term26547, args);
        assertTrue(recursiveEquals(term26547, term27107));
        assertTrue(recursiveEquals(term26617, term27108));
    }

};


