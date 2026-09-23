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
import java.lang.Object;

public class PeepholeSubstituteAlternateSyntax_makeForwardSlashBracketSafe_146236628238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term591;

    public PeepholeSubstituteAlternateSyntax_makeForwardSlashBracketSafe_146236628238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term591, term591.getClass(), "type", -1697741339);
        setIntField(term593, term593.getClass(), "type", 98922530);
        setIntField(term595, term595.getClass(), "type", -1388471422);
        setIntField(term597, term597.getClass(), "type", -1498296052);
        setIntField(term599, term599.getClass(), "type", 2098647989);
        setField(term599, term599.getClass(), "next", null);
        setField(term599, term599.getClass(), "first", null);
        setField(term599, term599.getClass(), "last", null);
        setField(term599, term599.getClass(), "propListHead", null);
        setIntField(term599, term599.getClass(), "sourcePosition", 0);
        setField(term599, term599.getClass(), "jsType", null);
        setField(term599, term599.getClass(), "parent", null);
        setField(term597, term597.getClass(), "next", term599);
        setIntField(term602, term602.getClass(), "type", 1598895173);
        setField(term602, term602.getClass(), "next", null);
        setField(term602, term602.getClass(), "first", null);
        setField(term602, term602.getClass(), "last", term599);
        setField(term602, term602.getClass(), "propListHead", null);
        setIntField(term602, term602.getClass(), "sourcePosition", 0);
        setField(term602, term602.getClass(), "jsType", null);
        setField(term602, term602.getClass(), "parent", null);
        setField(term597, term597.getClass(), "first", term602);
        setField(term597, term597.getClass(), "last", term595);
        setField(term597, term597.getClass(), "propListHead", null);
        setIntField(term597, term597.getClass(), "sourcePosition", 0);
        setField(term597, term597.getClass(), "jsType", null);
        setField(term597, term597.getClass(), "parent", null);
        setField(term595, term595.getClass(), "next", term597);
        setField(term595, term595.getClass(), "first", term599);
        setIntField(term606, term606.getClass(), "type", -227365013);
        setIntField(term608, term608.getClass(), "type", 11724947);
        setField(term608, term608.getClass(), "next", null);
        setField(term608, term608.getClass(), "first", term602);
        setField(term608, term608.getClass(), "last", term597);
        setField(term608, term608.getClass(), "propListHead", null);
        setIntField(term608, term608.getClass(), "sourcePosition", 0);
        setField(term608, term608.getClass(), "jsType", null);
        setField(term608, term608.getClass(), "parent", null);
        setField(term606, term606.getClass(), "next", term608);
        setField(term606, term606.getClass(), "first", term593);
        setField(term606, term606.getClass(), "last", term593);
        setField(term606, term606.getClass(), "propListHead", null);
        setIntField(term606, term606.getClass(), "sourcePosition", 0);
        setField(term606, term606.getClass(), "jsType", null);
        setField(term606, term606.getClass(), "parent", null);
        setField(term595, term595.getClass(), "last", term606);
        setField(term595, term595.getClass(), "propListHead", null);
        setIntField(term595, term595.getClass(), "sourcePosition", 0);
        setField(term595, term595.getClass(), "jsType", null);
        setField(term595, term595.getClass(), "parent", null);
        setField(term593, term593.getClass(), "next", term595);
        setIntField(term613, term613.getClass(), "type", 1953277050);
        setField(term613, term613.getClass(), "next", term606);
        setField(term613, term613.getClass(), "first", term608);
        setField(term613, term613.getClass(), "last", term591);
        setField(term613, term613.getClass(), "propListHead", null);
        setIntField(term613, term613.getClass(), "sourcePosition", 0);
        setField(term613, term613.getClass(), "jsType", null);
        setField(term613, term613.getClass(), "parent", null);
        setField(term593, term593.getClass(), "first", term613);
        setField(term593, term593.getClass(), "last", term613);
        setField(term593, term593.getClass(), "propListHead", null);
        setIntField(term593, term593.getClass(), "sourcePosition", 0);
        setField(term593, term593.getClass(), "jsType", null);
        setField(term593, term593.getClass(), "parent", null);
        setField(term591, term591.getClass(), "next", term593);
        setField(term591, term591.getClass(), "first", term597);
        setField(term591, term591.getClass(), "last", term599);
        setField(term591, term591.getClass(), "propListHead", null);
        setIntField(term591, term591.getClass(), "sourcePosition", 0);
        setField(term591, term591.getClass(), "jsType", null);
        setField(term591, term591.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term591;
        try {
            callMethod(klass, "makeForwardSlashBracketSafe", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


