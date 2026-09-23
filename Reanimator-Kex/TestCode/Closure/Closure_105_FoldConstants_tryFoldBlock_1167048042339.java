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

public class FoldConstants_tryFoldBlock_1167048042339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93998;
     Object term94068;
     Object term94585;
     Object term94586;

    public FoldConstants_tryFoldBlock_1167048042339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93998 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term94068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term94278, term94278.getClass(), "next", term94348);
        setIntField(term94278, term94278.getClass(), "type", 48);
        setField(term94208, term94208.getClass(), "next", term94278);
        setIntField(term94208, term94208.getClass(), "type", 88);
        setIntField(term94418, term94418.getClass(), "type", 31);
        setField(term94208, term94208.getClass(), "first", term94418);
        setField(term94138, term94138.getClass(), "next", term94208);
        setIntField(term94138, term94138.getClass(), "type", 31);
        setField(term94068, term94068.getClass(), "first", term94138);
        term94585 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term94585, term94585.getClass(), "compiler", null);
        term94586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term94586, term94586.getClass(), "type", 0);
        setField(term94586, term94586.getClass(), "next", null);
        setIntField(term94587, term94587.getClass(), "type", 31);
        setIntField(term94588, term94588.getClass(), "type", 88);
        setIntField(term94589, term94589.getClass(), "type", 48);
        setIntField(term94590, term94590.getClass(), "type", 0);
        setField(term94590, term94590.getClass(), "next", null);
        setField(term94590, term94590.getClass(), "first", null);
        setField(term94590, term94590.getClass(), "last", null);
        setField(term94590, term94590.getClass(), "propListHead", null);
        setIntField(term94590, term94590.getClass(), "sourcePosition", 0);
        setField(term94590, term94590.getClass(), "jsType", null);
        setField(term94590, term94590.getClass(), "parent", null);
        setField(term94589, term94589.getClass(), "next", term94590);
        setField(term94589, term94589.getClass(), "first", null);
        setField(term94589, term94589.getClass(), "last", null);
        setField(term94589, term94589.getClass(), "propListHead", null);
        setIntField(term94589, term94589.getClass(), "sourcePosition", 0);
        setField(term94589, term94589.getClass(), "jsType", null);
        setField(term94589, term94589.getClass(), "parent", null);
        setField(term94588, term94588.getClass(), "next", term94589);
        setIntField(term94591, term94591.getClass(), "type", 31);
        setField(term94591, term94591.getClass(), "next", null);
        setField(term94591, term94591.getClass(), "first", null);
        setField(term94591, term94591.getClass(), "last", null);
        setField(term94591, term94591.getClass(), "propListHead", null);
        setIntField(term94591, term94591.getClass(), "sourcePosition", 0);
        setField(term94591, term94591.getClass(), "jsType", null);
        setField(term94591, term94591.getClass(), "parent", null);
        setField(term94588, term94588.getClass(), "first", term94591);
        setField(term94588, term94588.getClass(), "last", null);
        setField(term94588, term94588.getClass(), "propListHead", null);
        setIntField(term94588, term94588.getClass(), "sourcePosition", 0);
        setField(term94588, term94588.getClass(), "jsType", null);
        setField(term94588, term94588.getClass(), "parent", null);
        setField(term94587, term94587.getClass(), "next", term94588);
        setField(term94587, term94587.getClass(), "first", null);
        setField(term94587, term94587.getClass(), "last", null);
        setField(term94587, term94587.getClass(), "propListHead", null);
        setIntField(term94587, term94587.getClass(), "sourcePosition", 0);
        setField(term94587, term94587.getClass(), "jsType", null);
        setField(term94587, term94587.getClass(), "parent", null);
        setField(term94586, term94586.getClass(), "first", term94587);
        setField(term94586, term94586.getClass(), "last", null);
        setField(term94586, term94586.getClass(), "propListHead", null);
        setIntField(term94586, term94586.getClass(), "sourcePosition", 0);
        setField(term94586, term94586.getClass(), "jsType", null);
        setField(term94586, term94586.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term94068;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term93998, args);
        assertTrue(recursiveEquals(term93998, term94585));
        assertTrue(recursiveEquals(term94068, null));
    }

};


