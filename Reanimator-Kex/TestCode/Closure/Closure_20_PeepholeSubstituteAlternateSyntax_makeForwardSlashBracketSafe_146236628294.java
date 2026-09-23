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

public class PeepholeSubstituteAlternateSyntax_makeForwardSlashBracketSafe_146236628294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1513;

    public PeepholeSubstituteAlternateSyntax_makeForwardSlashBracketSafe_146236628294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1513, term1513.getClass(), "type", 1065595802);
        setIntField(term1515, term1515.getClass(), "type", 21031843);
        setIntField(term1517, term1517.getClass(), "type", -380787857);
        setIntField(term1519, term1519.getClass(), "type", 319853052);
        setIntField(term1521, term1521.getClass(), "type", -1097563716);
        setField(term1521, term1521.getClass(), "next", null);
        setField(term1521, term1521.getClass(), "first", null);
        setField(term1521, term1521.getClass(), "last", null);
        setField(term1521, term1521.getClass(), "propListHead", null);
        setIntField(term1521, term1521.getClass(), "sourcePosition", 0);
        setField(term1521, term1521.getClass(), "jsType", null);
        setField(term1521, term1521.getClass(), "parent", null);
        setField(term1519, term1519.getClass(), "next", term1521);
        setIntField(term1524, term1524.getClass(), "type", 1572907769);
        setField(term1524, term1524.getClass(), "next", null);
        setField(term1524, term1524.getClass(), "first", null);
        setField(term1524, term1524.getClass(), "last", term1521);
        setField(term1524, term1524.getClass(), "propListHead", null);
        setIntField(term1524, term1524.getClass(), "sourcePosition", 0);
        setField(term1524, term1524.getClass(), "jsType", null);
        setField(term1524, term1524.getClass(), "parent", null);
        setField(term1519, term1519.getClass(), "first", term1524);
        setField(term1519, term1519.getClass(), "last", term1517);
        setField(term1519, term1519.getClass(), "propListHead", null);
        setIntField(term1519, term1519.getClass(), "sourcePosition", 0);
        setField(term1519, term1519.getClass(), "jsType", null);
        setField(term1519, term1519.getClass(), "parent", null);
        setField(term1517, term1517.getClass(), "next", term1519);
        setField(term1517, term1517.getClass(), "first", term1521);
        setIntField(term1528, term1528.getClass(), "type", -516303035);
        setIntField(term1530, term1530.getClass(), "type", -2143043890);
        setField(term1530, term1530.getClass(), "next", null);
        setField(term1530, term1530.getClass(), "first", term1524);
        setField(term1530, term1530.getClass(), "last", term1519);
        setField(term1530, term1530.getClass(), "propListHead", null);
        setIntField(term1530, term1530.getClass(), "sourcePosition", 0);
        setField(term1530, term1530.getClass(), "jsType", null);
        setField(term1530, term1530.getClass(), "parent", null);
        setField(term1528, term1528.getClass(), "next", term1530);
        setField(term1528, term1528.getClass(), "first", term1515);
        setField(term1528, term1528.getClass(), "last", term1515);
        setField(term1528, term1528.getClass(), "propListHead", null);
        setIntField(term1528, term1528.getClass(), "sourcePosition", 0);
        setField(term1528, term1528.getClass(), "jsType", null);
        setField(term1528, term1528.getClass(), "parent", null);
        setField(term1517, term1517.getClass(), "last", term1528);
        setField(term1517, term1517.getClass(), "propListHead", null);
        setIntField(term1517, term1517.getClass(), "sourcePosition", 0);
        setField(term1517, term1517.getClass(), "jsType", null);
        setField(term1517, term1517.getClass(), "parent", null);
        setField(term1515, term1515.getClass(), "next", term1517);
        setIntField(term1535, term1535.getClass(), "type", -2138825831);
        setField(term1535, term1535.getClass(), "next", term1528);
        setField(term1535, term1535.getClass(), "first", term1530);
        setField(term1535, term1535.getClass(), "last", term1513);
        setField(term1535, term1535.getClass(), "propListHead", null);
        setIntField(term1535, term1535.getClass(), "sourcePosition", 0);
        setField(term1535, term1535.getClass(), "jsType", null);
        setField(term1535, term1535.getClass(), "parent", null);
        setField(term1515, term1515.getClass(), "first", term1535);
        setField(term1515, term1515.getClass(), "last", term1535);
        setField(term1515, term1515.getClass(), "propListHead", null);
        setIntField(term1515, term1515.getClass(), "sourcePosition", 0);
        setField(term1515, term1515.getClass(), "jsType", null);
        setField(term1515, term1515.getClass(), "parent", null);
        setField(term1513, term1513.getClass(), "next", term1515);
        setField(term1513, term1513.getClass(), "first", term1519);
        setField(term1513, term1513.getClass(), "last", term1521);
        setField(term1513, term1513.getClass(), "propListHead", null);
        setIntField(term1513, term1513.getClass(), "sourcePosition", 0);
        setField(term1513, term1513.getClass(), "jsType", null);
        setField(term1513, term1513.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1513;
        try {
            callMethod(klass, "makeForwardSlashBracketSafe", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


