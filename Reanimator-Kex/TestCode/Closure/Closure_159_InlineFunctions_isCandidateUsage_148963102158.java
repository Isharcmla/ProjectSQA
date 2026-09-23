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
import java.lang.Object;

public class InlineFunctions_isCandidateUsage_148963102158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9059;
     Object term9583;

    public InlineFunctions_isCandidateUsage_148963102158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term9059, term9059.getClass(), "parent", term9129);
        setIntField(term9059, term9059.getClass(), "type", 38);
        term9583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9583, term9583.getClass(), "type", 38);
        setField(term9583, term9583.getClass(), "next", null);
        setField(term9583, term9583.getClass(), "first", null);
        setField(term9583, term9583.getClass(), "last", null);
        setField(term9583, term9583.getClass(), "propListHead", null);
        setIntField(term9583, term9583.getClass(), "sourcePosition", 0);
        setField(term9583, term9583.getClass(), "jsType", null);
        setIntField(term9584, term9584.getClass(), "type", 0);
        setField(term9584, term9584.getClass(), "next", null);
        setField(term9584, term9584.getClass(), "first", null);
        setField(term9584, term9584.getClass(), "last", null);
        setField(term9584, term9584.getClass(), "propListHead", null);
        setIntField(term9584, term9584.getClass(), "sourcePosition", 0);
        setField(term9584, term9584.getClass(), "jsType", null);
        setField(term9584, term9584.getClass(), "parent", null);
        setField(term9583, term9583.getClass(), "parent", term9584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term9059;
        Object retValue = callMethod(klass, "isCandidateUsage", argTypes, null, args);
        assertTrue(recursiveEquals(term9059, term9583));
        assertTrue(recursiveEquals(retValue, false));
    }

};


