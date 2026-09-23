package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class IR_throwNode_940306539164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19495;
     Object term19921;
     Object term19845;

    public IR_throwNode_940306539164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19495, term19495.getClass(), "type", 24);
        term19921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19921, term19921.getClass(), "type", 24);
        setField(term19921, term19921.getClass(), "next", null);
        setField(term19921, term19921.getClass(), "first", null);
        setField(term19921, term19921.getClass(), "last", null);
        setField(term19921, term19921.getClass(), "propListHead", null);
        setIntField(term19921, term19921.getClass(), "sourcePosition", 0);
        setField(term19921, term19921.getClass(), "jsType", null);
        setIntField(term19922, term19922.getClass(), "type", 49);
        setField(term19922, term19922.getClass(), "next", null);
        setField(term19922, term19922.getClass(), "first", term19921);
        setField(term19922, term19922.getClass(), "last", term19921);
        setField(term19922, term19922.getClass(), "propListHead", null);
        setIntField(term19922, term19922.getClass(), "sourcePosition", -1);
        setField(term19922, term19922.getClass(), "jsType", null);
        setField(term19922, term19922.getClass(), "parent", null);
        setField(term19921, term19921.getClass(), "parent", term19922);
        term19845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19845, term19845.getClass(), "type", 49);
        setField(term19845, term19845.getClass(), "next", null);
        setIntField(term19842, term19842.getClass(), "type", 24);
        setField(term19842, term19842.getClass(), "next", null);
        setField(term19842, term19842.getClass(), "first", null);
        setField(term19842, term19842.getClass(), "last", null);
        setField(term19842, term19842.getClass(), "propListHead", null);
        setIntField(term19842, term19842.getClass(), "sourcePosition", 0);
        setField(term19842, term19842.getClass(), "jsType", null);
        setField(term19842, term19842.getClass(), "parent", term19845);
        setField(term19845, term19845.getClass(), "first", term19842);
        setField(term19845, term19845.getClass(), "last", term19842);
        setField(term19845, term19845.getClass(), "propListHead", null);
        setIntField(term19845, term19845.getClass(), "sourcePosition", -1);
        setField(term19845, term19845.getClass(), "jsType", null);
        setField(term19845, term19845.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term19495;
        Object retValue = callMethod(klass, "throwNode", argTypes, null, args);
        assertTrue(recursiveEquals(term19495, term19921));
        assertTrue(recursiveEquals(retValue, term19845));
    }

};


