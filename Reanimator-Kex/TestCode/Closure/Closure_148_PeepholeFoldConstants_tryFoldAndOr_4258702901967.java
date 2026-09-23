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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term524354;
     Object term524446;
     Object term524532;
     Object term524618;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term524354 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term524446 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term524446, term524446.getClass(), "parent", null);
        setIntField(term524446, term524446.getClass(), "type", 0);
        term524532 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term524532, term524532.getClass(), "type", 44);
        term524618 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term524446;
        args[1] = term524532;
        args[2] = term524618;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term524354, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


