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

public class PeepholeFoldConstants_tryConvertOperandsToNumber_21063566178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12274;
     Object term12344;
     Object term12637;
     Object term12638;

    public PeepholeFoldConstants_tryConvertOperandsToNumber_21063566178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12274 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term12344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term12344, term12344.getClass(), "first", term12344);
        setField(term12344, term12344.getClass(), "next", term12414);
        setIntField(term12344, term12344.getClass(), "type", 39);
        term12637 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term12637, term12637.getClass(), "currentTraversal", null);
        term12638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12638, term12638.getClass(), "type", 39);
        setIntField(term12639, term12639.getClass(), "type", 0);
        setField(term12639, term12639.getClass(), "next", null);
        setField(term12639, term12639.getClass(), "first", null);
        setField(term12639, term12639.getClass(), "last", null);
        setField(term12639, term12639.getClass(), "propListHead", null);
        setIntField(term12639, term12639.getClass(), "sourcePosition", 0);
        setField(term12639, term12639.getClass(), "jsType", null);
        setField(term12639, term12639.getClass(), "parent", null);
        setField(term12638, term12638.getClass(), "next", term12639);
        setField(term12638, term12638.getClass(), "first", term12638);
        setField(term12638, term12638.getClass(), "last", null);
        setField(term12638, term12638.getClass(), "propListHead", null);
        setIntField(term12638, term12638.getClass(), "sourcePosition", 0);
        setField(term12638, term12638.getClass(), "jsType", null);
        setField(term12638, term12638.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12344;
        callMethod(klass, "tryConvertOperandsToNumber", argTypes, term12274, args);
        assertTrue(recursiveEquals(term12274, term12637));
        assertTrue(recursiveEquals(term12344, term12638));
    }

};


