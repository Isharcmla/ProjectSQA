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

public class PeepholeFoldConstants_tryFoldStringJoin_146246079364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11064;
     Object term11134;
     Object term11446;
     Object term11447;
     Object term11441;

    public PeepholeFoldConstants_tryFoldStringJoin_146246079364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11064 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term11134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term11134, term11134.getClass(), "first", null);
        term11446 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term11446, term11446.getClass(), "currentTraversal", null);
        term11447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11447, term11447.getClass(), "type", 0);
        setField(term11447, term11447.getClass(), "next", null);
        setField(term11447, term11447.getClass(), "first", null);
        setField(term11447, term11447.getClass(), "last", null);
        setField(term11447, term11447.getClass(), "propListHead", null);
        setIntField(term11447, term11447.getClass(), "sourcePosition", 0);
        setField(term11447, term11447.getClass(), "jsType", null);
        setField(term11447, term11447.getClass(), "parent", null);
        term11441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11441, term11441.getClass(), "type", 0);
        setField(term11441, term11441.getClass(), "next", null);
        setField(term11441, term11441.getClass(), "first", null);
        setField(term11441, term11441.getClass(), "last", null);
        setField(term11441, term11441.getClass(), "propListHead", null);
        setIntField(term11441, term11441.getClass(), "sourcePosition", 0);
        setField(term11441, term11441.getClass(), "jsType", null);
        setField(term11441, term11441.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term11134;
        Object retValue = callMethod(klass, "tryFoldStringJoin", argTypes, term11064, args);
        assertTrue(recursiveEquals(term11064, term11446));
        assertTrue(recursiveEquals(term11134, term11447));
        assertTrue(recursiveEquals(retValue, term11441));
    }

};


