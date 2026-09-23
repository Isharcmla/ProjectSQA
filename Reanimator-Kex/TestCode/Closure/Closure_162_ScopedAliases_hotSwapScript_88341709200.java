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

public class ScopedAliases_hotSwapScript_88341709200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111987;
     Object term112079;

    public ScopedAliases_hotSwapScript_88341709200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111987 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term111987, term111987.getClass(), "compiler", null);
        term112079 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term112079, term112079.getClass(), "type", 37);
        setField(term112079, term112079.getClass(), "parent", null);
        setField(term112079, term112079.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term112079;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term111987, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


