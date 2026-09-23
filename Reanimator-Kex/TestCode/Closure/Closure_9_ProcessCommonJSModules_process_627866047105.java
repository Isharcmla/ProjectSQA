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

public class ProcessCommonJSModules_process_627866047105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46322;
     Object term46414;
     Object term46967;
     Object term46968;

    public ProcessCommonJSModules_process_627866047105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46322 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term46322, term46322.getClass(), "compiler", null);
        term46414 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46506 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46668 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term46414, term46414.getClass(), "type", 0);
        setField(term46414, term46414.getClass(), "parent", null);
        setField(term46506, term46506.getClass(), "next", term46576);
        setIntField(term46506, term46506.getClass(), "type", 0);
        setField(term46668, term46668.getClass(), "next", null);
        setIntField(term46668, term46668.getClass(), "type", 0);
        setField(term46668, term46668.getClass(), "first", null);
        setField(term46506, term46506.getClass(), "first", term46668);
        setField(term46414, term46414.getClass(), "first", term46506);
        term46967 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term46967, term46967.getClass(), "compiler", null);
        setField(term46967, term46967.getClass(), "filenamePrefix", null);
        setBooleanField(term46967, term46967.getClass(), "reportDependencies", false);
        setField(term46967, term46967.getClass(), "module", null);
        term46968 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46969 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46971 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term46968, term46968.getClass(), "number", 0.0);
        setIntField(term46968, term46968.getClass(), "type", 0);
        setField(term46968, term46968.getClass(), "next", null);
        setDoubleField(term46969, term46969.getClass(), "number", 0.0);
        setIntField(term46969, term46969.getClass(), "type", 0);
        setIntField(term46970, term46970.getClass(), "type", 0);
        setField(term46970, term46970.getClass(), "next", null);
        setField(term46970, term46970.getClass(), "first", null);
        setField(term46970, term46970.getClass(), "last", null);
        setField(term46970, term46970.getClass(), "propListHead", null);
        setIntField(term46970, term46970.getClass(), "sourcePosition", 0);
        setField(term46970, term46970.getClass(), "jsType", null);
        setField(term46970, term46970.getClass(), "parent", null);
        setField(term46969, term46969.getClass(), "next", term46970);
        setDoubleField(term46971, term46971.getClass(), "number", 0.0);
        setIntField(term46971, term46971.getClass(), "type", 0);
        setField(term46971, term46971.getClass(), "next", null);
        setField(term46971, term46971.getClass(), "first", null);
        setField(term46971, term46971.getClass(), "last", null);
        setField(term46971, term46971.getClass(), "propListHead", null);
        setIntField(term46971, term46971.getClass(), "sourcePosition", 0);
        setField(term46971, term46971.getClass(), "jsType", null);
        setField(term46971, term46971.getClass(), "parent", null);
        setField(term46969, term46969.getClass(), "first", term46971);
        setField(term46969, term46969.getClass(), "last", null);
        setField(term46969, term46969.getClass(), "propListHead", null);
        setIntField(term46969, term46969.getClass(), "sourcePosition", 0);
        setField(term46969, term46969.getClass(), "jsType", null);
        setField(term46969, term46969.getClass(), "parent", null);
        setField(term46968, term46968.getClass(), "first", term46969);
        setField(term46968, term46968.getClass(), "last", null);
        setField(term46968, term46968.getClass(), "propListHead", null);
        setIntField(term46968, term46968.getClass(), "sourcePosition", 0);
        setField(term46968, term46968.getClass(), "jsType", null);
        setField(term46968, term46968.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term46414;
        callMethod(klass, "process", argTypes, term46322, args);
        assertTrue(recursiveEquals(term46322, term46967));
        assertTrue(recursiveEquals(term46414, null));
    }

};


