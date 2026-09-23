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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3654881;
     Object term3654973;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3654881 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3654973 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3655065 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3655157 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3655249 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3655417 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3655065, term3655065.getClass(), "type", 35);
        setIntField(term3655249, term3655249.getClass(), "type", 40);
        setField(term3655249, term3655249.getClass(), "str", "lastIndexOf");
        setField(term3655157, term3655157.getClass(), "next", term3655249);
        setIntField(term3655157, term3655157.getClass(), "type", 40);
        setField(term3655157, term3655157.getClass(), "str", "");
        setField(term3655065, term3655065.getClass(), "first", term3655157);
        setIntField(term3655417, term3655417.getClass(), "type", 44);
        setField(term3655417, term3655417.getClass(), "next", null);
        setField(term3655065, term3655065.getClass(), "next", term3655417);
        setField(term3654973, term3654973.getClass(), "first", term3655065);
        setIntField(term3654973, term3654973.getClass(), "type", 37);
        setField(term3654973, term3654973.getClass(), "parent", term3655157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3654973;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3654881, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


