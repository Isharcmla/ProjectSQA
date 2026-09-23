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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3570528;
     Object term3570620;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3570528 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3570620 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3570712 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3570804 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3570934 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3570712, term3570712.getClass(), "type", 35);
        setField(term3570804, term3570804.getClass(), "next", term3570804);
        setIntField(term3570804, term3570804.getClass(), "type", 40);
        setField(term3570804, term3570804.getClass(), "str", "indexOf");
        setField(term3570712, term3570712.getClass(), "first", term3570804);
        setIntField(term3570934, term3570934.getClass(), "type", 43);
        setField(term3570712, term3570712.getClass(), "next", term3570934);
        setField(term3570620, term3570620.getClass(), "first", term3570712);
        setIntField(term3570620, term3570620.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3570620;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3570528, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


