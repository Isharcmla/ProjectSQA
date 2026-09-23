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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term441830;
     Object term441922;
     Object term442014;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term441830 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term441922 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term441922, term441922.getClass(), "parent", null);
        setIntField(term441922, term441922.getClass(), "type", 100);
        term442014 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term442014, term442014.getClass(), "type", 47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term441922;
        args[1] = term442014;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term441830, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


