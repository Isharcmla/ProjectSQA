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

public class ProcessCommonJSModules_process_62786604745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13476;
     Object term13546;
     Object term14100;
     Object term14101;

    public ProcessCommonJSModules_process_62786604745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13476 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term13476, term13476.getClass(), "compiler", null);
        term13546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13638 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term13708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13800 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term13546, term13546.getClass(), "type", 0);
        setField(term13546, term13546.getClass(), "parent", null);
        setField(term13638, term13638.getClass(), "next", term13708);
        setIntField(term13638, term13638.getClass(), "type", 37);
        setField(term13800, term13800.getClass(), "next", null);
        setIntField(term13800, term13800.getClass(), "type", 0);
        setField(term13800, term13800.getClass(), "first", null);
        setField(term13638, term13638.getClass(), "first", term13800);
        setField(term13546, term13546.getClass(), "first", term13638);
        term14100 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term14100, term14100.getClass(), "compiler", null);
        setField(term14100, term14100.getClass(), "filenamePrefix", null);
        setBooleanField(term14100, term14100.getClass(), "reportDependencies", false);
        setField(term14100, term14100.getClass(), "module", null);
        term14101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14102 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term14103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14104 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term14101, term14101.getClass(), "type", 0);
        setField(term14101, term14101.getClass(), "next", null);
        setDoubleField(term14102, term14102.getClass(), "number", 0.0);
        setIntField(term14102, term14102.getClass(), "type", 37);
        setIntField(term14103, term14103.getClass(), "type", 0);
        setField(term14103, term14103.getClass(), "next", null);
        setField(term14103, term14103.getClass(), "first", null);
        setField(term14103, term14103.getClass(), "last", null);
        setField(term14103, term14103.getClass(), "propListHead", null);
        setIntField(term14103, term14103.getClass(), "sourcePosition", 0);
        setField(term14103, term14103.getClass(), "jsType", null);
        setField(term14103, term14103.getClass(), "parent", null);
        setField(term14102, term14102.getClass(), "next", term14103);
        setDoubleField(term14104, term14104.getClass(), "number", 0.0);
        setIntField(term14104, term14104.getClass(), "type", 0);
        setField(term14104, term14104.getClass(), "next", null);
        setField(term14104, term14104.getClass(), "first", null);
        setField(term14104, term14104.getClass(), "last", null);
        setField(term14104, term14104.getClass(), "propListHead", null);
        setIntField(term14104, term14104.getClass(), "sourcePosition", 0);
        setField(term14104, term14104.getClass(), "jsType", null);
        setField(term14104, term14104.getClass(), "parent", null);
        setField(term14102, term14102.getClass(), "first", term14104);
        setField(term14102, term14102.getClass(), "last", null);
        setField(term14102, term14102.getClass(), "propListHead", null);
        setIntField(term14102, term14102.getClass(), "sourcePosition", 0);
        setField(term14102, term14102.getClass(), "jsType", null);
        setField(term14102, term14102.getClass(), "parent", null);
        setField(term14101, term14101.getClass(), "first", term14102);
        setField(term14101, term14101.getClass(), "last", null);
        setField(term14101, term14101.getClass(), "propListHead", null);
        setIntField(term14101, term14101.getClass(), "sourcePosition", 0);
        setField(term14101, term14101.getClass(), "jsType", null);
        setField(term14101, term14101.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term13546;
        callMethod(klass, "process", argTypes, term13476, args);
        assertTrue(recursiveEquals(term13476, term14100));
        assertTrue(recursiveEquals(term13546, null));
    }

};


