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

public class PeepholeFoldConstants_optimizeSubtree_1606506993211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34405;
     Object term34475;
     Object term34505;
     Object term34506;
     Object term34489;

    public PeepholeFoldConstants_optimizeSubtree_1606506993211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34405 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term34475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34475, term34475.getClass(), "type", 56);
        setField(term34475, term34475.getClass(), "first", term34475);
        term34505 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term34505, term34505.getClass(), "currentTraversal", null);
        term34506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34506, term34506.getClass(), "type", 56);
        setField(term34506, term34506.getClass(), "next", null);
        setField(term34506, term34506.getClass(), "first", term34506);
        setField(term34506, term34506.getClass(), "last", null);
        setField(term34506, term34506.getClass(), "propListHead", null);
        setIntField(term34506, term34506.getClass(), "sourcePosition", 0);
        setField(term34506, term34506.getClass(), "jsType", null);
        setField(term34506, term34506.getClass(), "parent", null);
        term34489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34489, term34489.getClass(), "type", 56);
        setField(term34489, term34489.getClass(), "next", null);
        setField(term34489, term34489.getClass(), "first", term34489);
        setField(term34489, term34489.getClass(), "last", null);
        setField(term34489, term34489.getClass(), "propListHead", null);
        setIntField(term34489, term34489.getClass(), "sourcePosition", 0);
        setField(term34489, term34489.getClass(), "jsType", null);
        setField(term34489, term34489.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34475;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term34405, args);
        assertTrue(recursiveEquals(term34405, term34505));
        assertTrue(recursiveEquals(term34475, term34506));
        assertTrue(recursiveEquals(retValue, term34489));
    }

};


