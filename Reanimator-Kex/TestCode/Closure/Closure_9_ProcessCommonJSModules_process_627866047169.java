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

public class ProcessCommonJSModules_process_627866047169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82125;
     Object term82217;
     Object term83611;
     Object term83612;

    public ProcessCommonJSModules_process_627866047169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82125 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term82125, term82125.getClass(), "compiler", null);
        term82217 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term82309 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term82401 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term82493 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term82585 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term82677 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term82217, term82217.getClass(), "type", 0);
        setField(term82217, term82217.getClass(), "parent", null);
        setField(term82401, term82401.getClass(), "next", null);
        setIntField(term82401, term82401.getClass(), "type", 37);
        setField(term82401, term82401.getClass(), "first", null);
        setField(term82309, term82309.getClass(), "next", term82401);
        setIntField(term82309, term82309.getClass(), "type", 0);
        setField(term82677, term82677.getClass(), "next", null);
        setIntField(term82677, term82677.getClass(), "type", 0);
        setField(term82677, term82677.getClass(), "first", null);
        setField(term82585, term82585.getClass(), "next", term82677);
        setIntField(term82585, term82585.getClass(), "type", 37);
        setField(term82585, term82585.getClass(), "first", null);
        setField(term82493, term82493.getClass(), "next", term82585);
        setIntField(term82493, term82493.getClass(), "type", 0);
        setField(term82493, term82493.getClass(), "first", null);
        setField(term82309, term82309.getClass(), "first", term82493);
        setField(term82217, term82217.getClass(), "first", term82309);
        term83611 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term83611, term83611.getClass(), "compiler", null);
        setField(term83611, term83611.getClass(), "filenamePrefix", null);
        setBooleanField(term83611, term83611.getClass(), "reportDependencies", false);
        setField(term83611, term83611.getClass(), "module", null);
        term83612 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term83613 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term83614 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term83615 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term83616 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term83617 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term83612, term83612.getClass(), "number", 0.0);
        setIntField(term83612, term83612.getClass(), "type", 0);
        setField(term83612, term83612.getClass(), "next", null);
        setDoubleField(term83613, term83613.getClass(), "number", 0.0);
        setIntField(term83613, term83613.getClass(), "type", 0);
        setDoubleField(term83614, term83614.getClass(), "number", 0.0);
        setIntField(term83614, term83614.getClass(), "type", 37);
        setField(term83614, term83614.getClass(), "next", null);
        setField(term83614, term83614.getClass(), "first", null);
        setField(term83614, term83614.getClass(), "last", null);
        setField(term83614, term83614.getClass(), "propListHead", null);
        setIntField(term83614, term83614.getClass(), "sourcePosition", 0);
        setField(term83614, term83614.getClass(), "jsType", null);
        setField(term83614, term83614.getClass(), "parent", null);
        setField(term83613, term83613.getClass(), "next", term83614);
        setDoubleField(term83615, term83615.getClass(), "number", 0.0);
        setIntField(term83615, term83615.getClass(), "type", 0);
        setDoubleField(term83616, term83616.getClass(), "number", 0.0);
        setIntField(term83616, term83616.getClass(), "type", 37);
        setDoubleField(term83617, term83617.getClass(), "number", 0.0);
        setIntField(term83617, term83617.getClass(), "type", 0);
        setField(term83617, term83617.getClass(), "next", null);
        setField(term83617, term83617.getClass(), "first", null);
        setField(term83617, term83617.getClass(), "last", null);
        setField(term83617, term83617.getClass(), "propListHead", null);
        setIntField(term83617, term83617.getClass(), "sourcePosition", 0);
        setField(term83617, term83617.getClass(), "jsType", null);
        setField(term83617, term83617.getClass(), "parent", null);
        setField(term83616, term83616.getClass(), "next", term83617);
        setField(term83616, term83616.getClass(), "first", null);
        setField(term83616, term83616.getClass(), "last", null);
        setField(term83616, term83616.getClass(), "propListHead", null);
        setIntField(term83616, term83616.getClass(), "sourcePosition", 0);
        setField(term83616, term83616.getClass(), "jsType", null);
        setField(term83616, term83616.getClass(), "parent", null);
        setField(term83615, term83615.getClass(), "next", term83616);
        setField(term83615, term83615.getClass(), "first", null);
        setField(term83615, term83615.getClass(), "last", null);
        setField(term83615, term83615.getClass(), "propListHead", null);
        setIntField(term83615, term83615.getClass(), "sourcePosition", 0);
        setField(term83615, term83615.getClass(), "jsType", null);
        setField(term83615, term83615.getClass(), "parent", null);
        setField(term83613, term83613.getClass(), "first", term83615);
        setField(term83613, term83613.getClass(), "last", null);
        setField(term83613, term83613.getClass(), "propListHead", null);
        setIntField(term83613, term83613.getClass(), "sourcePosition", 0);
        setField(term83613, term83613.getClass(), "jsType", null);
        setField(term83613, term83613.getClass(), "parent", null);
        setField(term83612, term83612.getClass(), "first", term83613);
        setField(term83612, term83612.getClass(), "last", null);
        setField(term83612, term83612.getClass(), "propListHead", null);
        setIntField(term83612, term83612.getClass(), "sourcePosition", 0);
        setField(term83612, term83612.getClass(), "jsType", null);
        setField(term83612, term83612.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term82217;
        callMethod(klass, "process", argTypes, term82125, args);
        assertTrue(recursiveEquals(term82125, term83611));
        assertTrue(recursiveEquals(term82217, null));
    }

};


