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

public class PeepholeFoldConstants_tryReduceOperandsForOp_1283860076354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81981;
     Object term82051;
     Object term93107;
     Object term93108;

    public PeepholeFoldConstants_tryReduceOperandsForOp_1283860076354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81981 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term82051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term82051, term82051.getClass(), "type", 25);
        term93107 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term93107, term93107.getClass(), "currentTraversal", null);
        term93108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93108, term93108.getClass(), "type", 25);
        setField(term93108, term93108.getClass(), "next", null);
        setField(term93108, term93108.getClass(), "first", null);
        setField(term93108, term93108.getClass(), "last", null);
        setField(term93108, term93108.getClass(), "propListHead", null);
        setIntField(term93108, term93108.getClass(), "sourcePosition", 0);
        setField(term93108, term93108.getClass(), "jsType", null);
        setField(term93108, term93108.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term82051;
        callMethod(klass, "tryReduceOperandsForOp", argTypes, term81981, args);
        assertTrue(recursiveEquals(term81981, term93107));
        assertTrue(recursiveEquals(term82051, term93108));
    }

};


