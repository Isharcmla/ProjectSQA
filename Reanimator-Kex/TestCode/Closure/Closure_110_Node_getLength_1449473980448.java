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

public class Node_getLength_1449473980448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32669;
     Object term32793;

    public Node_getLength_1449473980448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32777 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term32669, term32669.getClass(), "propListHead", term32777);
        term32793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32794 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term32793, term32793.getClass(), "type", 0);
        setField(term32793, term32793.getClass(), "next", null);
        setField(term32793, term32793.getClass(), "first", null);
        setField(term32793, term32793.getClass(), "last", null);
        setField(term32794, term32794.getClass(), "objectValue", null);
        setField(term32794, term32794.getClass(), "next", null);
        setIntField(term32794, term32794.getClass(), "propType", 0);
        setField(term32793, term32793.getClass(), "propListHead", term32794);
        setIntField(term32793, term32793.getClass(), "sourcePosition", 0);
        setField(term32793, term32793.getClass(), "jsType", null);
        setField(term32793, term32793.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLength", argTypes, term32669, args);
        assertTrue(recursiveEquals(term32669, term32793));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


