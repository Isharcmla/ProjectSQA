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

public class PeepholeFoldConstants_optimizeSubtree_1606506993105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13864;
     Object term13934;
     Object term13993;
     Object term13994;
     Object term13983;

    public PeepholeFoldConstants_optimizeSubtree_1606506993105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13864 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term13934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13934, term13934.getClass(), "type", 43);
        term13993 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term13993, term13993.getClass(), "late", false);
        setField(term13993, term13993.getClass(), "compiler", null);
        term13994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13994, term13994.getClass(), "type", 43);
        setField(term13994, term13994.getClass(), "next", null);
        setField(term13994, term13994.getClass(), "first", null);
        setField(term13994, term13994.getClass(), "last", null);
        setField(term13994, term13994.getClass(), "propListHead", null);
        setIntField(term13994, term13994.getClass(), "sourcePosition", 0);
        setField(term13994, term13994.getClass(), "jsType", null);
        setField(term13994, term13994.getClass(), "parent", null);
        term13983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13983, term13983.getClass(), "type", 43);
        setField(term13983, term13983.getClass(), "next", null);
        setField(term13983, term13983.getClass(), "first", null);
        setField(term13983, term13983.getClass(), "last", null);
        setField(term13983, term13983.getClass(), "propListHead", null);
        setIntField(term13983, term13983.getClass(), "sourcePosition", 0);
        setField(term13983, term13983.getClass(), "jsType", null);
        setField(term13983, term13983.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13934;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term13864, args);
        assertTrue(recursiveEquals(term13864, term13993));
        assertTrue(recursiveEquals(term13934, term13994));
        assertTrue(recursiveEquals(retValue, term13983));
    }

};


