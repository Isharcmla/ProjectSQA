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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493407;
     Object term493499;
     Object term493591;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term493407 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term493499 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term493499, term493499.getClass(), "parent", null);
        setIntField(term493499, term493499.getClass(), "type", 100);
        term493591 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term493591, term493591.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term493499;
        args[1] = term493591;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term493407, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


