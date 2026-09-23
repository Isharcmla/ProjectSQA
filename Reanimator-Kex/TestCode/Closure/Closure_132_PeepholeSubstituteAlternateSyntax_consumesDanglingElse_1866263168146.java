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

public class PeepholeSubstituteAlternateSyntax_consumesDanglingElse_1866263168146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16773;
     Object term16843;
     Object term58925;
     Object term58926;

    public PeepholeSubstituteAlternateSyntax_consumesDanglingElse_1866263168146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16773 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term16843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16843, term16843.getClass(), "type", 108);
        term58925 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term58925, term58925.getClass(), "late", false);
        setIntField(term58925, term58925.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term58925, term58925.getClass(), "compiler", null);
        term58926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58926, term58926.getClass(), "type", 108);
        setField(term58926, term58926.getClass(), "next", null);
        setField(term58926, term58926.getClass(), "first", null);
        setField(term58926, term58926.getClass(), "last", null);
        setField(term58926, term58926.getClass(), "propListHead", null);
        setIntField(term58926, term58926.getClass(), "sourcePosition", 0);
        setField(term58926, term58926.getClass(), "jsType", null);
        setField(term58926, term58926.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term16843;
        Object retValue = callMethod(klass, "consumesDanglingElse", argTypes, term16773, args);
        assertTrue(recursiveEquals(term16773, term58925));
        assertTrue(recursiveEquals(term16843, term58926));
        assertTrue(recursiveEquals(retValue, true));
    }

};


