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

public class PeepholeFoldConstants_tryFoldBinaryOperator_67412251195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16867;
     Object term16937;
     Object term17272;
     Object term17273;
     Object term17253;

    public PeepholeFoldConstants_tryFoldBinaryOperator_67412251195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16867 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term16937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term16937, term16937.getClass(), "first", term16937);
        setField(term16937, term16937.getClass(), "next", term16937);
        setIntField(term16937, term16937.getClass(), "type", 35);
        term17272 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term17272, term17272.getClass(), "currentTraversal", null);
        term17273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17273, term17273.getClass(), "type", 35);
        setField(term17273, term17273.getClass(), "next", term17273);
        setField(term17273, term17273.getClass(), "first", term17273);
        setField(term17273, term17273.getClass(), "last", null);
        setField(term17273, term17273.getClass(), "propListHead", null);
        setIntField(term17273, term17273.getClass(), "sourcePosition", 0);
        setField(term17273, term17273.getClass(), "jsType", null);
        setField(term17273, term17273.getClass(), "parent", null);
        term17253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17253, term17253.getClass(), "type", 35);
        setField(term17253, term17253.getClass(), "next", term17253);
        setField(term17253, term17253.getClass(), "first", term17253);
        setField(term17253, term17253.getClass(), "last", null);
        setField(term17253, term17253.getClass(), "propListHead", null);
        setIntField(term17253, term17253.getClass(), "sourcePosition", 0);
        setField(term17253, term17253.getClass(), "jsType", null);
        setField(term17253, term17253.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term16937;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term16867, args);
        assertTrue(recursiveEquals(term16867, term17272));
        assertTrue(recursiveEquals(term16937, term17273));
        assertTrue(recursiveEquals(retValue, term17253));
    }

};


