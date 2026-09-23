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
import java.lang.Object;

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3221234;
     Object term3221326;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3221234 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3221326 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3221418 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3221510 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3221602 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3221672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3221326, term3221326.getClass(), "type", 37);
        setIntField(term3221418, term3221418.getClass(), "type", 35);
        setIntField(term3221602, term3221602.getClass(), "type", 40);
        setField(term3221602, term3221602.getClass(), "str", null);
        setField(term3221510, term3221510.getClass(), "next", term3221602);
        setIntField(term3221510, term3221510.getClass(), "type", 40);
        setField(term3221418, term3221418.getClass(), "first", term3221510);
        setIntField(term3221672, term3221672.getClass(), "type", 39);
        setField(term3221418, term3221418.getClass(), "next", term3221672);
        setField(term3221326, term3221326.getClass(), "first", term3221418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3221326;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3221234, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


