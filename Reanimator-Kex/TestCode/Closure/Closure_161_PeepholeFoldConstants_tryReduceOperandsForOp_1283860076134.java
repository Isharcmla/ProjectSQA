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

public class PeepholeFoldConstants_tryReduceOperandsForOp_1283860076134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22044;
     Object term22114;
     Object term22311;
     Object term22312;

    public PeepholeFoldConstants_tryReduceOperandsForOp_1283860076134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22044 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term22114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22114, term22114.getClass(), "type", 18);
        term22311 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term22311, term22311.getClass(), "currentTraversal", null);
        term22312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22312, term22312.getClass(), "type", 18);
        setField(term22312, term22312.getClass(), "next", null);
        setField(term22312, term22312.getClass(), "first", null);
        setField(term22312, term22312.getClass(), "last", null);
        setField(term22312, term22312.getClass(), "propListHead", null);
        setIntField(term22312, term22312.getClass(), "sourcePosition", 0);
        setField(term22312, term22312.getClass(), "jsType", null);
        setField(term22312, term22312.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term22114;
        callMethod(klass, "tryReduceOperandsForOp", argTypes, term22044, args);
        assertTrue(recursiveEquals(term22044, term22311));
        assertTrue(recursiveEquals(term22114, term22312));
    }

};


