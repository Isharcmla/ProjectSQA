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

public class ProcessCommonJSModules_process_627866047207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105155;
     Object term105225;
     Object term105953;
     Object term105954;

    public ProcessCommonJSModules_process_627866047207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105155 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term105155, term105155.getClass(), "compiler", null);
        term105225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105317 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term105409 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term105501 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term105571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term105225, term105225.getClass(), "type", 0);
        setField(term105225, term105225.getClass(), "parent", null);
        setField(term105571, term105571.getClass(), "next", null);
        setIntField(term105571, term105571.getClass(), "type", 0);
        setField(term105571, term105571.getClass(), "first", null);
        setField(term105501, term105501.getClass(), "next", term105571);
        setIntField(term105501, term105501.getClass(), "type", 37);
        setField(term105501, term105501.getClass(), "first", null);
        setField(term105409, term105409.getClass(), "next", term105501);
        setIntField(term105409, term105409.getClass(), "type", 37);
        setField(term105409, term105409.getClass(), "first", null);
        setField(term105317, term105317.getClass(), "next", term105409);
        setIntField(term105317, term105317.getClass(), "type", 37);
        setField(term105317, term105317.getClass(), "first", term105409);
        setField(term105225, term105225.getClass(), "first", term105317);
        term105953 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term105953, term105953.getClass(), "compiler", null);
        setField(term105953, term105953.getClass(), "filenamePrefix", null);
        setBooleanField(term105953, term105953.getClass(), "reportDependencies", false);
        setField(term105953, term105953.getClass(), "module", null);
        term105954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105955 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term105956 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term105954, term105954.getClass(), "type", 0);
        setField(term105954, term105954.getClass(), "next", null);
        setDoubleField(term105955, term105955.getClass(), "number", 0.0);
        setIntField(term105955, term105955.getClass(), "type", 37);
        setDoubleField(term105956, term105956.getClass(), "number", 0.0);
        setIntField(term105956, term105956.getClass(), "type", 37);
        setField(term105956, term105956.getClass(), "next", true);
        setField(term105956, term105956.getClass(), "first", null);
        setField(term105956, term105956.getClass(), "last", null);
        setField(term105956, term105956.getClass(), "propListHead", null);
        setIntField(term105956, term105956.getClass(), "sourcePosition", 0);
        setField(term105956, term105956.getClass(), "jsType", null);
        setField(term105956, term105956.getClass(), "parent", null);
        setField(term105955, term105955.getClass(), "next", term105956);
        setField(term105955, term105955.getClass(), "first", term105956);
        setField(term105955, term105955.getClass(), "last", null);
        setField(term105955, term105955.getClass(), "propListHead", null);
        setIntField(term105955, term105955.getClass(), "sourcePosition", 0);
        setField(term105955, term105955.getClass(), "jsType", null);
        setField(term105955, term105955.getClass(), "parent", null);
        setField(term105954, term105954.getClass(), "first", term105955);
        setField(term105954, term105954.getClass(), "last", null);
        setField(term105954, term105954.getClass(), "propListHead", null);
        setIntField(term105954, term105954.getClass(), "sourcePosition", 0);
        setField(term105954, term105954.getClass(), "jsType", null);
        setField(term105954, term105954.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term105225;
        callMethod(klass, "process", argTypes, term105155, args);
        assertTrue(recursiveEquals(term105155, term105953));
        assertTrue(recursiveEquals(term105225, null));
    }

};


