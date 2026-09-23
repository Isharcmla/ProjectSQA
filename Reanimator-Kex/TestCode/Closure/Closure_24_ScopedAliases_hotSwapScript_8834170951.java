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

public class ScopedAliases_hotSwapScript_8834170951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57313;
     Object term57383;
     Object term57603;
     Object term57604;

    public ScopedAliases_hotSwapScript_8834170951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57313 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term57313, term57313.getClass(), "compiler", null);
        term57383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57383, term57383.getClass(), "type", 105);
        setField(term57383, term57383.getClass(), "parent", null);
        term57603 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term57603, term57603.getClass(), "compiler", null);
        setField(term57603, term57603.getClass(), "preprocessorSymbolTable", null);
        setField(term57603, term57603.getClass(), "transformationHandler", null);
        term57604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57604, term57604.getClass(), "type", 105);
        setField(term57604, term57604.getClass(), "next", null);
        setField(term57604, term57604.getClass(), "first", null);
        setField(term57604, term57604.getClass(), "last", null);
        setField(term57604, term57604.getClass(), "propListHead", null);
        setIntField(term57604, term57604.getClass(), "sourcePosition", 0);
        setField(term57604, term57604.getClass(), "jsType", null);
        setField(term57604, term57604.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term57383;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term57313, args);
        assertTrue(recursiveEquals(term57313, term57603));
        assertTrue(recursiveEquals(term57383, term57604));
    }

};


