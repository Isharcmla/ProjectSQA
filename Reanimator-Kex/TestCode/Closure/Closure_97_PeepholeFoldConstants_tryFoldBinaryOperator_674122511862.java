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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245345;
     Object term245437;
     Object term245681;
     Object term245682;
     Object term245628;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245345 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term245437 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term245529 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term245621 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term245529, term245529.getClass(), "next", term245621);
        setIntField(term245529, term245529.getClass(), "type", 0);
        setField(term245437, term245437.getClass(), "first", term245529);
        setIntField(term245437, term245437.getClass(), "type", 100);
        setField(term245437, term245437.getClass(), "parent", null);
        term245681 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term245681, term245681.getClass(), "currentTraversal", null);
        term245682 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term245683 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term245684 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term245682, term245682.getClass(), "str", null);
        setIntField(term245682, term245682.getClass(), "type", 100);
        setField(term245682, term245682.getClass(), "next", null);
        setField(term245683, term245683.getClass(), "str", null);
        setIntField(term245683, term245683.getClass(), "type", 0);
        setField(term245684, term245684.getClass(), "str", null);
        setIntField(term245684, term245684.getClass(), "type", 0);
        setField(term245684, term245684.getClass(), "next", null);
        setField(term245684, term245684.getClass(), "first", null);
        setField(term245684, term245684.getClass(), "last", null);
        setField(term245684, term245684.getClass(), "propListHead", null);
        setIntField(term245684, term245684.getClass(), "sourcePosition", 0);
        setField(term245684, term245684.getClass(), "jsType", null);
        setField(term245684, term245684.getClass(), "parent", null);
        setField(term245683, term245683.getClass(), "next", term245684);
        setField(term245683, term245683.getClass(), "first", null);
        setField(term245683, term245683.getClass(), "last", null);
        setField(term245683, term245683.getClass(), "propListHead", null);
        setIntField(term245683, term245683.getClass(), "sourcePosition", 0);
        setField(term245683, term245683.getClass(), "jsType", null);
        setField(term245683, term245683.getClass(), "parent", null);
        setField(term245682, term245682.getClass(), "first", term245683);
        setField(term245682, term245682.getClass(), "last", null);
        setField(term245682, term245682.getClass(), "propListHead", null);
        setIntField(term245682, term245682.getClass(), "sourcePosition", 0);
        setField(term245682, term245682.getClass(), "jsType", null);
        setField(term245682, term245682.getClass(), "parent", null);
        term245628 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term245630 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term245632 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term245628, term245628.getClass(), "str", null);
        setIntField(term245628, term245628.getClass(), "type", 100);
        setField(term245628, term245628.getClass(), "next", null);
        setField(term245630, term245630.getClass(), "str", null);
        setIntField(term245630, term245630.getClass(), "type", 0);
        setField(term245632, term245632.getClass(), "str", null);
        setIntField(term245632, term245632.getClass(), "type", 0);
        setField(term245632, term245632.getClass(), "next", null);
        setField(term245632, term245632.getClass(), "first", null);
        setField(term245632, term245632.getClass(), "last", null);
        setField(term245632, term245632.getClass(), "propListHead", null);
        setIntField(term245632, term245632.getClass(), "sourcePosition", 0);
        setField(term245632, term245632.getClass(), "jsType", null);
        setField(term245632, term245632.getClass(), "parent", null);
        setField(term245630, term245630.getClass(), "next", term245632);
        setField(term245630, term245630.getClass(), "first", null);
        setField(term245630, term245630.getClass(), "last", null);
        setField(term245630, term245630.getClass(), "propListHead", null);
        setIntField(term245630, term245630.getClass(), "sourcePosition", 0);
        setField(term245630, term245630.getClass(), "jsType", null);
        setField(term245630, term245630.getClass(), "parent", null);
        setField(term245628, term245628.getClass(), "first", term245630);
        setField(term245628, term245628.getClass(), "last", null);
        setField(term245628, term245628.getClass(), "propListHead", null);
        setIntField(term245628, term245628.getClass(), "sourcePosition", 0);
        setField(term245628, term245628.getClass(), "jsType", null);
        setField(term245628, term245628.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term245437;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term245345, args);
        assertTrue(recursiveEquals(term245345, term245681));
        assertTrue(recursiveEquals(term245437, term245682));
        assertTrue(recursiveEquals(retValue, term245628));
    }

};


