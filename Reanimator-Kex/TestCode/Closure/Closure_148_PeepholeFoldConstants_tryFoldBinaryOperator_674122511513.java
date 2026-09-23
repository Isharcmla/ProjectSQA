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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108127;
     Object term108219;
     Object term108848;
     Object term108849;
     Object term108804;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108127 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term108219 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term108311 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term108403 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term108311, term108311.getClass(), "next", term108403);
        setField(term108219, term108219.getClass(), "first", term108311);
        setIntField(term108219, term108219.getClass(), "type", 14);
        term108848 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term108848, term108848.getClass(), "currentTraversal", null);
        term108849 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term108850 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term108851 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term108849, term108849.getClass(), "str", null);
        setIntField(term108849, term108849.getClass(), "type", 14);
        setField(term108849, term108849.getClass(), "next", null);
        setField(term108850, term108850.getClass(), "str", null);
        setIntField(term108850, term108850.getClass(), "type", 0);
        setField(term108851, term108851.getClass(), "str", null);
        setIntField(term108851, term108851.getClass(), "type", 0);
        setField(term108851, term108851.getClass(), "next", null);
        setField(term108851, term108851.getClass(), "first", null);
        setField(term108851, term108851.getClass(), "last", null);
        setField(term108851, term108851.getClass(), "propListHead", null);
        setIntField(term108851, term108851.getClass(), "sourcePosition", 0);
        setField(term108851, term108851.getClass(), "jsType", null);
        setField(term108851, term108851.getClass(), "parent", null);
        setField(term108850, term108850.getClass(), "next", term108851);
        setField(term108850, term108850.getClass(), "first", null);
        setField(term108850, term108850.getClass(), "last", null);
        setField(term108850, term108850.getClass(), "propListHead", null);
        setIntField(term108850, term108850.getClass(), "sourcePosition", 0);
        setField(term108850, term108850.getClass(), "jsType", null);
        setField(term108850, term108850.getClass(), "parent", null);
        setField(term108849, term108849.getClass(), "first", term108850);
        setField(term108849, term108849.getClass(), "last", null);
        setField(term108849, term108849.getClass(), "propListHead", null);
        setIntField(term108849, term108849.getClass(), "sourcePosition", 0);
        setField(term108849, term108849.getClass(), "jsType", null);
        setField(term108849, term108849.getClass(), "parent", null);
        term108804 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term108806 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term108808 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term108804, term108804.getClass(), "str", null);
        setIntField(term108804, term108804.getClass(), "type", 14);
        setField(term108804, term108804.getClass(), "next", null);
        setField(term108806, term108806.getClass(), "str", null);
        setIntField(term108806, term108806.getClass(), "type", 0);
        setField(term108808, term108808.getClass(), "str", null);
        setIntField(term108808, term108808.getClass(), "type", 0);
        setField(term108808, term108808.getClass(), "next", null);
        setField(term108808, term108808.getClass(), "first", null);
        setField(term108808, term108808.getClass(), "last", null);
        setField(term108808, term108808.getClass(), "propListHead", null);
        setIntField(term108808, term108808.getClass(), "sourcePosition", 0);
        setField(term108808, term108808.getClass(), "jsType", null);
        setField(term108808, term108808.getClass(), "parent", null);
        setField(term108806, term108806.getClass(), "next", term108808);
        setField(term108806, term108806.getClass(), "first", null);
        setField(term108806, term108806.getClass(), "last", null);
        setField(term108806, term108806.getClass(), "propListHead", null);
        setIntField(term108806, term108806.getClass(), "sourcePosition", 0);
        setField(term108806, term108806.getClass(), "jsType", null);
        setField(term108806, term108806.getClass(), "parent", null);
        setField(term108804, term108804.getClass(), "first", term108806);
        setField(term108804, term108804.getClass(), "last", null);
        setField(term108804, term108804.getClass(), "propListHead", null);
        setIntField(term108804, term108804.getClass(), "sourcePosition", 0);
        setField(term108804, term108804.getClass(), "jsType", null);
        setField(term108804, term108804.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term108219;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term108127, args);
        assertTrue(recursiveEquals(term108127, term108848));
        assertTrue(recursiveEquals(term108219, term108849));
        assertTrue(recursiveEquals(retValue, term108804));
    }

};


