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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ScopedAliases_hotSwapScript_88341709176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99589;
     Object term99659;

    public ScopedAliases_hotSwapScript_88341709176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99589 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term99589, term99589.getClass(), "compiler", null);
        term99659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term99659, term99659.getClass(), "type", 0);
        setField(term99659, term99659.getClass(), "parent", null);
        setField(term99799, term99799.getClass(), "next", term99869);
        setIntField(term99799, term99799.getClass(), "type", 37);
        setField(term99799, term99799.getClass(), "first", null);
        setField(term99729, term99729.getClass(), "next", term99799);
        setIntField(term99729, term99729.getClass(), "type", 0);
        setField(term99729, term99729.getClass(), "first", null);
        setField(term99659, term99659.getClass(), "first", term99729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term99659;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term99589, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


