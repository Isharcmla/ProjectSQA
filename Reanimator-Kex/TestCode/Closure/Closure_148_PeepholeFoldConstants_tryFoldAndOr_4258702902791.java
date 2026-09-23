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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term807250;
     Object term807342;
     Object term807526;
     Object term807618;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term807250 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term807342 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term807434 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term807434, term807434.getClass(), "type", 113);
        setField(term807342, term807342.getClass(), "parent", term807434);
        setIntField(term807342, term807342.getClass(), "type", 0);
        term807526 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term807526, term807526.getClass(), "type", 97);
        term807618 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term807618, term807618.getClass(), "type", 47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term807342;
        args[1] = term807526;
        args[2] = term807618;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term807250, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


