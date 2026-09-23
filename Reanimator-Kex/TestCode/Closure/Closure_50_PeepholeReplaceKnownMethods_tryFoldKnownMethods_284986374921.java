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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3766470;
     Object term3766562;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3766470 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3766562 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3766654 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3766746 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3766838 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3766968 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3766654, term3766654.getClass(), "type", 35);
        setIntField(term3766838, term3766838.getClass(), "type", 40);
        setField(term3766838, term3766838.getClass(), "str", "lastIndexOf");
        setField(term3766746, term3766746.getClass(), "next", term3766838);
        setIntField(term3766746, term3766746.getClass(), "type", 40);
        setField(term3766654, term3766654.getClass(), "first", term3766746);
        setIntField(term3766968, term3766968.getClass(), "type", 44);
        setField(term3766654, term3766654.getClass(), "next", term3766968);
        setField(term3766562, term3766562.getClass(), "first", term3766654);
        setIntField(term3766562, term3766562.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3766562;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3766470, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


