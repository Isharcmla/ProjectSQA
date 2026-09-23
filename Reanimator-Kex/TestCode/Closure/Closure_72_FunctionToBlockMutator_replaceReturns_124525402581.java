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

public class FunctionToBlockMutator_replaceReturns_124525402581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21659;
     Object term36628;
     Object term36591;

    public FunctionToBlockMutator_replaceReturns_124525402581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21659, term21659.getClass(), "type", 96);
        setField(term21659, term21659.getClass(), "parent", null);
        setField(term21659, term21659.getClass(), "first", null);
        term36628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36628, term36628.getClass(), "type", 96);
        setField(term36628, term36628.getClass(), "next", null);
        setField(term36628, term36628.getClass(), "first", null);
        setField(term36628, term36628.getClass(), "last", null);
        setField(term36628, term36628.getClass(), "propListHead", null);
        setIntField(term36628, term36628.getClass(), "sourcePosition", 0);
        setField(term36628, term36628.getClass(), "jsType", null);
        setField(term36628, term36628.getClass(), "parent", null);
        term36591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36591, term36591.getClass(), "type", 96);
        setField(term36591, term36591.getClass(), "next", null);
        setField(term36591, term36591.getClass(), "first", null);
        setField(term36591, term36591.getClass(), "last", null);
        setField(term36591, term36591.getClass(), "propListHead", null);
        setIntField(term36591, term36591.getClass(), "sourcePosition", 0);
        setField(term36591, term36591.getClass(), "jsType", null);
        setField(term36591, term36591.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term21659;
        args[1] = null;
        args[2] = "";
        args[3] = false;
        Object retValue = callMethod(klass, "replaceReturns", argTypes, null, args);
        assertTrue(recursiveEquals(term21659, term36628));
        assertTrue(recursiveEquals(retValue, term36591));
    }

};


