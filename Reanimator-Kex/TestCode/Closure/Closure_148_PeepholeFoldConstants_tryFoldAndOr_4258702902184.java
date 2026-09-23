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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term596049;
     Object term596178;
     Object term596270;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term596049 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term596178 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term596178, term596178.getClass(), "parent", null);
        setIntField(term596178, term596178.getClass(), "type", 0);
        term596270 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term596270, term596270.getClass(), "type", 64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term596178;
        args[1] = term596178;
        args[2] = term596270;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term596049, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


