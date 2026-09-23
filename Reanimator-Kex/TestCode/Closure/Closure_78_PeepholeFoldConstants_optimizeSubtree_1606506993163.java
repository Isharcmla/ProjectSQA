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

public class PeepholeFoldConstants_optimizeSubtree_1606506993163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27158;
     Object term27228;
     Object term27240;
     Object term27241;
     Object term27230;

    public PeepholeFoldConstants_optimizeSubtree_1606506993163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27158 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term27228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27228, term27228.getClass(), "type", 25);
        term27240 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term27240, term27240.getClass(), "currentTraversal", null);
        term27241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27241, term27241.getClass(), "type", 25);
        setField(term27241, term27241.getClass(), "next", null);
        setField(term27241, term27241.getClass(), "first", null);
        setField(term27241, term27241.getClass(), "last", null);
        setField(term27241, term27241.getClass(), "propListHead", null);
        setIntField(term27241, term27241.getClass(), "sourcePosition", 0);
        setField(term27241, term27241.getClass(), "jsType", null);
        setField(term27241, term27241.getClass(), "parent", null);
        term27230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27230, term27230.getClass(), "type", 25);
        setField(term27230, term27230.getClass(), "next", null);
        setField(term27230, term27230.getClass(), "first", null);
        setField(term27230, term27230.getClass(), "last", null);
        setField(term27230, term27230.getClass(), "propListHead", null);
        setIntField(term27230, term27230.getClass(), "sourcePosition", 0);
        setField(term27230, term27230.getClass(), "jsType", null);
        setField(term27230, term27230.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term27228;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term27158, args);
        assertTrue(recursiveEquals(term27158, term27240));
        assertTrue(recursiveEquals(term27228, term27241));
        assertTrue(recursiveEquals(retValue, term27230));
    }

};


