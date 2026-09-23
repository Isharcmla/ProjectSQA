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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3632472;
     Object term3632564;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3632472 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3632564 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3632656 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3632748 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3632840 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3633008 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3632656, term3632656.getClass(), "type", 35);
        setIntField(term3632840, term3632840.getClass(), "type", 40);
        setField(term3632840, term3632840.getClass(), "str", "lastIndexOf");
        setField(term3632748, term3632748.getClass(), "next", term3632840);
        setIntField(term3632748, term3632748.getClass(), "type", 40);
        setField(term3632748, term3632748.getClass(), "str", "");
        setField(term3632656, term3632656.getClass(), "first", term3632748);
        setIntField(term3633008, term3633008.getClass(), "type", 44);
        setField(term3633008, term3633008.getClass(), "next", null);
        setField(term3632656, term3632656.getClass(), "next", term3633008);
        setField(term3632564, term3632564.getClass(), "first", term3632656);
        setIntField(term3632564, term3632564.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3632564;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3632472, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


