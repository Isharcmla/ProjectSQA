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

public class ProcessCommonJSModules_process_627866047195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98602;
     Object term98672;
     Object term99158;
     Object term99159;

    public ProcessCommonJSModules_process_627866047195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98602 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term98602, term98602.getClass(), "compiler", null);
        term98672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term98672, term98672.getClass(), "type", 37);
        setField(term98672, term98672.getClass(), "parent", null);
        setField(term98882, term98882.getClass(), "next", null);
        setIntField(term98882, term98882.getClass(), "type", 37);
        setField(term98882, term98882.getClass(), "first", null);
        setField(term98812, term98812.getClass(), "next", term98882);
        setIntField(term98812, term98812.getClass(), "type", 0);
        setField(term98812, term98812.getClass(), "first", null);
        setField(term98742, term98742.getClass(), "next", term98812);
        setIntField(term98742, term98742.getClass(), "type", 0);
        setField(term98952, term98952.getClass(), "next", null);
        setIntField(term98952, term98952.getClass(), "type", 0);
        setField(term98952, term98952.getClass(), "first", null);
        setField(term98742, term98742.getClass(), "first", term98952);
        setField(term98672, term98672.getClass(), "first", term98742);
        term99158 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term99158, term99158.getClass(), "compiler", null);
        setField(term99158, term99158.getClass(), "filenamePrefix", null);
        setBooleanField(term99158, term99158.getClass(), "reportDependencies", false);
        setField(term99158, term99158.getClass(), "module", null);
        term99159 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term99159, term99159.getClass(), "compiler", null);
        setField(term99159, term99159.getClass(), "filenamePrefix", null);
        setBooleanField(term99159, term99159.getClass(), "reportDependencies", false);
        setField(term99159, term99159.getClass(), "module", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term98672;
        callMethod(klass, "process", argTypes, term98602, args);
        assertTrue(recursiveEquals(term98602, term99158));
        assertTrue(recursiveEquals(term98672, null));
    }

};


