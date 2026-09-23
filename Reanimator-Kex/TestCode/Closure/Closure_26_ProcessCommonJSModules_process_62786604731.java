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

public class ProcessCommonJSModules_process_62786604731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15832;
     Object term15902;
     Object term16466;
     Object term16467;

    public ProcessCommonJSModules_process_62786604731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15832 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term15832, term15832.getClass(), "compiler", null);
        term15902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15902, term15902.getClass(), "type", 0);
        setField(term15902, term15902.getClass(), "parent", null);
        setField(term15972, term15972.getClass(), "next", term16042);
        setIntField(term15972, term15972.getClass(), "type", 0);
        setField(term16112, term16112.getClass(), "next", term16182);
        setIntField(term16112, term16112.getClass(), "type", 0);
        setField(term16112, term16112.getClass(), "first", null);
        setField(term15972, term15972.getClass(), "first", term16112);
        setField(term15902, term15902.getClass(), "first", term15972);
        term16466 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term16466, term16466.getClass(), "compiler", null);
        setField(term16466, term16466.getClass(), "filenamePrefix", null);
        setBooleanField(term16466, term16466.getClass(), "reportDependencies", false);
        setField(term16466, term16466.getClass(), "module", null);
        term16467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16467, term16467.getClass(), "type", 0);
        setField(term16467, term16467.getClass(), "next", null);
        setIntField(term16468, term16468.getClass(), "type", 0);
        setIntField(term16469, term16469.getClass(), "type", 0);
        setField(term16469, term16469.getClass(), "next", null);
        setField(term16469, term16469.getClass(), "first", null);
        setField(term16469, term16469.getClass(), "last", null);
        setField(term16469, term16469.getClass(), "propListHead", null);
        setIntField(term16469, term16469.getClass(), "sourcePosition", 0);
        setField(term16469, term16469.getClass(), "jsType", null);
        setField(term16469, term16469.getClass(), "parent", null);
        setField(term16468, term16468.getClass(), "next", term16469);
        setIntField(term16470, term16470.getClass(), "type", 0);
        setIntField(term16471, term16471.getClass(), "type", 0);
        setField(term16471, term16471.getClass(), "next", null);
        setField(term16471, term16471.getClass(), "first", null);
        setField(term16471, term16471.getClass(), "last", null);
        setField(term16471, term16471.getClass(), "propListHead", null);
        setIntField(term16471, term16471.getClass(), "sourcePosition", 0);
        setField(term16471, term16471.getClass(), "jsType", null);
        setField(term16471, term16471.getClass(), "parent", null);
        setField(term16470, term16470.getClass(), "next", term16471);
        setField(term16470, term16470.getClass(), "first", null);
        setField(term16470, term16470.getClass(), "last", null);
        setField(term16470, term16470.getClass(), "propListHead", null);
        setIntField(term16470, term16470.getClass(), "sourcePosition", 0);
        setField(term16470, term16470.getClass(), "jsType", null);
        setField(term16470, term16470.getClass(), "parent", null);
        setField(term16468, term16468.getClass(), "first", term16470);
        setField(term16468, term16468.getClass(), "last", null);
        setField(term16468, term16468.getClass(), "propListHead", null);
        setIntField(term16468, term16468.getClass(), "sourcePosition", 0);
        setField(term16468, term16468.getClass(), "jsType", null);
        setField(term16468, term16468.getClass(), "parent", null);
        setField(term16467, term16467.getClass(), "first", term16468);
        setField(term16467, term16467.getClass(), "last", null);
        setField(term16467, term16467.getClass(), "propListHead", null);
        setIntField(term16467, term16467.getClass(), "sourcePosition", 0);
        setField(term16467, term16467.getClass(), "jsType", null);
        setField(term16467, term16467.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term15902;
        callMethod(klass, "process", argTypes, term15832, args);
        assertTrue(recursiveEquals(term15832, term16466));
        assertTrue(recursiveEquals(term15902, null));
    }

};


