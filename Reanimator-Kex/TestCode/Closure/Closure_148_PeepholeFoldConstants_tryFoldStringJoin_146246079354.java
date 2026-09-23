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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class PeepholeFoldConstants_tryFoldStringJoin_146246079354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9315;
     Object term9385;
     Object term9420;
     Object term9421;
     Object term9404;

    public PeepholeFoldConstants_tryFoldStringJoin_146246079354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9315 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term9385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term9385, term9385.getClass(), "first", term9385);
        setField(term9385, term9385.getClass(), "next", term9385);
        term9420 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term9420, term9420.getClass(), "currentTraversal", null);
        term9421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9421, term9421.getClass(), "type", 0);
        setField(term9421, term9421.getClass(), "next", term9421);
        setField(term9421, term9421.getClass(), "first", term9421);
        setField(term9421, term9421.getClass(), "last", null);
        setField(term9421, term9421.getClass(), "propListHead", null);
        setIntField(term9421, term9421.getClass(), "sourcePosition", 0);
        setField(term9421, term9421.getClass(), "jsType", null);
        setField(term9421, term9421.getClass(), "parent", null);
        term9404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9404, term9404.getClass(), "type", 0);
        setField(term9404, term9404.getClass(), "next", term9404);
        setField(term9404, term9404.getClass(), "first", term9404);
        setField(term9404, term9404.getClass(), "last", null);
        setField(term9404, term9404.getClass(), "propListHead", null);
        setIntField(term9404, term9404.getClass(), "sourcePosition", 0);
        setField(term9404, term9404.getClass(), "jsType", null);
        setField(term9404, term9404.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term9385;
        Object retValue = callMethod(klass, "tryFoldStringJoin", argTypes, term9315, args);
        assertTrue(recursiveEquals(term9315, term9420));
        assertTrue(recursiveEquals(term9385, term9421));
        assertTrue(recursiveEquals(retValue, term9404));
    }

};


