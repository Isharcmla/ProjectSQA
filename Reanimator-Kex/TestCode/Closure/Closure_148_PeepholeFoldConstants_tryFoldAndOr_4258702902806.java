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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902806 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term814112;
     Object term814182;
     Object term814252;
     Object term814287;
     Object term814288;
     Object term814289;
     Object term814256;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902806() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term814112 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term814182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term814182, term814182.getClass(), "parent", term814182);
        setIntField(term814182, term814182.getClass(), "type", 63);
        term814252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term814252, term814252.getClass(), "type", 63);
        term814287 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term814287, term814287.getClass(), "currentTraversal", null);
        term814288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term814288, term814288.getClass(), "type", 63);
        setField(term814288, term814288.getClass(), "next", null);
        setField(term814288, term814288.getClass(), "first", null);
        setField(term814288, term814288.getClass(), "last", null);
        setField(term814288, term814288.getClass(), "propListHead", null);
        setIntField(term814288, term814288.getClass(), "sourcePosition", 0);
        setField(term814288, term814288.getClass(), "jsType", null);
        setField(term814288, term814288.getClass(), "parent", term814288);
        term814289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term814289, term814289.getClass(), "type", 63);
        setField(term814289, term814289.getClass(), "next", null);
        setField(term814289, term814289.getClass(), "first", null);
        setField(term814289, term814289.getClass(), "last", null);
        setField(term814289, term814289.getClass(), "propListHead", null);
        setIntField(term814289, term814289.getClass(), "sourcePosition", 0);
        setField(term814289, term814289.getClass(), "jsType", null);
        setField(term814289, term814289.getClass(), "parent", null);
        term814256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term814256, term814256.getClass(), "type", 63);
        setField(term814256, term814256.getClass(), "next", null);
        setField(term814256, term814256.getClass(), "first", null);
        setField(term814256, term814256.getClass(), "last", null);
        setField(term814256, term814256.getClass(), "propListHead", null);
        setIntField(term814256, term814256.getClass(), "sourcePosition", 0);
        setField(term814256, term814256.getClass(), "jsType", null);
        setField(term814256, term814256.getClass(), "parent", term814256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term814182;
        args[1] = term814252;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term814112, args);
        assertTrue(recursiveEquals(term814112, term814287));
        assertTrue(recursiveEquals(term814182, term814288));
        assertTrue(recursiveEquals(term814252, term814289));
        assertTrue(recursiveEquals(retValue, term814256));
    }

};


