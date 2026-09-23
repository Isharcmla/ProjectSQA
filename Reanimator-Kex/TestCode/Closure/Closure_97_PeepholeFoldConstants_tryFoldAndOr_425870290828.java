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

public class PeepholeFoldConstants_tryFoldAndOr_425870290828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237651;
     Object term237743;
     Object term237835;
     Object term237927;
     Object term237968;
     Object term237969;
     Object term237970;
     Object term237971;
     Object term237928;

    public PeepholeFoldConstants_tryFoldAndOr_425870290828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237651 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term237743 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term237743, term237743.getClass(), "parent", null);
        setIntField(term237743, term237743.getClass(), "type", 0);
        term237835 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term237835, term237835.getClass(), "type", 0);
        term237927 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term237968 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term237968, term237968.getClass(), "currentTraversal", null);
        term237969 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term237969, term237969.getClass(), "str", null);
        setIntField(term237969, term237969.getClass(), "type", 0);
        setField(term237969, term237969.getClass(), "next", null);
        setField(term237969, term237969.getClass(), "first", null);
        setField(term237969, term237969.getClass(), "last", null);
        setField(term237969, term237969.getClass(), "propListHead", null);
        setIntField(term237969, term237969.getClass(), "sourcePosition", 0);
        setField(term237969, term237969.getClass(), "jsType", null);
        setField(term237969, term237969.getClass(), "parent", null);
        term237970 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term237970, term237970.getClass(), "number", 0.0);
        setIntField(term237970, term237970.getClass(), "type", 0);
        setField(term237970, term237970.getClass(), "next", null);
        setField(term237970, term237970.getClass(), "first", null);
        setField(term237970, term237970.getClass(), "last", null);
        setField(term237970, term237970.getClass(), "propListHead", null);
        setIntField(term237970, term237970.getClass(), "sourcePosition", 0);
        setField(term237970, term237970.getClass(), "jsType", null);
        setField(term237970, term237970.getClass(), "parent", null);
        term237971 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term237971, term237971.getClass(), "number", 0.0);
        setIntField(term237971, term237971.getClass(), "type", 0);
        setField(term237971, term237971.getClass(), "next", null);
        setField(term237971, term237971.getClass(), "first", null);
        setField(term237971, term237971.getClass(), "last", null);
        setField(term237971, term237971.getClass(), "propListHead", null);
        setIntField(term237971, term237971.getClass(), "sourcePosition", 0);
        setField(term237971, term237971.getClass(), "jsType", null);
        setField(term237971, term237971.getClass(), "parent", null);
        term237928 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term237928, term237928.getClass(), "str", null);
        setIntField(term237928, term237928.getClass(), "type", 0);
        setField(term237928, term237928.getClass(), "next", null);
        setField(term237928, term237928.getClass(), "first", null);
        setField(term237928, term237928.getClass(), "last", null);
        setField(term237928, term237928.getClass(), "propListHead", null);
        setIntField(term237928, term237928.getClass(), "sourcePosition", 0);
        setField(term237928, term237928.getClass(), "jsType", null);
        setField(term237928, term237928.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term237743;
        args[1] = term237835;
        args[2] = term237927;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term237651, args);
        assertTrue(recursiveEquals(term237651, term237968));
        assertTrue(recursiveEquals(term237743, term237969));
        assertTrue(recursiveEquals(term237835, term237970));
        assertTrue(recursiveEquals(term237927, term237971));
        assertTrue(recursiveEquals(retValue, term237928));
    }

};


