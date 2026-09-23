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

public class ProcessCommonJSModules_process_62786604733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6484;
     Object term6576;
     Object term6688;
     Object term6689;

    public ProcessCommonJSModules_process_62786604733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6484 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term6484, term6484.getClass(), "compiler", null);
        term6576 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term6688 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term6688, term6688.getClass(), "compiler", null);
        setField(term6688, term6688.getClass(), "filenamePrefix", null);
        setBooleanField(term6688, term6688.getClass(), "reportDependencies", false);
        setField(term6688, term6688.getClass(), "module", null);
        term6689 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term6689, term6689.getClass(), "number", 0.0);
        setIntField(term6689, term6689.getClass(), "type", 0);
        setField(term6689, term6689.getClass(), "next", null);
        setField(term6689, term6689.getClass(), "first", null);
        setField(term6689, term6689.getClass(), "last", null);
        setField(term6689, term6689.getClass(), "propListHead", null);
        setIntField(term6689, term6689.getClass(), "sourcePosition", 0);
        setField(term6689, term6689.getClass(), "jsType", null);
        setField(term6689, term6689.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term6576;
        callMethod(klass, "process", argTypes, term6484, args);
        assertTrue(recursiveEquals(term6484, term6688));
        assertTrue(recursiveEquals(term6576, null));
    }

};


