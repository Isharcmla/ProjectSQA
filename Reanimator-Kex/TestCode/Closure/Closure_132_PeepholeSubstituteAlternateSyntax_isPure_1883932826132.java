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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13088;
     Object term13158;
     Object term34962;
     Object term34963;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13088 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setField(term13088, term13088.getClass(), "compiler", null);
        term13158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13158, term13158.getClass(), "type", 55);
        setIntField(term13228, term13228.getClass(), "type", 2);
        setIntField(term13298, term13298.getClass(), "type", 1);
        setField(term13298, term13298.getClass(), "first", null);
        setField(term13298, term13298.getClass(), "next", null);
        setField(term13228, term13228.getClass(), "first", term13298);
        setIntField(term13368, term13368.getClass(), "type", 0);
        setField(term13368, term13368.getClass(), "first", null);
        setField(term13368, term13368.getClass(), "next", null);
        setField(term13228, term13228.getClass(), "next", term13368);
        setField(term13158, term13158.getClass(), "first", term13228);
        term34962 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term34962, term34962.getClass(), "late", false);
        setIntField(term34962, term34962.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term34962, term34962.getClass(), "compiler", null);
        term34963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34963, term34963.getClass(), "type", 55);
        setField(term34963, term34963.getClass(), "next", null);
        setIntField(term34964, term34964.getClass(), "type", 2);
        setIntField(term34965, term34965.getClass(), "type", 0);
        setField(term34965, term34965.getClass(), "next", null);
        setField(term34965, term34965.getClass(), "first", null);
        setField(term34965, term34965.getClass(), "last", null);
        setField(term34965, term34965.getClass(), "propListHead", null);
        setIntField(term34965, term34965.getClass(), "sourcePosition", 0);
        setField(term34965, term34965.getClass(), "jsType", null);
        setField(term34965, term34965.getClass(), "parent", null);
        setField(term34964, term34964.getClass(), "next", term34965);
        setIntField(term34966, term34966.getClass(), "type", 1);
        setField(term34966, term34966.getClass(), "next", null);
        setField(term34966, term34966.getClass(), "first", null);
        setField(term34966, term34966.getClass(), "last", null);
        setField(term34966, term34966.getClass(), "propListHead", null);
        setIntField(term34966, term34966.getClass(), "sourcePosition", 0);
        setField(term34966, term34966.getClass(), "jsType", null);
        setField(term34966, term34966.getClass(), "parent", null);
        setField(term34964, term34964.getClass(), "first", term34966);
        setField(term34964, term34964.getClass(), "last", null);
        setField(term34964, term34964.getClass(), "propListHead", null);
        setIntField(term34964, term34964.getClass(), "sourcePosition", 0);
        setField(term34964, term34964.getClass(), "jsType", null);
        setField(term34964, term34964.getClass(), "parent", null);
        setField(term34963, term34963.getClass(), "first", term34964);
        setField(term34963, term34963.getClass(), "last", null);
        setField(term34963, term34963.getClass(), "propListHead", null);
        setIntField(term34963, term34963.getClass(), "sourcePosition", 0);
        setField(term34963, term34963.getClass(), "jsType", null);
        setField(term34963, term34963.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13158;
        Object retValue = callMethod(klass, "isPure", argTypes, term13088, args);
        assertTrue(recursiveEquals(term13088, term34962));
        assertTrue(recursiveEquals(term13158, term34963));
        assertTrue(recursiveEquals(retValue, false));
    }

};


