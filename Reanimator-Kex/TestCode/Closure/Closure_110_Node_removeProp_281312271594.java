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

public class Node_removeProp_281312271594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51558;
     Object term51666;
     Object term51854;
     Object term51855;

    public Node_removeProp_281312271594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term51666 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        term51854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51854, term51854.getClass(), "type", 0);
        setField(term51854, term51854.getClass(), "next", null);
        setField(term51854, term51854.getClass(), "first", null);
        setField(term51854, term51854.getClass(), "last", null);
        setField(term51854, term51854.getClass(), "propListHead", null);
        setIntField(term51854, term51854.getClass(), "sourcePosition", 0);
        setField(term51854, term51854.getClass(), "jsType", null);
        setField(term51854, term51854.getClass(), "parent", null);
        term51855 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term51855, term51855.getClass(), "objectValue", null);
        setField(term51855, term51855.getClass(), "next", null);
        setIntField(term51855, term51855.getClass(), "propType", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node$PropListItem");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term51666;
        args[1] = 0;
        Object retValue = callMethod(klass, "removeProp", argTypes, term51558, args);
        assertTrue(recursiveEquals(term51558, term51854));
        assertTrue(recursiveEquals(term51666, term51855));
        assertTrue(recursiveEquals(retValue, null));
    }

};


