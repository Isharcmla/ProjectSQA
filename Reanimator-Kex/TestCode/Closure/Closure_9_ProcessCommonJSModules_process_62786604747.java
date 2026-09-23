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

public class ProcessCommonJSModules_process_62786604747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14468;
     Object term14538;
     Object term15172;
     Object term15173;

    public ProcessCommonJSModules_process_62786604747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14468 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term14468, term14468.getClass(), "compiler", null);
        term14538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14538, term14538.getClass(), "type", 37);
        setField(term14538, term14538.getClass(), "parent", null);
        setField(term14748, term14748.getClass(), "next", null);
        setIntField(term14748, term14748.getClass(), "type", 0);
        setField(term14748, term14748.getClass(), "first", null);
        setField(term14678, term14678.getClass(), "next", term14748);
        setIntField(term14678, term14678.getClass(), "type", 0);
        setField(term14678, term14678.getClass(), "first", null);
        setField(term14608, term14608.getClass(), "next", term14678);
        setIntField(term14608, term14608.getClass(), "type", 0);
        setField(term14818, term14818.getClass(), "next", null);
        setIntField(term14818, term14818.getClass(), "type", 0);
        setField(term14818, term14818.getClass(), "first", null);
        setField(term14608, term14608.getClass(), "first", term14818);
        setField(term14538, term14538.getClass(), "first", term14608);
        term15172 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term15172, term15172.getClass(), "compiler", null);
        setField(term15172, term15172.getClass(), "filenamePrefix", null);
        setBooleanField(term15172, term15172.getClass(), "reportDependencies", false);
        setField(term15172, term15172.getClass(), "module", null);
        term15173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15173, term15173.getClass(), "type", 37);
        setField(term15173, term15173.getClass(), "next", null);
        setIntField(term15174, term15174.getClass(), "type", 0);
        setIntField(term15175, term15175.getClass(), "type", 0);
        setIntField(term15176, term15176.getClass(), "type", 0);
        setField(term15176, term15176.getClass(), "next", null);
        setField(term15176, term15176.getClass(), "first", null);
        setField(term15176, term15176.getClass(), "last", null);
        setField(term15176, term15176.getClass(), "propListHead", null);
        setIntField(term15176, term15176.getClass(), "sourcePosition", 0);
        setField(term15176, term15176.getClass(), "jsType", null);
        setField(term15176, term15176.getClass(), "parent", null);
        setField(term15175, term15175.getClass(), "next", term15176);
        setField(term15175, term15175.getClass(), "first", null);
        setField(term15175, term15175.getClass(), "last", null);
        setField(term15175, term15175.getClass(), "propListHead", null);
        setIntField(term15175, term15175.getClass(), "sourcePosition", 0);
        setField(term15175, term15175.getClass(), "jsType", null);
        setField(term15175, term15175.getClass(), "parent", null);
        setField(term15174, term15174.getClass(), "next", term15175);
        setIntField(term15177, term15177.getClass(), "type", 0);
        setField(term15177, term15177.getClass(), "next", null);
        setField(term15177, term15177.getClass(), "first", null);
        setField(term15177, term15177.getClass(), "last", null);
        setField(term15177, term15177.getClass(), "propListHead", null);
        setIntField(term15177, term15177.getClass(), "sourcePosition", 0);
        setField(term15177, term15177.getClass(), "jsType", null);
        setField(term15177, term15177.getClass(), "parent", null);
        setField(term15174, term15174.getClass(), "first", term15177);
        setField(term15174, term15174.getClass(), "last", null);
        setField(term15174, term15174.getClass(), "propListHead", null);
        setIntField(term15174, term15174.getClass(), "sourcePosition", 0);
        setField(term15174, term15174.getClass(), "jsType", null);
        setField(term15174, term15174.getClass(), "parent", null);
        setField(term15173, term15173.getClass(), "first", term15174);
        setField(term15173, term15173.getClass(), "last", null);
        setField(term15173, term15173.getClass(), "propListHead", null);
        setIntField(term15173, term15173.getClass(), "sourcePosition", 0);
        setField(term15173, term15173.getClass(), "jsType", null);
        setField(term15173, term15173.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term14538;
        callMethod(klass, "process", argTypes, term14468, args);
        assertTrue(recursiveEquals(term14468, term15172));
        assertTrue(recursiveEquals(term14538, null));
    }

};


