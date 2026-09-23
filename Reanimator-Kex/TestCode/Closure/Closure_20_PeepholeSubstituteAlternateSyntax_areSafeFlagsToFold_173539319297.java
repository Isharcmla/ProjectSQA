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

public class PeepholeSubstituteAlternateSyntax_areSafeFlagsToFold_173539319297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10618;
     Object term10667;

    public PeepholeSubstituteAlternateSyntax_areSafeFlagsToFold_173539319297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10618 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setField(term10618, term10618.getClass(), "compiler", null);
        term10667 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term10667, term10667.getClass(), "late", false);
        setIntField(term10667, term10667.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term10667, term10667.getClass(), "compiler", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "areSafeFlagsToFold", argTypes, term10618, args);
        assertTrue(recursiveEquals(term10618, term10667));
        assertTrue(recursiveEquals(retValue, true));
    }

};


