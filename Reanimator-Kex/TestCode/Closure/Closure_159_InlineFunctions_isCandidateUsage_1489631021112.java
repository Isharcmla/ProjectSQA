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

public class InlineFunctions_isCandidateUsage_1489631021112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18893;
     Object term69676;

    public InlineFunctions_isCandidateUsage_1489631021112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18963, term18963.getClass(), "type", 37);
        setField(term18893, term18893.getClass(), "parent", term18963);
        setIntField(term18893, term18893.getClass(), "type", 38);
        term69676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term69676, term69676.getClass(), "type", 38);
        setField(term69676, term69676.getClass(), "next", null);
        setField(term69676, term69676.getClass(), "first", null);
        setField(term69676, term69676.getClass(), "last", null);
        setField(term69676, term69676.getClass(), "propListHead", null);
        setIntField(term69676, term69676.getClass(), "sourcePosition", 0);
        setField(term69676, term69676.getClass(), "jsType", null);
        setIntField(term69677, term69677.getClass(), "type", 37);
        setField(term69677, term69677.getClass(), "next", null);
        setField(term69677, term69677.getClass(), "first", null);
        setField(term69677, term69677.getClass(), "last", null);
        setField(term69677, term69677.getClass(), "propListHead", null);
        setIntField(term69677, term69677.getClass(), "sourcePosition", 0);
        setField(term69677, term69677.getClass(), "jsType", null);
        setField(term69677, term69677.getClass(), "parent", null);
        setField(term69676, term69676.getClass(), "parent", term69677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18893;
        Object retValue = callMethod(klass, "isCandidateUsage", argTypes, null, args);
        assertTrue(recursiveEquals(term18893, term69676));
        assertTrue(recursiveEquals(retValue, false));
    }

};


