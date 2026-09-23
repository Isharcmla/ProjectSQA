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

public class PeepholeSubstituteAlternateSyntax_isPure_188393282697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10649;
     Object term10719;
     Object term11009;
     Object term11010;

    public PeepholeSubstituteAlternateSyntax_isPure_188393282697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10649 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setField(term10649, term10649.getClass(), "compiler", null);
        term10719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10719, term10719.getClass(), "type", 147);
        setIntField(term10789, term10789.getClass(), "type", 2);
        setIntField(term10859, term10859.getClass(), "type", 1);
        setField(term10859, term10859.getClass(), "first", null);
        setField(term10859, term10859.getClass(), "next", null);
        setField(term10789, term10789.getClass(), "first", term10859);
        setIntField(term10929, term10929.getClass(), "type", 0);
        setField(term10929, term10929.getClass(), "first", null);
        setField(term10929, term10929.getClass(), "next", null);
        setField(term10789, term10789.getClass(), "next", term10929);
        setField(term10719, term10719.getClass(), "first", term10789);
        term11009 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term11009, term11009.getClass(), "late", false);
        setIntField(term11009, term11009.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term11009, term11009.getClass(), "compiler", null);
        term11010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11010, term11010.getClass(), "type", 147);
        setField(term11010, term11010.getClass(), "next", null);
        setIntField(term11011, term11011.getClass(), "type", 2);
        setIntField(term11012, term11012.getClass(), "type", 0);
        setField(term11012, term11012.getClass(), "next", null);
        setField(term11012, term11012.getClass(), "first", null);
        setField(term11012, term11012.getClass(), "last", null);
        setField(term11012, term11012.getClass(), "propListHead", null);
        setIntField(term11012, term11012.getClass(), "sourcePosition", 0);
        setField(term11012, term11012.getClass(), "jsType", null);
        setField(term11012, term11012.getClass(), "parent", null);
        setField(term11011, term11011.getClass(), "next", term11012);
        setIntField(term11013, term11013.getClass(), "type", 1);
        setField(term11013, term11013.getClass(), "next", null);
        setField(term11013, term11013.getClass(), "first", null);
        setField(term11013, term11013.getClass(), "last", null);
        setField(term11013, term11013.getClass(), "propListHead", null);
        setIntField(term11013, term11013.getClass(), "sourcePosition", 0);
        setField(term11013, term11013.getClass(), "jsType", null);
        setField(term11013, term11013.getClass(), "parent", null);
        setField(term11011, term11011.getClass(), "first", term11013);
        setField(term11011, term11011.getClass(), "last", null);
        setField(term11011, term11011.getClass(), "propListHead", null);
        setIntField(term11011, term11011.getClass(), "sourcePosition", 0);
        setField(term11011, term11011.getClass(), "jsType", null);
        setField(term11011, term11011.getClass(), "parent", null);
        setField(term11010, term11010.getClass(), "first", term11011);
        setField(term11010, term11010.getClass(), "last", null);
        setField(term11010, term11010.getClass(), "propListHead", null);
        setIntField(term11010, term11010.getClass(), "sourcePosition", 0);
        setField(term11010, term11010.getClass(), "jsType", null);
        setField(term11010, term11010.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term10719;
        Object retValue = callMethod(klass, "isPure", argTypes, term10649, args);
        assertTrue(recursiveEquals(term10649, term11009));
        assertTrue(recursiveEquals(term10719, term11010));
        assertTrue(recursiveEquals(retValue, false));
    }

};


