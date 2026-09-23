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

public class ProcessCommonJSModules_process_627866047155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74735;
     Object term74827;
     Object term75573;
     Object term75574;

    public ProcessCommonJSModules_process_627866047155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74735 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term74735, term74735.getClass(), "compiler", null);
        term74827 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term74919 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term74989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75081 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term75173 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term74827, term74827.getClass(), "type", 0);
        setField(term74827, term74827.getClass(), "parent", null);
        setField(term74919, term74919.getClass(), "next", term74989);
        setIntField(term74919, term74919.getClass(), "type", 37);
        setField(term75173, term75173.getClass(), "next", null);
        setIntField(term75173, term75173.getClass(), "type", 0);
        setField(term75173, term75173.getClass(), "first", null);
        setField(term75081, term75081.getClass(), "next", term75173);
        setIntField(term75081, term75081.getClass(), "type", 37);
        setField(term75081, term75081.getClass(), "first", null);
        setField(term74919, term74919.getClass(), "first", term75081);
        setField(term74827, term74827.getClass(), "first", term74919);
        term75573 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term75573, term75573.getClass(), "compiler", null);
        setField(term75573, term75573.getClass(), "filenamePrefix", null);
        setBooleanField(term75573, term75573.getClass(), "reportDependencies", false);
        setField(term75573, term75573.getClass(), "module", null);
        term75574 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term75575 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term75576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75577 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term75578 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term75574, term75574.getClass(), "number", 0.0);
        setIntField(term75574, term75574.getClass(), "type", 0);
        setField(term75574, term75574.getClass(), "next", null);
        setDoubleField(term75575, term75575.getClass(), "number", 0.0);
        setIntField(term75575, term75575.getClass(), "type", 37);
        setIntField(term75576, term75576.getClass(), "type", 0);
        setField(term75576, term75576.getClass(), "next", null);
        setField(term75576, term75576.getClass(), "first", null);
        setField(term75576, term75576.getClass(), "last", null);
        setField(term75576, term75576.getClass(), "propListHead", null);
        setIntField(term75576, term75576.getClass(), "sourcePosition", 0);
        setField(term75576, term75576.getClass(), "jsType", null);
        setField(term75576, term75576.getClass(), "parent", null);
        setField(term75575, term75575.getClass(), "next", term75576);
        setDoubleField(term75577, term75577.getClass(), "number", 0.0);
        setIntField(term75577, term75577.getClass(), "type", 37);
        setDoubleField(term75578, term75578.getClass(), "number", 0.0);
        setIntField(term75578, term75578.getClass(), "type", 0);
        setField(term75578, term75578.getClass(), "next", null);
        setField(term75578, term75578.getClass(), "first", null);
        setField(term75578, term75578.getClass(), "last", null);
        setField(term75578, term75578.getClass(), "propListHead", null);
        setIntField(term75578, term75578.getClass(), "sourcePosition", 0);
        setField(term75578, term75578.getClass(), "jsType", null);
        setField(term75578, term75578.getClass(), "parent", null);
        setField(term75577, term75577.getClass(), "next", term75578);
        setField(term75577, term75577.getClass(), "first", null);
        setField(term75577, term75577.getClass(), "last", null);
        setField(term75577, term75577.getClass(), "propListHead", null);
        setIntField(term75577, term75577.getClass(), "sourcePosition", 0);
        setField(term75577, term75577.getClass(), "jsType", null);
        setField(term75577, term75577.getClass(), "parent", null);
        setField(term75575, term75575.getClass(), "first", term75577);
        setField(term75575, term75575.getClass(), "last", null);
        setField(term75575, term75575.getClass(), "propListHead", null);
        setIntField(term75575, term75575.getClass(), "sourcePosition", 0);
        setField(term75575, term75575.getClass(), "jsType", null);
        setField(term75575, term75575.getClass(), "parent", null);
        setField(term75574, term75574.getClass(), "first", term75575);
        setField(term75574, term75574.getClass(), "last", null);
        setField(term75574, term75574.getClass(), "propListHead", null);
        setIntField(term75574, term75574.getClass(), "sourcePosition", 0);
        setField(term75574, term75574.getClass(), "jsType", null);
        setField(term75574, term75574.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term74827;
        callMethod(klass, "process", argTypes, term74735, args);
        assertTrue(recursiveEquals(term74735, term75573));
        assertTrue(recursiveEquals(term74827, null));
    }

};


