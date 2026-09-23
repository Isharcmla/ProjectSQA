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

public class PeepholeSubstituteAlternateSyntax_statementMustExitParent_49605188137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19984;
     Object term20054;
     Object term20882;
     Object term20883;

    public PeepholeSubstituteAlternateSyntax_statementMustExitParent_49605188137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19984 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term20054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20054, term20054.getClass(), "type", 4);
        term20882 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term20882, term20882.getClass(), "late", false);
        setIntField(term20882, term20882.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term20882, term20882.getClass(), "compiler", null);
        term20883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20883, term20883.getClass(), "type", 4);
        setField(term20883, term20883.getClass(), "next", null);
        setField(term20883, term20883.getClass(), "first", null);
        setField(term20883, term20883.getClass(), "last", null);
        setField(term20883, term20883.getClass(), "propListHead", null);
        setIntField(term20883, term20883.getClass(), "sourcePosition", 0);
        setField(term20883, term20883.getClass(), "jsType", null);
        setField(term20883, term20883.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20054;
        Object retValue = callMethod(klass, "statementMustExitParent", argTypes, term19984, args);
        assertTrue(recursiveEquals(term19984, term20882));
        assertTrue(recursiveEquals(term20054, term20883));
        assertTrue(recursiveEquals(retValue, true));
    }

};


