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
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldAndOr_4258702902684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term767430;
     Object term767522;
     Object term767706;
     Object term767798;
     Object term768961;
     Object term768962;
     Object term768964;
     Object term768965;
     Object term768887;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term767430 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term767522 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term767614 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term767614, term767614.getClass(), "type", 114);
        setField(term767522, term767522.getClass(), "parent", term767614);
        setIntField(term767522, term767522.getClass(), "type", 100);
        term767706 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term767706, term767706.getClass(), "type", 0);
        term767798 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term767798, term767798.getClass(), "type", 47);
        term768961 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term768961, term768961.getClass(), "currentTraversal", null);
        term768962 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term768963 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term768962, term768962.getClass(), "number", 0.0);
        setIntField(term768962, term768962.getClass(), "type", 100);
        setField(term768962, term768962.getClass(), "next", null);
        setField(term768962, term768962.getClass(), "first", null);
        setField(term768962, term768962.getClass(), "last", null);
        setField(term768962, term768962.getClass(), "propListHead", null);
        setIntField(term768962, term768962.getClass(), "sourcePosition", 0);
        setField(term768962, term768962.getClass(), "jsType", null);
        setDoubleField(term768963, term768963.getClass(), "number", 0.0);
        setIntField(term768963, term768963.getClass(), "type", 114);
        setField(term768963, term768963.getClass(), "next", null);
        setField(term768963, term768963.getClass(), "first", null);
        setField(term768963, term768963.getClass(), "last", null);
        setField(term768963, term768963.getClass(), "propListHead", null);
        setIntField(term768963, term768963.getClass(), "sourcePosition", 0);
        setField(term768963, term768963.getClass(), "jsType", null);
        setField(term768963, term768963.getClass(), "parent", null);
        setField(term768962, term768962.getClass(), "parent", term768963);
        term768964 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term768964, term768964.getClass(), "number", 0.0);
        setIntField(term768964, term768964.getClass(), "type", 0);
        setField(term768964, term768964.getClass(), "next", null);
        setField(term768964, term768964.getClass(), "first", null);
        setField(term768964, term768964.getClass(), "last", null);
        setField(term768964, term768964.getClass(), "propListHead", null);
        setIntField(term768964, term768964.getClass(), "sourcePosition", 0);
        setField(term768964, term768964.getClass(), "jsType", null);
        setField(term768964, term768964.getClass(), "parent", null);
        term768965 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term768965, term768965.getClass(), "str", null);
        setIntField(term768965, term768965.getClass(), "type", 47);
        setField(term768965, term768965.getClass(), "next", null);
        setField(term768965, term768965.getClass(), "first", null);
        setField(term768965, term768965.getClass(), "last", null);
        setField(term768965, term768965.getClass(), "propListHead", null);
        setIntField(term768965, term768965.getClass(), "sourcePosition", 0);
        setField(term768965, term768965.getClass(), "jsType", null);
        setField(term768965, term768965.getClass(), "parent", null);
        term768887 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term768891 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term768887, term768887.getClass(), "number", 0.0);
        setIntField(term768887, term768887.getClass(), "type", 100);
        setField(term768887, term768887.getClass(), "next", null);
        setField(term768887, term768887.getClass(), "first", null);
        setField(term768887, term768887.getClass(), "last", null);
        setField(term768887, term768887.getClass(), "propListHead", null);
        setIntField(term768887, term768887.getClass(), "sourcePosition", 0);
        setField(term768887, term768887.getClass(), "jsType", null);
        setDoubleField(term768891, term768891.getClass(), "number", 0.0);
        setIntField(term768891, term768891.getClass(), "type", 114);
        setField(term768891, term768891.getClass(), "next", null);
        setField(term768891, term768891.getClass(), "first", null);
        setField(term768891, term768891.getClass(), "last", null);
        setField(term768891, term768891.getClass(), "propListHead", null);
        setIntField(term768891, term768891.getClass(), "sourcePosition", 0);
        setField(term768891, term768891.getClass(), "jsType", null);
        setField(term768891, term768891.getClass(), "parent", null);
        setField(term768887, term768887.getClass(), "parent", term768891);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term767522;
        args[1] = term767706;
        args[2] = term767798;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term767430, args);
        assertTrue(recursiveEquals(term767430, term768961));
        assertTrue(recursiveEquals(term767522, term768962));
        assertTrue(recursiveEquals(term767706, term768964));
        assertTrue(recursiveEquals(term767798, term768965));
        assertTrue(recursiveEquals(retValue, term768887));
    }

};


