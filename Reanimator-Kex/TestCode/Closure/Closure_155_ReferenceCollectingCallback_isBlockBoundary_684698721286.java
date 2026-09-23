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

public class ReferenceCollectingCallback_isBlockBoundary_684698721286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67259;
     Object term67329;
     Object term67902;
     Object term67904;

    public ReferenceCollectingCallback_isBlockBoundary_684698721286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term67329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67329, term67329.getClass(), "type", 98);
        setField(term67329, term67329.getClass(), "first", term67399);
        term67902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67902, term67902.getClass(), "type", 98);
        setField(term67902, term67902.getClass(), "next", null);
        setIntField(term67903, term67903.getClass(), "type", 0);
        setField(term67903, term67903.getClass(), "next", null);
        setField(term67903, term67903.getClass(), "first", null);
        setField(term67903, term67903.getClass(), "last", null);
        setField(term67903, term67903.getClass(), "propListHead", null);
        setIntField(term67903, term67903.getClass(), "sourcePosition", 0);
        setField(term67903, term67903.getClass(), "jsType", null);
        setField(term67903, term67903.getClass(), "parent", null);
        setField(term67902, term67902.getClass(), "first", term67903);
        setField(term67902, term67902.getClass(), "last", null);
        setField(term67902, term67902.getClass(), "propListHead", null);
        setIntField(term67902, term67902.getClass(), "sourcePosition", 0);
        setField(term67902, term67902.getClass(), "jsType", null);
        setField(term67902, term67902.getClass(), "parent", null);
        term67904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67904, term67904.getClass(), "type", 0);
        setField(term67904, term67904.getClass(), "next", null);
        setField(term67904, term67904.getClass(), "first", null);
        setField(term67904, term67904.getClass(), "last", null);
        setField(term67904, term67904.getClass(), "propListHead", null);
        setIntField(term67904, term67904.getClass(), "sourcePosition", 0);
        setField(term67904, term67904.getClass(), "jsType", null);
        setField(term67904, term67904.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term67259;
        args[1] = term67329;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term67259, term67902));
        assertTrue(recursiveEquals(term67329, term67904));
        assertTrue(recursiveEquals(retValue, true));
    }

};


