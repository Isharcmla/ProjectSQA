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

public class NodeUtil_isBooleanResultHelper_1304367666194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term799;
     Object term9567;

    public NodeUtil_isBooleanResultHelper_1304367666194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term799, term799.getClass(), "type", -2070466617);
        setIntField(term801, term801.getClass(), "type", 798043553);
        setIntField(term803, term803.getClass(), "type", 0);
        setField(term803, term803.getClass(), "next", null);
        setField(term803, term803.getClass(), "first", null);
        setField(term803, term803.getClass(), "last", null);
        setField(term803, term803.getClass(), "propListHead", null);
        setIntField(term803, term803.getClass(), "sourcePosition", 0);
        setField(term803, term803.getClass(), "jsType", null);
        setField(term803, term803.getClass(), "parent", null);
        setField(term801, term801.getClass(), "next", term803);
        setIntField(term806, term806.getClass(), "type", 0);
        setField(term806, term806.getClass(), "next", null);
        setField(term806, term806.getClass(), "first", null);
        setField(term806, term806.getClass(), "last", null);
        setField(term806, term806.getClass(), "propListHead", null);
        setIntField(term806, term806.getClass(), "sourcePosition", 0);
        setField(term806, term806.getClass(), "jsType", null);
        setField(term806, term806.getClass(), "parent", null);
        setField(term801, term801.getClass(), "first", term806);
        setIntField(term809, term809.getClass(), "type", 0);
        setField(term809, term809.getClass(), "next", null);
        setField(term809, term809.getClass(), "first", null);
        setField(term809, term809.getClass(), "last", null);
        setField(term809, term809.getClass(), "propListHead", null);
        setIntField(term809, term809.getClass(), "sourcePosition", 0);
        setField(term809, term809.getClass(), "jsType", null);
        setField(term809, term809.getClass(), "parent", null);
        setField(term801, term801.getClass(), "last", term809);
        setField(term801, term801.getClass(), "propListHead", null);
        setIntField(term801, term801.getClass(), "sourcePosition", 0);
        setField(term801, term801.getClass(), "jsType", null);
        setField(term801, term801.getClass(), "parent", null);
        setField(term799, term799.getClass(), "next", term801);
        setIntField(term813, term813.getClass(), "type", 0);
        setField(term813, term813.getClass(), "next", null);
        setField(term813, term813.getClass(), "first", null);
        setField(term813, term813.getClass(), "last", null);
        setField(term813, term813.getClass(), "propListHead", null);
        setIntField(term813, term813.getClass(), "sourcePosition", 0);
        setField(term813, term813.getClass(), "jsType", null);
        setField(term813, term813.getClass(), "parent", null);
        setField(term799, term799.getClass(), "first", term813);
        setIntField(term816, term816.getClass(), "type", 0);
        setField(term816, term816.getClass(), "next", null);
        setField(term816, term816.getClass(), "first", null);
        setField(term816, term816.getClass(), "last", null);
        setField(term816, term816.getClass(), "propListHead", null);
        setIntField(term816, term816.getClass(), "sourcePosition", 0);
        setField(term816, term816.getClass(), "jsType", null);
        setField(term816, term816.getClass(), "parent", null);
        setField(term799, term799.getClass(), "last", term816);
        setField(term799, term799.getClass(), "propListHead", null);
        setIntField(term799, term799.getClass(), "sourcePosition", 0);
        setField(term799, term799.getClass(), "jsType", null);
        setField(term799, term799.getClass(), "parent", null);
        term9567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9567, term9567.getClass(), "type", -2070466617);
        setIntField(term9568, term9568.getClass(), "type", 798043553);
        setIntField(term9569, term9569.getClass(), "type", 0);
        setField(term9569, term9569.getClass(), "next", null);
        setField(term9569, term9569.getClass(), "first", null);
        setField(term9569, term9569.getClass(), "last", null);
        setField(term9569, term9569.getClass(), "propListHead", null);
        setIntField(term9569, term9569.getClass(), "sourcePosition", 0);
        setField(term9569, term9569.getClass(), "jsType", null);
        setField(term9569, term9569.getClass(), "parent", null);
        setField(term9568, term9568.getClass(), "next", term9569);
        setIntField(term9570, term9570.getClass(), "type", 0);
        setField(term9570, term9570.getClass(), "next", null);
        setField(term9570, term9570.getClass(), "first", null);
        setField(term9570, term9570.getClass(), "last", null);
        setField(term9570, term9570.getClass(), "propListHead", null);
        setIntField(term9570, term9570.getClass(), "sourcePosition", 0);
        setField(term9570, term9570.getClass(), "jsType", null);
        setField(term9570, term9570.getClass(), "parent", null);
        setField(term9568, term9568.getClass(), "first", term9570);
        setIntField(term9571, term9571.getClass(), "type", 0);
        setField(term9571, term9571.getClass(), "next", null);
        setField(term9571, term9571.getClass(), "first", null);
        setField(term9571, term9571.getClass(), "last", null);
        setField(term9571, term9571.getClass(), "propListHead", null);
        setIntField(term9571, term9571.getClass(), "sourcePosition", 0);
        setField(term9571, term9571.getClass(), "jsType", null);
        setField(term9571, term9571.getClass(), "parent", null);
        setField(term9568, term9568.getClass(), "last", term9571);
        setField(term9568, term9568.getClass(), "propListHead", null);
        setIntField(term9568, term9568.getClass(), "sourcePosition", 0);
        setField(term9568, term9568.getClass(), "jsType", null);
        setField(term9568, term9568.getClass(), "parent", null);
        setField(term9567, term9567.getClass(), "next", term9568);
        setIntField(term9572, term9572.getClass(), "type", 0);
        setField(term9572, term9572.getClass(), "next", null);
        setField(term9572, term9572.getClass(), "first", null);
        setField(term9572, term9572.getClass(), "last", null);
        setField(term9572, term9572.getClass(), "propListHead", null);
        setIntField(term9572, term9572.getClass(), "sourcePosition", 0);
        setField(term9572, term9572.getClass(), "jsType", null);
        setField(term9572, term9572.getClass(), "parent", null);
        setField(term9567, term9567.getClass(), "first", term9572);
        setIntField(term9573, term9573.getClass(), "type", 0);
        setField(term9573, term9573.getClass(), "next", null);
        setField(term9573, term9573.getClass(), "first", null);
        setField(term9573, term9573.getClass(), "last", null);
        setField(term9573, term9573.getClass(), "propListHead", null);
        setIntField(term9573, term9573.getClass(), "sourcePosition", 0);
        setField(term9573, term9573.getClass(), "jsType", null);
        setField(term9573, term9573.getClass(), "parent", null);
        setField(term9567, term9567.getClass(), "last", term9573);
        setField(term9567, term9567.getClass(), "propListHead", null);
        setIntField(term9567, term9567.getClass(), "sourcePosition", 0);
        setField(term9567, term9567.getClass(), "jsType", null);
        setField(term9567, term9567.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term799;
        Object retValue = callMethod(klass, "isBooleanResultHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term799, term9567));
        assertTrue(recursiveEquals(retValue, false));
    }

};


