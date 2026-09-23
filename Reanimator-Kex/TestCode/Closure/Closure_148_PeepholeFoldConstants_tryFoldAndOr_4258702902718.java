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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term779961;
     Object term780053;
     Object term780399;
     Object term780434;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term779961 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term780053 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term780145 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term780434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term780480 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term780053, term780053.getClass(), "parent", term780145);
        setIntField(term780053, term780053.getClass(), "type", 0);
        setField(term780434, term780434.getClass(), "next", term780480);
        setField(term780434, term780434.getClass(), "parent", null);
        setField(term780053, term780053.getClass(), "first", term780434);
        setField(term780053, term780053.getClass(), "last", null);
        term780399 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term780399, term780399.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term780053;
        args[1] = term780399;
        args[2] = term780434;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term779961, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


