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

public class ProcessCommonJSModules_process_627866047153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73447;
     Object term73517;
     Object term74404;
     Object term74405;

    public ProcessCommonJSModules_process_627866047153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73447 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term73447, term73447.getClass(), "compiler", null);
        term73517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73609 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term73679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73771 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term73863 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term73955 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term73517, term73517.getClass(), "type", 0);
        setField(term73517, term73517.getClass(), "parent", null);
        setField(term73609, term73609.getClass(), "next", term73679);
        setIntField(term73609, term73609.getClass(), "type", 0);
        setField(term73863, term73863.getClass(), "next", term73955);
        setIntField(term73863, term73863.getClass(), "type", 37);
        setField(term73863, term73863.getClass(), "first", null);
        setField(term73771, term73771.getClass(), "next", term73863);
        setIntField(term73771, term73771.getClass(), "type", 0);
        setField(term73771, term73771.getClass(), "first", null);
        setField(term73609, term73609.getClass(), "first", term73771);
        setField(term73517, term73517.getClass(), "first", term73609);
        term74404 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term74404, term74404.getClass(), "compiler", null);
        setField(term74404, term74404.getClass(), "filenamePrefix", null);
        setBooleanField(term74404, term74404.getClass(), "reportDependencies", false);
        setField(term74404, term74404.getClass(), "module", null);
        term74405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74406 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term74407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74408 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term74409 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term74410 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term74405, term74405.getClass(), "type", 0);
        setField(term74405, term74405.getClass(), "next", null);
        setDoubleField(term74406, term74406.getClass(), "number", 0.0);
        setIntField(term74406, term74406.getClass(), "type", 0);
        setIntField(term74407, term74407.getClass(), "type", 0);
        setField(term74407, term74407.getClass(), "next", null);
        setField(term74407, term74407.getClass(), "first", null);
        setField(term74407, term74407.getClass(), "last", null);
        setField(term74407, term74407.getClass(), "propListHead", null);
        setIntField(term74407, term74407.getClass(), "sourcePosition", 0);
        setField(term74407, term74407.getClass(), "jsType", null);
        setField(term74407, term74407.getClass(), "parent", null);
        setField(term74406, term74406.getClass(), "next", term74407);
        setDoubleField(term74408, term74408.getClass(), "number", 0.0);
        setIntField(term74408, term74408.getClass(), "type", 0);
        setDoubleField(term74409, term74409.getClass(), "number", 0.0);
        setIntField(term74409, term74409.getClass(), "type", 37);
        setDoubleField(term74410, term74410.getClass(), "number", 0.0);
        setIntField(term74410, term74410.getClass(), "type", 0);
        setField(term74410, term74410.getClass(), "next", null);
        setField(term74410, term74410.getClass(), "first", null);
        setField(term74410, term74410.getClass(), "last", null);
        setField(term74410, term74410.getClass(), "propListHead", null);
        setIntField(term74410, term74410.getClass(), "sourcePosition", 0);
        setField(term74410, term74410.getClass(), "jsType", null);
        setField(term74410, term74410.getClass(), "parent", null);
        setField(term74409, term74409.getClass(), "next", term74410);
        setField(term74409, term74409.getClass(), "first", null);
        setField(term74409, term74409.getClass(), "last", null);
        setField(term74409, term74409.getClass(), "propListHead", null);
        setIntField(term74409, term74409.getClass(), "sourcePosition", 0);
        setField(term74409, term74409.getClass(), "jsType", null);
        setField(term74409, term74409.getClass(), "parent", null);
        setField(term74408, term74408.getClass(), "next", term74409);
        setField(term74408, term74408.getClass(), "first", null);
        setField(term74408, term74408.getClass(), "last", null);
        setField(term74408, term74408.getClass(), "propListHead", null);
        setIntField(term74408, term74408.getClass(), "sourcePosition", 0);
        setField(term74408, term74408.getClass(), "jsType", null);
        setField(term74408, term74408.getClass(), "parent", null);
        setField(term74406, term74406.getClass(), "first", term74408);
        setField(term74406, term74406.getClass(), "last", null);
        setField(term74406, term74406.getClass(), "propListHead", null);
        setIntField(term74406, term74406.getClass(), "sourcePosition", 0);
        setField(term74406, term74406.getClass(), "jsType", null);
        setField(term74406, term74406.getClass(), "parent", null);
        setField(term74405, term74405.getClass(), "first", term74406);
        setField(term74405, term74405.getClass(), "last", null);
        setField(term74405, term74405.getClass(), "propListHead", null);
        setIntField(term74405, term74405.getClass(), "sourcePosition", 0);
        setField(term74405, term74405.getClass(), "jsType", null);
        setField(term74405, term74405.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term73517;
        callMethod(klass, "process", argTypes, term73447, args);
        assertTrue(recursiveEquals(term73447, term74404));
        assertTrue(recursiveEquals(term73517, null));
    }

};


