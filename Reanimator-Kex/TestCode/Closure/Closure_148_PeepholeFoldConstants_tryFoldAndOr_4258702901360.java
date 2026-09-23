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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331546;
     Object term331684;
     Object term331770;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term331546 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term331684 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term331684, term331684.getClass(), "parent", null);
        setIntField(term331684, term331684.getClass(), "type", 0);
        term331770 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term331770, term331770.getClass(), "type", 47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term331684;
        args[1] = term331684;
        args[2] = term331770;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term331546, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


