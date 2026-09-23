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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847729;
     Object term847821;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term847729 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term847821 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term847911 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term848003 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term848003, term848003.getClass(), "type", 44);
        setField(term847911, term847911.getClass(), "next", term848003);
        setIntField(term847911, term847911.getClass(), "type", 0);
        setField(term847821, term847821.getClass(), "first", term847911);
        setIntField(term847821, term847821.getClass(), "type", 101);
        setField(term847821, term847821.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term847821;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term847729, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


