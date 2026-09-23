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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3626400;
     Object term3626492;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3626400 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3626492 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3626584 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3626676 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3626768 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3626898 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3626492, term3626492.getClass(), "type", 37);
        setIntField(term3626584, term3626584.getClass(), "type", 35);
        setIntField(term3626768, term3626768.getClass(), "type", 40);
        setField(term3626768, term3626768.getClass(), "str", "lastIndexOf");
        setField(term3626676, term3626676.getClass(), "next", term3626768);
        setIntField(term3626676, term3626676.getClass(), "type", 40);
        setField(term3626584, term3626584.getClass(), "first", term3626676);
        setIntField(term3626898, term3626898.getClass(), "type", 40);
        setField(term3626584, term3626584.getClass(), "next", term3626898);
        setField(term3626492, term3626492.getClass(), "first", term3626584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3626492;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3626400, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


