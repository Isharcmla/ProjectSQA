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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3612670;
     Object term3612762;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3612670 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3612762 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3612854 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3612946 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3613038 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3613206 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3613298 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3612854, term3612854.getClass(), "type", 35);
        setIntField(term3613038, term3613038.getClass(), "type", 40);
        setField(term3613038, term3613038.getClass(), "str", "substring");
        setField(term3612946, term3612946.getClass(), "next", term3613038);
        setIntField(term3612946, term3612946.getClass(), "type", 40);
        setField(term3612946, term3612946.getClass(), "str", "");
        setField(term3612854, term3612854.getClass(), "first", term3612946);
        setIntField(term3613206, term3613206.getClass(), "type", 39);
        setDoubleField(term3613206, term3613206.getClass(), "number", 0.0);
        setIntField(term3613298, term3613298.getClass(), "type", 39);
        setField(term3613206, term3613206.getClass(), "next", term3613298);
        setField(term3612854, term3612854.getClass(), "next", term3613206);
        setField(term3612762, term3612762.getClass(), "first", term3612854);
        setIntField(term3612762, term3612762.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3612762;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3612670, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


