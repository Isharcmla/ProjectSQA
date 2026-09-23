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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_28498637469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13452;
     Object term13522;
     Object term19750;
     Object term19751;
     Object term19737;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_28498637469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13452 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term13522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term13522, term13522.getClass(), "first", null);
        term19750 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term19750, term19750.getClass(), "currentTraversal", null);
        term19751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19751, term19751.getClass(), "type", 0);
        setField(term19751, term19751.getClass(), "next", null);
        setField(term19751, term19751.getClass(), "first", null);
        setField(term19751, term19751.getClass(), "last", null);
        setField(term19751, term19751.getClass(), "propListHead", null);
        setIntField(term19751, term19751.getClass(), "sourcePosition", 0);
        setField(term19751, term19751.getClass(), "jsType", null);
        setField(term19751, term19751.getClass(), "parent", null);
        term19737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19737, term19737.getClass(), "type", 0);
        setField(term19737, term19737.getClass(), "next", null);
        setField(term19737, term19737.getClass(), "first", null);
        setField(term19737, term19737.getClass(), "last", null);
        setField(term19737, term19737.getClass(), "propListHead", null);
        setIntField(term19737, term19737.getClass(), "sourcePosition", 0);
        setField(term19737, term19737.getClass(), "jsType", null);
        setField(term19737, term19737.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13522;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term13452, args);
        assertTrue(recursiveEquals(term13452, term19750));
        assertTrue(recursiveEquals(term13522, term19751));
        assertTrue(recursiveEquals(retValue, term19737));
    }

};


