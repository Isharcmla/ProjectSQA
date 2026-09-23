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

public class NodeUtil_isArrayLiteral_986440215242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1834;
     Object term14076;

    public NodeUtil_isArrayLiteral_986440215242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1834, term1834.getClass(), "type", 722787672);
        setIntField(term1836, term1836.getClass(), "type", -2093707412);
        setIntField(term1838, term1838.getClass(), "type", 0);
        setField(term1838, term1838.getClass(), "next", null);
        setField(term1838, term1838.getClass(), "first", null);
        setField(term1838, term1838.getClass(), "last", null);
        setField(term1838, term1838.getClass(), "propListHead", null);
        setIntField(term1838, term1838.getClass(), "sourcePosition", 0);
        setField(term1838, term1838.getClass(), "jsType", null);
        setField(term1838, term1838.getClass(), "parent", null);
        setField(term1836, term1836.getClass(), "next", term1838);
        setIntField(term1841, term1841.getClass(), "type", 0);
        setField(term1841, term1841.getClass(), "next", null);
        setField(term1841, term1841.getClass(), "first", null);
        setField(term1841, term1841.getClass(), "last", null);
        setField(term1841, term1841.getClass(), "propListHead", null);
        setIntField(term1841, term1841.getClass(), "sourcePosition", 0);
        setField(term1841, term1841.getClass(), "jsType", null);
        setField(term1841, term1841.getClass(), "parent", null);
        setField(term1836, term1836.getClass(), "first", term1841);
        setIntField(term1844, term1844.getClass(), "type", 0);
        setField(term1844, term1844.getClass(), "next", null);
        setField(term1844, term1844.getClass(), "first", null);
        setField(term1844, term1844.getClass(), "last", null);
        setField(term1844, term1844.getClass(), "propListHead", null);
        setIntField(term1844, term1844.getClass(), "sourcePosition", 0);
        setField(term1844, term1844.getClass(), "jsType", null);
        setField(term1844, term1844.getClass(), "parent", null);
        setField(term1836, term1836.getClass(), "last", term1844);
        setField(term1836, term1836.getClass(), "propListHead", null);
        setIntField(term1836, term1836.getClass(), "sourcePosition", 0);
        setField(term1836, term1836.getClass(), "jsType", null);
        setField(term1836, term1836.getClass(), "parent", null);
        setField(term1834, term1834.getClass(), "next", term1836);
        setIntField(term1848, term1848.getClass(), "type", 0);
        setField(term1848, term1848.getClass(), "next", null);
        setField(term1848, term1848.getClass(), "first", null);
        setField(term1848, term1848.getClass(), "last", null);
        setField(term1848, term1848.getClass(), "propListHead", null);
        setIntField(term1848, term1848.getClass(), "sourcePosition", 0);
        setField(term1848, term1848.getClass(), "jsType", null);
        setField(term1848, term1848.getClass(), "parent", null);
        setField(term1834, term1834.getClass(), "first", term1848);
        setIntField(term1851, term1851.getClass(), "type", 0);
        setField(term1851, term1851.getClass(), "next", null);
        setField(term1851, term1851.getClass(), "first", null);
        setField(term1851, term1851.getClass(), "last", null);
        setField(term1851, term1851.getClass(), "propListHead", null);
        setIntField(term1851, term1851.getClass(), "sourcePosition", 0);
        setField(term1851, term1851.getClass(), "jsType", null);
        setField(term1851, term1851.getClass(), "parent", null);
        setField(term1834, term1834.getClass(), "last", term1851);
        setField(term1834, term1834.getClass(), "propListHead", null);
        setIntField(term1834, term1834.getClass(), "sourcePosition", 0);
        setField(term1834, term1834.getClass(), "jsType", null);
        setField(term1834, term1834.getClass(), "parent", null);
        term14076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14076, term14076.getClass(), "type", 722787672);
        setIntField(term14077, term14077.getClass(), "type", -2093707412);
        setIntField(term14078, term14078.getClass(), "type", 0);
        setField(term14078, term14078.getClass(), "next", null);
        setField(term14078, term14078.getClass(), "first", null);
        setField(term14078, term14078.getClass(), "last", null);
        setField(term14078, term14078.getClass(), "propListHead", null);
        setIntField(term14078, term14078.getClass(), "sourcePosition", 0);
        setField(term14078, term14078.getClass(), "jsType", null);
        setField(term14078, term14078.getClass(), "parent", null);
        setField(term14077, term14077.getClass(), "next", term14078);
        setIntField(term14079, term14079.getClass(), "type", 0);
        setField(term14079, term14079.getClass(), "next", null);
        setField(term14079, term14079.getClass(), "first", null);
        setField(term14079, term14079.getClass(), "last", null);
        setField(term14079, term14079.getClass(), "propListHead", null);
        setIntField(term14079, term14079.getClass(), "sourcePosition", 0);
        setField(term14079, term14079.getClass(), "jsType", null);
        setField(term14079, term14079.getClass(), "parent", null);
        setField(term14077, term14077.getClass(), "first", term14079);
        setIntField(term14080, term14080.getClass(), "type", 0);
        setField(term14080, term14080.getClass(), "next", null);
        setField(term14080, term14080.getClass(), "first", null);
        setField(term14080, term14080.getClass(), "last", null);
        setField(term14080, term14080.getClass(), "propListHead", null);
        setIntField(term14080, term14080.getClass(), "sourcePosition", 0);
        setField(term14080, term14080.getClass(), "jsType", null);
        setField(term14080, term14080.getClass(), "parent", null);
        setField(term14077, term14077.getClass(), "last", term14080);
        setField(term14077, term14077.getClass(), "propListHead", null);
        setIntField(term14077, term14077.getClass(), "sourcePosition", 0);
        setField(term14077, term14077.getClass(), "jsType", null);
        setField(term14077, term14077.getClass(), "parent", null);
        setField(term14076, term14076.getClass(), "next", term14077);
        setIntField(term14081, term14081.getClass(), "type", 0);
        setField(term14081, term14081.getClass(), "next", null);
        setField(term14081, term14081.getClass(), "first", null);
        setField(term14081, term14081.getClass(), "last", null);
        setField(term14081, term14081.getClass(), "propListHead", null);
        setIntField(term14081, term14081.getClass(), "sourcePosition", 0);
        setField(term14081, term14081.getClass(), "jsType", null);
        setField(term14081, term14081.getClass(), "parent", null);
        setField(term14076, term14076.getClass(), "first", term14081);
        setIntField(term14082, term14082.getClass(), "type", 0);
        setField(term14082, term14082.getClass(), "next", null);
        setField(term14082, term14082.getClass(), "first", null);
        setField(term14082, term14082.getClass(), "last", null);
        setField(term14082, term14082.getClass(), "propListHead", null);
        setIntField(term14082, term14082.getClass(), "sourcePosition", 0);
        setField(term14082, term14082.getClass(), "jsType", null);
        setField(term14082, term14082.getClass(), "parent", null);
        setField(term14076, term14076.getClass(), "last", term14082);
        setField(term14076, term14076.getClass(), "propListHead", null);
        setIntField(term14076, term14076.getClass(), "sourcePosition", 0);
        setField(term14076, term14076.getClass(), "jsType", null);
        setField(term14076, term14076.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1834;
        Object retValue = callMethod(klass, "isArrayLiteral", argTypes, null, args);
        assertTrue(recursiveEquals(term1834, term14076));
        assertTrue(recursiveEquals(retValue, false));
    }

};


