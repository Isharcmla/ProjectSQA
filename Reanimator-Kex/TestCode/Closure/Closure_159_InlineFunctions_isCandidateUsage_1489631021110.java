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

public class InlineFunctions_isCandidateUsage_1489631021110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18422;
     Object term69594;

    public InlineFunctions_isCandidateUsage_1489631021110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18492, term18492.getClass(), "type", 118);
        setField(term18422, term18422.getClass(), "parent", term18492);
        setIntField(term18422, term18422.getClass(), "type", 38);
        term69594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term69594, term69594.getClass(), "type", 38);
        setField(term69594, term69594.getClass(), "next", null);
        setField(term69594, term69594.getClass(), "first", null);
        setField(term69594, term69594.getClass(), "last", null);
        setField(term69594, term69594.getClass(), "propListHead", null);
        setIntField(term69594, term69594.getClass(), "sourcePosition", 0);
        setField(term69594, term69594.getClass(), "jsType", null);
        setIntField(term69595, term69595.getClass(), "type", 118);
        setField(term69595, term69595.getClass(), "next", null);
        setField(term69595, term69595.getClass(), "first", null);
        setField(term69595, term69595.getClass(), "last", null);
        setField(term69595, term69595.getClass(), "propListHead", null);
        setIntField(term69595, term69595.getClass(), "sourcePosition", 0);
        setField(term69595, term69595.getClass(), "jsType", null);
        setField(term69595, term69595.getClass(), "parent", null);
        setField(term69594, term69594.getClass(), "parent", term69595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18422;
        Object retValue = callMethod(klass, "isCandidateUsage", argTypes, null, args);
        assertTrue(recursiveEquals(term18422, term69594));
        assertTrue(recursiveEquals(retValue, true));
    }

};


