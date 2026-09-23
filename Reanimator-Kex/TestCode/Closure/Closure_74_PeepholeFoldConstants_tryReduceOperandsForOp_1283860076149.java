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

public class PeepholeFoldConstants_tryReduceOperandsForOp_1283860076149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26042;
     Object term26112;
     Object term26144;
     Object term26145;

    public PeepholeFoldConstants_tryReduceOperandsForOp_1283860076149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26042 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term26112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26112, term26112.getClass(), "type", 9);
        term26144 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term26144, term26144.getClass(), "currentTraversal", null);
        term26145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26145, term26145.getClass(), "type", 9);
        setField(term26145, term26145.getClass(), "next", null);
        setField(term26145, term26145.getClass(), "first", null);
        setField(term26145, term26145.getClass(), "last", null);
        setField(term26145, term26145.getClass(), "propListHead", null);
        setIntField(term26145, term26145.getClass(), "sourcePosition", 0);
        setField(term26145, term26145.getClass(), "jsType", null);
        setField(term26145, term26145.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26112;
        callMethod(klass, "tryReduceOperandsForOp", argTypes, term26042, args);
        assertTrue(recursiveEquals(term26042, term26144));
        assertTrue(recursiveEquals(term26112, term26145));
    }

};


