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

public class ProcessCommonJSModules_process_627866047213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108159;
     Object term108251;
     Object term108824;
     Object term108825;

    public ProcessCommonJSModules_process_627866047213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108159 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term108159, term108159.getClass(), "compiler", null);
        term108251 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term108343 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term108413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108505 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term108597 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term108251, term108251.getClass(), "type", 0);
        setField(term108251, term108251.getClass(), "parent", null);
        setField(term108343, term108343.getClass(), "next", term108413);
        setIntField(term108343, term108343.getClass(), "type", 37);
        setField(term108597, term108597.getClass(), "next", null);
        setIntField(term108597, term108597.getClass(), "type", 0);
        setField(term108597, term108597.getClass(), "first", null);
        setField(term108505, term108505.getClass(), "next", term108597);
        setIntField(term108505, term108505.getClass(), "type", 37);
        setField(term108505, term108505.getClass(), "first", null);
        setField(term108343, term108343.getClass(), "first", term108505);
        setField(term108251, term108251.getClass(), "first", term108343);
        term108824 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term108824, term108824.getClass(), "compiler", null);
        setField(term108824, term108824.getClass(), "filenamePrefix", null);
        setBooleanField(term108824, term108824.getClass(), "reportDependencies", false);
        setField(term108824, term108824.getClass(), "module", null);
        term108825 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term108826 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term108827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term108825, term108825.getClass(), "number", 0.0);
        setIntField(term108825, term108825.getClass(), "type", 0);
        setField(term108825, term108825.getClass(), "next", null);
        setDoubleField(term108826, term108826.getClass(), "number", 0.0);
        setIntField(term108826, term108826.getClass(), "type", 37);
        setIntField(term108827, term108827.getClass(), "type", 0);
        setField(term108827, term108827.getClass(), "next", null);
        setField(term108827, term108827.getClass(), "first", null);
        setField(term108827, term108827.getClass(), "last", null);
        setField(term108827, term108827.getClass(), "propListHead", null);
        setIntField(term108827, term108827.getClass(), "sourcePosition", 0);
        setField(term108827, term108827.getClass(), "jsType", null);
        setField(term108827, term108827.getClass(), "parent", null);
        setField(term108826, term108826.getClass(), "next", term108827);
        setField(term108826, term108826.getClass(), "first", true);
        setField(term108826, term108826.getClass(), "last", null);
        setField(term108826, term108826.getClass(), "propListHead", null);
        setIntField(term108826, term108826.getClass(), "sourcePosition", 0);
        setField(term108826, term108826.getClass(), "jsType", null);
        setField(term108826, term108826.getClass(), "parent", null);
        setField(term108825, term108825.getClass(), "first", term108826);
        setField(term108825, term108825.getClass(), "last", null);
        setField(term108825, term108825.getClass(), "propListHead", null);
        setIntField(term108825, term108825.getClass(), "sourcePosition", 0);
        setField(term108825, term108825.getClass(), "jsType", null);
        setField(term108825, term108825.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term108251;
        callMethod(klass, "process", argTypes, term108159, args);
        assertTrue(recursiveEquals(term108159, term108824));
        assertTrue(recursiveEquals(term108251, null));
    }

};


