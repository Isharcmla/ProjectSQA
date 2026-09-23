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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term524802;
     Object term524894;
     Object term524980;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term524802 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term524894 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term524894, term524894.getClass(), "parent", null);
        setIntField(term524894, term524894.getClass(), "type", 100);
        term524980 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term524980, term524980.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term524894;
        args[1] = term524980;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term524802, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


