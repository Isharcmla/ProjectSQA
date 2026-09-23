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

public class PeepholeFoldConstants_tryReduceOperandsForOp_1283860076247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40217;
     Object term40287;
     Object term40598;
     Object term40599;

    public PeepholeFoldConstants_tryReduceOperandsForOp_1283860076247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40217 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term40287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40287, term40287.getClass(), "type", 28);
        term40598 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term40598, term40598.getClass(), "currentTraversal", null);
        term40599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40599, term40599.getClass(), "type", 28);
        setField(term40599, term40599.getClass(), "next", null);
        setField(term40599, term40599.getClass(), "first", null);
        setField(term40599, term40599.getClass(), "last", null);
        setField(term40599, term40599.getClass(), "propListHead", null);
        setIntField(term40599, term40599.getClass(), "sourcePosition", 0);
        setField(term40599, term40599.getClass(), "jsType", null);
        setField(term40599, term40599.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40287;
        callMethod(klass, "tryReduceOperandsForOp", argTypes, term40217, args);
        assertTrue(recursiveEquals(term40217, term40598));
        assertTrue(recursiveEquals(term40287, term40599));
    }

};


