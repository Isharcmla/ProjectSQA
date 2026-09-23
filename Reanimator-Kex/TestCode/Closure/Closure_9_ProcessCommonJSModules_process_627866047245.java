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

public class ProcessCommonJSModules_process_627866047245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126863;
     Object term126955;
     Object term127430;
     Object term127431;

    public ProcessCommonJSModules_process_627866047245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126863 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term126863, term126863.getClass(), "compiler", null);
        term126955 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term127047 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term127117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127209 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term126955, term126955.getClass(), "type", 37);
        setField(term126955, term126955.getClass(), "parent", null);
        setField(term127117, term127117.getClass(), "next", null);
        setIntField(term127117, term127117.getClass(), "type", 0);
        setField(term127117, term127117.getClass(), "first", null);
        setField(term127047, term127047.getClass(), "next", term127117);
        setIntField(term127047, term127047.getClass(), "type", 0);
        setField(term127209, term127209.getClass(), "next", null);
        setIntField(term127209, term127209.getClass(), "type", 0);
        setField(term127209, term127209.getClass(), "first", null);
        setField(term127047, term127047.getClass(), "first", term127209);
        setField(term126955, term126955.getClass(), "first", term127047);
        term127430 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term127430, term127430.getClass(), "compiler", null);
        setField(term127430, term127430.getClass(), "filenamePrefix", null);
        setBooleanField(term127430, term127430.getClass(), "reportDependencies", false);
        setField(term127430, term127430.getClass(), "module", null);
        term127431 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term127432 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term127433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127434 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term127431, term127431.getClass(), "number", 0.0);
        setIntField(term127431, term127431.getClass(), "type", 37);
        setField(term127431, term127431.getClass(), "next", null);
        setDoubleField(term127432, term127432.getClass(), "number", 0.0);
        setIntField(term127432, term127432.getClass(), "type", 0);
        setIntField(term127433, term127433.getClass(), "type", 0);
        setField(term127433, term127433.getClass(), "next", null);
        setField(term127433, term127433.getClass(), "first", null);
        setField(term127433, term127433.getClass(), "last", null);
        setField(term127433, term127433.getClass(), "propListHead", null);
        setIntField(term127433, term127433.getClass(), "sourcePosition", 0);
        setField(term127433, term127433.getClass(), "jsType", null);
        setField(term127433, term127433.getClass(), "parent", null);
        setField(term127432, term127432.getClass(), "next", term127433);
        setDoubleField(term127434, term127434.getClass(), "number", 0.0);
        setIntField(term127434, term127434.getClass(), "type", 0);
        setField(term127434, term127434.getClass(), "next", null);
        setField(term127434, term127434.getClass(), "first", null);
        setField(term127434, term127434.getClass(), "last", null);
        setField(term127434, term127434.getClass(), "propListHead", null);
        setIntField(term127434, term127434.getClass(), "sourcePosition", 0);
        setField(term127434, term127434.getClass(), "jsType", null);
        setField(term127434, term127434.getClass(), "parent", null);
        setField(term127432, term127432.getClass(), "first", term127434);
        setField(term127432, term127432.getClass(), "last", null);
        setField(term127432, term127432.getClass(), "propListHead", null);
        setIntField(term127432, term127432.getClass(), "sourcePosition", 0);
        setField(term127432, term127432.getClass(), "jsType", null);
        setField(term127432, term127432.getClass(), "parent", null);
        setField(term127431, term127431.getClass(), "first", term127432);
        setField(term127431, term127431.getClass(), "last", null);
        setField(term127431, term127431.getClass(), "propListHead", null);
        setIntField(term127431, term127431.getClass(), "sourcePosition", 0);
        setField(term127431, term127431.getClass(), "jsType", null);
        setField(term127431, term127431.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term126955;
        callMethod(klass, "process", argTypes, term126863, args);
        assertTrue(recursiveEquals(term126863, term127430));
        assertTrue(recursiveEquals(term126955, null));
    }

};


