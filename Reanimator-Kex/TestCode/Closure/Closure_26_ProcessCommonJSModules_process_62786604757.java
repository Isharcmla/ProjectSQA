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

public class ProcessCommonJSModules_process_62786604757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31388;
     Object term31480;
     Object term31785;
     Object term31786;

    public ProcessCommonJSModules_process_62786604757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31388 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term31388, term31388.getClass(), "compiler", null);
        term31480 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term31550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31480, term31480.getClass(), "type", 0);
        setField(term31480, term31480.getClass(), "parent", null);
        setField(term31550, term31550.getClass(), "next", term31620);
        setIntField(term31550, term31550.getClass(), "type", 0);
        setField(term31550, term31550.getClass(), "first", null);
        setField(term31480, term31480.getClass(), "first", term31550);
        term31785 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term31785, term31785.getClass(), "compiler", null);
        setField(term31785, term31785.getClass(), "filenamePrefix", null);
        setBooleanField(term31785, term31785.getClass(), "reportDependencies", false);
        setField(term31785, term31785.getClass(), "module", null);
        term31786 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term31787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term31786, term31786.getClass(), "str", null);
        setIntField(term31786, term31786.getClass(), "type", 0);
        setField(term31786, term31786.getClass(), "next", null);
        setIntField(term31787, term31787.getClass(), "type", 0);
        setIntField(term31788, term31788.getClass(), "type", 0);
        setField(term31788, term31788.getClass(), "next", null);
        setField(term31788, term31788.getClass(), "first", null);
        setField(term31788, term31788.getClass(), "last", null);
        setField(term31788, term31788.getClass(), "propListHead", null);
        setIntField(term31788, term31788.getClass(), "sourcePosition", 0);
        setField(term31788, term31788.getClass(), "jsType", null);
        setField(term31788, term31788.getClass(), "parent", null);
        setField(term31787, term31787.getClass(), "next", term31788);
        setField(term31787, term31787.getClass(), "first", null);
        setField(term31787, term31787.getClass(), "last", null);
        setField(term31787, term31787.getClass(), "propListHead", null);
        setIntField(term31787, term31787.getClass(), "sourcePosition", 0);
        setField(term31787, term31787.getClass(), "jsType", null);
        setField(term31787, term31787.getClass(), "parent", null);
        setField(term31786, term31786.getClass(), "first", term31787);
        setField(term31786, term31786.getClass(), "last", null);
        setField(term31786, term31786.getClass(), "propListHead", null);
        setIntField(term31786, term31786.getClass(), "sourcePosition", 0);
        setField(term31786, term31786.getClass(), "jsType", null);
        setField(term31786, term31786.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term31480;
        callMethod(klass, "process", argTypes, term31388, args);
        assertTrue(recursiveEquals(term31388, term31785));
        assertTrue(recursiveEquals(term31480, null));
    }

};


