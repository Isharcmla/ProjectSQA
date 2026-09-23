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

public class PeepholeSubstituteAlternateSyntax_tryMinimizeArrayLiteral_212987423058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5251;
     Object term5321;
     Object term23641;
     Object term23642;
     Object term23630;

    public PeepholeSubstituteAlternateSyntax_tryMinimizeArrayLiteral_212987423058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5251 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term5321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term5321, term5321.getClass(), "first", null);
        term23641 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term23641, term23641.getClass(), "late", false);
        setField(term23641, term23641.getClass(), "compiler", null);
        term23642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23642, term23642.getClass(), "type", 0);
        setField(term23642, term23642.getClass(), "next", null);
        setField(term23642, term23642.getClass(), "first", null);
        setField(term23642, term23642.getClass(), "last", null);
        setField(term23642, term23642.getClass(), "propListHead", null);
        setIntField(term23642, term23642.getClass(), "sourcePosition", 0);
        setField(term23642, term23642.getClass(), "jsType", null);
        setField(term23642, term23642.getClass(), "parent", null);
        term23630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23630, term23630.getClass(), "type", 0);
        setField(term23630, term23630.getClass(), "next", null);
        setField(term23630, term23630.getClass(), "first", null);
        setField(term23630, term23630.getClass(), "last", null);
        setField(term23630, term23630.getClass(), "propListHead", null);
        setIntField(term23630, term23630.getClass(), "sourcePosition", 0);
        setField(term23630, term23630.getClass(), "jsType", null);
        setField(term23630, term23630.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5321;
        Object retValue = callMethod(klass, "tryMinimizeArrayLiteral", argTypes, term5251, args);
        assertTrue(recursiveEquals(term5251, term23641));
        assertTrue(recursiveEquals(term5321, term23642));
        assertTrue(recursiveEquals(retValue, term23630));
    }

};


