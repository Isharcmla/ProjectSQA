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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487460;
     Object term487552;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term487460 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term487552 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term487642 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term487712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term487712, term487712.getClass(), "type", 47);
        setField(term487642, term487642.getClass(), "next", term487712);
        setIntField(term487642, term487642.getClass(), "type", 0);
        setField(term487552, term487552.getClass(), "first", term487642);
        setIntField(term487552, term487552.getClass(), "type", 101);
        setField(term487552, term487552.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term487552;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term487460, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


