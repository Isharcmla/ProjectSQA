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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term529017;
     Object term529103;
     Object term529195;
     Object term529281;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term529017 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term529103 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term529103, term529103.getClass(), "parent", null);
        setIntField(term529103, term529103.getClass(), "type", 0);
        term529195 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term529195, term529195.getClass(), "type", 0);
        term529281 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term529281, term529281.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term529103;
        args[1] = term529195;
        args[2] = term529281;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term529017, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


