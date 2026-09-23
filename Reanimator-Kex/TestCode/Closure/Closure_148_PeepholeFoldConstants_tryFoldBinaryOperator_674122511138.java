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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24518;
     Object term24588;
     Object term24878;
     Object term24879;
     Object term24848;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24518 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term24588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term24588, term24588.getClass(), "first", term24588);
        setField(term24588, term24588.getClass(), "next", term24588);
        setIntField(term24588, term24588.getClass(), "type", 21);
        term24878 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term24878, term24878.getClass(), "currentTraversal", null);
        term24879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24879, term24879.getClass(), "type", 21);
        setField(term24879, term24879.getClass(), "next", term24879);
        setField(term24879, term24879.getClass(), "first", term24879);
        setField(term24879, term24879.getClass(), "last", null);
        setField(term24879, term24879.getClass(), "propListHead", null);
        setIntField(term24879, term24879.getClass(), "sourcePosition", 0);
        setField(term24879, term24879.getClass(), "jsType", null);
        setField(term24879, term24879.getClass(), "parent", null);
        term24848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24848, term24848.getClass(), "type", 21);
        setField(term24848, term24848.getClass(), "next", term24848);
        setField(term24848, term24848.getClass(), "first", term24848);
        setField(term24848, term24848.getClass(), "last", null);
        setField(term24848, term24848.getClass(), "propListHead", null);
        setIntField(term24848, term24848.getClass(), "sourcePosition", 0);
        setField(term24848, term24848.getClass(), "jsType", null);
        setField(term24848, term24848.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term24588;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term24518, args);
        assertTrue(recursiveEquals(term24518, term24878));
        assertTrue(recursiveEquals(term24588, term24879));
        assertTrue(recursiveEquals(retValue, term24848));
    }

};


