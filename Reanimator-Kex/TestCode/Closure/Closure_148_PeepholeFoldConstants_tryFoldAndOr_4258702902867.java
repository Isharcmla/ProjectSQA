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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term834420;
     Object term834506;
     Object term834598;
     Object term834690;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term834420 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term834506 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term834506, term834506.getClass(), "parent", null);
        setIntField(term834506, term834506.getClass(), "type", 0);
        term834598 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term834598, term834598.getClass(), "type", 0);
        term834690 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term834690, term834690.getClass(), "type", 47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term834506;
        args[1] = term834598;
        args[2] = term834690;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term834420, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


