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

public class PeepholeFoldConstants_tryReduceOperandsForOp_1283860076106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18889;
     Object term18959;
     Object term19329;
     Object term19330;

    public PeepholeFoldConstants_tryReduceOperandsForOp_1283860076106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18889 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term18959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18959, term18959.getClass(), "type", 27);
        term19329 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term19329, term19329.getClass(), "currentTraversal", null);
        term19330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19330, term19330.getClass(), "type", 27);
        setField(term19330, term19330.getClass(), "next", null);
        setField(term19330, term19330.getClass(), "first", null);
        setField(term19330, term19330.getClass(), "last", null);
        setField(term19330, term19330.getClass(), "propListHead", null);
        setIntField(term19330, term19330.getClass(), "sourcePosition", 0);
        setField(term19330, term19330.getClass(), "jsType", null);
        setField(term19330, term19330.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18959;
        callMethod(klass, "tryReduceOperandsForOp", argTypes, term18889, args);
        assertTrue(recursiveEquals(term18889, term19329));
        assertTrue(recursiveEquals(term18959, term19330));
    }

};


