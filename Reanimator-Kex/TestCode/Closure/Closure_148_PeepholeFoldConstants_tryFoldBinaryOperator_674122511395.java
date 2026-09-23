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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79759;
     Object term79851;
     Object term80626;
     Object term80627;
     Object term80590;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79759 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term79851 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term79943 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term80035 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term79943, term79943.getClass(), "next", term80035);
        setIntField(term79943, term79943.getClass(), "type", 63);
        setField(term79851, term79851.getClass(), "first", term79943);
        setIntField(term79851, term79851.getClass(), "type", 35);
        term80626 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term80626, term80626.getClass(), "currentTraversal", null);
        term80627 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term80628 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term80629 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term80627, term80627.getClass(), "str", null);
        setIntField(term80627, term80627.getClass(), "type", 35);
        setField(term80627, term80627.getClass(), "next", null);
        setField(term80628, term80628.getClass(), "str", null);
        setIntField(term80628, term80628.getClass(), "type", 63);
        setDoubleField(term80629, term80629.getClass(), "number", 0.0);
        setIntField(term80629, term80629.getClass(), "type", 0);
        setField(term80629, term80629.getClass(), "next", null);
        setField(term80629, term80629.getClass(), "first", null);
        setField(term80629, term80629.getClass(), "last", null);
        setField(term80629, term80629.getClass(), "propListHead", null);
        setIntField(term80629, term80629.getClass(), "sourcePosition", 0);
        setField(term80629, term80629.getClass(), "jsType", null);
        setField(term80629, term80629.getClass(), "parent", null);
        setField(term80628, term80628.getClass(), "next", term80629);
        setField(term80628, term80628.getClass(), "first", null);
        setField(term80628, term80628.getClass(), "last", null);
        setField(term80628, term80628.getClass(), "propListHead", null);
        setIntField(term80628, term80628.getClass(), "sourcePosition", 0);
        setField(term80628, term80628.getClass(), "jsType", null);
        setField(term80628, term80628.getClass(), "parent", null);
        setField(term80627, term80627.getClass(), "first", term80628);
        setField(term80627, term80627.getClass(), "last", null);
        setField(term80627, term80627.getClass(), "propListHead", null);
        setIntField(term80627, term80627.getClass(), "sourcePosition", 0);
        setField(term80627, term80627.getClass(), "jsType", null);
        setField(term80627, term80627.getClass(), "parent", null);
        term80590 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term80592 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term80594 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term80590, term80590.getClass(), "str", null);
        setIntField(term80590, term80590.getClass(), "type", 35);
        setField(term80590, term80590.getClass(), "next", null);
        setField(term80592, term80592.getClass(), "str", null);
        setIntField(term80592, term80592.getClass(), "type", 63);
        setDoubleField(term80594, term80594.getClass(), "number", 0.0);
        setIntField(term80594, term80594.getClass(), "type", 0);
        setField(term80594, term80594.getClass(), "next", null);
        setField(term80594, term80594.getClass(), "first", null);
        setField(term80594, term80594.getClass(), "last", null);
        setField(term80594, term80594.getClass(), "propListHead", null);
        setIntField(term80594, term80594.getClass(), "sourcePosition", 0);
        setField(term80594, term80594.getClass(), "jsType", null);
        setField(term80594, term80594.getClass(), "parent", null);
        setField(term80592, term80592.getClass(), "next", term80594);
        setField(term80592, term80592.getClass(), "first", null);
        setField(term80592, term80592.getClass(), "last", null);
        setField(term80592, term80592.getClass(), "propListHead", null);
        setIntField(term80592, term80592.getClass(), "sourcePosition", 0);
        setField(term80592, term80592.getClass(), "jsType", null);
        setField(term80592, term80592.getClass(), "parent", null);
        setField(term80590, term80590.getClass(), "first", term80592);
        setField(term80590, term80590.getClass(), "last", null);
        setField(term80590, term80590.getClass(), "propListHead", null);
        setIntField(term80590, term80590.getClass(), "sourcePosition", 0);
        setField(term80590, term80590.getClass(), "jsType", null);
        setField(term80590, term80590.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term79851;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term79759, args);
        assertTrue(recursiveEquals(term79759, term80626));
        assertTrue(recursiveEquals(term79851, term80627));
        assertTrue(recursiveEquals(retValue, term80590));
    }

};


