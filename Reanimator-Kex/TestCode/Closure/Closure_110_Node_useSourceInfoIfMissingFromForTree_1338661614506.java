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

public class Node_useSourceInfoIfMissingFromForTree_1338661614506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40314;
     Object term40406;
     Object term40733;
     Object term40734;
     Object term40707;

    public Node_useSourceInfoIfMissingFromForTree_1338661614506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40314 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term40314, term40314.getClass(), "propListHead", null);
        term40406 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term40733 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term40733, term40733.getClass(), "number", 0.0);
        setIntField(term40733, term40733.getClass(), "type", 0);
        setField(term40733, term40733.getClass(), "next", null);
        setField(term40733, term40733.getClass(), "first", null);
        setField(term40733, term40733.getClass(), "last", null);
        setField(term40733, term40733.getClass(), "propListHead", null);
        setIntField(term40733, term40733.getClass(), "sourcePosition", 0);
        setField(term40733, term40733.getClass(), "jsType", null);
        setField(term40733, term40733.getClass(), "parent", null);
        term40734 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term40734, term40734.getClass(), "number", 0.0);
        setIntField(term40734, term40734.getClass(), "type", 0);
        setField(term40734, term40734.getClass(), "next", null);
        setField(term40734, term40734.getClass(), "first", null);
        setField(term40734, term40734.getClass(), "last", null);
        setField(term40734, term40734.getClass(), "propListHead", null);
        setIntField(term40734, term40734.getClass(), "sourcePosition", 0);
        setField(term40734, term40734.getClass(), "jsType", null);
        setField(term40734, term40734.getClass(), "parent", null);
        term40707 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term40707, term40707.getClass(), "number", 0.0);
        setIntField(term40707, term40707.getClass(), "type", 0);
        setField(term40707, term40707.getClass(), "next", null);
        setField(term40707, term40707.getClass(), "first", null);
        setField(term40707, term40707.getClass(), "last", null);
        setField(term40707, term40707.getClass(), "propListHead", null);
        setIntField(term40707, term40707.getClass(), "sourcePosition", 0);
        setField(term40707, term40707.getClass(), "jsType", null);
        setField(term40707, term40707.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40406;
        Object retValue = callMethod(klass, "useSourceInfoIfMissingFromForTree", argTypes, term40314, args);
        assertTrue(recursiveEquals(term40314, term40733));
        assertTrue(recursiveEquals(term40406, term40734));
        assertTrue(recursiveEquals(retValue, term40707));
    }

};


