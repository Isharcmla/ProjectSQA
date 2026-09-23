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

public class PeepholeSubstituteAlternateSyntax_tryMinimizeArrayLiteral_212987423092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93366;
     Object term93436;
     Object term93668;
     Object term93669;
     Object term93653;

    public PeepholeSubstituteAlternateSyntax_tryMinimizeArrayLiteral_212987423092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93366 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term93436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term93436, term93436.getClass(), "first", term93436);
        setIntField(term93436, term93436.getClass(), "type", -41);
        setField(term93436, term93436.getClass(), "next", null);
        term93668 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term93668, term93668.getClass(), "late", false);
        setField(term93668, term93668.getClass(), "compiler", null);
        term93669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93669, term93669.getClass(), "type", -41);
        setField(term93669, term93669.getClass(), "next", null);
        setField(term93669, term93669.getClass(), "first", term93669);
        setField(term93669, term93669.getClass(), "last", null);
        setField(term93669, term93669.getClass(), "propListHead", null);
        setIntField(term93669, term93669.getClass(), "sourcePosition", 0);
        setField(term93669, term93669.getClass(), "jsType", null);
        setField(term93669, term93669.getClass(), "parent", null);
        term93653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93653, term93653.getClass(), "type", -41);
        setField(term93653, term93653.getClass(), "next", null);
        setField(term93653, term93653.getClass(), "first", term93653);
        setField(term93653, term93653.getClass(), "last", null);
        setField(term93653, term93653.getClass(), "propListHead", null);
        setIntField(term93653, term93653.getClass(), "sourcePosition", 0);
        setField(term93653, term93653.getClass(), "jsType", null);
        setField(term93653, term93653.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term93436;
        Object retValue = callMethod(klass, "tryMinimizeArrayLiteral", argTypes, term93366, args);
        assertTrue(recursiveEquals(term93366, term93668));
        assertTrue(recursiveEquals(term93436, term93669));
        assertTrue(recursiveEquals(retValue, term93653));
    }

};


