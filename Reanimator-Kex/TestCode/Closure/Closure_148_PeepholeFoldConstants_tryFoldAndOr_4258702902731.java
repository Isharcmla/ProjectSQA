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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term784920;
     Object term785012;
     Object term785104;
     Object term785675;
     Object term785676;
     Object term785677;
     Object term785643;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term784920 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term785012 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term785012, term785012.getClass(), "parent", null);
        setIntField(term785012, term785012.getClass(), "type", 64);
        term785104 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term785104, term785104.getClass(), "type", 64);
        term785675 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term785675, term785675.getClass(), "currentTraversal", null);
        term785676 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term785676, term785676.getClass(), "number", 0.0);
        setIntField(term785676, term785676.getClass(), "type", 64);
        setField(term785676, term785676.getClass(), "next", null);
        setField(term785676, term785676.getClass(), "first", null);
        setField(term785676, term785676.getClass(), "last", null);
        setField(term785676, term785676.getClass(), "propListHead", null);
        setIntField(term785676, term785676.getClass(), "sourcePosition", 0);
        setField(term785676, term785676.getClass(), "jsType", null);
        setField(term785676, term785676.getClass(), "parent", null);
        term785677 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term785677, term785677.getClass(), "str", null);
        setIntField(term785677, term785677.getClass(), "type", 64);
        setField(term785677, term785677.getClass(), "next", null);
        setField(term785677, term785677.getClass(), "first", null);
        setField(term785677, term785677.getClass(), "last", null);
        setField(term785677, term785677.getClass(), "propListHead", null);
        setIntField(term785677, term785677.getClass(), "sourcePosition", 0);
        setField(term785677, term785677.getClass(), "jsType", null);
        setField(term785677, term785677.getClass(), "parent", null);
        term785643 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term785643, term785643.getClass(), "number", 0.0);
        setIntField(term785643, term785643.getClass(), "type", 64);
        setField(term785643, term785643.getClass(), "next", null);
        setField(term785643, term785643.getClass(), "first", null);
        setField(term785643, term785643.getClass(), "last", null);
        setField(term785643, term785643.getClass(), "propListHead", null);
        setIntField(term785643, term785643.getClass(), "sourcePosition", 0);
        setField(term785643, term785643.getClass(), "jsType", null);
        setField(term785643, term785643.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term785012;
        args[1] = term785104;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term784920, args);
        assertTrue(recursiveEquals(term784920, term785675));
        assertTrue(recursiveEquals(term785012, term785676));
        assertTrue(recursiveEquals(term785104, term785677));
        assertTrue(recursiveEquals(retValue, term785643));
    }

};


