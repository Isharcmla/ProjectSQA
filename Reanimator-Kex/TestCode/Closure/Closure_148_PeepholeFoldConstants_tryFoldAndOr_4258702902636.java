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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term751431;
     Object term751523;
     Object term751707;
     Object term751799;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term751431 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term751523 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term751615 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term751615, term751615.getClass(), "type", 114);
        setField(term751523, term751523.getClass(), "parent", term751615);
        setIntField(term751523, term751523.getClass(), "type", 0);
        term751707 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term751707, term751707.getClass(), "type", 90);
        term751799 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term751799, term751799.getClass(), "type", 47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term751523;
        args[1] = term751707;
        args[2] = term751799;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term751431, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


