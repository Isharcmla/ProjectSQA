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

public class PeepholeFoldConstants_tryFoldComparison_848443179769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173622;
     Object term173714;
     Object term173806;
     Object term173898;
     Object term174451;
     Object term174452;
     Object term174453;
     Object term174454;
     Object term174433;

    public PeepholeFoldConstants_tryFoldComparison_848443179769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173622 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term173714 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term173714, term173714.getClass(), "type", 16);
        term173806 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term173806, term173806.getClass(), "type", 16);
        term173898 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term174451 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term174451, term174451.getClass(), "currentTraversal", null);
        term174452 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term174452, term174452.getClass(), "str", null);
        setIntField(term174452, term174452.getClass(), "type", 16);
        setField(term174452, term174452.getClass(), "next", null);
        setField(term174452, term174452.getClass(), "first", null);
        setField(term174452, term174452.getClass(), "last", null);
        setField(term174452, term174452.getClass(), "propListHead", null);
        setIntField(term174452, term174452.getClass(), "sourcePosition", 0);
        setField(term174452, term174452.getClass(), "jsType", null);
        setField(term174452, term174452.getClass(), "parent", null);
        term174453 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term174453, term174453.getClass(), "str", null);
        setIntField(term174453, term174453.getClass(), "type", 16);
        setField(term174453, term174453.getClass(), "next", null);
        setField(term174453, term174453.getClass(), "first", null);
        setField(term174453, term174453.getClass(), "last", null);
        setField(term174453, term174453.getClass(), "propListHead", null);
        setIntField(term174453, term174453.getClass(), "sourcePosition", 0);
        setField(term174453, term174453.getClass(), "jsType", null);
        setField(term174453, term174453.getClass(), "parent", null);
        term174454 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term174454, term174454.getClass(), "str", null);
        setIntField(term174454, term174454.getClass(), "type", 0);
        setField(term174454, term174454.getClass(), "next", null);
        setField(term174454, term174454.getClass(), "first", null);
        setField(term174454, term174454.getClass(), "last", null);
        setField(term174454, term174454.getClass(), "propListHead", null);
        setIntField(term174454, term174454.getClass(), "sourcePosition", 0);
        setField(term174454, term174454.getClass(), "jsType", null);
        setField(term174454, term174454.getClass(), "parent", null);
        term174433 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term174433, term174433.getClass(), "str", null);
        setIntField(term174433, term174433.getClass(), "type", 16);
        setField(term174433, term174433.getClass(), "next", null);
        setField(term174433, term174433.getClass(), "first", null);
        setField(term174433, term174433.getClass(), "last", null);
        setField(term174433, term174433.getClass(), "propListHead", null);
        setIntField(term174433, term174433.getClass(), "sourcePosition", 0);
        setField(term174433, term174433.getClass(), "jsType", null);
        setField(term174433, term174433.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term173714;
        args[1] = term173806;
        args[2] = term173898;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term173622, args);
        assertTrue(recursiveEquals(term173622, term174451));
        assertTrue(recursiveEquals(term173714, term174452));
        assertTrue(recursiveEquals(term173806, term174453));
        assertTrue(recursiveEquals(term173898, term174454));
        assertTrue(recursiveEquals(retValue, term174433));
    }

};


