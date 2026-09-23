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

public class PeepholeFoldConstants_tryFoldComparison_848443179990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312562;
     Object term312632;
     Object term312702;
     Object term312772;
     Object term312804;
     Object term312805;
     Object term312806;
     Object term312807;
     Object term312782;

    public PeepholeFoldConstants_tryFoldComparison_848443179990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312562 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term312632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term312632, term312632.getClass(), "type", 14);
        term312702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term312702, term312702.getClass(), "type", 42);
        term312772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term312772, term312772.getClass(), "type", 42);
        term312804 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term312804, term312804.getClass(), "currentTraversal", null);
        term312805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term312805, term312805.getClass(), "type", 42);
        setField(term312805, term312805.getClass(), "next", null);
        setField(term312805, term312805.getClass(), "first", null);
        setField(term312805, term312805.getClass(), "last", null);
        setField(term312805, term312805.getClass(), "propListHead", null);
        setIntField(term312805, term312805.getClass(), "sourcePosition", 0);
        setField(term312805, term312805.getClass(), "jsType", null);
        setField(term312805, term312805.getClass(), "parent", null);
        term312806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term312806, term312806.getClass(), "type", 14);
        setField(term312806, term312806.getClass(), "next", null);
        setField(term312806, term312806.getClass(), "first", null);
        setField(term312806, term312806.getClass(), "last", null);
        setField(term312806, term312806.getClass(), "propListHead", null);
        setIntField(term312806, term312806.getClass(), "sourcePosition", 0);
        setField(term312806, term312806.getClass(), "jsType", null);
        setField(term312806, term312806.getClass(), "parent", null);
        term312807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term312807, term312807.getClass(), "type", 42);
        setField(term312807, term312807.getClass(), "next", null);
        setField(term312807, term312807.getClass(), "first", null);
        setField(term312807, term312807.getClass(), "last", null);
        setField(term312807, term312807.getClass(), "propListHead", null);
        setIntField(term312807, term312807.getClass(), "sourcePosition", 0);
        setField(term312807, term312807.getClass(), "jsType", null);
        setField(term312807, term312807.getClass(), "parent", null);
        term312782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term312782, term312782.getClass(), "type", 14);
        setField(term312782, term312782.getClass(), "next", null);
        setField(term312782, term312782.getClass(), "first", null);
        setField(term312782, term312782.getClass(), "last", null);
        setField(term312782, term312782.getClass(), "propListHead", null);
        setIntField(term312782, term312782.getClass(), "sourcePosition", 0);
        setField(term312782, term312782.getClass(), "jsType", null);
        setField(term312782, term312782.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term312632;
        args[1] = term312702;
        args[2] = term312772;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term312562, args);
        assertTrue(recursiveEquals(term312562, term312804));
        assertTrue(recursiveEquals(term312632, term312805));
        assertTrue(recursiveEquals(term312702, term312806));
        assertTrue(recursiveEquals(term312772, term312807));
        assertTrue(recursiveEquals(retValue, term312782));
    }

};


