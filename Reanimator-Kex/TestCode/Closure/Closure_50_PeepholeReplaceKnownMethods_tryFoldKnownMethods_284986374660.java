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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3584433;
     Object term3584525;
     Object term3586135;
     Object term3586136;
     Object term3585828;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3584433 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3584525 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3584617 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3584709 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3584801 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3584969 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3585061 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3584617, term3584617.getClass(), "type", 35);
        setIntField(term3584801, term3584801.getClass(), "type", 40);
        setField(term3584801, term3584801.getClass(), "str", "substr");
        setField(term3584709, term3584709.getClass(), "next", term3584801);
        setIntField(term3584709, term3584709.getClass(), "type", 40);
        setField(term3584709, term3584709.getClass(), "str", "");
        setField(term3584617, term3584617.getClass(), "first", term3584709);
        setIntField(term3584969, term3584969.getClass(), "type", 39);
        setDoubleField(term3584969, term3584969.getClass(), "number", 9.2194313987240837E18);
        setField(term3584969, term3584969.getClass(), "next", null);
        setField(term3584617, term3584617.getClass(), "next", term3584969);
        setField(term3584525, term3584525.getClass(), "first", term3584617);
        setIntField(term3584525, term3584525.getClass(), "type", 37);
        setField(term3584525, term3584525.getClass(), "parent", term3585061);
        term3586135 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3586135, term3586135.getClass(), "currentTraversal", null);
        term3586136 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3586137 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3586138 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3586139 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3586142 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3586144 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term3586136, term3586136.getClass(), "str", null);
        setIntField(term3586136, term3586136.getClass(), "type", 37);
        setField(term3586136, term3586136.getClass(), "next", null);
        setField(term3586137, term3586137.getClass(), "str", null);
        setIntField(term3586137, term3586137.getClass(), "type", 35);
        setDoubleField(term3586138, term3586138.getClass(), "number", 9.2194313987240837E18);
        setIntField(term3586138, term3586138.getClass(), "type", 39);
        setField(term3586138, term3586138.getClass(), "next", null);
        setField(term3586138, term3586138.getClass(), "first", null);
        setField(term3586138, term3586138.getClass(), "last", null);
        setField(term3586138, term3586138.getClass(), "propListHead", null);
        setIntField(term3586138, term3586138.getClass(), "sourcePosition", 0);
        setField(term3586138, term3586138.getClass(), "jsType", null);
        setField(term3586138, term3586138.getClass(), "parent", null);
        setField(term3586137, term3586137.getClass(), "next", term3586138);
        setField(term3586139, term3586139.getClass(), "str", "");
        setIntField(term3586139, term3586139.getClass(), "type", 40);
        setField(term3586142, term3586142.getClass(), "str", "");
        setIntField(term3586142, term3586142.getClass(), "type", 40);
        setField(term3586142, term3586142.getClass(), "next", null);
        setField(term3586142, term3586142.getClass(), "first", null);
        setField(term3586142, term3586142.getClass(), "last", null);
        setField(term3586142, term3586142.getClass(), "propListHead", null);
        setIntField(term3586142, term3586142.getClass(), "sourcePosition", 0);
        setField(term3586142, term3586142.getClass(), "jsType", null);
        setField(term3586142, term3586142.getClass(), "parent", null);
        setField(term3586139, term3586139.getClass(), "next", term3586142);
        setField(term3586139, term3586139.getClass(), "first", null);
        setField(term3586139, term3586139.getClass(), "last", null);
        setField(term3586139, term3586139.getClass(), "propListHead", null);
        setIntField(term3586139, term3586139.getClass(), "sourcePosition", 0);
        setField(term3586139, term3586139.getClass(), "jsType", null);
        setField(term3586139, term3586139.getClass(), "parent", null);
        setField(term3586137, term3586137.getClass(), "first", term3586139);
        setField(term3586137, term3586137.getClass(), "last", null);
        setField(term3586137, term3586137.getClass(), "propListHead", null);
        setIntField(term3586137, term3586137.getClass(), "sourcePosition", 0);
        setField(term3586137, term3586137.getClass(), "jsType", null);
        setField(term3586137, term3586137.getClass(), "parent", null);
        setField(term3586136, term3586136.getClass(), "first", term3586137);
        setField(term3586136, term3586136.getClass(), "last", null);
        setField(term3586136, term3586136.getClass(), "propListHead", null);
        setIntField(term3586136, term3586136.getClass(), "sourcePosition", 0);
        setField(term3586136, term3586136.getClass(), "jsType", null);
        setDoubleField(term3586144, term3586144.getClass(), "number", 0.0);
        setIntField(term3586144, term3586144.getClass(), "type", 0);
        setField(term3586144, term3586144.getClass(), "next", null);
        setField(term3586144, term3586144.getClass(), "first", null);
        setField(term3586144, term3586144.getClass(), "last", null);
        setField(term3586144, term3586144.getClass(), "propListHead", null);
        setIntField(term3586144, term3586144.getClass(), "sourcePosition", 0);
        setField(term3586144, term3586144.getClass(), "jsType", null);
        setField(term3586144, term3586144.getClass(), "parent", null);
        setField(term3586136, term3586136.getClass(), "parent", term3586144);
        term3585828 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3585830 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3585832 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3585836 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3585840 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3585847 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term3585828, term3585828.getClass(), "str", null);
        setIntField(term3585828, term3585828.getClass(), "type", 37);
        setField(term3585828, term3585828.getClass(), "next", null);
        setField(term3585830, term3585830.getClass(), "str", null);
        setIntField(term3585830, term3585830.getClass(), "type", 35);
        setDoubleField(term3585832, term3585832.getClass(), "number", 9.2194313987240837E18);
        setIntField(term3585832, term3585832.getClass(), "type", 39);
        setField(term3585832, term3585832.getClass(), "next", null);
        setField(term3585832, term3585832.getClass(), "first", null);
        setField(term3585832, term3585832.getClass(), "last", null);
        setField(term3585832, term3585832.getClass(), "propListHead", null);
        setIntField(term3585832, term3585832.getClass(), "sourcePosition", 0);
        setField(term3585832, term3585832.getClass(), "jsType", null);
        setField(term3585832, term3585832.getClass(), "parent", null);
        setField(term3585830, term3585830.getClass(), "next", term3585832);
        setField(term3585836, term3585836.getClass(), "str", "");
        setIntField(term3585836, term3585836.getClass(), "type", 40);
        setField(term3585840, term3585840.getClass(), "str", "");
        setIntField(term3585840, term3585840.getClass(), "type", 40);
        setField(term3585840, term3585840.getClass(), "next", null);
        setField(term3585840, term3585840.getClass(), "first", null);
        setField(term3585840, term3585840.getClass(), "last", null);
        setField(term3585840, term3585840.getClass(), "propListHead", null);
        setIntField(term3585840, term3585840.getClass(), "sourcePosition", 0);
        setField(term3585840, term3585840.getClass(), "jsType", null);
        setField(term3585840, term3585840.getClass(), "parent", null);
        setField(term3585836, term3585836.getClass(), "next", term3585840);
        setField(term3585836, term3585836.getClass(), "first", null);
        setField(term3585836, term3585836.getClass(), "last", null);
        setField(term3585836, term3585836.getClass(), "propListHead", null);
        setIntField(term3585836, term3585836.getClass(), "sourcePosition", 0);
        setField(term3585836, term3585836.getClass(), "jsType", null);
        setField(term3585836, term3585836.getClass(), "parent", null);
        setField(term3585830, term3585830.getClass(), "first", term3585836);
        setField(term3585830, term3585830.getClass(), "last", null);
        setField(term3585830, term3585830.getClass(), "propListHead", null);
        setIntField(term3585830, term3585830.getClass(), "sourcePosition", 0);
        setField(term3585830, term3585830.getClass(), "jsType", null);
        setField(term3585830, term3585830.getClass(), "parent", null);
        setField(term3585828, term3585828.getClass(), "first", term3585830);
        setField(term3585828, term3585828.getClass(), "last", null);
        setField(term3585828, term3585828.getClass(), "propListHead", null);
        setIntField(term3585828, term3585828.getClass(), "sourcePosition", 0);
        setField(term3585828, term3585828.getClass(), "jsType", null);
        setDoubleField(term3585847, term3585847.getClass(), "number", 0.0);
        setIntField(term3585847, term3585847.getClass(), "type", 0);
        setField(term3585847, term3585847.getClass(), "next", null);
        setField(term3585847, term3585847.getClass(), "first", null);
        setField(term3585847, term3585847.getClass(), "last", null);
        setField(term3585847, term3585847.getClass(), "propListHead", null);
        setIntField(term3585847, term3585847.getClass(), "sourcePosition", 0);
        setField(term3585847, term3585847.getClass(), "jsType", null);
        setField(term3585847, term3585847.getClass(), "parent", null);
        setField(term3585828, term3585828.getClass(), "parent", term3585847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3584525;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3584433, args);
        assertTrue(recursiveEquals(term3584433, term3586135));
        assertTrue(recursiveEquals(term3584525, term3586136));
        assertTrue(recursiveEquals(retValue, term3585828));
    }

};


