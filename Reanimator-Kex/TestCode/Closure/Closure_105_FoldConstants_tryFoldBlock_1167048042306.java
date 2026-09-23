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

public class FoldConstants_tryFoldBlock_1167048042306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82617;
     Object term82687;
     Object term83465;
     Object term83466;

    public FoldConstants_tryFoldBlock_1167048042306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82617 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term82687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term82897, term82897.getClass(), "next", term82967);
        setIntField(term82897, term82897.getClass(), "type", 120);
        setField(term82827, term82827.getClass(), "next", term82897);
        setIntField(term82827, term82827.getClass(), "type", 78);
        setField(term82757, term82757.getClass(), "next", term82827);
        setIntField(term82757, term82757.getClass(), "type", 82);
        setField(term82687, term82687.getClass(), "first", term82757);
        term83465 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term83465, term83465.getClass(), "compiler", null);
        term83466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83466, term83466.getClass(), "type", 0);
        setField(term83466, term83466.getClass(), "next", null);
        setIntField(term83467, term83467.getClass(), "type", 82);
        setIntField(term83468, term83468.getClass(), "type", 78);
        setIntField(term83469, term83469.getClass(), "type", 120);
        setIntField(term83470, term83470.getClass(), "type", 0);
        setField(term83470, term83470.getClass(), "next", null);
        setField(term83470, term83470.getClass(), "first", null);
        setField(term83470, term83470.getClass(), "last", null);
        setField(term83470, term83470.getClass(), "propListHead", null);
        setIntField(term83470, term83470.getClass(), "sourcePosition", 0);
        setField(term83470, term83470.getClass(), "jsType", null);
        setField(term83470, term83470.getClass(), "parent", null);
        setField(term83469, term83469.getClass(), "next", term83470);
        setField(term83469, term83469.getClass(), "first", null);
        setField(term83469, term83469.getClass(), "last", null);
        setField(term83469, term83469.getClass(), "propListHead", null);
        setIntField(term83469, term83469.getClass(), "sourcePosition", 0);
        setField(term83469, term83469.getClass(), "jsType", null);
        setField(term83469, term83469.getClass(), "parent", null);
        setField(term83468, term83468.getClass(), "next", term83469);
        setField(term83468, term83468.getClass(), "first", null);
        setField(term83468, term83468.getClass(), "last", null);
        setField(term83468, term83468.getClass(), "propListHead", null);
        setIntField(term83468, term83468.getClass(), "sourcePosition", 0);
        setField(term83468, term83468.getClass(), "jsType", null);
        setField(term83468, term83468.getClass(), "parent", null);
        setField(term83467, term83467.getClass(), "next", term83468);
        setField(term83467, term83467.getClass(), "first", null);
        setField(term83467, term83467.getClass(), "last", null);
        setField(term83467, term83467.getClass(), "propListHead", null);
        setIntField(term83467, term83467.getClass(), "sourcePosition", 0);
        setField(term83467, term83467.getClass(), "jsType", null);
        setField(term83467, term83467.getClass(), "parent", null);
        setField(term83466, term83466.getClass(), "first", term83467);
        setField(term83466, term83466.getClass(), "last", null);
        setField(term83466, term83466.getClass(), "propListHead", null);
        setIntField(term83466, term83466.getClass(), "sourcePosition", 0);
        setField(term83466, term83466.getClass(), "jsType", null);
        setField(term83466, term83466.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term82687;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term82617, args);
        assertTrue(recursiveEquals(term82617, term83465));
        assertTrue(recursiveEquals(term82687, null));
    }

};


