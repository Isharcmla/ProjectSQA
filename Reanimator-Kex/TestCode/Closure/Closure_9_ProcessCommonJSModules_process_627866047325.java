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

public class ProcessCommonJSModules_process_627866047325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169618;
     Object term169710;
     Object term170450;
     Object term170451;

    public ProcessCommonJSModules_process_627866047325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169618 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term169618, term169618.getClass(), "compiler", null);
        term169710 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term169802 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term169894 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term169986 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term170078 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term169710, term169710.getClass(), "type", 0);
        setField(term169710, term169710.getClass(), "parent", null);
        setField(term169894, term169894.getClass(), "next", null);
        setIntField(term169894, term169894.getClass(), "type", 0);
        setField(term169894, term169894.getClass(), "first", null);
        setField(term169802, term169802.getClass(), "next", term169894);
        setIntField(term169802, term169802.getClass(), "type", 0);
        setField(term170078, term170078.getClass(), "next", null);
        setIntField(term170078, term170078.getClass(), "type", 0);
        setField(term170078, term170078.getClass(), "first", null);
        setField(term169986, term169986.getClass(), "next", term170078);
        setIntField(term169986, term169986.getClass(), "type", 0);
        setField(term169986, term169986.getClass(), "first", null);
        setField(term169802, term169802.getClass(), "first", term169986);
        setField(term169710, term169710.getClass(), "first", term169802);
        term170450 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term170450, term170450.getClass(), "compiler", null);
        setField(term170450, term170450.getClass(), "filenamePrefix", null);
        setBooleanField(term170450, term170450.getClass(), "reportDependencies", false);
        setField(term170450, term170450.getClass(), "module", null);
        term170451 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term170452 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term170453 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term170454 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term170455 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term170451, term170451.getClass(), "number", 0.0);
        setIntField(term170451, term170451.getClass(), "type", 0);
        setField(term170451, term170451.getClass(), "next", null);
        setDoubleField(term170452, term170452.getClass(), "number", 0.0);
        setIntField(term170452, term170452.getClass(), "type", 0);
        setDoubleField(term170453, term170453.getClass(), "number", 0.0);
        setIntField(term170453, term170453.getClass(), "type", 0);
        setField(term170453, term170453.getClass(), "next", null);
        setField(term170453, term170453.getClass(), "first", null);
        setField(term170453, term170453.getClass(), "last", null);
        setField(term170453, term170453.getClass(), "propListHead", null);
        setIntField(term170453, term170453.getClass(), "sourcePosition", 0);
        setField(term170453, term170453.getClass(), "jsType", null);
        setField(term170453, term170453.getClass(), "parent", null);
        setField(term170452, term170452.getClass(), "next", term170453);
        setDoubleField(term170454, term170454.getClass(), "number", 0.0);
        setIntField(term170454, term170454.getClass(), "type", 0);
        setDoubleField(term170455, term170455.getClass(), "number", 0.0);
        setIntField(term170455, term170455.getClass(), "type", 0);
        setField(term170455, term170455.getClass(), "next", null);
        setField(term170455, term170455.getClass(), "first", null);
        setField(term170455, term170455.getClass(), "last", null);
        setField(term170455, term170455.getClass(), "propListHead", null);
        setIntField(term170455, term170455.getClass(), "sourcePosition", 0);
        setField(term170455, term170455.getClass(), "jsType", null);
        setField(term170455, term170455.getClass(), "parent", null);
        setField(term170454, term170454.getClass(), "next", term170455);
        setField(term170454, term170454.getClass(), "first", null);
        setField(term170454, term170454.getClass(), "last", null);
        setField(term170454, term170454.getClass(), "propListHead", null);
        setIntField(term170454, term170454.getClass(), "sourcePosition", 0);
        setField(term170454, term170454.getClass(), "jsType", null);
        setField(term170454, term170454.getClass(), "parent", null);
        setField(term170452, term170452.getClass(), "first", term170454);
        setField(term170452, term170452.getClass(), "last", null);
        setField(term170452, term170452.getClass(), "propListHead", null);
        setIntField(term170452, term170452.getClass(), "sourcePosition", 0);
        setField(term170452, term170452.getClass(), "jsType", null);
        setField(term170452, term170452.getClass(), "parent", null);
        setField(term170451, term170451.getClass(), "first", term170452);
        setField(term170451, term170451.getClass(), "last", null);
        setField(term170451, term170451.getClass(), "propListHead", null);
        setIntField(term170451, term170451.getClass(), "sourcePosition", 0);
        setField(term170451, term170451.getClass(), "jsType", null);
        setField(term170451, term170451.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term169710;
        callMethod(klass, "process", argTypes, term169618, args);
        assertTrue(recursiveEquals(term169618, term170450));
        assertTrue(recursiveEquals(term169710, null));
    }

};


