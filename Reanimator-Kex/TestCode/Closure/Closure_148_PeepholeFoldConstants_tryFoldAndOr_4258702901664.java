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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426954;
     Object term427046;
     Object term427132;
     Object term427224;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term426954 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term427046 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term427046, term427046.getClass(), "parent", null);
        setIntField(term427046, term427046.getClass(), "type", 0);
        term427132 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term427132, term427132.getClass(), "type", 0);
        term427224 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term427224, term427224.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term427046;
        args[1] = term427132;
        args[2] = term427224;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term426954, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


