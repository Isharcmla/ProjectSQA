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

public class PeepholeFoldConstants_tryFoldComparison_8484431792354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term652696;
     Object term652788;
     Object term652880;
     Object term652972;
     Object term653003;
     Object term653004;
     Object term653005;
     Object term653006;
     Object term652982;

    public PeepholeFoldConstants_tryFoldComparison_8484431792354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term652696 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term652788 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term652788, term652788.getClass(), "type", 16);
        term652880 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term652880, term652880.getClass(), "type", 42);
        term652972 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term652972, term652972.getClass(), "type", 42);
        term653003 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term653003, term653003.getClass(), "currentTraversal", null);
        term653004 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term653004, term653004.getClass(), "str", null);
        setIntField(term653004, term653004.getClass(), "type", 42);
        setField(term653004, term653004.getClass(), "next", null);
        setField(term653004, term653004.getClass(), "first", null);
        setField(term653004, term653004.getClass(), "last", null);
        setField(term653004, term653004.getClass(), "propListHead", null);
        setIntField(term653004, term653004.getClass(), "sourcePosition", 0);
        setField(term653004, term653004.getClass(), "jsType", null);
        setField(term653004, term653004.getClass(), "parent", null);
        term653005 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term653005, term653005.getClass(), "str", null);
        setIntField(term653005, term653005.getClass(), "type", 16);
        setField(term653005, term653005.getClass(), "next", null);
        setField(term653005, term653005.getClass(), "first", null);
        setField(term653005, term653005.getClass(), "last", null);
        setField(term653005, term653005.getClass(), "propListHead", null);
        setIntField(term653005, term653005.getClass(), "sourcePosition", 0);
        setField(term653005, term653005.getClass(), "jsType", null);
        setField(term653005, term653005.getClass(), "parent", null);
        term653006 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term653006, term653006.getClass(), "number", 0.0);
        setIntField(term653006, term653006.getClass(), "type", 42);
        setField(term653006, term653006.getClass(), "next", null);
        setField(term653006, term653006.getClass(), "first", null);
        setField(term653006, term653006.getClass(), "last", null);
        setField(term653006, term653006.getClass(), "propListHead", null);
        setIntField(term653006, term653006.getClass(), "sourcePosition", 0);
        setField(term653006, term653006.getClass(), "jsType", null);
        setField(term653006, term653006.getClass(), "parent", null);
        term652982 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term652982, term652982.getClass(), "str", null);
        setIntField(term652982, term652982.getClass(), "type", 16);
        setField(term652982, term652982.getClass(), "next", null);
        setField(term652982, term652982.getClass(), "first", null);
        setField(term652982, term652982.getClass(), "last", null);
        setField(term652982, term652982.getClass(), "propListHead", null);
        setIntField(term652982, term652982.getClass(), "sourcePosition", 0);
        setField(term652982, term652982.getClass(), "jsType", null);
        setField(term652982, term652982.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term652788;
        args[1] = term652880;
        args[2] = term652972;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term652696, args);
        assertTrue(recursiveEquals(term652696, term653003));
        assertTrue(recursiveEquals(term652788, term653004));
        assertTrue(recursiveEquals(term652880, term653005));
        assertTrue(recursiveEquals(term652972, term653006));
        assertTrue(recursiveEquals(retValue, term652982));
    }

};


