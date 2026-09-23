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

public class PeepholeFoldConstants_tryFoldKnownMethods_889469083218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35032;
     Object term35102;
     Object term35384;
     Object term35385;
     Object term35366;

    public PeepholeFoldConstants_tryFoldKnownMethods_889469083218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35032 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term35102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term35102, term35102.getClass(), "first", null);
        setIntField(term35102, term35102.getClass(), "type", 37);
        term35384 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term35384, term35384.getClass(), "currentTraversal", null);
        term35385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35385, term35385.getClass(), "type", 37);
        setField(term35385, term35385.getClass(), "next", null);
        setField(term35385, term35385.getClass(), "first", null);
        setField(term35385, term35385.getClass(), "last", null);
        setField(term35385, term35385.getClass(), "propListHead", null);
        setIntField(term35385, term35385.getClass(), "sourcePosition", 0);
        setField(term35385, term35385.getClass(), "jsType", null);
        setField(term35385, term35385.getClass(), "parent", null);
        term35366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35366, term35366.getClass(), "type", 37);
        setField(term35366, term35366.getClass(), "next", null);
        setField(term35366, term35366.getClass(), "first", null);
        setField(term35366, term35366.getClass(), "last", null);
        setField(term35366, term35366.getClass(), "propListHead", null);
        setIntField(term35366, term35366.getClass(), "sourcePosition", 0);
        setField(term35366, term35366.getClass(), "jsType", null);
        setField(term35366, term35366.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term35102;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term35032, args);
        assertTrue(recursiveEquals(term35032, term35384));
        assertTrue(recursiveEquals(term35102, term35385));
        assertTrue(recursiveEquals(retValue, term35366));
    }

};


