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

public class PeepholeFoldConstants_tryFoldAdd_1749649931231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45470;
     Object term45540;
     Object term45610;
     Object term45680;
     Object term46142;
     Object term46143;
     Object term46144;
     Object term46145;
     Object term46116;

    public PeepholeFoldConstants_tryFoldAdd_1749649931231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45470 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term45540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45540, term45540.getClass(), "type", 21);
        term45610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45610, term45610.getClass(), "type", 21);
        term45680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term46142 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term46142, term46142.getClass(), "currentTraversal", null);
        term46143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46143, term46143.getClass(), "type", 21);
        setField(term46143, term46143.getClass(), "next", null);
        setField(term46143, term46143.getClass(), "first", null);
        setField(term46143, term46143.getClass(), "last", null);
        setField(term46143, term46143.getClass(), "propListHead", null);
        setIntField(term46143, term46143.getClass(), "sourcePosition", 0);
        setField(term46143, term46143.getClass(), "jsType", null);
        setField(term46143, term46143.getClass(), "parent", null);
        term46144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46144, term46144.getClass(), "type", 21);
        setField(term46144, term46144.getClass(), "next", null);
        setField(term46144, term46144.getClass(), "first", null);
        setField(term46144, term46144.getClass(), "last", null);
        setField(term46144, term46144.getClass(), "propListHead", null);
        setIntField(term46144, term46144.getClass(), "sourcePosition", 0);
        setField(term46144, term46144.getClass(), "jsType", null);
        setField(term46144, term46144.getClass(), "parent", null);
        term46145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46145, term46145.getClass(), "type", 0);
        setField(term46145, term46145.getClass(), "next", null);
        setField(term46145, term46145.getClass(), "first", null);
        setField(term46145, term46145.getClass(), "last", null);
        setField(term46145, term46145.getClass(), "propListHead", null);
        setIntField(term46145, term46145.getClass(), "sourcePosition", 0);
        setField(term46145, term46145.getClass(), "jsType", null);
        setField(term46145, term46145.getClass(), "parent", null);
        term46116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46116, term46116.getClass(), "type", 21);
        setField(term46116, term46116.getClass(), "next", null);
        setField(term46116, term46116.getClass(), "first", null);
        setField(term46116, term46116.getClass(), "last", null);
        setField(term46116, term46116.getClass(), "propListHead", null);
        setIntField(term46116, term46116.getClass(), "sourcePosition", 0);
        setField(term46116, term46116.getClass(), "jsType", null);
        setField(term46116, term46116.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term45540;
        args[1] = term45610;
        args[2] = term45680;
        Object retValue = callMethod(klass, "tryFoldAdd", argTypes, term45470, args);
        assertTrue(recursiveEquals(term45470, term46142));
        assertTrue(recursiveEquals(term45540, term46143));
        assertTrue(recursiveEquals(term45610, term46144));
        assertTrue(recursiveEquals(term45680, term46145));
        assertTrue(recursiveEquals(retValue, term46116));
    }

};


