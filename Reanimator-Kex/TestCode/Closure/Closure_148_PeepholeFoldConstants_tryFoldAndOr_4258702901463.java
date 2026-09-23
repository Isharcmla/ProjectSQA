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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362278;
     Object term362416;
     Object term362508;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term362278 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term362416 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term362416, term362416.getClass(), "parent", null);
        setIntField(term362416, term362416.getClass(), "type", 0);
        term362508 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term362508, term362508.getClass(), "type", 64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term362416;
        args[1] = term362416;
        args[2] = term362508;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term362278, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


