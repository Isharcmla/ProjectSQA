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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3812335;
     Object term3812427;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3812335 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3812427 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3812519 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3812611 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3812703 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3812871 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3812963 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3812519, term3812519.getClass(), "type", 35);
        setIntField(term3812703, term3812703.getClass(), "type", 40);
        setField(term3812703, term3812703.getClass(), "str", "indexOf");
        setField(term3812611, term3812611.getClass(), "next", term3812703);
        setIntField(term3812611, term3812611.getClass(), "type", 40);
        setField(term3812611, term3812611.getClass(), "str", "");
        setField(term3812519, term3812519.getClass(), "first", term3812611);
        setIntField(term3812871, term3812871.getClass(), "type", 44);
        setField(term3812963, term3812963.getClass(), "next", null);
        setIntField(term3812963, term3812963.getClass(), "type", 39);
        setField(term3812871, term3812871.getClass(), "next", term3812963);
        setField(term3812519, term3812519.getClass(), "next", term3812871);
        setField(term3812427, term3812427.getClass(), "first", term3812519);
        setIntField(term3812427, term3812427.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3812427;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3812335, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


