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

public class ProcessCommonJSModules_process_627866047378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204232;
     Object term204324;
     Object term205500;
     Object term205501;

    public ProcessCommonJSModules_process_627866047378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204232 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term204232, term204232.getClass(), "compiler", null);
        term204324 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term204416 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term204486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term204556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term204324, term204324.getClass(), "type", 37);
        setField(term204324, term204324.getClass(), "parent", null);
        setField(term204486, term204486.getClass(), "next", null);
        setIntField(term204486, term204486.getClass(), "type", 0);
        setField(term204486, term204486.getClass(), "first", null);
        setField(term204416, term204416.getClass(), "next", term204486);
        setIntField(term204416, term204416.getClass(), "type", 0);
        setField(term204556, term204556.getClass(), "next", null);
        setIntField(term204556, term204556.getClass(), "type", 0);
        setField(term204556, term204556.getClass(), "first", null);
        setField(term204416, term204416.getClass(), "first", term204556);
        setField(term204324, term204324.getClass(), "first", term204416);
        term205500 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term205500, term205500.getClass(), "compiler", null);
        setField(term205500, term205500.getClass(), "filenamePrefix", null);
        setBooleanField(term205500, term205500.getClass(), "reportDependencies", false);
        setField(term205500, term205500.getClass(), "module", null);
        term205501 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term205502 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term205503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term205504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term205501, term205501.getClass(), "str", null);
        setIntField(term205501, term205501.getClass(), "type", 37);
        setField(term205501, term205501.getClass(), "next", null);
        setField(term205502, term205502.getClass(), "str", null);
        setIntField(term205502, term205502.getClass(), "type", 0);
        setIntField(term205503, term205503.getClass(), "type", 0);
        setField(term205503, term205503.getClass(), "next", null);
        setField(term205503, term205503.getClass(), "first", null);
        setField(term205503, term205503.getClass(), "last", null);
        setField(term205503, term205503.getClass(), "propListHead", null);
        setIntField(term205503, term205503.getClass(), "sourcePosition", 0);
        setField(term205503, term205503.getClass(), "jsType", null);
        setField(term205503, term205503.getClass(), "parent", null);
        setField(term205502, term205502.getClass(), "next", term205503);
        setIntField(term205504, term205504.getClass(), "type", 0);
        setField(term205504, term205504.getClass(), "next", null);
        setField(term205504, term205504.getClass(), "first", null);
        setField(term205504, term205504.getClass(), "last", null);
        setField(term205504, term205504.getClass(), "propListHead", null);
        setIntField(term205504, term205504.getClass(), "sourcePosition", 0);
        setField(term205504, term205504.getClass(), "jsType", null);
        setField(term205504, term205504.getClass(), "parent", null);
        setField(term205502, term205502.getClass(), "first", term205504);
        setField(term205502, term205502.getClass(), "last", null);
        setField(term205502, term205502.getClass(), "propListHead", null);
        setIntField(term205502, term205502.getClass(), "sourcePosition", 0);
        setField(term205502, term205502.getClass(), "jsType", null);
        setField(term205502, term205502.getClass(), "parent", null);
        setField(term205501, term205501.getClass(), "first", term205502);
        setField(term205501, term205501.getClass(), "last", null);
        setField(term205501, term205501.getClass(), "propListHead", null);
        setIntField(term205501, term205501.getClass(), "sourcePosition", 0);
        setField(term205501, term205501.getClass(), "jsType", null);
        setField(term205501, term205501.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term204324;
        callMethod(klass, "process", argTypes, term204232, args);
        assertTrue(recursiveEquals(term204232, term205500));
        assertTrue(recursiveEquals(term204324, null));
    }

};


