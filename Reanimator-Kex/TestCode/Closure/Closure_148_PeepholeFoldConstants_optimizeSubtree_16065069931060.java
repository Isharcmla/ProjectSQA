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

public class PeepholeFoldConstants_optimizeSubtree_16065069931060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248341;
     Object term248411;
     Object term249163;
     Object term249164;
     Object term249114;

    public PeepholeFoldConstants_optimizeSubtree_16065069931060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248341 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term248411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term248411, term248411.getClass(), "type", 37);
        setField(term248411, term248411.getClass(), "first", term248411);
        setField(term248411, term248411.getClass(), "next", term248411);
        term249163 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term249163, term249163.getClass(), "currentTraversal", null);
        term249164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term249164, term249164.getClass(), "type", 37);
        setField(term249164, term249164.getClass(), "next", term249164);
        setField(term249164, term249164.getClass(), "first", term249164);
        setField(term249164, term249164.getClass(), "last", null);
        setField(term249164, term249164.getClass(), "propListHead", null);
        setIntField(term249164, term249164.getClass(), "sourcePosition", 0);
        setField(term249164, term249164.getClass(), "jsType", null);
        setField(term249164, term249164.getClass(), "parent", null);
        term249114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term249114, term249114.getClass(), "type", 37);
        setField(term249114, term249114.getClass(), "next", term249114);
        setField(term249114, term249114.getClass(), "first", term249114);
        setField(term249114, term249114.getClass(), "last", null);
        setField(term249114, term249114.getClass(), "propListHead", null);
        setIntField(term249114, term249114.getClass(), "sourcePosition", 0);
        setField(term249114, term249114.getClass(), "jsType", null);
        setField(term249114, term249114.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term248411;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term248341, args);
        assertTrue(recursiveEquals(term248341, term249163));
        assertTrue(recursiveEquals(term248411, term249164));
        assertTrue(recursiveEquals(retValue, term249114));
    }

};


