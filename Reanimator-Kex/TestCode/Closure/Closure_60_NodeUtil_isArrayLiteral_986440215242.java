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
     Object term14197;

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
        term14197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14197, term14197.getClass(), "type", 722787672);
        setIntField(term14198, term14198.getClass(), "type", -2093707412);
        setIntField(term14199, term14199.getClass(), "type", 0);
        setField(term14199, term14199.getClass(), "next", null);
        setField(term14199, term14199.getClass(), "first", null);
        setField(term14199, term14199.getClass(), "last", null);
        setField(term14199, term14199.getClass(), "propListHead", null);
        setIntField(term14199, term14199.getClass(), "sourcePosition", 0);
        setField(term14199, term14199.getClass(), "jsType", null);
        setField(term14199, term14199.getClass(), "parent", null);
        setField(term14198, term14198.getClass(), "next", term14199);
        setIntField(term14200, term14200.getClass(), "type", 0);
        setField(term14200, term14200.getClass(), "next", null);
        setField(term14200, term14200.getClass(), "first", null);
        setField(term14200, term14200.getClass(), "last", null);
        setField(term14200, term14200.getClass(), "propListHead", null);
        setIntField(term14200, term14200.getClass(), "sourcePosition", 0);
        setField(term14200, term14200.getClass(), "jsType", null);
        setField(term14200, term14200.getClass(), "parent", null);
        setField(term14198, term14198.getClass(), "first", term14200);
        setIntField(term14201, term14201.getClass(), "type", 0);
        setField(term14201, term14201.getClass(), "next", null);
        setField(term14201, term14201.getClass(), "first", null);
        setField(term14201, term14201.getClass(), "last", null);
        setField(term14201, term14201.getClass(), "propListHead", null);
        setIntField(term14201, term14201.getClass(), "sourcePosition", 0);
        setField(term14201, term14201.getClass(), "jsType", null);
        setField(term14201, term14201.getClass(), "parent", null);
        setField(term14198, term14198.getClass(), "last", term14201);
        setField(term14198, term14198.getClass(), "propListHead", null);
        setIntField(term14198, term14198.getClass(), "sourcePosition", 0);
        setField(term14198, term14198.getClass(), "jsType", null);
        setField(term14198, term14198.getClass(), "parent", null);
        setField(term14197, term14197.getClass(), "next", term14198);
        setIntField(term14202, term14202.getClass(), "type", 0);
        setField(term14202, term14202.getClass(), "next", null);
        setField(term14202, term14202.getClass(), "first", null);
        setField(term14202, term14202.getClass(), "last", null);
        setField(term14202, term14202.getClass(), "propListHead", null);
        setIntField(term14202, term14202.getClass(), "sourcePosition", 0);
        setField(term14202, term14202.getClass(), "jsType", null);
        setField(term14202, term14202.getClass(), "parent", null);
        setField(term14197, term14197.getClass(), "first", term14202);
        setIntField(term14203, term14203.getClass(), "type", 0);
        setField(term14203, term14203.getClass(), "next", null);
        setField(term14203, term14203.getClass(), "first", null);
        setField(term14203, term14203.getClass(), "last", null);
        setField(term14203, term14203.getClass(), "propListHead", null);
        setIntField(term14203, term14203.getClass(), "sourcePosition", 0);
        setField(term14203, term14203.getClass(), "jsType", null);
        setField(term14203, term14203.getClass(), "parent", null);
        setField(term14197, term14197.getClass(), "last", term14203);
        setField(term14197, term14197.getClass(), "propListHead", null);
        setIntField(term14197, term14197.getClass(), "sourcePosition", 0);
        setField(term14197, term14197.getClass(), "jsType", null);
        setField(term14197, term14197.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1834;
        Object retValue = callMethod(klass, "isArrayLiteral", argTypes, null, args);
        assertTrue(recursiveEquals(term1834, term14197));
        assertTrue(recursiveEquals(retValue, false));
    }

};


