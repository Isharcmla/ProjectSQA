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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2638307;
     Object term2638399;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2638307 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2638399 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2638491 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2638583 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term2638491, term2638491.getClass(), "type", 35);
        setField(term2638583, term2638583.getClass(), "next", term2638583);
        setIntField(term2638583, term2638583.getClass(), "type", 40);
        setField(term2638491, term2638491.getClass(), "first", term2638583);
        setField(term2638399, term2638399.getClass(), "first", term2638491);
        setIntField(term2638399, term2638399.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2638399;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term2638307, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


