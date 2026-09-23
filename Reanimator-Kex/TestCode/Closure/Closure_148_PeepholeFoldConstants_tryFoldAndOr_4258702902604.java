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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term739839;
     Object term739925;
     Object term740109;
     Object term740201;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term739839 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term739925 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term740017 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term740017, term740017.getClass(), "type", 114);
        setField(term739925, term739925.getClass(), "parent", term740017);
        setIntField(term739925, term739925.getClass(), "type", 0);
        term740109 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term740109, term740109.getClass(), "type", 97);
        term740201 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term740201, term740201.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term739925;
        args[1] = term740109;
        args[2] = term740201;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term739839, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


