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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3707256;
     Object term3707348;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3707256 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3707348 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3707440 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3707532 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3707624 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3707754 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3707440, term3707440.getClass(), "type", 35);
        setIntField(term3707624, term3707624.getClass(), "type", 40);
        setField(term3707624, term3707624.getClass(), "str", "lastIndexOf");
        setField(term3707532, term3707532.getClass(), "next", term3707624);
        setIntField(term3707532, term3707532.getClass(), "type", 40);
        setField(term3707440, term3707440.getClass(), "first", term3707532);
        setIntField(term3707754, term3707754.getClass(), "type", 41);
        setField(term3707440, term3707440.getClass(), "next", term3707754);
        setField(term3707348, term3707348.getClass(), "first", term3707440);
        setIntField(term3707348, term3707348.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3707348;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3707256, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


