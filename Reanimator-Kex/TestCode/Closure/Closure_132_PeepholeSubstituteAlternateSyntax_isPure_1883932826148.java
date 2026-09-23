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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17483;
     Object term17553;
     Object term59143;
     Object term59144;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17483 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setField(term17483, term17483.getClass(), "compiler", null);
        term17553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17553, term17553.getClass(), "type", 74);
        setIntField(term17623, term17623.getClass(), "type", 2);
        setIntField(term17693, term17693.getClass(), "type", 1);
        setField(term17693, term17693.getClass(), "first", null);
        setField(term17693, term17693.getClass(), "next", null);
        setField(term17623, term17623.getClass(), "first", term17693);
        setIntField(term17763, term17763.getClass(), "type", 0);
        setField(term17763, term17763.getClass(), "first", null);
        setField(term17763, term17763.getClass(), "next", null);
        setField(term17623, term17623.getClass(), "next", term17763);
        setField(term17553, term17553.getClass(), "first", term17623);
        term59143 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term59143, term59143.getClass(), "late", false);
        setIntField(term59143, term59143.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term59143, term59143.getClass(), "compiler", null);
        term59144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59144, term59144.getClass(), "type", 74);
        setField(term59144, term59144.getClass(), "next", null);
        setIntField(term59145, term59145.getClass(), "type", 2);
        setIntField(term59146, term59146.getClass(), "type", 0);
        setField(term59146, term59146.getClass(), "next", null);
        setField(term59146, term59146.getClass(), "first", null);
        setField(term59146, term59146.getClass(), "last", null);
        setField(term59146, term59146.getClass(), "propListHead", null);
        setIntField(term59146, term59146.getClass(), "sourcePosition", 0);
        setField(term59146, term59146.getClass(), "jsType", null);
        setField(term59146, term59146.getClass(), "parent", null);
        setField(term59145, term59145.getClass(), "next", term59146);
        setIntField(term59147, term59147.getClass(), "type", 1);
        setField(term59147, term59147.getClass(), "next", null);
        setField(term59147, term59147.getClass(), "first", null);
        setField(term59147, term59147.getClass(), "last", null);
        setField(term59147, term59147.getClass(), "propListHead", null);
        setIntField(term59147, term59147.getClass(), "sourcePosition", 0);
        setField(term59147, term59147.getClass(), "jsType", null);
        setField(term59147, term59147.getClass(), "parent", null);
        setField(term59145, term59145.getClass(), "first", term59147);
        setField(term59145, term59145.getClass(), "last", null);
        setField(term59145, term59145.getClass(), "propListHead", null);
        setIntField(term59145, term59145.getClass(), "sourcePosition", 0);
        setField(term59145, term59145.getClass(), "jsType", null);
        setField(term59145, term59145.getClass(), "parent", null);
        setField(term59144, term59144.getClass(), "first", term59145);
        setField(term59144, term59144.getClass(), "last", null);
        setField(term59144, term59144.getClass(), "propListHead", null);
        setIntField(term59144, term59144.getClass(), "sourcePosition", 0);
        setField(term59144, term59144.getClass(), "jsType", null);
        setField(term59144, term59144.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17553;
        Object retValue = callMethod(klass, "isPure", argTypes, term17483, args);
        assertTrue(recursiveEquals(term17483, term59143));
        assertTrue(recursiveEquals(term17553, term59144));
        assertTrue(recursiveEquals(retValue, false));
    }

};


