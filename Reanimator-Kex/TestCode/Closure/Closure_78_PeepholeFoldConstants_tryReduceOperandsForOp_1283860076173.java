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

public class PeepholeFoldConstants_tryReduceOperandsForOp_1283860076173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28164;
     Object term28234;
     Object term28253;
     Object term28254;

    public PeepholeFoldConstants_tryReduceOperandsForOp_1283860076173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28164 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term28234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28234, term28234.getClass(), "type", 24);
        term28253 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term28253, term28253.getClass(), "currentTraversal", null);
        term28254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28254, term28254.getClass(), "type", 24);
        setField(term28254, term28254.getClass(), "next", null);
        setField(term28254, term28254.getClass(), "first", null);
        setField(term28254, term28254.getClass(), "last", null);
        setField(term28254, term28254.getClass(), "propListHead", null);
        setIntField(term28254, term28254.getClass(), "sourcePosition", 0);
        setField(term28254, term28254.getClass(), "jsType", null);
        setField(term28254, term28254.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28234;
        callMethod(klass, "tryReduceOperandsForOp", argTypes, term28164, args);
        assertTrue(recursiveEquals(term28164, term28253));
        assertTrue(recursiveEquals(term28234, term28254));
    }

};


