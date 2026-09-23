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

public class Node_setSourceFileForTesting_208698425840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56455;
     Object term96634;

    public Node_setSourceFileForTesting_208698425840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56455 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term96634 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term96635 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term96636 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSourceFile"));
        setDoubleField(term96634, term96634.getClass(), "number", 0.0);
        setIntField(term96634, term96634.getClass(), "type", 0);
        setField(term96634, term96634.getClass(), "next", null);
        setField(term96634, term96634.getClass(), "first", null);
        setField(term96634, term96634.getClass(), "last", null);
        setField(term96636, term96636.getClass(), "name", "");
        setBooleanField(term96636, term96636.getClass(), "extern", false);
        setField(term96635, term96635.getClass(), "objectValue", term96636);
        setField(term96635, term96635.getClass(), "next", null);
        setIntField(term96635, term96635.getClass(), "propType", 51);
        setField(term96634, term96634.getClass(), "propListHead", term96635);
        setIntField(term96634, term96634.getClass(), "sourcePosition", 0);
        setField(term96634, term96634.getClass(), "jsType", null);
        setField(term96634, term96634.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "setSourceFileForTesting", argTypes, term56455, args);
        assertTrue(recursiveEquals(term56455, term96634));
    }

};


