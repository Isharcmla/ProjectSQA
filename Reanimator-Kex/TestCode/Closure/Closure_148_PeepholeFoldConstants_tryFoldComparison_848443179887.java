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

public class PeepholeFoldConstants_tryFoldComparison_848443179887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205355;
     Object term205447;
     Object term205539;
     Object term205631;
     Object term206079;
     Object term206080;
     Object term206081;
     Object term206082;
     Object term206059;

    public PeepholeFoldConstants_tryFoldComparison_848443179887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205355 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term205447 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term205447, term205447.getClass(), "type", 14);
        term205539 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term205539, term205539.getClass(), "type", 14);
        term205631 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term206079 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term206079, term206079.getClass(), "currentTraversal", null);
        term206080 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term206080, term206080.getClass(), "str", null);
        setIntField(term206080, term206080.getClass(), "type", 14);
        setField(term206080, term206080.getClass(), "next", null);
        setField(term206080, term206080.getClass(), "first", null);
        setField(term206080, term206080.getClass(), "last", null);
        setField(term206080, term206080.getClass(), "propListHead", null);
        setIntField(term206080, term206080.getClass(), "sourcePosition", 0);
        setField(term206080, term206080.getClass(), "jsType", null);
        setField(term206080, term206080.getClass(), "parent", null);
        term206081 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term206081, term206081.getClass(), "str", null);
        setIntField(term206081, term206081.getClass(), "type", 14);
        setField(term206081, term206081.getClass(), "next", null);
        setField(term206081, term206081.getClass(), "first", null);
        setField(term206081, term206081.getClass(), "last", null);
        setField(term206081, term206081.getClass(), "propListHead", null);
        setIntField(term206081, term206081.getClass(), "sourcePosition", 0);
        setField(term206081, term206081.getClass(), "jsType", null);
        setField(term206081, term206081.getClass(), "parent", null);
        term206082 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term206082, term206082.getClass(), "str", null);
        setIntField(term206082, term206082.getClass(), "type", 0);
        setField(term206082, term206082.getClass(), "next", null);
        setField(term206082, term206082.getClass(), "first", null);
        setField(term206082, term206082.getClass(), "last", null);
        setField(term206082, term206082.getClass(), "propListHead", null);
        setIntField(term206082, term206082.getClass(), "sourcePosition", 0);
        setField(term206082, term206082.getClass(), "jsType", null);
        setField(term206082, term206082.getClass(), "parent", null);
        term206059 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term206059, term206059.getClass(), "str", null);
        setIntField(term206059, term206059.getClass(), "type", 14);
        setField(term206059, term206059.getClass(), "next", null);
        setField(term206059, term206059.getClass(), "first", null);
        setField(term206059, term206059.getClass(), "last", null);
        setField(term206059, term206059.getClass(), "propListHead", null);
        setIntField(term206059, term206059.getClass(), "sourcePosition", 0);
        setField(term206059, term206059.getClass(), "jsType", null);
        setField(term206059, term206059.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term205447;
        args[1] = term205539;
        args[2] = term205631;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term205355, args);
        assertTrue(recursiveEquals(term205355, term206079));
        assertTrue(recursiveEquals(term205447, term206080));
        assertTrue(recursiveEquals(term205539, term206081));
        assertTrue(recursiveEquals(term205631, term206082));
        assertTrue(recursiveEquals(retValue, term206059));
    }

};


