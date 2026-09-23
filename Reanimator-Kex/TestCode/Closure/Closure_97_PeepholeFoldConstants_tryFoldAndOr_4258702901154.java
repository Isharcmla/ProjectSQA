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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355428;
     Object term355520;
     Object term355612;
     Object term355704;
     Object term355745;
     Object term355746;
     Object term355747;
     Object term355748;
     Object term355705;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355428 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term355520 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term355520, term355520.getClass(), "parent", null);
        setIntField(term355520, term355520.getClass(), "type", 0);
        term355612 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term355612, term355612.getClass(), "type", 0);
        term355704 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term355745 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term355745, term355745.getClass(), "currentTraversal", null);
        term355746 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term355746, term355746.getClass(), "number", 0.0);
        setIntField(term355746, term355746.getClass(), "type", 0);
        setField(term355746, term355746.getClass(), "next", null);
        setField(term355746, term355746.getClass(), "first", null);
        setField(term355746, term355746.getClass(), "last", null);
        setField(term355746, term355746.getClass(), "propListHead", null);
        setIntField(term355746, term355746.getClass(), "sourcePosition", 0);
        setField(term355746, term355746.getClass(), "jsType", null);
        setField(term355746, term355746.getClass(), "parent", null);
        term355747 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term355747, term355747.getClass(), "str", null);
        setIntField(term355747, term355747.getClass(), "type", 0);
        setField(term355747, term355747.getClass(), "next", null);
        setField(term355747, term355747.getClass(), "first", null);
        setField(term355747, term355747.getClass(), "last", null);
        setField(term355747, term355747.getClass(), "propListHead", null);
        setIntField(term355747, term355747.getClass(), "sourcePosition", 0);
        setField(term355747, term355747.getClass(), "jsType", null);
        setField(term355747, term355747.getClass(), "parent", null);
        term355748 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term355748, term355748.getClass(), "number", 0.0);
        setIntField(term355748, term355748.getClass(), "type", 0);
        setField(term355748, term355748.getClass(), "next", null);
        setField(term355748, term355748.getClass(), "first", null);
        setField(term355748, term355748.getClass(), "last", null);
        setField(term355748, term355748.getClass(), "propListHead", null);
        setIntField(term355748, term355748.getClass(), "sourcePosition", 0);
        setField(term355748, term355748.getClass(), "jsType", null);
        setField(term355748, term355748.getClass(), "parent", null);
        term355705 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term355705, term355705.getClass(), "number", 0.0);
        setIntField(term355705, term355705.getClass(), "type", 0);
        setField(term355705, term355705.getClass(), "next", null);
        setField(term355705, term355705.getClass(), "first", null);
        setField(term355705, term355705.getClass(), "last", null);
        setField(term355705, term355705.getClass(), "propListHead", null);
        setIntField(term355705, term355705.getClass(), "sourcePosition", 0);
        setField(term355705, term355705.getClass(), "jsType", null);
        setField(term355705, term355705.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term355520;
        args[1] = term355612;
        args[2] = term355704;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term355428, args);
        assertTrue(recursiveEquals(term355428, term355745));
        assertTrue(recursiveEquals(term355520, term355746));
        assertTrue(recursiveEquals(term355612, term355747));
        assertTrue(recursiveEquals(term355704, term355748));
        assertTrue(recursiveEquals(retValue, term355705));
    }

};


