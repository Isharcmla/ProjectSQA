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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldAndOr_4258702902640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term753215;
     Object term753307;
     Object term753539;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term753215 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term753307 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term753377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term753447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term753307, term753307.getClass(), "parent", null);
        setIntField(term753307, term753307.getClass(), "type", 100);
        setField(term753377, term753377.getClass(), "next", term753447);
        setField(term753307, term753307.getClass(), "first", term753377);
        term753539 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term753539, term753539.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term753307;
        args[1] = term753539;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term753215, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


