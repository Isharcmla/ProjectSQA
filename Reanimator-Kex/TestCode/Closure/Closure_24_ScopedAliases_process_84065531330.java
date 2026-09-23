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

public class ScopedAliases_process_84065531330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15395;
     Object term15465;
     Object term16985;
     Object term16986;

    public ScopedAliases_process_84065531330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15395 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term15395, term15395.getClass(), "compiler", null);
        term15465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15465, term15465.getClass(), "type", 0);
        setField(term15465, term15465.getClass(), "parent", null);
        setField(term15535, term15535.getClass(), "next", null);
        setIntField(term15535, term15535.getClass(), "type", 0);
        setField(term15675, term15675.getClass(), "next", null);
        setIntField(term15675, term15675.getClass(), "type", 0);
        setField(term15675, term15675.getClass(), "first", null);
        setField(term15605, term15605.getClass(), "next", term15675);
        setIntField(term15605, term15605.getClass(), "type", 105);
        setField(term15535, term15535.getClass(), "first", term15605);
        setField(term15465, term15465.getClass(), "first", term15535);
        term16985 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term16985, term16985.getClass(), "compiler", null);
        setField(term16985, term16985.getClass(), "preprocessorSymbolTable", null);
        setField(term16985, term16985.getClass(), "transformationHandler", null);
        term16986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16986, term16986.getClass(), "type", 0);
        setField(term16986, term16986.getClass(), "next", null);
        setIntField(term16987, term16987.getClass(), "type", 0);
        setField(term16987, term16987.getClass(), "next", null);
        setIntField(term16988, term16988.getClass(), "type", 105);
        setIntField(term16989, term16989.getClass(), "type", 0);
        setField(term16989, term16989.getClass(), "next", null);
        setField(term16989, term16989.getClass(), "first", null);
        setField(term16989, term16989.getClass(), "last", null);
        setField(term16989, term16989.getClass(), "propListHead", null);
        setIntField(term16989, term16989.getClass(), "sourcePosition", 0);
        setField(term16989, term16989.getClass(), "jsType", null);
        setField(term16989, term16989.getClass(), "parent", null);
        setField(term16988, term16988.getClass(), "next", term16989);
        setField(term16988, term16988.getClass(), "first", null);
        setField(term16988, term16988.getClass(), "last", null);
        setField(term16988, term16988.getClass(), "propListHead", null);
        setIntField(term16988, term16988.getClass(), "sourcePosition", 0);
        setField(term16988, term16988.getClass(), "jsType", null);
        setField(term16988, term16988.getClass(), "parent", null);
        setField(term16987, term16987.getClass(), "first", term16988);
        setField(term16987, term16987.getClass(), "last", null);
        setField(term16987, term16987.getClass(), "propListHead", null);
        setIntField(term16987, term16987.getClass(), "sourcePosition", 0);
        setField(term16987, term16987.getClass(), "jsType", null);
        setField(term16987, term16987.getClass(), "parent", null);
        setField(term16986, term16986.getClass(), "first", term16987);
        setField(term16986, term16986.getClass(), "last", null);
        setField(term16986, term16986.getClass(), "propListHead", null);
        setIntField(term16986, term16986.getClass(), "sourcePosition", 0);
        setField(term16986, term16986.getClass(), "jsType", null);
        setField(term16986, term16986.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term15465;
        callMethod(klass, "process", argTypes, term15395, args);
        assertTrue(recursiveEquals(term15395, term16985));
        assertTrue(recursiveEquals(term15465, null));
    }

};


