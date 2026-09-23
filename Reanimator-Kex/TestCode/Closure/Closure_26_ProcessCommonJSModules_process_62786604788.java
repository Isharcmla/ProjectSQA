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

public class ProcessCommonJSModules_process_62786604788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46188;
     Object term46280;
     Object term47249;
     Object term47250;

    public ProcessCommonJSModules_process_62786604788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46188 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term46188, term46188.getClass(), "compiler", null);
        term46280 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term46372 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term46280, term46280.getClass(), "type", 0);
        setField(term46280, term46280.getClass(), "parent", null);
        setField(term46372, term46372.getClass(), "next", null);
        setIntField(term46372, term46372.getClass(), "type", 37);
        setField(term46372, term46372.getClass(), "first", null);
        setField(term46280, term46280.getClass(), "first", term46372);
        term47249 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term47249, term47249.getClass(), "compiler", null);
        setField(term47249, term47249.getClass(), "filenamePrefix", null);
        setBooleanField(term47249, term47249.getClass(), "reportDependencies", false);
        setField(term47249, term47249.getClass(), "module", null);
        term47250 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term47251 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term47250, term47250.getClass(), "str", null);
        setIntField(term47250, term47250.getClass(), "type", 0);
        setField(term47250, term47250.getClass(), "next", null);
        setField(term47251, term47251.getClass(), "str", null);
        setIntField(term47251, term47251.getClass(), "type", 37);
        setField(term47251, term47251.getClass(), "next", null);
        setField(term47251, term47251.getClass(), "first", null);
        setField(term47251, term47251.getClass(), "last", null);
        setField(term47251, term47251.getClass(), "propListHead", null);
        setIntField(term47251, term47251.getClass(), "sourcePosition", 0);
        setField(term47251, term47251.getClass(), "jsType", null);
        setField(term47251, term47251.getClass(), "parent", null);
        setField(term47250, term47250.getClass(), "first", term47251);
        setField(term47250, term47250.getClass(), "last", null);
        setField(term47250, term47250.getClass(), "propListHead", null);
        setIntField(term47250, term47250.getClass(), "sourcePosition", 0);
        setField(term47250, term47250.getClass(), "jsType", null);
        setField(term47250, term47250.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term46280;
        callMethod(klass, "process", argTypes, term46188, args);
        assertTrue(recursiveEquals(term46188, term47249));
        assertTrue(recursiveEquals(term46280, null));
    }

};


