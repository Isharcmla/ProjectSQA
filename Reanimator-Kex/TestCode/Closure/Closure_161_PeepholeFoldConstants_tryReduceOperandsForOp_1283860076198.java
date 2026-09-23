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

public class PeepholeFoldConstants_tryReduceOperandsForOp_1283860076198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29911;
     Object term29981;
     Object term30177;
     Object term30178;

    public PeepholeFoldConstants_tryReduceOperandsForOp_1283860076198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29911 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term29981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29981, term29981.getClass(), "type", 20);
        term30177 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term30177, term30177.getClass(), "currentTraversal", null);
        term30178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30178, term30178.getClass(), "type", 20);
        setField(term30178, term30178.getClass(), "next", null);
        setField(term30178, term30178.getClass(), "first", null);
        setField(term30178, term30178.getClass(), "last", null);
        setField(term30178, term30178.getClass(), "propListHead", null);
        setIntField(term30178, term30178.getClass(), "sourcePosition", 0);
        setField(term30178, term30178.getClass(), "jsType", null);
        setField(term30178, term30178.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29981;
        callMethod(klass, "tryReduceOperandsForOp", argTypes, term29911, args);
        assertTrue(recursiveEquals(term29911, term30177));
        assertTrue(recursiveEquals(term29981, term30178));
    }

};


