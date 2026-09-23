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

public class PeepholeFoldConstants_optimizeSubtree_160650699349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8345;
     Object term8415;
     Object term8720;
     Object term8721;
     Object term8712;

    public PeepholeFoldConstants_optimizeSubtree_160650699349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8345 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term8415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8415, term8415.getClass(), "type", 33);
        term8720 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term8720, term8720.getClass(), "currentTraversal", null);
        term8721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8721, term8721.getClass(), "type", 33);
        setField(term8721, term8721.getClass(), "next", null);
        setField(term8721, term8721.getClass(), "first", null);
        setField(term8721, term8721.getClass(), "last", null);
        setField(term8721, term8721.getClass(), "propListHead", null);
        setIntField(term8721, term8721.getClass(), "sourcePosition", 0);
        setField(term8721, term8721.getClass(), "jsType", null);
        setField(term8721, term8721.getClass(), "parent", null);
        term8712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8712, term8712.getClass(), "type", 33);
        setField(term8712, term8712.getClass(), "next", null);
        setField(term8712, term8712.getClass(), "first", null);
        setField(term8712, term8712.getClass(), "last", null);
        setField(term8712, term8712.getClass(), "propListHead", null);
        setIntField(term8712, term8712.getClass(), "sourcePosition", 0);
        setField(term8712, term8712.getClass(), "jsType", null);
        setField(term8712, term8712.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term8415;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term8345, args);
        assertTrue(recursiveEquals(term8345, term8720));
        assertTrue(recursiveEquals(term8415, term8721));
        assertTrue(recursiveEquals(retValue, term8712));
    }

};


