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

public class ProcessCommonJSModules_process_627866047340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177468;
     Object term177560;
     Object term179359;
     Object term179360;

    public ProcessCommonJSModules_process_627866047340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177468 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term177468, term177468.getClass(), "compiler", null);
        term177560 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term177652 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term177744 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term177560, term177560.getClass(), "type", 0);
        setField(term177560, term177560.getClass(), "parent", null);
        setField(term177652, term177652.getClass(), "next", null);
        setIntField(term177652, term177652.getClass(), "type", 0);
        setField(term177744, term177744.getClass(), "next", null);
        setIntField(term177744, term177744.getClass(), "type", 0);
        setField(term177744, term177744.getClass(), "first", null);
        setField(term177652, term177652.getClass(), "first", term177744);
        setField(term177560, term177560.getClass(), "first", term177652);
        term179359 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term179359, term179359.getClass(), "compiler", null);
        setField(term179359, term179359.getClass(), "filenamePrefix", null);
        setBooleanField(term179359, term179359.getClass(), "reportDependencies", false);
        setField(term179359, term179359.getClass(), "module", null);
        term179360 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term179361 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term179362 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term179360, term179360.getClass(), "number", 0.0);
        setIntField(term179360, term179360.getClass(), "type", 0);
        setField(term179360, term179360.getClass(), "next", null);
        setDoubleField(term179361, term179361.getClass(), "number", 0.0);
        setIntField(term179361, term179361.getClass(), "type", 0);
        setField(term179361, term179361.getClass(), "next", null);
        setDoubleField(term179362, term179362.getClass(), "number", 0.0);
        setIntField(term179362, term179362.getClass(), "type", 0);
        setField(term179362, term179362.getClass(), "next", null);
        setField(term179362, term179362.getClass(), "first", null);
        setField(term179362, term179362.getClass(), "last", null);
        setField(term179362, term179362.getClass(), "propListHead", null);
        setIntField(term179362, term179362.getClass(), "sourcePosition", 0);
        setField(term179362, term179362.getClass(), "jsType", null);
        setField(term179362, term179362.getClass(), "parent", null);
        setField(term179361, term179361.getClass(), "first", term179362);
        setField(term179361, term179361.getClass(), "last", null);
        setField(term179361, term179361.getClass(), "propListHead", null);
        setIntField(term179361, term179361.getClass(), "sourcePosition", 0);
        setField(term179361, term179361.getClass(), "jsType", null);
        setField(term179361, term179361.getClass(), "parent", null);
        setField(term179360, term179360.getClass(), "first", term179361);
        setField(term179360, term179360.getClass(), "last", null);
        setField(term179360, term179360.getClass(), "propListHead", null);
        setIntField(term179360, term179360.getClass(), "sourcePosition", 0);
        setField(term179360, term179360.getClass(), "jsType", null);
        setField(term179360, term179360.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term177560;
        callMethod(klass, "process", argTypes, term177468, args);
        assertTrue(recursiveEquals(term177468, term179359));
        assertTrue(recursiveEquals(term177560, null));
    }

};


