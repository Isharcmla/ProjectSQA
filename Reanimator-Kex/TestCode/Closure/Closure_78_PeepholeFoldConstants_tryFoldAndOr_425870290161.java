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

public class PeepholeFoldConstants_tryFoldAndOr_425870290161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26795;
     Object term26887;
     Object term26979;
     Object term27036;
     Object term27037;
     Object term27038;
     Object term27014;

    public PeepholeFoldConstants_tryFoldAndOr_425870290161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26795 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term26887 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term26887, term26887.getClass(), "parent", null);
        setIntField(term26887, term26887.getClass(), "type", 0);
        term26979 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term27036 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term27036, term27036.getClass(), "currentTraversal", null);
        term27037 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term27037, term27037.getClass(), "str", null);
        setIntField(term27037, term27037.getClass(), "type", 0);
        setField(term27037, term27037.getClass(), "next", null);
        setField(term27037, term27037.getClass(), "first", null);
        setField(term27037, term27037.getClass(), "last", null);
        setField(term27037, term27037.getClass(), "propListHead", null);
        setIntField(term27037, term27037.getClass(), "sourcePosition", 0);
        setField(term27037, term27037.getClass(), "jsType", null);
        setField(term27037, term27037.getClass(), "parent", null);
        term27038 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term27038, term27038.getClass(), "str", null);
        setIntField(term27038, term27038.getClass(), "type", 0);
        setField(term27038, term27038.getClass(), "next", null);
        setField(term27038, term27038.getClass(), "first", null);
        setField(term27038, term27038.getClass(), "last", null);
        setField(term27038, term27038.getClass(), "propListHead", null);
        setIntField(term27038, term27038.getClass(), "sourcePosition", 0);
        setField(term27038, term27038.getClass(), "jsType", null);
        setField(term27038, term27038.getClass(), "parent", null);
        term27014 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term27014, term27014.getClass(), "str", null);
        setIntField(term27014, term27014.getClass(), "type", 0);
        setField(term27014, term27014.getClass(), "next", null);
        setField(term27014, term27014.getClass(), "first", null);
        setField(term27014, term27014.getClass(), "last", null);
        setField(term27014, term27014.getClass(), "propListHead", null);
        setIntField(term27014, term27014.getClass(), "sourcePosition", 0);
        setField(term27014, term27014.getClass(), "jsType", null);
        setField(term27014, term27014.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term26887;
        args[1] = term26979;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term26795, args);
        assertTrue(recursiveEquals(term26795, term27036));
        assertTrue(recursiveEquals(term26887, term27037));
        assertTrue(recursiveEquals(term26979, term27038));
        assertTrue(recursiveEquals(retValue, term27014));
    }

};


