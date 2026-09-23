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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldAndOr_4258702902611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term741979;
     Object term742071;
     Object term742255;
     Object term742325;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term741979 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term742071 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term742163 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term742071, term742071.getClass(), "parent", null);
        setIntField(term742071, term742071.getClass(), "type", 0);
        setField(term742071, term742071.getClass(), "first", term742163);
        term742255 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term742255, term742255.getClass(), "type", 44);
        term742325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term742071;
        args[1] = term742255;
        args[2] = term742325;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term741979, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


