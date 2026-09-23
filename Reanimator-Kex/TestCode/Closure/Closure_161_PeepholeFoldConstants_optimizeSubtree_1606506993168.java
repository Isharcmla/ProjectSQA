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

public class PeepholeFoldConstants_optimizeSubtree_1606506993168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26825;
     Object term26895;
     Object term27114;
     Object term27115;
     Object term27105;

    public PeepholeFoldConstants_optimizeSubtree_1606506993168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26825 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term26895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26895, term26895.getClass(), "type", 66);
        term27114 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term27114, term27114.getClass(), "currentTraversal", null);
        term27115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27115, term27115.getClass(), "type", 66);
        setField(term27115, term27115.getClass(), "next", null);
        setField(term27115, term27115.getClass(), "first", null);
        setField(term27115, term27115.getClass(), "last", null);
        setField(term27115, term27115.getClass(), "propListHead", null);
        setIntField(term27115, term27115.getClass(), "sourcePosition", 0);
        setField(term27115, term27115.getClass(), "jsType", null);
        setField(term27115, term27115.getClass(), "parent", null);
        term27105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27105, term27105.getClass(), "type", 66);
        setField(term27105, term27105.getClass(), "next", null);
        setField(term27105, term27105.getClass(), "first", null);
        setField(term27105, term27105.getClass(), "last", null);
        setField(term27105, term27105.getClass(), "propListHead", null);
        setIntField(term27105, term27105.getClass(), "sourcePosition", 0);
        setField(term27105, term27105.getClass(), "jsType", null);
        setField(term27105, term27105.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26895;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term26825, args);
        assertTrue(recursiveEquals(term26825, term27114));
        assertTrue(recursiveEquals(term26895, term27115));
        assertTrue(recursiveEquals(retValue, term27105));
    }

};


