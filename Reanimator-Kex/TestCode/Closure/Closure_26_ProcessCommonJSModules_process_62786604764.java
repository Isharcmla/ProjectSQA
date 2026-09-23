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

public class ProcessCommonJSModules_process_62786604764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33936;
     Object term34028;
     Object term35080;
     Object term35081;

    public ProcessCommonJSModules_process_62786604764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33936 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term33936, term33936.getClass(), "compiler", null);
        term34028 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term34120 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term34190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34028, term34028.getClass(), "type", 0);
        setField(term34028, term34028.getClass(), "parent", null);
        setField(term34120, term34120.getClass(), "next", term34190);
        setIntField(term34120, term34120.getClass(), "type", 0);
        setField(term34120, term34120.getClass(), "first", null);
        setField(term34028, term34028.getClass(), "first", term34120);
        term35080 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term35080, term35080.getClass(), "compiler", null);
        setField(term35080, term35080.getClass(), "filenamePrefix", null);
        setBooleanField(term35080, term35080.getClass(), "reportDependencies", false);
        setField(term35080, term35080.getClass(), "module", null);
        term35081 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term35082 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term35083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term35081, term35081.getClass(), "number", 0.0);
        setIntField(term35081, term35081.getClass(), "type", 0);
        setField(term35081, term35081.getClass(), "next", null);
        setDoubleField(term35082, term35082.getClass(), "number", 0.0);
        setIntField(term35082, term35082.getClass(), "type", 0);
        setIntField(term35083, term35083.getClass(), "type", 0);
        setField(term35083, term35083.getClass(), "next", null);
        setField(term35083, term35083.getClass(), "first", null);
        setField(term35083, term35083.getClass(), "last", null);
        setField(term35083, term35083.getClass(), "propListHead", null);
        setIntField(term35083, term35083.getClass(), "sourcePosition", 0);
        setField(term35083, term35083.getClass(), "jsType", null);
        setField(term35083, term35083.getClass(), "parent", null);
        setField(term35082, term35082.getClass(), "next", term35083);
        setField(term35082, term35082.getClass(), "first", null);
        setField(term35082, term35082.getClass(), "last", null);
        setField(term35082, term35082.getClass(), "propListHead", null);
        setIntField(term35082, term35082.getClass(), "sourcePosition", 0);
        setField(term35082, term35082.getClass(), "jsType", null);
        setField(term35082, term35082.getClass(), "parent", null);
        setField(term35081, term35081.getClass(), "first", term35082);
        setField(term35081, term35081.getClass(), "last", null);
        setField(term35081, term35081.getClass(), "propListHead", null);
        setIntField(term35081, term35081.getClass(), "sourcePosition", 0);
        setField(term35081, term35081.getClass(), "jsType", null);
        setField(term35081, term35081.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term34028;
        callMethod(klass, "process", argTypes, term33936, args);
        assertTrue(recursiveEquals(term33936, term35080));
        assertTrue(recursiveEquals(term34028, null));
    }

};


