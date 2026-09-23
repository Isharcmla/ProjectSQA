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

public class ReferenceCollectingCallback_isBlockBoundary_684698721985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251085;
     Object term251177;
     Object term251756;
     Object term251758;

    public ReferenceCollectingCallback_isBlockBoundary_684698721985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251085 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term251177 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term251269 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term251177, term251177.getClass(), "type", 100);
        setField(term251177, term251177.getClass(), "first", term251269);
        term251756 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term251757 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term251756, term251756.getClass(), "str", null);
        setIntField(term251756, term251756.getClass(), "type", 100);
        setField(term251756, term251756.getClass(), "next", null);
        setField(term251757, term251757.getClass(), "str", null);
        setIntField(term251757, term251757.getClass(), "type", 0);
        setField(term251757, term251757.getClass(), "next", null);
        setField(term251757, term251757.getClass(), "first", null);
        setField(term251757, term251757.getClass(), "last", null);
        setField(term251757, term251757.getClass(), "propListHead", null);
        setIntField(term251757, term251757.getClass(), "sourcePosition", 0);
        setField(term251757, term251757.getClass(), "jsType", null);
        setField(term251757, term251757.getClass(), "parent", null);
        setField(term251756, term251756.getClass(), "first", term251757);
        setField(term251756, term251756.getClass(), "last", null);
        setField(term251756, term251756.getClass(), "propListHead", null);
        setIntField(term251756, term251756.getClass(), "sourcePosition", 0);
        setField(term251756, term251756.getClass(), "jsType", null);
        setField(term251756, term251756.getClass(), "parent", null);
        term251758 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term251758, term251758.getClass(), "str", null);
        setIntField(term251758, term251758.getClass(), "type", 0);
        setField(term251758, term251758.getClass(), "next", null);
        setField(term251758, term251758.getClass(), "first", null);
        setField(term251758, term251758.getClass(), "last", null);
        setField(term251758, term251758.getClass(), "propListHead", null);
        setIntField(term251758, term251758.getClass(), "sourcePosition", 0);
        setField(term251758, term251758.getClass(), "jsType", null);
        setField(term251758, term251758.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term251085;
        args[1] = term251177;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term251085, term251756));
        assertTrue(recursiveEquals(term251177, term251758));
        assertTrue(recursiveEquals(retValue, true));
    }

};


