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

public class ProcessCommonJSModules_process_627866047165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80279;
     Object term80371;
     Object term80958;
     Object term80959;

    public ProcessCommonJSModules_process_627866047165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80279 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term80279, term80279.getClass(), "compiler", null);
        term80371 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term80463 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term80533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80625 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term80371, term80371.getClass(), "type", 37);
        setField(term80371, term80371.getClass(), "parent", null);
        setField(term80533, term80533.getClass(), "next", null);
        setIntField(term80533, term80533.getClass(), "type", 0);
        setField(term80533, term80533.getClass(), "first", null);
        setField(term80463, term80463.getClass(), "next", term80533);
        setIntField(term80463, term80463.getClass(), "type", 0);
        setField(term80625, term80625.getClass(), "next", null);
        setIntField(term80625, term80625.getClass(), "type", 37);
        setField(term80625, term80625.getClass(), "first", null);
        setField(term80463, term80463.getClass(), "first", term80625);
        setField(term80371, term80371.getClass(), "first", term80463);
        term80958 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term80958, term80958.getClass(), "compiler", null);
        setField(term80958, term80958.getClass(), "filenamePrefix", null);
        setBooleanField(term80958, term80958.getClass(), "reportDependencies", false);
        setField(term80958, term80958.getClass(), "module", null);
        term80959 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term80960 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term80961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80962 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term80959, term80959.getClass(), "number", 0.0);
        setIntField(term80959, term80959.getClass(), "type", 37);
        setField(term80959, term80959.getClass(), "next", null);
        setDoubleField(term80960, term80960.getClass(), "number", 0.0);
        setIntField(term80960, term80960.getClass(), "type", 0);
        setIntField(term80961, term80961.getClass(), "type", 0);
        setField(term80961, term80961.getClass(), "next", null);
        setField(term80961, term80961.getClass(), "first", null);
        setField(term80961, term80961.getClass(), "last", null);
        setField(term80961, term80961.getClass(), "propListHead", null);
        setIntField(term80961, term80961.getClass(), "sourcePosition", 0);
        setField(term80961, term80961.getClass(), "jsType", null);
        setField(term80961, term80961.getClass(), "parent", null);
        setField(term80960, term80960.getClass(), "next", term80961);
        setDoubleField(term80962, term80962.getClass(), "number", 0.0);
        setIntField(term80962, term80962.getClass(), "type", 37);
        setField(term80962, term80962.getClass(), "next", null);
        setField(term80962, term80962.getClass(), "first", null);
        setField(term80962, term80962.getClass(), "last", null);
        setField(term80962, term80962.getClass(), "propListHead", null);
        setIntField(term80962, term80962.getClass(), "sourcePosition", 0);
        setField(term80962, term80962.getClass(), "jsType", null);
        setField(term80962, term80962.getClass(), "parent", null);
        setField(term80960, term80960.getClass(), "first", term80962);
        setField(term80960, term80960.getClass(), "last", null);
        setField(term80960, term80960.getClass(), "propListHead", null);
        setIntField(term80960, term80960.getClass(), "sourcePosition", 0);
        setField(term80960, term80960.getClass(), "jsType", null);
        setField(term80960, term80960.getClass(), "parent", null);
        setField(term80959, term80959.getClass(), "first", term80960);
        setField(term80959, term80959.getClass(), "last", null);
        setField(term80959, term80959.getClass(), "propListHead", null);
        setIntField(term80959, term80959.getClass(), "sourcePosition", 0);
        setField(term80959, term80959.getClass(), "jsType", null);
        setField(term80959, term80959.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term80371;
        callMethod(klass, "process", argTypes, term80279, args);
        assertTrue(recursiveEquals(term80279, term80958));
        assertTrue(recursiveEquals(term80371, null));
    }

};


