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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3770966;
     Object term3771058;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3770966 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3771058 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3771150 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3771242 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3771334 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3771464 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3771150, term3771150.getClass(), "type", 35);
        setIntField(term3771334, term3771334.getClass(), "type", 40);
        setField(term3771334, term3771334.getClass(), "str", "lastIndexOf");
        setField(term3771242, term3771242.getClass(), "next", term3771334);
        setIntField(term3771242, term3771242.getClass(), "type", 40);
        setField(term3771150, term3771150.getClass(), "first", term3771242);
        setIntField(term3771464, term3771464.getClass(), "type", 43);
        setField(term3771150, term3771150.getClass(), "next", term3771464);
        setField(term3771058, term3771058.getClass(), "first", term3771150);
        setIntField(term3771058, term3771058.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3771058;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3770966, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


