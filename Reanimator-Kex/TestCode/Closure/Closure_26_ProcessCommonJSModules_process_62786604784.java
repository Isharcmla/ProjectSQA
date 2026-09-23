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

public class ProcessCommonJSModules_process_62786604784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44812;
     Object term44882;
     Object term45687;
     Object term45688;

    public ProcessCommonJSModules_process_62786604784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44812 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term44812, term44812.getClass(), "compiler", null);
        term44882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44882, term44882.getClass(), "type", 0);
        setField(term44882, term44882.getClass(), "parent", null);
        setField(term44952, term44952.getClass(), "next", null);
        setIntField(term44952, term44952.getClass(), "type", 37);
        setField(term44952, term44952.getClass(), "first", null);
        setField(term44882, term44882.getClass(), "first", term44952);
        term45687 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term45687, term45687.getClass(), "compiler", null);
        setField(term45687, term45687.getClass(), "filenamePrefix", null);
        setBooleanField(term45687, term45687.getClass(), "reportDependencies", false);
        setField(term45687, term45687.getClass(), "module", null);
        term45688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45688, term45688.getClass(), "type", 0);
        setField(term45688, term45688.getClass(), "next", null);
        setIntField(term45689, term45689.getClass(), "type", 37);
        setField(term45689, term45689.getClass(), "next", null);
        setField(term45689, term45689.getClass(), "first", null);
        setField(term45689, term45689.getClass(), "last", null);
        setField(term45689, term45689.getClass(), "propListHead", null);
        setIntField(term45689, term45689.getClass(), "sourcePosition", 0);
        setField(term45689, term45689.getClass(), "jsType", null);
        setField(term45689, term45689.getClass(), "parent", null);
        setField(term45688, term45688.getClass(), "first", term45689);
        setField(term45688, term45688.getClass(), "last", null);
        setField(term45688, term45688.getClass(), "propListHead", null);
        setIntField(term45688, term45688.getClass(), "sourcePosition", 0);
        setField(term45688, term45688.getClass(), "jsType", null);
        setField(term45688, term45688.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term44882;
        callMethod(klass, "process", argTypes, term44812, args);
        assertTrue(recursiveEquals(term44812, term45687));
        assertTrue(recursiveEquals(term44882, null));
    }

};


