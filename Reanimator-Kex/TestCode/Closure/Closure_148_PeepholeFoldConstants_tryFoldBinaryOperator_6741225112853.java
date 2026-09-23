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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term830567;
     Object term830659;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term830567 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term830659 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term830729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term830821 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term830821, term830821.getClass(), "type", 47);
        setField(term830729, term830729.getClass(), "next", term830821);
        setIntField(term830729, term830729.getClass(), "type", 0);
        setField(term830659, term830659.getClass(), "first", term830729);
        setIntField(term830659, term830659.getClass(), "type", 101);
        setField(term830659, term830659.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term830659;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term830567, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


