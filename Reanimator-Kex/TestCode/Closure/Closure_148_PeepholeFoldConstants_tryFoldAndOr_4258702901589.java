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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401707;
     Object term401793;
     Object term401885;
     Object term401955;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term401707 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term401793 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term401793, term401793.getClass(), "parent", null);
        setIntField(term401793, term401793.getClass(), "type", 0);
        term401885 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term401885, term401885.getClass(), "type", 0);
        term401955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term401955, term401955.getClass(), "type", 64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term401793;
        args[1] = term401885;
        args[2] = term401955;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term401707, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


