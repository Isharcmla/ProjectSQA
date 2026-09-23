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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term887717;
     Object term887809;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term887717 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term887809 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term887901 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term887993 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term887993, term887993.getClass(), "type", 44);
        setField(term887901, term887901.getClass(), "next", term887993);
        setIntField(term887901, term887901.getClass(), "type", 0);
        setField(term887809, term887809.getClass(), "first", term887901);
        setIntField(term887809, term887809.getClass(), "type", 100);
        setField(term887809, term887809.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term887809;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term887717, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


