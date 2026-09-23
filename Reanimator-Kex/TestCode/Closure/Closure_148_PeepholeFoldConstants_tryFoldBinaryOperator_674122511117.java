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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20201;
     Object term20271;
     Object term20505;
     Object term20506;
     Object term20490;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20201 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term20271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term20271, term20271.getClass(), "first", term20271);
        setField(term20271, term20271.getClass(), "next", term20271);
        setIntField(term20271, term20271.getClass(), "type", 20);
        term20505 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term20505, term20505.getClass(), "currentTraversal", null);
        term20506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20506, term20506.getClass(), "type", 20);
        setField(term20506, term20506.getClass(), "next", term20506);
        setField(term20506, term20506.getClass(), "first", term20506);
        setField(term20506, term20506.getClass(), "last", null);
        setField(term20506, term20506.getClass(), "propListHead", null);
        setIntField(term20506, term20506.getClass(), "sourcePosition", 0);
        setField(term20506, term20506.getClass(), "jsType", null);
        setField(term20506, term20506.getClass(), "parent", null);
        term20490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20490, term20490.getClass(), "type", 20);
        setField(term20490, term20490.getClass(), "next", term20490);
        setField(term20490, term20490.getClass(), "first", term20490);
        setField(term20490, term20490.getClass(), "last", null);
        setField(term20490, term20490.getClass(), "propListHead", null);
        setIntField(term20490, term20490.getClass(), "sourcePosition", 0);
        setField(term20490, term20490.getClass(), "jsType", null);
        setField(term20490, term20490.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20271;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term20201, args);
        assertTrue(recursiveEquals(term20201, term20505));
        assertTrue(recursiveEquals(term20271, term20506));
        assertTrue(recursiveEquals(retValue, term20490));
    }

};


