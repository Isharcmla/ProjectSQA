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

public class PeepholeFoldConstants_tryFoldGetElem_393512537604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158394;
     Object term158464;
     Object term158534;
     Object term158604;
     Object term158623;
     Object term158624;
     Object term158625;
     Object term158626;
     Object term158606;

    public PeepholeFoldConstants_tryFoldGetElem_393512537604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158394 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term158464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term158464, term158464.getClass(), "type", 35);
        term158534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term158534, term158534.getClass(), "type", 63);
        term158604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term158623 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term158623, term158623.getClass(), "currentTraversal", null);
        term158624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term158624, term158624.getClass(), "type", 35);
        setField(term158624, term158624.getClass(), "next", null);
        setField(term158624, term158624.getClass(), "first", null);
        setField(term158624, term158624.getClass(), "last", null);
        setField(term158624, term158624.getClass(), "propListHead", null);
        setIntField(term158624, term158624.getClass(), "sourcePosition", 0);
        setField(term158624, term158624.getClass(), "jsType", null);
        setField(term158624, term158624.getClass(), "parent", null);
        term158625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term158625, term158625.getClass(), "type", 63);
        setField(term158625, term158625.getClass(), "next", null);
        setField(term158625, term158625.getClass(), "first", null);
        setField(term158625, term158625.getClass(), "last", null);
        setField(term158625, term158625.getClass(), "propListHead", null);
        setIntField(term158625, term158625.getClass(), "sourcePosition", 0);
        setField(term158625, term158625.getClass(), "jsType", null);
        setField(term158625, term158625.getClass(), "parent", null);
        term158626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term158626, term158626.getClass(), "type", 0);
        setField(term158626, term158626.getClass(), "next", null);
        setField(term158626, term158626.getClass(), "first", null);
        setField(term158626, term158626.getClass(), "last", null);
        setField(term158626, term158626.getClass(), "propListHead", null);
        setIntField(term158626, term158626.getClass(), "sourcePosition", 0);
        setField(term158626, term158626.getClass(), "jsType", null);
        setField(term158626, term158626.getClass(), "parent", null);
        term158606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term158606, term158606.getClass(), "type", 35);
        setField(term158606, term158606.getClass(), "next", null);
        setField(term158606, term158606.getClass(), "first", null);
        setField(term158606, term158606.getClass(), "last", null);
        setField(term158606, term158606.getClass(), "propListHead", null);
        setIntField(term158606, term158606.getClass(), "sourcePosition", 0);
        setField(term158606, term158606.getClass(), "jsType", null);
        setField(term158606, term158606.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term158464;
        args[1] = term158534;
        args[2] = term158604;
        Object retValue = callMethod(klass, "tryFoldGetElem", argTypes, term158394, args);
        assertTrue(recursiveEquals(term158394, term158623));
        assertTrue(recursiveEquals(term158464, term158624));
        assertTrue(recursiveEquals(term158534, term158625));
        assertTrue(recursiveEquals(term158604, term158626));
        assertTrue(recursiveEquals(retValue, term158606));
    }

};


