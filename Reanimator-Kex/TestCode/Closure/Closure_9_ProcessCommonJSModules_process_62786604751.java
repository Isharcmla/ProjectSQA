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

public class ProcessCommonJSModules_process_62786604751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15944;
     Object term16014;
     Object term16694;
     Object term16695;

    public ProcessCommonJSModules_process_62786604751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15944 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term15944, term15944.getClass(), "compiler", null);
        term16014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16014, term16014.getClass(), "type", 37);
        setField(term16014, term16014.getClass(), "parent", null);
        setField(term16154, term16154.getClass(), "next", null);
        setIntField(term16154, term16154.getClass(), "type", 0);
        setField(term16154, term16154.getClass(), "first", null);
        setField(term16084, term16084.getClass(), "next", term16154);
        setIntField(term16084, term16084.getClass(), "type", 0);
        setField(term16224, term16224.getClass(), "next", null);
        setIntField(term16224, term16224.getClass(), "type", 0);
        setField(term16224, term16224.getClass(), "first", null);
        setField(term16084, term16084.getClass(), "first", term16224);
        setField(term16014, term16014.getClass(), "first", term16084);
        term16694 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term16694, term16694.getClass(), "compiler", null);
        setField(term16694, term16694.getClass(), "filenamePrefix", null);
        setBooleanField(term16694, term16694.getClass(), "reportDependencies", false);
        setField(term16694, term16694.getClass(), "module", null);
        term16695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16695, term16695.getClass(), "type", 37);
        setField(term16695, term16695.getClass(), "next", null);
        setIntField(term16696, term16696.getClass(), "type", 0);
        setIntField(term16697, term16697.getClass(), "type", 0);
        setField(term16697, term16697.getClass(), "next", null);
        setField(term16697, term16697.getClass(), "first", null);
        setField(term16697, term16697.getClass(), "last", null);
        setField(term16697, term16697.getClass(), "propListHead", null);
        setIntField(term16697, term16697.getClass(), "sourcePosition", 0);
        setField(term16697, term16697.getClass(), "jsType", null);
        setField(term16697, term16697.getClass(), "parent", null);
        setField(term16696, term16696.getClass(), "next", term16697);
        setIntField(term16698, term16698.getClass(), "type", 0);
        setField(term16698, term16698.getClass(), "next", null);
        setField(term16698, term16698.getClass(), "first", null);
        setField(term16698, term16698.getClass(), "last", null);
        setField(term16698, term16698.getClass(), "propListHead", null);
        setIntField(term16698, term16698.getClass(), "sourcePosition", 0);
        setField(term16698, term16698.getClass(), "jsType", null);
        setField(term16698, term16698.getClass(), "parent", null);
        setField(term16696, term16696.getClass(), "first", term16698);
        setField(term16696, term16696.getClass(), "last", null);
        setField(term16696, term16696.getClass(), "propListHead", null);
        setIntField(term16696, term16696.getClass(), "sourcePosition", 0);
        setField(term16696, term16696.getClass(), "jsType", null);
        setField(term16696, term16696.getClass(), "parent", null);
        setField(term16695, term16695.getClass(), "first", term16696);
        setField(term16695, term16695.getClass(), "last", null);
        setField(term16695, term16695.getClass(), "propListHead", null);
        setIntField(term16695, term16695.getClass(), "sourcePosition", 0);
        setField(term16695, term16695.getClass(), "jsType", null);
        setField(term16695, term16695.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term16014;
        callMethod(klass, "process", argTypes, term15944, args);
        assertTrue(recursiveEquals(term15944, term16694));
        assertTrue(recursiveEquals(term16014, null));
    }

};


