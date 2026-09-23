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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term580734;
     Object term580826;
     Object term580918;
     Object term580988;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term580734 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term580826 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term580826, term580826.getClass(), "parent", null);
        setIntField(term580826, term580826.getClass(), "type", 0);
        term580918 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term580918, term580918.getClass(), "type", 0);
        term580988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term580988, term580988.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term580826;
        args[1] = term580918;
        args[2] = term580988;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term580734, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


