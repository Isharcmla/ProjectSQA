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

public class PeepholeFoldConstants_tryFoldAndOr_425870290214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42260;
     Object term42398;
     Object term42490;
     Object term42639;
     Object term42640;
     Object term42641;
     Object term42642;
     Object term42602;

    public PeepholeFoldConstants_tryFoldAndOr_425870290214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42260 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term42398 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term42398, term42398.getClass(), "parent", null);
        setIntField(term42398, term42398.getClass(), "type", 0);
        term42490 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term42639 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term42639, term42639.getClass(), "currentTraversal", null);
        term42640 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term42640, term42640.getClass(), "number", 0.0);
        setIntField(term42640, term42640.getClass(), "type", 0);
        setField(term42640, term42640.getClass(), "next", null);
        setField(term42640, term42640.getClass(), "first", null);
        setField(term42640, term42640.getClass(), "last", null);
        setField(term42640, term42640.getClass(), "propListHead", null);
        setIntField(term42640, term42640.getClass(), "sourcePosition", 0);
        setField(term42640, term42640.getClass(), "jsType", null);
        setField(term42640, term42640.getClass(), "parent", null);
        term42641 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term42641, term42641.getClass(), "number", 0.0);
        setIntField(term42641, term42641.getClass(), "type", 0);
        setField(term42641, term42641.getClass(), "next", null);
        setField(term42641, term42641.getClass(), "first", null);
        setField(term42641, term42641.getClass(), "last", null);
        setField(term42641, term42641.getClass(), "propListHead", null);
        setIntField(term42641, term42641.getClass(), "sourcePosition", 0);
        setField(term42641, term42641.getClass(), "jsType", null);
        setField(term42641, term42641.getClass(), "parent", null);
        term42642 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term42642, term42642.getClass(), "number", 0.0);
        setIntField(term42642, term42642.getClass(), "type", 0);
        setField(term42642, term42642.getClass(), "next", null);
        setField(term42642, term42642.getClass(), "first", null);
        setField(term42642, term42642.getClass(), "last", null);
        setField(term42642, term42642.getClass(), "propListHead", null);
        setIntField(term42642, term42642.getClass(), "sourcePosition", 0);
        setField(term42642, term42642.getClass(), "jsType", null);
        setField(term42642, term42642.getClass(), "parent", null);
        term42602 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term42602, term42602.getClass(), "number", 0.0);
        setIntField(term42602, term42602.getClass(), "type", 0);
        setField(term42602, term42602.getClass(), "next", null);
        setField(term42602, term42602.getClass(), "first", null);
        setField(term42602, term42602.getClass(), "last", null);
        setField(term42602, term42602.getClass(), "propListHead", null);
        setIntField(term42602, term42602.getClass(), "sourcePosition", 0);
        setField(term42602, term42602.getClass(), "jsType", null);
        setField(term42602, term42602.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term42398;
        args[1] = term42398;
        args[2] = term42490;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term42260, args);
        assertTrue(recursiveEquals(term42260, term42639));
        assertTrue(recursiveEquals(term42398, term42640));
        assertTrue(recursiveEquals(term42398, term42641));
        assertTrue(recursiveEquals(term42490, term42642));
        assertTrue(recursiveEquals(retValue, term42602));
    }

};


