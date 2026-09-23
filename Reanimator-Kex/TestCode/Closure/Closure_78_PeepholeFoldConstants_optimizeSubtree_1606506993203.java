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

public class PeepholeFoldConstants_optimizeSubtree_1606506993203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33137;
     Object term33207;
     Object term33230;
     Object term33231;
     Object term33221;

    public PeepholeFoldConstants_optimizeSubtree_1606506993203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33137 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term33207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33207, term33207.getClass(), "type", 70);
        term33230 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term33230, term33230.getClass(), "currentTraversal", null);
        term33231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33231, term33231.getClass(), "type", 70);
        setField(term33231, term33231.getClass(), "next", null);
        setField(term33231, term33231.getClass(), "first", null);
        setField(term33231, term33231.getClass(), "last", null);
        setField(term33231, term33231.getClass(), "propListHead", null);
        setIntField(term33231, term33231.getClass(), "sourcePosition", 0);
        setField(term33231, term33231.getClass(), "jsType", null);
        setField(term33231, term33231.getClass(), "parent", null);
        term33221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33221, term33221.getClass(), "type", 70);
        setField(term33221, term33221.getClass(), "next", null);
        setField(term33221, term33221.getClass(), "first", null);
        setField(term33221, term33221.getClass(), "last", null);
        setField(term33221, term33221.getClass(), "propListHead", null);
        setIntField(term33221, term33221.getClass(), "sourcePosition", 0);
        setField(term33221, term33221.getClass(), "jsType", null);
        setField(term33221, term33221.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term33207;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term33137, args);
        assertTrue(recursiveEquals(term33137, term33230));
        assertTrue(recursiveEquals(term33207, term33231));
        assertTrue(recursiveEquals(retValue, term33221));
    }

};


