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

public class ProcessCommonJSModules_process_627866047355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188777;
     Object term188869;
     Object term189586;
     Object term189587;

    public ProcessCommonJSModules_process_627866047355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188777 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term188777, term188777.getClass(), "compiler", null);
        term188869 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term188939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term189009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term189101 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term189193 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term188869, term188869.getClass(), "type", 0);
        setField(term188869, term188869.getClass(), "parent", null);
        setField(term188939, term188939.getClass(), "next", term189009);
        setIntField(term188939, term188939.getClass(), "type", 33);
        setField(term189193, term189193.getClass(), "next", null);
        setIntField(term189193, term189193.getClass(), "type", 0);
        setField(term189193, term189193.getClass(), "first", null);
        setField(term189101, term189101.getClass(), "next", term189193);
        setIntField(term189101, term189101.getClass(), "type", 37);
        setField(term189101, term189101.getClass(), "first", null);
        setField(term188939, term188939.getClass(), "first", term189101);
        setField(term188869, term188869.getClass(), "first", term188939);
        term189586 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term189586, term189586.getClass(), "compiler", null);
        setField(term189586, term189586.getClass(), "filenamePrefix", null);
        setBooleanField(term189586, term189586.getClass(), "reportDependencies", false);
        setField(term189586, term189586.getClass(), "module", null);
        term189587 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term189588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term189589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term189590 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term189591 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term189587, term189587.getClass(), "number", 0.0);
        setIntField(term189587, term189587.getClass(), "type", 0);
        setField(term189587, term189587.getClass(), "next", null);
        setIntField(term189588, term189588.getClass(), "type", 33);
        setIntField(term189589, term189589.getClass(), "type", 0);
        setField(term189589, term189589.getClass(), "next", null);
        setField(term189589, term189589.getClass(), "first", null);
        setField(term189589, term189589.getClass(), "last", null);
        setField(term189589, term189589.getClass(), "propListHead", null);
        setIntField(term189589, term189589.getClass(), "sourcePosition", 0);
        setField(term189589, term189589.getClass(), "jsType", null);
        setField(term189589, term189589.getClass(), "parent", null);
        setField(term189588, term189588.getClass(), "next", term189589);
        setDoubleField(term189590, term189590.getClass(), "number", 0.0);
        setIntField(term189590, term189590.getClass(), "type", 37);
        setDoubleField(term189591, term189591.getClass(), "number", 0.0);
        setIntField(term189591, term189591.getClass(), "type", 0);
        setField(term189591, term189591.getClass(), "next", null);
        setField(term189591, term189591.getClass(), "first", null);
        setField(term189591, term189591.getClass(), "last", null);
        setField(term189591, term189591.getClass(), "propListHead", null);
        setIntField(term189591, term189591.getClass(), "sourcePosition", 0);
        setField(term189591, term189591.getClass(), "jsType", null);
        setField(term189591, term189591.getClass(), "parent", null);
        setField(term189590, term189590.getClass(), "next", term189591);
        setField(term189590, term189590.getClass(), "first", null);
        setField(term189590, term189590.getClass(), "last", null);
        setField(term189590, term189590.getClass(), "propListHead", null);
        setIntField(term189590, term189590.getClass(), "sourcePosition", 0);
        setField(term189590, term189590.getClass(), "jsType", null);
        setField(term189590, term189590.getClass(), "parent", null);
        setField(term189588, term189588.getClass(), "first", term189590);
        setField(term189588, term189588.getClass(), "last", null);
        setField(term189588, term189588.getClass(), "propListHead", null);
        setIntField(term189588, term189588.getClass(), "sourcePosition", 0);
        setField(term189588, term189588.getClass(), "jsType", null);
        setField(term189588, term189588.getClass(), "parent", null);
        setField(term189587, term189587.getClass(), "first", term189588);
        setField(term189587, term189587.getClass(), "last", null);
        setField(term189587, term189587.getClass(), "propListHead", null);
        setIntField(term189587, term189587.getClass(), "sourcePosition", 0);
        setField(term189587, term189587.getClass(), "jsType", null);
        setField(term189587, term189587.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term188869;
        callMethod(klass, "process", argTypes, term188777, args);
        assertTrue(recursiveEquals(term188777, term189586));
        assertTrue(recursiveEquals(term188869, null));
    }

};


