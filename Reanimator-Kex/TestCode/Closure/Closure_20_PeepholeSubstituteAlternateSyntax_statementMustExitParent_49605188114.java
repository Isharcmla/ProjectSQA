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

public class PeepholeSubstituteAlternateSyntax_statementMustExitParent_49605188114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15024;
     Object term15094;
     Object term15402;
     Object term15403;

    public PeepholeSubstituteAlternateSyntax_statementMustExitParent_49605188114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15024 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term15094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15094, term15094.getClass(), "type", 125);
        term15402 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term15402, term15402.getClass(), "late", false);
        setIntField(term15402, term15402.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term15402, term15402.getClass(), "compiler", null);
        term15403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15403, term15403.getClass(), "type", 125);
        setField(term15403, term15403.getClass(), "next", null);
        setField(term15403, term15403.getClass(), "first", null);
        setField(term15403, term15403.getClass(), "last", null);
        setField(term15403, term15403.getClass(), "propListHead", null);
        setIntField(term15403, term15403.getClass(), "sourcePosition", 0);
        setField(term15403, term15403.getClass(), "jsType", null);
        setField(term15403, term15403.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term15094;
        Object retValue = callMethod(klass, "statementMustExitParent", argTypes, term15024, args);
        assertTrue(recursiveEquals(term15024, term15402));
        assertTrue(recursiveEquals(term15094, term15403));
        assertTrue(recursiveEquals(retValue, false));
    }

};


