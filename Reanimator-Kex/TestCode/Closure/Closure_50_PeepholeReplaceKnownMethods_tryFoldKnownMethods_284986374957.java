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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3798837;
     Object term3798929;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3798837 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3798929 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3799021 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3799113 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3799205 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3799367 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3799021, term3799021.getClass(), "type", 35);
        setIntField(term3799205, term3799205.getClass(), "type", 40);
        setField(term3799205, term3799205.getClass(), "str", "indexOf");
        setField(term3799113, term3799113.getClass(), "next", term3799205);
        setIntField(term3799113, term3799113.getClass(), "type", 40);
        setField(term3799113, term3799113.getClass(), "str", "");
        setField(term3799021, term3799021.getClass(), "first", term3799113);
        setIntField(term3799367, term3799367.getClass(), "type", 43);
        setField(term3799367, term3799367.getClass(), "next", null);
        setField(term3799021, term3799021.getClass(), "next", term3799367);
        setField(term3798929, term3798929.getClass(), "first", term3799021);
        setIntField(term3798929, term3798929.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3798929;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3798837, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


