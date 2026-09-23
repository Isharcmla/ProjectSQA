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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_59162209144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7423;
     Object term7493;
     Object term7764;
     Object term7765;
     Object term7756;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_59162209144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7423 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term7493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7493, term7493.getClass(), "type", 37);
        term7764 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term7764, term7764.getClass(), "currentTraversal", null);
        term7765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7765, term7765.getClass(), "type", 37);
        setField(term7765, term7765.getClass(), "next", null);
        setField(term7765, term7765.getClass(), "first", null);
        setField(term7765, term7765.getClass(), "last", null);
        setField(term7765, term7765.getClass(), "propListHead", null);
        setIntField(term7765, term7765.getClass(), "sourcePosition", 0);
        setField(term7765, term7765.getClass(), "jsType", null);
        setField(term7765, term7765.getClass(), "parent", null);
        term7756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7756, term7756.getClass(), "type", 37);
        setField(term7756, term7756.getClass(), "next", null);
        setField(term7756, term7756.getClass(), "first", null);
        setField(term7756, term7756.getClass(), "last", null);
        setField(term7756, term7756.getClass(), "propListHead", null);
        setIntField(term7756, term7756.getClass(), "sourcePosition", 0);
        setField(term7756, term7756.getClass(), "jsType", null);
        setField(term7756, term7756.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term7493;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term7423, args);
        assertTrue(recursiveEquals(term7423, term7764));
        assertTrue(recursiveEquals(term7493, term7765));
        assertTrue(recursiveEquals(retValue, term7756));
    }

};


