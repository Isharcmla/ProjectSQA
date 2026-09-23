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

public class ProcessCommonJSModules_process_627866047309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158872;
     Object term158942;
     Object term159590;
     Object term159591;

    public ProcessCommonJSModules_process_627866047309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158872 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term158872, term158872.getClass(), "compiler", null);
        term158942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term159012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term159082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term159152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term159222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term158942, term158942.getClass(), "type", 37);
        setField(term158942, term158942.getClass(), "parent", null);
        setField(term159152, term159152.getClass(), "next", null);
        setIntField(term159152, term159152.getClass(), "type", 0);
        setField(term159152, term159152.getClass(), "first", null);
        setField(term159082, term159082.getClass(), "next", term159152);
        setIntField(term159082, term159082.getClass(), "type", 37);
        setField(term159082, term159082.getClass(), "first", null);
        setField(term159012, term159012.getClass(), "next", term159082);
        setIntField(term159012, term159012.getClass(), "type", 37);
        setField(term159222, term159222.getClass(), "next", null);
        setIntField(term159222, term159222.getClass(), "type", 0);
        setField(term159222, term159222.getClass(), "first", null);
        setField(term159012, term159012.getClass(), "first", term159222);
        setField(term158942, term158942.getClass(), "first", term159012);
        term159590 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term159590, term159590.getClass(), "compiler", null);
        setField(term159590, term159590.getClass(), "filenamePrefix", null);
        setBooleanField(term159590, term159590.getClass(), "reportDependencies", false);
        setField(term159590, term159590.getClass(), "module", null);
        term159591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term159592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term159593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term159594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term159595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term159591, term159591.getClass(), "type", 37);
        setField(term159591, term159591.getClass(), "next", null);
        setIntField(term159592, term159592.getClass(), "type", 37);
        setIntField(term159593, term159593.getClass(), "type", 37);
        setIntField(term159594, term159594.getClass(), "type", 0);
        setField(term159594, term159594.getClass(), "next", null);
        setField(term159594, term159594.getClass(), "first", null);
        setField(term159594, term159594.getClass(), "last", null);
        setField(term159594, term159594.getClass(), "propListHead", null);
        setIntField(term159594, term159594.getClass(), "sourcePosition", 0);
        setField(term159594, term159594.getClass(), "jsType", null);
        setField(term159594, term159594.getClass(), "parent", null);
        setField(term159593, term159593.getClass(), "next", term159594);
        setField(term159593, term159593.getClass(), "first", null);
        setField(term159593, term159593.getClass(), "last", null);
        setField(term159593, term159593.getClass(), "propListHead", null);
        setIntField(term159593, term159593.getClass(), "sourcePosition", 0);
        setField(term159593, term159593.getClass(), "jsType", null);
        setField(term159593, term159593.getClass(), "parent", null);
        setField(term159592, term159592.getClass(), "next", term159593);
        setIntField(term159595, term159595.getClass(), "type", 0);
        setField(term159595, term159595.getClass(), "next", null);
        setField(term159595, term159595.getClass(), "first", null);
        setField(term159595, term159595.getClass(), "last", null);
        setField(term159595, term159595.getClass(), "propListHead", null);
        setIntField(term159595, term159595.getClass(), "sourcePosition", 0);
        setField(term159595, term159595.getClass(), "jsType", null);
        setField(term159595, term159595.getClass(), "parent", null);
        setField(term159592, term159592.getClass(), "first", term159595);
        setField(term159592, term159592.getClass(), "last", null);
        setField(term159592, term159592.getClass(), "propListHead", null);
        setIntField(term159592, term159592.getClass(), "sourcePosition", 0);
        setField(term159592, term159592.getClass(), "jsType", null);
        setField(term159592, term159592.getClass(), "parent", null);
        setField(term159591, term159591.getClass(), "first", term159592);
        setField(term159591, term159591.getClass(), "last", null);
        setField(term159591, term159591.getClass(), "propListHead", null);
        setIntField(term159591, term159591.getClass(), "sourcePosition", 0);
        setField(term159591, term159591.getClass(), "jsType", null);
        setField(term159591, term159591.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term158942;
        callMethod(klass, "process", argTypes, term158872, args);
        assertTrue(recursiveEquals(term158872, term159590));
        assertTrue(recursiveEquals(term158942, null));
    }

};


