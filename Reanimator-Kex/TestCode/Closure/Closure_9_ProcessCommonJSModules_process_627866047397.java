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

public class ProcessCommonJSModules_process_627866047397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217280;
     Object term217350;
     Object term217937;
     Object term217938;

    public ProcessCommonJSModules_process_627866047397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217280 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term217280, term217280.getClass(), "compiler", null);
        term217350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term217442 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term217534 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term217626 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term217350, term217350.getClass(), "type", 0);
        setField(term217350, term217350.getClass(), "parent", null);
        setField(term217442, term217442.getClass(), "next", null);
        setIntField(term217442, term217442.getClass(), "type", 0);
        setField(term217626, term217626.getClass(), "next", null);
        setIntField(term217626, term217626.getClass(), "type", 0);
        setField(term217626, term217626.getClass(), "first", null);
        setField(term217534, term217534.getClass(), "next", term217626);
        setIntField(term217534, term217534.getClass(), "type", 0);
        setField(term217534, term217534.getClass(), "first", null);
        setField(term217442, term217442.getClass(), "first", term217534);
        setField(term217350, term217350.getClass(), "first", term217442);
        term217937 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term217937, term217937.getClass(), "compiler", null);
        setField(term217937, term217937.getClass(), "filenamePrefix", null);
        setBooleanField(term217937, term217937.getClass(), "reportDependencies", false);
        setField(term217937, term217937.getClass(), "module", null);
        term217938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term217939 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term217940 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term217941 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term217938, term217938.getClass(), "type", 0);
        setField(term217938, term217938.getClass(), "next", null);
        setDoubleField(term217939, term217939.getClass(), "number", 0.0);
        setIntField(term217939, term217939.getClass(), "type", 0);
        setField(term217939, term217939.getClass(), "next", null);
        setDoubleField(term217940, term217940.getClass(), "number", 0.0);
        setIntField(term217940, term217940.getClass(), "type", 0);
        setDoubleField(term217941, term217941.getClass(), "number", 0.0);
        setIntField(term217941, term217941.getClass(), "type", 0);
        setField(term217941, term217941.getClass(), "next", null);
        setField(term217941, term217941.getClass(), "first", null);
        setField(term217941, term217941.getClass(), "last", null);
        setField(term217941, term217941.getClass(), "propListHead", null);
        setIntField(term217941, term217941.getClass(), "sourcePosition", 0);
        setField(term217941, term217941.getClass(), "jsType", null);
        setField(term217941, term217941.getClass(), "parent", null);
        setField(term217940, term217940.getClass(), "next", term217941);
        setField(term217940, term217940.getClass(), "first", null);
        setField(term217940, term217940.getClass(), "last", null);
        setField(term217940, term217940.getClass(), "propListHead", null);
        setIntField(term217940, term217940.getClass(), "sourcePosition", 0);
        setField(term217940, term217940.getClass(), "jsType", null);
        setField(term217940, term217940.getClass(), "parent", null);
        setField(term217939, term217939.getClass(), "first", term217940);
        setField(term217939, term217939.getClass(), "last", null);
        setField(term217939, term217939.getClass(), "propListHead", null);
        setIntField(term217939, term217939.getClass(), "sourcePosition", 0);
        setField(term217939, term217939.getClass(), "jsType", null);
        setField(term217939, term217939.getClass(), "parent", null);
        setField(term217938, term217938.getClass(), "first", term217939);
        setField(term217938, term217938.getClass(), "last", null);
        setField(term217938, term217938.getClass(), "propListHead", null);
        setIntField(term217938, term217938.getClass(), "sourcePosition", 0);
        setField(term217938, term217938.getClass(), "jsType", null);
        setField(term217938, term217938.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term217350;
        callMethod(klass, "process", argTypes, term217280, args);
        assertTrue(recursiveEquals(term217280, term217937));
        assertTrue(recursiveEquals(term217350, null));
    }

};


