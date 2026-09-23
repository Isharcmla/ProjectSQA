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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term727489;
     Object term727575;
     Object term727759;
     Object term727851;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term727489 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term727575 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term727667 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term727667, term727667.getClass(), "type", 108);
        setField(term727575, term727575.getClass(), "parent", term727667);
        setIntField(term727575, term727575.getClass(), "type", 0);
        term727759 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term727759, term727759.getClass(), "type", 89);
        term727851 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term727851, term727851.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term727575;
        args[1] = term727759;
        args[2] = term727851;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term727489, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


