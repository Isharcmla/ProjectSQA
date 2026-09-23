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

public class PeepholeFoldConstants_compareToUndefined_131166578192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14182;
     Object term14252;
     Object term14456;
     Object term14457;

    public PeepholeFoldConstants_compareToUndefined_131166578192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14182 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term14252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14252, term14252.getClass(), "type", 0);
        term14456 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term14456, term14456.getClass(), "currentTraversal", null);
        term14457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14457, term14457.getClass(), "type", 0);
        setField(term14457, term14457.getClass(), "next", null);
        setField(term14457, term14457.getClass(), "first", null);
        setField(term14457, term14457.getClass(), "last", null);
        setField(term14457, term14457.getClass(), "propListHead", null);
        setIntField(term14457, term14457.getClass(), "sourcePosition", 0);
        setField(term14457, term14457.getClass(), "jsType", null);
        setField(term14457, term14457.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term14252;
        args[1] = 12;
        Object retValue = callMethod(klass, "compareToUndefined", argTypes, term14182, args);
        assertTrue(recursiveEquals(term14182, term14456));
        assertTrue(recursiveEquals(term14252, term14457));
        assertTrue(recursiveEquals(retValue, false));
    }

};


