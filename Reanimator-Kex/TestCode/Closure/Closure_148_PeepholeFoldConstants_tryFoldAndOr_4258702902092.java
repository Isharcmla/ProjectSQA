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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566621;
     Object term566713;
     Object term566805;
     Object term566897;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term566621 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term566713 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term566713, term566713.getClass(), "parent", null);
        setIntField(term566713, term566713.getClass(), "type", 0);
        term566805 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term566805, term566805.getClass(), "type", 47);
        term566897 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term566713;
        args[1] = term566805;
        args[2] = term566897;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term566621, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


