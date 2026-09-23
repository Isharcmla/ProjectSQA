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
     Object term27551;
     Object term27621;
     Object term27835;
     Object term27836;
     Object term27826;

    public PeepholeFoldConstants_optimizeSubtree_1606506993168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27551 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term27621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27621, term27621.getClass(), "type", 46);
        term27835 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term27835, term27835.getClass(), "currentTraversal", null);
        term27836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27836, term27836.getClass(), "type", 46);
        setField(term27836, term27836.getClass(), "next", null);
        setField(term27836, term27836.getClass(), "first", null);
        setField(term27836, term27836.getClass(), "last", null);
        setField(term27836, term27836.getClass(), "propListHead", null);
        setIntField(term27836, term27836.getClass(), "sourcePosition", 0);
        setField(term27836, term27836.getClass(), "jsType", null);
        setField(term27836, term27836.getClass(), "parent", null);
        term27826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27826, term27826.getClass(), "type", 46);
        setField(term27826, term27826.getClass(), "next", null);
        setField(term27826, term27826.getClass(), "first", null);
        setField(term27826, term27826.getClass(), "last", null);
        setField(term27826, term27826.getClass(), "propListHead", null);
        setIntField(term27826, term27826.getClass(), "sourcePosition", 0);
        setField(term27826, term27826.getClass(), "jsType", null);
        setField(term27826, term27826.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term27621;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term27551, args);
        assertTrue(recursiveEquals(term27551, term27835));
        assertTrue(recursiveEquals(term27621, term27836));
        assertTrue(recursiveEquals(retValue, term27826));
    }

};


