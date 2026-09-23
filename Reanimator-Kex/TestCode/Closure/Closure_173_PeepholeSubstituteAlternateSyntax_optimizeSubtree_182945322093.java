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

public class PeepholeSubstituteAlternateSyntax_optimizeSubtree_182945322093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93579;
     Object term93649;
     Object term93681;
     Object term93682;
     Object term93672;

    public PeepholeSubstituteAlternateSyntax_optimizeSubtree_182945322093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93579 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term93649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93649, term93649.getClass(), "type", 43);
        term93681 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term93681, term93681.getClass(), "late", false);
        setField(term93681, term93681.getClass(), "compiler", null);
        term93682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93682, term93682.getClass(), "type", 43);
        setField(term93682, term93682.getClass(), "next", null);
        setField(term93682, term93682.getClass(), "first", null);
        setField(term93682, term93682.getClass(), "last", null);
        setField(term93682, term93682.getClass(), "propListHead", null);
        setIntField(term93682, term93682.getClass(), "sourcePosition", 0);
        setField(term93682, term93682.getClass(), "jsType", null);
        setField(term93682, term93682.getClass(), "parent", null);
        term93672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93672, term93672.getClass(), "type", 43);
        setField(term93672, term93672.getClass(), "next", null);
        setField(term93672, term93672.getClass(), "first", null);
        setField(term93672, term93672.getClass(), "last", null);
        setField(term93672, term93672.getClass(), "propListHead", null);
        setIntField(term93672, term93672.getClass(), "sourcePosition", 0);
        setField(term93672, term93672.getClass(), "jsType", null);
        setField(term93672, term93672.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term93649;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term93579, args);
        assertTrue(recursiveEquals(term93579, term93681));
        assertTrue(recursiveEquals(term93649, term93682));
        assertTrue(recursiveEquals(retValue, term93672));
    }

};


