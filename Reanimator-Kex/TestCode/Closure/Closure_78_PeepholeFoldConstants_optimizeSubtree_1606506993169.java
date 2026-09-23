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

public class PeepholeFoldConstants_optimizeSubtree_1606506993169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27754;
     Object term27824;
     Object term27854;
     Object term27855;
     Object term27838;

    public PeepholeFoldConstants_optimizeSubtree_1606506993169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27754 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term27824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27824, term27824.getClass(), "type", 76);
        setField(term27824, term27824.getClass(), "first", term27824);
        term27854 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term27854, term27854.getClass(), "currentTraversal", null);
        term27855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27855, term27855.getClass(), "type", 76);
        setField(term27855, term27855.getClass(), "next", null);
        setField(term27855, term27855.getClass(), "first", term27855);
        setField(term27855, term27855.getClass(), "last", null);
        setField(term27855, term27855.getClass(), "propListHead", null);
        setIntField(term27855, term27855.getClass(), "sourcePosition", 0);
        setField(term27855, term27855.getClass(), "jsType", null);
        setField(term27855, term27855.getClass(), "parent", null);
        term27838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27838, term27838.getClass(), "type", 76);
        setField(term27838, term27838.getClass(), "next", null);
        setField(term27838, term27838.getClass(), "first", term27838);
        setField(term27838, term27838.getClass(), "last", null);
        setField(term27838, term27838.getClass(), "propListHead", null);
        setIntField(term27838, term27838.getClass(), "sourcePosition", 0);
        setField(term27838, term27838.getClass(), "jsType", null);
        setField(term27838, term27838.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term27824;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term27754, args);
        assertTrue(recursiveEquals(term27754, term27854));
        assertTrue(recursiveEquals(term27824, term27855));
        assertTrue(recursiveEquals(retValue, term27838));
    }

};


