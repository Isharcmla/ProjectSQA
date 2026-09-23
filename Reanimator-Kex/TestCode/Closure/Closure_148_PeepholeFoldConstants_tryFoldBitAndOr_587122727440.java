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

public class PeepholeFoldConstants_tryFoldBitAndOr_587122727440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90127;
     Object term90232;
     Object term90243;
     Object term90244;
     Object term90245;
     Object term90234;

    public PeepholeFoldConstants_tryFoldBitAndOr_587122727440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90127 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term90232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term90232, term90232.getClass(), "type", 11);
        term90243 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term90243, term90243.getClass(), "currentTraversal", null);
        term90244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term90244, term90244.getClass(), "type", 11);
        setField(term90244, term90244.getClass(), "next", null);
        setField(term90244, term90244.getClass(), "first", null);
        setField(term90244, term90244.getClass(), "last", null);
        setField(term90244, term90244.getClass(), "propListHead", null);
        setIntField(term90244, term90244.getClass(), "sourcePosition", 0);
        setField(term90244, term90244.getClass(), "jsType", null);
        setField(term90244, term90244.getClass(), "parent", null);
        term90245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term90245, term90245.getClass(), "type", 11);
        setField(term90245, term90245.getClass(), "next", null);
        setField(term90245, term90245.getClass(), "first", null);
        setField(term90245, term90245.getClass(), "last", null);
        setField(term90245, term90245.getClass(), "propListHead", null);
        setIntField(term90245, term90245.getClass(), "sourcePosition", 0);
        setField(term90245, term90245.getClass(), "jsType", null);
        setField(term90245, term90245.getClass(), "parent", null);
        term90234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term90234, term90234.getClass(), "type", 11);
        setField(term90234, term90234.getClass(), "next", null);
        setField(term90234, term90234.getClass(), "first", null);
        setField(term90234, term90234.getClass(), "last", null);
        setField(term90234, term90234.getClass(), "propListHead", null);
        setIntField(term90234, term90234.getClass(), "sourcePosition", 0);
        setField(term90234, term90234.getClass(), "jsType", null);
        setField(term90234, term90234.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term90232;
        args[1] = term90232;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldBitAndOr", argTypes, term90127, args);
        assertTrue(recursiveEquals(term90127, term90243));
        assertTrue(recursiveEquals(term90232, term90244));
        assertTrue(recursiveEquals(term90232, term90245));
        assertTrue(recursiveEquals(retValue, term90234));
    }

};


