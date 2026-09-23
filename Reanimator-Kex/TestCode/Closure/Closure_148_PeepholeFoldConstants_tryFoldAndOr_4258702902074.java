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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559853;
     Object term559991;
     Object term560077;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term559853 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term559991 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term559991, term559991.getClass(), "parent", null);
        setIntField(term559991, term559991.getClass(), "type", 0);
        term560077 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term560077, term560077.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term559991;
        args[1] = term559991;
        args[2] = term560077;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term559853, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


