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

public class ProcessCommonJSModules_process_627866047119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54323;
     Object term54393;
     Object term55043;
     Object term55044;

    public ProcessCommonJSModules_process_627866047119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54323 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term54323, term54323.getClass(), "compiler", null);
        term54393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54393, term54393.getClass(), "type", 0);
        setField(term54393, term54393.getClass(), "parent", null);
        setField(term54463, term54463.getClass(), "next", term54533);
        setIntField(term54463, term54463.getClass(), "type", 33);
        setField(term54673, term54673.getClass(), "next", null);
        setIntField(term54673, term54673.getClass(), "type", 0);
        setField(term54673, term54673.getClass(), "first", null);
        setField(term54603, term54603.getClass(), "next", term54673);
        setIntField(term54603, term54603.getClass(), "type", 37);
        setField(term54603, term54603.getClass(), "first", null);
        setField(term54463, term54463.getClass(), "first", term54603);
        setField(term54393, term54393.getClass(), "first", term54463);
        term55043 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term55043, term55043.getClass(), "compiler", null);
        setField(term55043, term55043.getClass(), "filenamePrefix", null);
        setBooleanField(term55043, term55043.getClass(), "reportDependencies", false);
        setField(term55043, term55043.getClass(), "module", null);
        term55044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term55044, term55044.getClass(), "type", 0);
        setField(term55044, term55044.getClass(), "next", null);
        setIntField(term55045, term55045.getClass(), "type", 33);
        setIntField(term55046, term55046.getClass(), "type", 0);
        setField(term55046, term55046.getClass(), "next", null);
        setField(term55046, term55046.getClass(), "first", null);
        setField(term55046, term55046.getClass(), "last", null);
        setField(term55046, term55046.getClass(), "propListHead", null);
        setIntField(term55046, term55046.getClass(), "sourcePosition", 0);
        setField(term55046, term55046.getClass(), "jsType", null);
        setField(term55046, term55046.getClass(), "parent", null);
        setField(term55045, term55045.getClass(), "next", term55046);
        setIntField(term55047, term55047.getClass(), "type", 37);
        setIntField(term55048, term55048.getClass(), "type", 0);
        setField(term55048, term55048.getClass(), "next", null);
        setField(term55048, term55048.getClass(), "first", null);
        setField(term55048, term55048.getClass(), "last", null);
        setField(term55048, term55048.getClass(), "propListHead", null);
        setIntField(term55048, term55048.getClass(), "sourcePosition", 0);
        setField(term55048, term55048.getClass(), "jsType", null);
        setField(term55048, term55048.getClass(), "parent", null);
        setField(term55047, term55047.getClass(), "next", term55048);
        setField(term55047, term55047.getClass(), "first", null);
        setField(term55047, term55047.getClass(), "last", null);
        setField(term55047, term55047.getClass(), "propListHead", null);
        setIntField(term55047, term55047.getClass(), "sourcePosition", 0);
        setField(term55047, term55047.getClass(), "jsType", null);
        setField(term55047, term55047.getClass(), "parent", null);
        setField(term55045, term55045.getClass(), "first", term55047);
        setField(term55045, term55045.getClass(), "last", null);
        setField(term55045, term55045.getClass(), "propListHead", null);
        setIntField(term55045, term55045.getClass(), "sourcePosition", 0);
        setField(term55045, term55045.getClass(), "jsType", null);
        setField(term55045, term55045.getClass(), "parent", null);
        setField(term55044, term55044.getClass(), "first", term55045);
        setField(term55044, term55044.getClass(), "last", null);
        setField(term55044, term55044.getClass(), "propListHead", null);
        setIntField(term55044, term55044.getClass(), "sourcePosition", 0);
        setField(term55044, term55044.getClass(), "jsType", null);
        setField(term55044, term55044.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term54393;
        callMethod(klass, "process", argTypes, term54323, args);
        assertTrue(recursiveEquals(term54323, term55043));
        assertTrue(recursiveEquals(term54393, null));
    }

};


