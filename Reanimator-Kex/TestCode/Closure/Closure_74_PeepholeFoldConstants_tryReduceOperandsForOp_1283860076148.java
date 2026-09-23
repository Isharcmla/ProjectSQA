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

public class PeepholeFoldConstants_tryReduceOperandsForOp_1283860076148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25853;
     Object term25923;
     Object term26136;
     Object term26137;

    public PeepholeFoldConstants_tryReduceOperandsForOp_1283860076148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25853 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term25923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25923, term25923.getClass(), "type", 28);
        term26136 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term26136, term26136.getClass(), "currentTraversal", null);
        term26137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26137, term26137.getClass(), "type", 28);
        setField(term26137, term26137.getClass(), "next", null);
        setField(term26137, term26137.getClass(), "first", null);
        setField(term26137, term26137.getClass(), "last", null);
        setField(term26137, term26137.getClass(), "propListHead", null);
        setIntField(term26137, term26137.getClass(), "sourcePosition", 0);
        setField(term26137, term26137.getClass(), "jsType", null);
        setField(term26137, term26137.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term25923;
        callMethod(klass, "tryReduceOperandsForOp", argTypes, term25853, args);
        assertTrue(recursiveEquals(term25853, term26136));
        assertTrue(recursiveEquals(term25923, term26137));
    }

};


