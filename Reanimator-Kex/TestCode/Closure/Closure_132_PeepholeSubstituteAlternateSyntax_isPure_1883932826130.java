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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12415;
     Object term12485;
     Object term34624;
     Object term34625;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12415 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setField(term12415, term12415.getClass(), "compiler", null);
        term12485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12485, term12485.getClass(), "type", 94);
        setIntField(term12555, term12555.getClass(), "type", 2);
        setIntField(term12625, term12625.getClass(), "type", 1);
        setField(term12625, term12625.getClass(), "first", null);
        setField(term12625, term12625.getClass(), "next", null);
        setField(term12555, term12555.getClass(), "first", term12625);
        setIntField(term12695, term12695.getClass(), "type", 0);
        setField(term12695, term12695.getClass(), "first", null);
        setField(term12695, term12695.getClass(), "next", null);
        setField(term12555, term12555.getClass(), "next", term12695);
        setField(term12485, term12485.getClass(), "first", term12555);
        term34624 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term34624, term34624.getClass(), "late", false);
        setIntField(term34624, term34624.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term34624, term34624.getClass(), "compiler", null);
        term34625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34625, term34625.getClass(), "type", 94);
        setField(term34625, term34625.getClass(), "next", null);
        setIntField(term34626, term34626.getClass(), "type", 2);
        setIntField(term34627, term34627.getClass(), "type", 0);
        setField(term34627, term34627.getClass(), "next", null);
        setField(term34627, term34627.getClass(), "first", null);
        setField(term34627, term34627.getClass(), "last", null);
        setField(term34627, term34627.getClass(), "propListHead", null);
        setIntField(term34627, term34627.getClass(), "sourcePosition", 0);
        setField(term34627, term34627.getClass(), "jsType", null);
        setField(term34627, term34627.getClass(), "parent", null);
        setField(term34626, term34626.getClass(), "next", term34627);
        setIntField(term34628, term34628.getClass(), "type", 1);
        setField(term34628, term34628.getClass(), "next", null);
        setField(term34628, term34628.getClass(), "first", null);
        setField(term34628, term34628.getClass(), "last", null);
        setField(term34628, term34628.getClass(), "propListHead", null);
        setIntField(term34628, term34628.getClass(), "sourcePosition", 0);
        setField(term34628, term34628.getClass(), "jsType", null);
        setField(term34628, term34628.getClass(), "parent", null);
        setField(term34626, term34626.getClass(), "first", term34628);
        setField(term34626, term34626.getClass(), "last", null);
        setField(term34626, term34626.getClass(), "propListHead", null);
        setIntField(term34626, term34626.getClass(), "sourcePosition", 0);
        setField(term34626, term34626.getClass(), "jsType", null);
        setField(term34626, term34626.getClass(), "parent", null);
        setField(term34625, term34625.getClass(), "first", term34626);
        setField(term34625, term34625.getClass(), "last", null);
        setField(term34625, term34625.getClass(), "propListHead", null);
        setIntField(term34625, term34625.getClass(), "sourcePosition", 0);
        setField(term34625, term34625.getClass(), "jsType", null);
        setField(term34625, term34625.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12485;
        Object retValue = callMethod(klass, "isPure", argTypes, term12415, args);
        assertTrue(recursiveEquals(term12415, term34624));
        assertTrue(recursiveEquals(term12485, term34625));
        assertTrue(recursiveEquals(retValue, false));
    }

};


