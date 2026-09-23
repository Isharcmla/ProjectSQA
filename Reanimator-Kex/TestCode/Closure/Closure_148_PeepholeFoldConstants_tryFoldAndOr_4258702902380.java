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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660642;
     Object term660728;
     Object term660912;
     Object term661004;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term660642 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term660728 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term660820 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term660820, term660820.getClass(), "type", 108);
        setField(term660728, term660728.getClass(), "parent", term660820);
        setIntField(term660728, term660728.getClass(), "type", 100);
        term660912 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term660912, term660912.getClass(), "type", 35);
        term661004 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term661004, term661004.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term660728;
        args[1] = term660912;
        args[2] = term661004;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term660642, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


