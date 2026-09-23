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

public class PeepholeFoldConstants_optimizeSubtree_1606506993172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27247;
     Object term27317;
     Object term27519;
     Object term27520;
     Object term27510;

    public PeepholeFoldConstants_optimizeSubtree_1606506993172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27247 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term27317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27317, term27317.getClass(), "type", 46);
        term27519 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term27519, term27519.getClass(), "currentTraversal", null);
        term27520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27520, term27520.getClass(), "type", 46);
        setField(term27520, term27520.getClass(), "next", null);
        setField(term27520, term27520.getClass(), "first", null);
        setField(term27520, term27520.getClass(), "last", null);
        setField(term27520, term27520.getClass(), "propListHead", null);
        setIntField(term27520, term27520.getClass(), "sourcePosition", 0);
        setField(term27520, term27520.getClass(), "jsType", null);
        setField(term27520, term27520.getClass(), "parent", null);
        term27510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27510, term27510.getClass(), "type", 46);
        setField(term27510, term27510.getClass(), "next", null);
        setField(term27510, term27510.getClass(), "first", null);
        setField(term27510, term27510.getClass(), "last", null);
        setField(term27510, term27510.getClass(), "propListHead", null);
        setIntField(term27510, term27510.getClass(), "sourcePosition", 0);
        setField(term27510, term27510.getClass(), "jsType", null);
        setField(term27510, term27510.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term27317;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term27247, args);
        assertTrue(recursiveEquals(term27247, term27519));
        assertTrue(recursiveEquals(term27317, term27520));
        assertTrue(recursiveEquals(retValue, term27510));
    }

};


