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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3662387;
     Object term3662479;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3662387 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3662479 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3662571 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3662663 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3662755 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3662885 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3662571, term3662571.getClass(), "type", 35);
        setIntField(term3662755, term3662755.getClass(), "type", 40);
        setField(term3662755, term3662755.getClass(), "str", "lastIndexOf");
        setField(term3662663, term3662663.getClass(), "next", term3662755);
        setIntField(term3662663, term3662663.getClass(), "type", 40);
        setField(term3662571, term3662571.getClass(), "first", term3662663);
        setIntField(term3662885, term3662885.getClass(), "type", 43);
        setField(term3662571, term3662571.getClass(), "next", term3662885);
        setField(term3662479, term3662479.getClass(), "first", term3662571);
        setIntField(term3662479, term3662479.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3662479;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3662387, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


