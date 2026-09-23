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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term461310;
     Object term461396;
     Object term461482;
     Object term461568;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term461310 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term461396 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term461396, term461396.getClass(), "parent", null);
        setIntField(term461396, term461396.getClass(), "type", 0);
        term461482 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term461482, term461482.getClass(), "type", 0);
        term461568 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term461568, term461568.getClass(), "type", 47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term461396;
        args[1] = term461482;
        args[2] = term461568;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term461310, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


