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

public class ProcessCommonJSModules_process_62786604751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28196;
     Object term28266;
     Object term28345;
     Object term28346;

    public ProcessCommonJSModules_process_62786604751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28196 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term28196, term28196.getClass(), "compiler", null);
        term28266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28266, term28266.getClass(), "type", 0);
        setField(term28266, term28266.getClass(), "parent", null);
        setField(term28266, term28266.getClass(), "first", null);
        term28345 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term28345, term28345.getClass(), "compiler", null);
        setField(term28345, term28345.getClass(), "filenamePrefix", null);
        setBooleanField(term28345, term28345.getClass(), "reportDependencies", false);
        setField(term28345, term28345.getClass(), "module", null);
        term28346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28346, term28346.getClass(), "type", 0);
        setField(term28346, term28346.getClass(), "next", null);
        setField(term28346, term28346.getClass(), "first", null);
        setField(term28346, term28346.getClass(), "last", null);
        setField(term28346, term28346.getClass(), "propListHead", null);
        setIntField(term28346, term28346.getClass(), "sourcePosition", 0);
        setField(term28346, term28346.getClass(), "jsType", null);
        setField(term28346, term28346.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term28266;
        callMethod(klass, "process", argTypes, term28196, args);
        assertTrue(recursiveEquals(term28196, term28345));
        assertTrue(recursiveEquals(term28266, null));
    }

};


