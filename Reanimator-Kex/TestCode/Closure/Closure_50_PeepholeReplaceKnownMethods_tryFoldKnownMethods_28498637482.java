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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_28498637482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21954;
     Object term22046;
     Object term22079;
     Object term22080;
     Object term22065;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_28498637482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21954 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term22046 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term22046, term22046.getClass(), "first", null);
        setIntField(term22046, term22046.getClass(), "type", 37);
        term22079 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term22079, term22079.getClass(), "currentTraversal", null);
        term22080 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term22080, term22080.getClass(), "str", null);
        setIntField(term22080, term22080.getClass(), "type", 37);
        setField(term22080, term22080.getClass(), "next", null);
        setField(term22080, term22080.getClass(), "first", null);
        setField(term22080, term22080.getClass(), "last", null);
        setField(term22080, term22080.getClass(), "propListHead", null);
        setIntField(term22080, term22080.getClass(), "sourcePosition", 0);
        setField(term22080, term22080.getClass(), "jsType", null);
        setField(term22080, term22080.getClass(), "parent", null);
        term22065 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term22065, term22065.getClass(), "str", null);
        setIntField(term22065, term22065.getClass(), "type", 37);
        setField(term22065, term22065.getClass(), "next", null);
        setField(term22065, term22065.getClass(), "first", null);
        setField(term22065, term22065.getClass(), "last", null);
        setField(term22065, term22065.getClass(), "propListHead", null);
        setIntField(term22065, term22065.getClass(), "sourcePosition", 0);
        setField(term22065, term22065.getClass(), "jsType", null);
        setField(term22065, term22065.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term22046;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term21954, args);
        assertTrue(recursiveEquals(term21954, term22079));
        assertTrue(recursiveEquals(term22046, term22080));
        assertTrue(recursiveEquals(retValue, term22065));
    }

};


