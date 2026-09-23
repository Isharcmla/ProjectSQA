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

public class PeepholeFoldConstants_optimizeSubtree_160650699399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17673;
     Object term17743;
     Object term17967;
     Object term17968;
     Object term17959;

    public PeepholeFoldConstants_optimizeSubtree_160650699399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17673 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term17743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17743, term17743.getClass(), "type", 31);
        term17967 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term17967, term17967.getClass(), "currentTraversal", null);
        term17968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17968, term17968.getClass(), "type", 31);
        setField(term17968, term17968.getClass(), "next", null);
        setField(term17968, term17968.getClass(), "first", null);
        setField(term17968, term17968.getClass(), "last", null);
        setField(term17968, term17968.getClass(), "propListHead", null);
        setIntField(term17968, term17968.getClass(), "sourcePosition", 0);
        setField(term17968, term17968.getClass(), "jsType", null);
        setField(term17968, term17968.getClass(), "parent", null);
        term17959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17959, term17959.getClass(), "type", 31);
        setField(term17959, term17959.getClass(), "next", null);
        setField(term17959, term17959.getClass(), "first", null);
        setField(term17959, term17959.getClass(), "last", null);
        setField(term17959, term17959.getClass(), "propListHead", null);
        setIntField(term17959, term17959.getClass(), "sourcePosition", 0);
        setField(term17959, term17959.getClass(), "jsType", null);
        setField(term17959, term17959.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17743;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term17673, args);
        assertTrue(recursiveEquals(term17673, term17967));
        assertTrue(recursiveEquals(term17743, term17968));
        assertTrue(recursiveEquals(retValue, term17959));
    }

};


