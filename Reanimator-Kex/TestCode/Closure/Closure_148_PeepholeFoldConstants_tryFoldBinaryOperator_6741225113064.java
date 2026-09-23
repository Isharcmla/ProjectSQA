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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term903704;
     Object term903796;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term903704 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term903796 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term903888 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term903980 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term904072 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term903980, term903980.getClass(), "type", 44);
        setField(term903888, term903888.getClass(), "next", term903980);
        setIntField(term903888, term903888.getClass(), "type", 0);
        setField(term903796, term903796.getClass(), "first", term903888);
        setIntField(term903796, term903796.getClass(), "type", 101);
        setIntField(term904072, term904072.getClass(), "type", 98);
        setField(term904072, term904072.getClass(), "first", term903796);
        setField(term903796, term903796.getClass(), "parent", term904072);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term903796;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term903704, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


