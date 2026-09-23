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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340732;
     Object term340824;
     Object term340916;
     Object term341008;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term340732 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term340824 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term340824, term340824.getClass(), "parent", null);
        setIntField(term340824, term340824.getClass(), "type", 0);
        term340916 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term340916, term340916.getClass(), "type", 0);
        term341008 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term341008, term341008.getClass(), "type", 47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term340824;
        args[1] = term340916;
        args[2] = term341008;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term340732, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


