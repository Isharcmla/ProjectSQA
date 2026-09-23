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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3596066;
     Object term3596158;
     Object term3597877;
     Object term3597878;
     Object term3597699;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3596066 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3596158 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3596250 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3596342 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3596434 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3596542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3596158, term3596158.getClass(), "type", 37);
        setIntField(term3596250, term3596250.getClass(), "type", 35);
        setIntField(term3596434, term3596434.getClass(), "type", 40);
        setField(term3596434, term3596434.getClass(), "str", "charCodeAt");
        setField(term3596342, term3596342.getClass(), "next", term3596434);
        setIntField(term3596342, term3596342.getClass(), "type", 40);
        setField(term3596250, term3596250.getClass(), "first", term3596342);
        setIntField(term3596542, term3596542.getClass(), "type", 40);
        setField(term3596250, term3596250.getClass(), "next", term3596542);
        setField(term3596158, term3596158.getClass(), "first", term3596250);
        term3597877 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3597877, term3597877.getClass(), "currentTraversal", null);
        term3597878 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3597879 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3597880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3597881 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3597882 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term3597878, term3597878.getClass(), "number", 0.0);
        setIntField(term3597878, term3597878.getClass(), "type", 37);
        setField(term3597878, term3597878.getClass(), "next", null);
        setField(term3597879, term3597879.getClass(), "str", null);
        setIntField(term3597879, term3597879.getClass(), "type", 35);
        setIntField(term3597880, term3597880.getClass(), "type", 40);
        setField(term3597880, term3597880.getClass(), "next", null);
        setField(term3597880, term3597880.getClass(), "first", null);
        setField(term3597880, term3597880.getClass(), "last", null);
        setField(term3597880, term3597880.getClass(), "propListHead", null);
        setIntField(term3597880, term3597880.getClass(), "sourcePosition", 0);
        setField(term3597880, term3597880.getClass(), "jsType", null);
        setField(term3597880, term3597880.getClass(), "parent", null);
        setField(term3597879, term3597879.getClass(), "next", term3597880);
        setField(term3597881, term3597881.getClass(), "str", null);
        setIntField(term3597881, term3597881.getClass(), "type", 40);
        setField(term3597882, term3597882.getClass(), "str", "");
        setIntField(term3597882, term3597882.getClass(), "type", 40);
        setField(term3597882, term3597882.getClass(), "next", null);
        setField(term3597882, term3597882.getClass(), "first", null);
        setField(term3597882, term3597882.getClass(), "last", null);
        setField(term3597882, term3597882.getClass(), "propListHead", null);
        setIntField(term3597882, term3597882.getClass(), "sourcePosition", 0);
        setField(term3597882, term3597882.getClass(), "jsType", null);
        setField(term3597882, term3597882.getClass(), "parent", null);
        setField(term3597881, term3597881.getClass(), "next", term3597882);
        setField(term3597881, term3597881.getClass(), "first", null);
        setField(term3597881, term3597881.getClass(), "last", null);
        setField(term3597881, term3597881.getClass(), "propListHead", null);
        setIntField(term3597881, term3597881.getClass(), "sourcePosition", 0);
        setField(term3597881, term3597881.getClass(), "jsType", null);
        setField(term3597881, term3597881.getClass(), "parent", null);
        setField(term3597879, term3597879.getClass(), "first", term3597881);
        setField(term3597879, term3597879.getClass(), "last", null);
        setField(term3597879, term3597879.getClass(), "propListHead", null);
        setIntField(term3597879, term3597879.getClass(), "sourcePosition", 0);
        setField(term3597879, term3597879.getClass(), "jsType", null);
        setField(term3597879, term3597879.getClass(), "parent", null);
        setField(term3597878, term3597878.getClass(), "first", term3597879);
        setField(term3597878, term3597878.getClass(), "last", null);
        setField(term3597878, term3597878.getClass(), "propListHead", null);
        setIntField(term3597878, term3597878.getClass(), "sourcePosition", 0);
        setField(term3597878, term3597878.getClass(), "jsType", null);
        setField(term3597878, term3597878.getClass(), "parent", null);
        term3597699 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3597702 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3597704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3597707 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3597709 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term3597699, term3597699.getClass(), "number", 0.0);
        setIntField(term3597699, term3597699.getClass(), "type", 37);
        setField(term3597699, term3597699.getClass(), "next", null);
        setField(term3597702, term3597702.getClass(), "str", null);
        setIntField(term3597702, term3597702.getClass(), "type", 35);
        setIntField(term3597704, term3597704.getClass(), "type", 40);
        setField(term3597704, term3597704.getClass(), "next", null);
        setField(term3597704, term3597704.getClass(), "first", null);
        setField(term3597704, term3597704.getClass(), "last", null);
        setField(term3597704, term3597704.getClass(), "propListHead", null);
        setIntField(term3597704, term3597704.getClass(), "sourcePosition", 0);
        setField(term3597704, term3597704.getClass(), "jsType", null);
        setField(term3597704, term3597704.getClass(), "parent", null);
        setField(term3597702, term3597702.getClass(), "next", term3597704);
        setField(term3597707, term3597707.getClass(), "str", null);
        setIntField(term3597707, term3597707.getClass(), "type", 40);
        setField(term3597709, term3597709.getClass(), "str", "");
        setIntField(term3597709, term3597709.getClass(), "type", 40);
        setField(term3597709, term3597709.getClass(), "next", null);
        setField(term3597709, term3597709.getClass(), "first", null);
        setField(term3597709, term3597709.getClass(), "last", null);
        setField(term3597709, term3597709.getClass(), "propListHead", null);
        setIntField(term3597709, term3597709.getClass(), "sourcePosition", 0);
        setField(term3597709, term3597709.getClass(), "jsType", null);
        setField(term3597709, term3597709.getClass(), "parent", null);
        setField(term3597707, term3597707.getClass(), "next", term3597709);
        setField(term3597707, term3597707.getClass(), "first", null);
        setField(term3597707, term3597707.getClass(), "last", null);
        setField(term3597707, term3597707.getClass(), "propListHead", null);
        setIntField(term3597707, term3597707.getClass(), "sourcePosition", 0);
        setField(term3597707, term3597707.getClass(), "jsType", null);
        setField(term3597707, term3597707.getClass(), "parent", null);
        setField(term3597702, term3597702.getClass(), "first", term3597707);
        setField(term3597702, term3597702.getClass(), "last", null);
        setField(term3597702, term3597702.getClass(), "propListHead", null);
        setIntField(term3597702, term3597702.getClass(), "sourcePosition", 0);
        setField(term3597702, term3597702.getClass(), "jsType", null);
        setField(term3597702, term3597702.getClass(), "parent", null);
        setField(term3597699, term3597699.getClass(), "first", term3597702);
        setField(term3597699, term3597699.getClass(), "last", null);
        setField(term3597699, term3597699.getClass(), "propListHead", null);
        setIntField(term3597699, term3597699.getClass(), "sourcePosition", 0);
        setField(term3597699, term3597699.getClass(), "jsType", null);
        setField(term3597699, term3597699.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3596158;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3596066, args);
        assertTrue(recursiveEquals(term3596066, term3597877));
        assertTrue(recursiveEquals(term3596158, term3597878));
        assertTrue(recursiveEquals(retValue, term3597699));
    }

};


