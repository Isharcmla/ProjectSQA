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

public class PeepholeSubstituteAlternateSyntax_tryFoldRegularExpressionConstructor_2124589149141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14950;
     Object term15020;
     Object term44231;
     Object term44232;
     Object term44175;

    public PeepholeSubstituteAlternateSyntax_tryFoldRegularExpressionConstructor_2124589149141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14950 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term15020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term15020, term15020.getClass(), "parent", term15090);
        setField(term15230, term15230.getClass(), "next", term15300);
        setField(term15160, term15160.getClass(), "next", term15230);
        setField(term15020, term15020.getClass(), "first", term15160);
        term44231 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term44231, term44231.getClass(), "late", false);
        setIntField(term44231, term44231.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term44231, term44231.getClass(), "compiler", null);
        term44232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44232, term44232.getClass(), "type", 0);
        setField(term44232, term44232.getClass(), "next", null);
        setIntField(term44233, term44233.getClass(), "type", 0);
        setIntField(term44234, term44234.getClass(), "type", 0);
        setIntField(term44235, term44235.getClass(), "type", 0);
        setField(term44235, term44235.getClass(), "next", null);
        setField(term44235, term44235.getClass(), "first", null);
        setField(term44235, term44235.getClass(), "last", null);
        setField(term44235, term44235.getClass(), "propListHead", null);
        setIntField(term44235, term44235.getClass(), "sourcePosition", 0);
        setField(term44235, term44235.getClass(), "jsType", null);
        setField(term44235, term44235.getClass(), "parent", null);
        setField(term44234, term44234.getClass(), "next", term44235);
        setField(term44234, term44234.getClass(), "first", null);
        setField(term44234, term44234.getClass(), "last", null);
        setField(term44234, term44234.getClass(), "propListHead", null);
        setIntField(term44234, term44234.getClass(), "sourcePosition", 0);
        setField(term44234, term44234.getClass(), "jsType", null);
        setField(term44234, term44234.getClass(), "parent", null);
        setField(term44233, term44233.getClass(), "next", term44234);
        setField(term44233, term44233.getClass(), "first", null);
        setField(term44233, term44233.getClass(), "last", null);
        setField(term44233, term44233.getClass(), "propListHead", null);
        setIntField(term44233, term44233.getClass(), "sourcePosition", 0);
        setField(term44233, term44233.getClass(), "jsType", null);
        setField(term44233, term44233.getClass(), "parent", null);
        setField(term44232, term44232.getClass(), "first", term44233);
        setField(term44232, term44232.getClass(), "last", null);
        setField(term44232, term44232.getClass(), "propListHead", null);
        setIntField(term44232, term44232.getClass(), "sourcePosition", 0);
        setField(term44232, term44232.getClass(), "jsType", null);
        setIntField(term44236, term44236.getClass(), "type", 0);
        setField(term44236, term44236.getClass(), "next", null);
        setField(term44236, term44236.getClass(), "first", null);
        setField(term44236, term44236.getClass(), "last", null);
        setField(term44236, term44236.getClass(), "propListHead", null);
        setIntField(term44236, term44236.getClass(), "sourcePosition", 0);
        setField(term44236, term44236.getClass(), "jsType", null);
        setField(term44236, term44236.getClass(), "parent", null);
        setField(term44232, term44232.getClass(), "parent", term44236);
        term44175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44175, term44175.getClass(), "type", 0);
        setField(term44175, term44175.getClass(), "next", null);
        setIntField(term44177, term44177.getClass(), "type", 0);
        setIntField(term44179, term44179.getClass(), "type", 0);
        setIntField(term44181, term44181.getClass(), "type", 0);
        setField(term44181, term44181.getClass(), "next", null);
        setField(term44181, term44181.getClass(), "first", null);
        setField(term44181, term44181.getClass(), "last", null);
        setField(term44181, term44181.getClass(), "propListHead", null);
        setIntField(term44181, term44181.getClass(), "sourcePosition", 0);
        setField(term44181, term44181.getClass(), "jsType", null);
        setField(term44181, term44181.getClass(), "parent", null);
        setField(term44179, term44179.getClass(), "next", term44181);
        setField(term44179, term44179.getClass(), "first", null);
        setField(term44179, term44179.getClass(), "last", null);
        setField(term44179, term44179.getClass(), "propListHead", null);
        setIntField(term44179, term44179.getClass(), "sourcePosition", 0);
        setField(term44179, term44179.getClass(), "jsType", null);
        setField(term44179, term44179.getClass(), "parent", null);
        setField(term44177, term44177.getClass(), "next", term44179);
        setField(term44177, term44177.getClass(), "first", null);
        setField(term44177, term44177.getClass(), "last", null);
        setField(term44177, term44177.getClass(), "propListHead", null);
        setIntField(term44177, term44177.getClass(), "sourcePosition", 0);
        setField(term44177, term44177.getClass(), "jsType", null);
        setField(term44177, term44177.getClass(), "parent", null);
        setField(term44175, term44175.getClass(), "first", term44177);
        setField(term44175, term44175.getClass(), "last", null);
        setField(term44175, term44175.getClass(), "propListHead", null);
        setIntField(term44175, term44175.getClass(), "sourcePosition", 0);
        setField(term44175, term44175.getClass(), "jsType", null);
        setIntField(term44187, term44187.getClass(), "type", 0);
        setField(term44187, term44187.getClass(), "next", null);
        setField(term44187, term44187.getClass(), "first", null);
        setField(term44187, term44187.getClass(), "last", null);
        setField(term44187, term44187.getClass(), "propListHead", null);
        setIntField(term44187, term44187.getClass(), "sourcePosition", 0);
        setField(term44187, term44187.getClass(), "jsType", null);
        setField(term44187, term44187.getClass(), "parent", null);
        setField(term44175, term44175.getClass(), "parent", term44187);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term15020;
        Object retValue = callMethod(klass, "tryFoldRegularExpressionConstructor", argTypes, term14950, args);
        assertTrue(recursiveEquals(term14950, term44231));
        assertTrue(recursiveEquals(term15020, term44232));
        assertTrue(recursiveEquals(retValue, term44175));
    }

};


