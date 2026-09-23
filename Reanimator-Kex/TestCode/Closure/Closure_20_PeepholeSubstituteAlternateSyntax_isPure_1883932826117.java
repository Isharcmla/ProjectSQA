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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15841;
     Object term15911;
     Object term16200;
     Object term16201;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15841 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term15911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15911, term15911.getClass(), "type", 135);
        setIntField(term15981, term15981.getClass(), "type", 2);
        setIntField(term16051, term16051.getClass(), "type", 1);
        setField(term16051, term16051.getClass(), "first", null);
        setField(term16051, term16051.getClass(), "next", null);
        setField(term15981, term15981.getClass(), "first", term16051);
        setIntField(term16121, term16121.getClass(), "type", 0);
        setField(term16121, term16121.getClass(), "first", null);
        setField(term16121, term16121.getClass(), "next", null);
        setField(term15981, term15981.getClass(), "next", term16121);
        setField(term15911, term15911.getClass(), "first", term15981);
        term16200 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term16200, term16200.getClass(), "late", false);
        setIntField(term16200, term16200.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term16200, term16200.getClass(), "compiler", null);
        term16201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16201, term16201.getClass(), "type", 135);
        setField(term16201, term16201.getClass(), "next", null);
        setIntField(term16202, term16202.getClass(), "type", 2);
        setIntField(term16203, term16203.getClass(), "type", 0);
        setField(term16203, term16203.getClass(), "next", null);
        setField(term16203, term16203.getClass(), "first", null);
        setField(term16203, term16203.getClass(), "last", null);
        setField(term16203, term16203.getClass(), "propListHead", null);
        setIntField(term16203, term16203.getClass(), "sourcePosition", 0);
        setField(term16203, term16203.getClass(), "jsType", null);
        setField(term16203, term16203.getClass(), "parent", null);
        setField(term16202, term16202.getClass(), "next", term16203);
        setIntField(term16204, term16204.getClass(), "type", 1);
        setField(term16204, term16204.getClass(), "next", null);
        setField(term16204, term16204.getClass(), "first", null);
        setField(term16204, term16204.getClass(), "last", null);
        setField(term16204, term16204.getClass(), "propListHead", null);
        setIntField(term16204, term16204.getClass(), "sourcePosition", 0);
        setField(term16204, term16204.getClass(), "jsType", null);
        setField(term16204, term16204.getClass(), "parent", null);
        setField(term16202, term16202.getClass(), "first", term16204);
        setField(term16202, term16202.getClass(), "last", null);
        setField(term16202, term16202.getClass(), "propListHead", null);
        setIntField(term16202, term16202.getClass(), "sourcePosition", 0);
        setField(term16202, term16202.getClass(), "jsType", null);
        setField(term16202, term16202.getClass(), "parent", null);
        setField(term16201, term16201.getClass(), "first", term16202);
        setField(term16201, term16201.getClass(), "last", null);
        setField(term16201, term16201.getClass(), "propListHead", null);
        setIntField(term16201, term16201.getClass(), "sourcePosition", 0);
        setField(term16201, term16201.getClass(), "jsType", null);
        setField(term16201, term16201.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term15911;
        Object retValue = callMethod(klass, "isPure", argTypes, term15841, args);
        assertTrue(recursiveEquals(term15841, term16200));
        assertTrue(recursiveEquals(term15911, term16201));
        assertTrue(recursiveEquals(retValue, false));
    }

};


