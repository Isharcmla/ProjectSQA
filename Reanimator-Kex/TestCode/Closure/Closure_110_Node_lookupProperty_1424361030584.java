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

public class Node_lookupProperty_1424361030584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50373;
     Object term50491;
     Object term50484;

    public Node_lookupProperty_1424361030584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50481 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term50373, term50373.getClass(), "propListHead", term50481);
        term50491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50492 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term50491, term50491.getClass(), "type", 0);
        setField(term50491, term50491.getClass(), "next", null);
        setField(term50491, term50491.getClass(), "first", null);
        setField(term50491, term50491.getClass(), "last", null);
        setField(term50492, term50492.getClass(), "objectValue", null);
        setField(term50492, term50492.getClass(), "next", null);
        setIntField(term50492, term50492.getClass(), "propType", 0);
        setField(term50491, term50491.getClass(), "propListHead", term50492);
        setIntField(term50491, term50491.getClass(), "sourcePosition", 0);
        setField(term50491, term50491.getClass(), "jsType", null);
        setField(term50491, term50491.getClass(), "parent", null);
        term50484 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term50484, term50484.getClass(), "objectValue", null);
        setField(term50484, term50484.getClass(), "next", null);
        setIntField(term50484, term50484.getClass(), "propType", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "lookupProperty", argTypes, term50373, args);
        assertTrue(recursiveEquals(term50373, term50491));
        assertTrue(recursiveEquals(retValue, term50484));
    }

};


