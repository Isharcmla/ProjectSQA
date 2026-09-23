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

public class PeepholeFoldConstants_tryFoldComparison_848443179876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203196;
     Object term203288;
     Object term203380;
     Object term203472;
     Object term203544;
     Object term203545;
     Object term203546;
     Object term203547;
     Object term203522;

    public PeepholeFoldConstants_tryFoldComparison_848443179876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203196 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term203288 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term203288, term203288.getClass(), "type", 14);
        term203380 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term203380, term203380.getClass(), "type", 14);
        term203472 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term203544 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term203544, term203544.getClass(), "currentTraversal", null);
        term203545 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term203545, term203545.getClass(), "number", 0.0);
        setIntField(term203545, term203545.getClass(), "type", 14);
        setField(term203545, term203545.getClass(), "next", null);
        setField(term203545, term203545.getClass(), "first", null);
        setField(term203545, term203545.getClass(), "last", null);
        setField(term203545, term203545.getClass(), "propListHead", null);
        setIntField(term203545, term203545.getClass(), "sourcePosition", 0);
        setField(term203545, term203545.getClass(), "jsType", null);
        setField(term203545, term203545.getClass(), "parent", null);
        term203546 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term203546, term203546.getClass(), "number", 0.0);
        setIntField(term203546, term203546.getClass(), "type", 14);
        setField(term203546, term203546.getClass(), "next", null);
        setField(term203546, term203546.getClass(), "first", null);
        setField(term203546, term203546.getClass(), "last", null);
        setField(term203546, term203546.getClass(), "propListHead", null);
        setIntField(term203546, term203546.getClass(), "sourcePosition", 0);
        setField(term203546, term203546.getClass(), "jsType", null);
        setField(term203546, term203546.getClass(), "parent", null);
        term203547 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term203547, term203547.getClass(), "number", 0.0);
        setIntField(term203547, term203547.getClass(), "type", 0);
        setField(term203547, term203547.getClass(), "next", null);
        setField(term203547, term203547.getClass(), "first", null);
        setField(term203547, term203547.getClass(), "last", null);
        setField(term203547, term203547.getClass(), "propListHead", null);
        setIntField(term203547, term203547.getClass(), "sourcePosition", 0);
        setField(term203547, term203547.getClass(), "jsType", null);
        setField(term203547, term203547.getClass(), "parent", null);
        term203522 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term203522, term203522.getClass(), "number", 0.0);
        setIntField(term203522, term203522.getClass(), "type", 14);
        setField(term203522, term203522.getClass(), "next", null);
        setField(term203522, term203522.getClass(), "first", null);
        setField(term203522, term203522.getClass(), "last", null);
        setField(term203522, term203522.getClass(), "propListHead", null);
        setIntField(term203522, term203522.getClass(), "sourcePosition", 0);
        setField(term203522, term203522.getClass(), "jsType", null);
        setField(term203522, term203522.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term203288;
        args[1] = term203380;
        args[2] = term203472;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term203196, args);
        assertTrue(recursiveEquals(term203196, term203544));
        assertTrue(recursiveEquals(term203288, term203545));
        assertTrue(recursiveEquals(term203380, term203546));
        assertTrue(recursiveEquals(term203472, term203547));
        assertTrue(recursiveEquals(retValue, term203522));
    }

};


