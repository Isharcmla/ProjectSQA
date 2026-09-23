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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term672281;
     Object term672373;
     Object term672557;
     Object term672649;
     Object term673102;
     Object term673103;
     Object term673105;
     Object term673106;
     Object term673029;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term672281 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term672373 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term672465 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term672465, term672465.getClass(), "type", 114);
        setField(term672373, term672373.getClass(), "parent", term672465);
        setIntField(term672373, term672373.getClass(), "type", 0);
        term672557 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term672557, term672557.getClass(), "type", 117);
        term672649 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term672649, term672649.getClass(), "type", 47);
        term673102 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term673102, term673102.getClass(), "currentTraversal", null);
        term673103 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term673104 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term673103, term673103.getClass(), "number", 0.0);
        setIntField(term673103, term673103.getClass(), "type", 0);
        setField(term673103, term673103.getClass(), "next", null);
        setField(term673103, term673103.getClass(), "first", null);
        setField(term673103, term673103.getClass(), "last", null);
        setField(term673103, term673103.getClass(), "propListHead", null);
        setIntField(term673103, term673103.getClass(), "sourcePosition", 0);
        setField(term673103, term673103.getClass(), "jsType", null);
        setDoubleField(term673104, term673104.getClass(), "number", 0.0);
        setIntField(term673104, term673104.getClass(), "type", 114);
        setField(term673104, term673104.getClass(), "next", null);
        setField(term673104, term673104.getClass(), "first", null);
        setField(term673104, term673104.getClass(), "last", null);
        setField(term673104, term673104.getClass(), "propListHead", null);
        setIntField(term673104, term673104.getClass(), "sourcePosition", 0);
        setField(term673104, term673104.getClass(), "jsType", null);
        setField(term673104, term673104.getClass(), "parent", null);
        setField(term673103, term673103.getClass(), "parent", term673104);
        term673105 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term673105, term673105.getClass(), "number", 0.0);
        setIntField(term673105, term673105.getClass(), "type", 117);
        setField(term673105, term673105.getClass(), "next", null);
        setField(term673105, term673105.getClass(), "first", null);
        setField(term673105, term673105.getClass(), "last", null);
        setField(term673105, term673105.getClass(), "propListHead", null);
        setIntField(term673105, term673105.getClass(), "sourcePosition", 0);
        setField(term673105, term673105.getClass(), "jsType", null);
        setField(term673105, term673105.getClass(), "parent", null);
        term673106 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term673106, term673106.getClass(), "str", null);
        setIntField(term673106, term673106.getClass(), "type", 47);
        setField(term673106, term673106.getClass(), "next", null);
        setField(term673106, term673106.getClass(), "first", null);
        setField(term673106, term673106.getClass(), "last", null);
        setField(term673106, term673106.getClass(), "propListHead", null);
        setIntField(term673106, term673106.getClass(), "sourcePosition", 0);
        setField(term673106, term673106.getClass(), "jsType", null);
        setField(term673106, term673106.getClass(), "parent", null);
        term673029 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term673033 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term673029, term673029.getClass(), "number", 0.0);
        setIntField(term673029, term673029.getClass(), "type", 0);
        setField(term673029, term673029.getClass(), "next", null);
        setField(term673029, term673029.getClass(), "first", null);
        setField(term673029, term673029.getClass(), "last", null);
        setField(term673029, term673029.getClass(), "propListHead", null);
        setIntField(term673029, term673029.getClass(), "sourcePosition", 0);
        setField(term673029, term673029.getClass(), "jsType", null);
        setDoubleField(term673033, term673033.getClass(), "number", 0.0);
        setIntField(term673033, term673033.getClass(), "type", 114);
        setField(term673033, term673033.getClass(), "next", null);
        setField(term673033, term673033.getClass(), "first", null);
        setField(term673033, term673033.getClass(), "last", null);
        setField(term673033, term673033.getClass(), "propListHead", null);
        setIntField(term673033, term673033.getClass(), "sourcePosition", 0);
        setField(term673033, term673033.getClass(), "jsType", null);
        setField(term673033, term673033.getClass(), "parent", null);
        setField(term673029, term673029.getClass(), "parent", term673033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term672373;
        args[1] = term672557;
        args[2] = term672649;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term672281, args);
        assertTrue(recursiveEquals(term672281, term673102));
        assertTrue(recursiveEquals(term672373, term673103));
        assertTrue(recursiveEquals(term672557, term673105));
        assertTrue(recursiveEquals(term672649, term673106));
        assertTrue(recursiveEquals(retValue, term673029));
    }

};


