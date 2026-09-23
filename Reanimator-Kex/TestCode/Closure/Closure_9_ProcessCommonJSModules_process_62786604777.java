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

public class ProcessCommonJSModules_process_62786604777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29729;
     Object term29799;
     Object term30289;
     Object term30290;

    public ProcessCommonJSModules_process_62786604777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29729 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term29729, term29729.getClass(), "compiler", null);
        term29799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29799, term29799.getClass(), "type", 0);
        setField(term29799, term29799.getClass(), "parent", null);
        setField(term29939, term29939.getClass(), "next", null);
        setIntField(term29939, term29939.getClass(), "type", 37);
        setField(term29939, term29939.getClass(), "first", null);
        setField(term29869, term29869.getClass(), "next", term29939);
        setIntField(term29869, term29869.getClass(), "type", 0);
        setField(term30009, term30009.getClass(), "next", null);
        setIntField(term30009, term30009.getClass(), "type", 0);
        setField(term30009, term30009.getClass(), "first", null);
        setField(term29869, term29869.getClass(), "first", term30009);
        setField(term29799, term29799.getClass(), "first", term29869);
        term30289 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term30289, term30289.getClass(), "compiler", null);
        setField(term30289, term30289.getClass(), "filenamePrefix", null);
        setBooleanField(term30289, term30289.getClass(), "reportDependencies", false);
        setField(term30289, term30289.getClass(), "module", null);
        term30290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30290, term30290.getClass(), "type", 0);
        setField(term30290, term30290.getClass(), "next", null);
        setIntField(term30291, term30291.getClass(), "type", 0);
        setIntField(term30292, term30292.getClass(), "type", 37);
        setField(term30292, term30292.getClass(), "next", null);
        setField(term30292, term30292.getClass(), "first", null);
        setField(term30292, term30292.getClass(), "last", null);
        setField(term30292, term30292.getClass(), "propListHead", null);
        setIntField(term30292, term30292.getClass(), "sourcePosition", 0);
        setField(term30292, term30292.getClass(), "jsType", null);
        setField(term30292, term30292.getClass(), "parent", null);
        setField(term30291, term30291.getClass(), "next", term30292);
        setIntField(term30293, term30293.getClass(), "type", 0);
        setField(term30293, term30293.getClass(), "next", null);
        setField(term30293, term30293.getClass(), "first", null);
        setField(term30293, term30293.getClass(), "last", null);
        setField(term30293, term30293.getClass(), "propListHead", null);
        setIntField(term30293, term30293.getClass(), "sourcePosition", 0);
        setField(term30293, term30293.getClass(), "jsType", null);
        setField(term30293, term30293.getClass(), "parent", null);
        setField(term30291, term30291.getClass(), "first", term30293);
        setField(term30291, term30291.getClass(), "last", null);
        setField(term30291, term30291.getClass(), "propListHead", null);
        setIntField(term30291, term30291.getClass(), "sourcePosition", 0);
        setField(term30291, term30291.getClass(), "jsType", null);
        setField(term30291, term30291.getClass(), "parent", null);
        setField(term30290, term30290.getClass(), "first", term30291);
        setField(term30290, term30290.getClass(), "last", null);
        setField(term30290, term30290.getClass(), "propListHead", null);
        setIntField(term30290, term30290.getClass(), "sourcePosition", 0);
        setField(term30290, term30290.getClass(), "jsType", null);
        setField(term30290, term30290.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term29799;
        callMethod(klass, "process", argTypes, term29729, args);
        assertTrue(recursiveEquals(term29729, term30289));
        assertTrue(recursiveEquals(term29799, null));
    }

};


