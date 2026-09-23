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

public class PeepholeFoldConstants_tryFoldComparison_8484431791014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237394;
     Object term237486;
     Object term237578;
     Object term237670;
     Object term238036;
     Object term238037;
     Object term238038;
     Object term238039;
     Object term238016;

    public PeepholeFoldConstants_tryFoldComparison_8484431791014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237394 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term237486 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term237486, term237486.getClass(), "type", 16);
        term237578 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term237578, term237578.getClass(), "type", 42);
        term237670 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term237670, term237670.getClass(), "type", 42);
        term238036 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term238036, term238036.getClass(), "currentTraversal", null);
        term238037 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term238037, term238037.getClass(), "str", null);
        setIntField(term238037, term238037.getClass(), "type", 42);
        setField(term238037, term238037.getClass(), "next", null);
        setField(term238037, term238037.getClass(), "first", null);
        setField(term238037, term238037.getClass(), "last", null);
        setField(term238037, term238037.getClass(), "propListHead", null);
        setIntField(term238037, term238037.getClass(), "sourcePosition", 0);
        setField(term238037, term238037.getClass(), "jsType", null);
        setField(term238037, term238037.getClass(), "parent", null);
        term238038 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term238038, term238038.getClass(), "str", null);
        setIntField(term238038, term238038.getClass(), "type", 16);
        setField(term238038, term238038.getClass(), "next", null);
        setField(term238038, term238038.getClass(), "first", null);
        setField(term238038, term238038.getClass(), "last", null);
        setField(term238038, term238038.getClass(), "propListHead", null);
        setIntField(term238038, term238038.getClass(), "sourcePosition", 0);
        setField(term238038, term238038.getClass(), "jsType", null);
        setField(term238038, term238038.getClass(), "parent", null);
        term238039 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term238039, term238039.getClass(), "str", null);
        setIntField(term238039, term238039.getClass(), "type", 42);
        setField(term238039, term238039.getClass(), "next", null);
        setField(term238039, term238039.getClass(), "first", null);
        setField(term238039, term238039.getClass(), "last", null);
        setField(term238039, term238039.getClass(), "propListHead", null);
        setIntField(term238039, term238039.getClass(), "sourcePosition", 0);
        setField(term238039, term238039.getClass(), "jsType", null);
        setField(term238039, term238039.getClass(), "parent", null);
        term238016 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term238016, term238016.getClass(), "str", null);
        setIntField(term238016, term238016.getClass(), "type", 16);
        setField(term238016, term238016.getClass(), "next", null);
        setField(term238016, term238016.getClass(), "first", null);
        setField(term238016, term238016.getClass(), "last", null);
        setField(term238016, term238016.getClass(), "propListHead", null);
        setIntField(term238016, term238016.getClass(), "sourcePosition", 0);
        setField(term238016, term238016.getClass(), "jsType", null);
        setField(term238016, term238016.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term237486;
        args[1] = term237578;
        args[2] = term237670;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term237394, args);
        assertTrue(recursiveEquals(term237394, term238036));
        assertTrue(recursiveEquals(term237486, term238037));
        assertTrue(recursiveEquals(term237578, term238038));
        assertTrue(recursiveEquals(term237670, term238039));
        assertTrue(recursiveEquals(retValue, term238016));
    }

};


