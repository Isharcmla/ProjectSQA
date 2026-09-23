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

public class PeepholeFoldConstants_tryFoldComparison_8484431791442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356544;
     Object term356636;
     Object term356728;
     Object term356820;
     Object term356994;
     Object term356995;
     Object term356996;
     Object term356997;
     Object term356971;

    public PeepholeFoldConstants_tryFoldComparison_8484431791442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356544 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term356636 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term356636, term356636.getClass(), "type", 14);
        term356728 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term356728, term356728.getClass(), "type", 42);
        term356820 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term356820, term356820.getClass(), "type", 42);
        term356994 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term356994, term356994.getClass(), "currentTraversal", null);
        term356995 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term356995, term356995.getClass(), "str", null);
        setIntField(term356995, term356995.getClass(), "type", 42);
        setField(term356995, term356995.getClass(), "next", null);
        setField(term356995, term356995.getClass(), "first", null);
        setField(term356995, term356995.getClass(), "last", null);
        setField(term356995, term356995.getClass(), "propListHead", null);
        setIntField(term356995, term356995.getClass(), "sourcePosition", 0);
        setField(term356995, term356995.getClass(), "jsType", null);
        setField(term356995, term356995.getClass(), "parent", null);
        term356996 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term356996, term356996.getClass(), "str", null);
        setIntField(term356996, term356996.getClass(), "type", 14);
        setField(term356996, term356996.getClass(), "next", null);
        setField(term356996, term356996.getClass(), "first", null);
        setField(term356996, term356996.getClass(), "last", null);
        setField(term356996, term356996.getClass(), "propListHead", null);
        setIntField(term356996, term356996.getClass(), "sourcePosition", 0);
        setField(term356996, term356996.getClass(), "jsType", null);
        setField(term356996, term356996.getClass(), "parent", null);
        term356997 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term356997, term356997.getClass(), "number", 0.0);
        setIntField(term356997, term356997.getClass(), "type", 42);
        setField(term356997, term356997.getClass(), "next", null);
        setField(term356997, term356997.getClass(), "first", null);
        setField(term356997, term356997.getClass(), "last", null);
        setField(term356997, term356997.getClass(), "propListHead", null);
        setIntField(term356997, term356997.getClass(), "sourcePosition", 0);
        setField(term356997, term356997.getClass(), "jsType", null);
        setField(term356997, term356997.getClass(), "parent", null);
        term356971 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term356971, term356971.getClass(), "str", null);
        setIntField(term356971, term356971.getClass(), "type", 14);
        setField(term356971, term356971.getClass(), "next", null);
        setField(term356971, term356971.getClass(), "first", null);
        setField(term356971, term356971.getClass(), "last", null);
        setField(term356971, term356971.getClass(), "propListHead", null);
        setIntField(term356971, term356971.getClass(), "sourcePosition", 0);
        setField(term356971, term356971.getClass(), "jsType", null);
        setField(term356971, term356971.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term356636;
        args[1] = term356728;
        args[2] = term356820;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term356544, args);
        assertTrue(recursiveEquals(term356544, term356994));
        assertTrue(recursiveEquals(term356636, term356995));
        assertTrue(recursiveEquals(term356728, term356996));
        assertTrue(recursiveEquals(term356820, term356997));
        assertTrue(recursiveEquals(retValue, term356971));
    }

};


