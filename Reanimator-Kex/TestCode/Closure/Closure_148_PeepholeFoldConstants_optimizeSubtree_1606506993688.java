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

public class PeepholeFoldConstants_optimizeSubtree_1606506993688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152838;
     Object term152908;
     Object term152993;
     Object term152994;
     Object term152978;

    public PeepholeFoldConstants_optimizeSubtree_1606506993688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152838 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term152908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term152908, term152908.getClass(), "type", 30);
        setField(term152908, term152908.getClass(), "first", term152908);
        term152993 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term152993, term152993.getClass(), "currentTraversal", null);
        term152994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term152994, term152994.getClass(), "type", 30);
        setField(term152994, term152994.getClass(), "next", null);
        setField(term152994, term152994.getClass(), "first", term152994);
        setField(term152994, term152994.getClass(), "last", null);
        setField(term152994, term152994.getClass(), "propListHead", null);
        setIntField(term152994, term152994.getClass(), "sourcePosition", 0);
        setField(term152994, term152994.getClass(), "jsType", null);
        setField(term152994, term152994.getClass(), "parent", null);
        term152978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term152978, term152978.getClass(), "type", 30);
        setField(term152978, term152978.getClass(), "next", null);
        setField(term152978, term152978.getClass(), "first", term152978);
        setField(term152978, term152978.getClass(), "last", null);
        setField(term152978, term152978.getClass(), "propListHead", null);
        setIntField(term152978, term152978.getClass(), "sourcePosition", 0);
        setField(term152978, term152978.getClass(), "jsType", null);
        setField(term152978, term152978.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term152908;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term152838, args);
        assertTrue(recursiveEquals(term152838, term152993));
        assertTrue(recursiveEquals(term152908, term152994));
        assertTrue(recursiveEquals(retValue, term152978));
    }

};


