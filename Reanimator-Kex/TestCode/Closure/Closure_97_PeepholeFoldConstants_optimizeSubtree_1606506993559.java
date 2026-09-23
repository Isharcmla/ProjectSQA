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

public class PeepholeFoldConstants_optimizeSubtree_1606506993559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147707;
     Object term147777;
     Object term148105;
     Object term148106;
     Object term148089;

    public PeepholeFoldConstants_optimizeSubtree_1606506993559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147707 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term147777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term147777, term147777.getClass(), "type", 36);
        setField(term147777, term147777.getClass(), "first", term147777);
        setField(term147777, term147777.getClass(), "next", term147777);
        term148105 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term148105, term148105.getClass(), "currentTraversal", null);
        term148106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term148106, term148106.getClass(), "type", 36);
        setField(term148106, term148106.getClass(), "next", term148106);
        setField(term148106, term148106.getClass(), "first", term148106);
        setField(term148106, term148106.getClass(), "last", null);
        setField(term148106, term148106.getClass(), "propListHead", null);
        setIntField(term148106, term148106.getClass(), "sourcePosition", 0);
        setField(term148106, term148106.getClass(), "jsType", null);
        setField(term148106, term148106.getClass(), "parent", null);
        term148089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term148089, term148089.getClass(), "type", 36);
        setField(term148089, term148089.getClass(), "next", term148089);
        setField(term148089, term148089.getClass(), "first", term148089);
        setField(term148089, term148089.getClass(), "last", null);
        setField(term148089, term148089.getClass(), "propListHead", null);
        setIntField(term148089, term148089.getClass(), "sourcePosition", 0);
        setField(term148089, term148089.getClass(), "jsType", null);
        setField(term148089, term148089.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term147777;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term147707, args);
        assertTrue(recursiveEquals(term147707, term148105));
        assertTrue(recursiveEquals(term147777, term148106));
        assertTrue(recursiveEquals(retValue, term148089));
    }

};


