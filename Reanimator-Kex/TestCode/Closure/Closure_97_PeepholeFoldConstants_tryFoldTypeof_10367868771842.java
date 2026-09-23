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

public class PeepholeFoldConstants_tryFoldTypeof_10367868771842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term711833;
     Object term711925;
     Object term712045;
     Object term712046;
     Object term712019;

    public PeepholeFoldConstants_tryFoldTypeof_10367868771842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term711833 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term711925 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term712017 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term711925, term711925.getClass(), "type", 32);
        setField(term711925, term711925.getClass(), "first", term712017);
        term712045 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term712045, term712045.getClass(), "currentTraversal", null);
        term712046 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term712047 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term712046, term712046.getClass(), "number", 0.0);
        setIntField(term712046, term712046.getClass(), "type", 32);
        setField(term712046, term712046.getClass(), "next", null);
        setDoubleField(term712047, term712047.getClass(), "number", 0.0);
        setIntField(term712047, term712047.getClass(), "type", 0);
        setField(term712047, term712047.getClass(), "next", null);
        setField(term712047, term712047.getClass(), "first", null);
        setField(term712047, term712047.getClass(), "last", null);
        setField(term712047, term712047.getClass(), "propListHead", null);
        setIntField(term712047, term712047.getClass(), "sourcePosition", 0);
        setField(term712047, term712047.getClass(), "jsType", null);
        setField(term712047, term712047.getClass(), "parent", null);
        setField(term712046, term712046.getClass(), "first", term712047);
        setField(term712046, term712046.getClass(), "last", null);
        setField(term712046, term712046.getClass(), "propListHead", null);
        setIntField(term712046, term712046.getClass(), "sourcePosition", 0);
        setField(term712046, term712046.getClass(), "jsType", null);
        setField(term712046, term712046.getClass(), "parent", null);
        term712019 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term712022 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term712019, term712019.getClass(), "number", 0.0);
        setIntField(term712019, term712019.getClass(), "type", 32);
        setField(term712019, term712019.getClass(), "next", null);
        setDoubleField(term712022, term712022.getClass(), "number", 0.0);
        setIntField(term712022, term712022.getClass(), "type", 0);
        setField(term712022, term712022.getClass(), "next", null);
        setField(term712022, term712022.getClass(), "first", null);
        setField(term712022, term712022.getClass(), "last", null);
        setField(term712022, term712022.getClass(), "propListHead", null);
        setIntField(term712022, term712022.getClass(), "sourcePosition", 0);
        setField(term712022, term712022.getClass(), "jsType", null);
        setField(term712022, term712022.getClass(), "parent", null);
        setField(term712019, term712019.getClass(), "first", term712022);
        setField(term712019, term712019.getClass(), "last", null);
        setField(term712019, term712019.getClass(), "propListHead", null);
        setIntField(term712019, term712019.getClass(), "sourcePosition", 0);
        setField(term712019, term712019.getClass(), "jsType", null);
        setField(term712019, term712019.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term711925;
        Object retValue = callMethod(klass, "tryFoldTypeof", argTypes, term711833, args);
        assertTrue(recursiveEquals(term711833, term712045));
        assertTrue(recursiveEquals(term711925, term712046));
        assertTrue(recursiveEquals(retValue, term712019));
    }

};


