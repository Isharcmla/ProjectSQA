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

public class ProcessCommonJSModules_process_627866047193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96397;
     Object term96467;
     Object term98119;
     Object term98120;

    public ProcessCommonJSModules_process_627866047193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96397 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term96397, term96397.getClass(), "compiler", null);
        term96467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term96467, term96467.getClass(), "type", 0);
        setField(term96467, term96467.getClass(), "parent", null);
        setField(term96537, term96537.getClass(), "next", null);
        setIntField(term96537, term96537.getClass(), "type", 0);
        setField(term96677, term96677.getClass(), "next", null);
        setIntField(term96677, term96677.getClass(), "type", 0);
        setField(term96677, term96677.getClass(), "first", null);
        setField(term96607, term96607.getClass(), "next", term96677);
        setIntField(term96607, term96607.getClass(), "type", 37);
        setField(term96607, term96607.getClass(), "first", null);
        setField(term96537, term96537.getClass(), "first", term96607);
        setField(term96467, term96467.getClass(), "first", term96537);
        term98119 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term98119, term98119.getClass(), "compiler", null);
        setField(term98119, term98119.getClass(), "filenamePrefix", null);
        setBooleanField(term98119, term98119.getClass(), "reportDependencies", false);
        setField(term98119, term98119.getClass(), "module", null);
        term98120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term98120, term98120.getClass(), "type", 0);
        setField(term98120, term98120.getClass(), "next", null);
        setIntField(term98121, term98121.getClass(), "type", 0);
        setField(term98121, term98121.getClass(), "next", null);
        setIntField(term98122, term98122.getClass(), "type", 37);
        setIntField(term98123, term98123.getClass(), "type", 0);
        setField(term98123, term98123.getClass(), "next", null);
        setField(term98123, term98123.getClass(), "first", null);
        setField(term98123, term98123.getClass(), "last", null);
        setField(term98123, term98123.getClass(), "propListHead", null);
        setIntField(term98123, term98123.getClass(), "sourcePosition", 0);
        setField(term98123, term98123.getClass(), "jsType", null);
        setField(term98123, term98123.getClass(), "parent", null);
        setField(term98122, term98122.getClass(), "next", term98123);
        setField(term98122, term98122.getClass(), "first", null);
        setField(term98122, term98122.getClass(), "last", null);
        setField(term98122, term98122.getClass(), "propListHead", null);
        setIntField(term98122, term98122.getClass(), "sourcePosition", 0);
        setField(term98122, term98122.getClass(), "jsType", null);
        setField(term98122, term98122.getClass(), "parent", null);
        setField(term98121, term98121.getClass(), "first", term98122);
        setField(term98121, term98121.getClass(), "last", null);
        setField(term98121, term98121.getClass(), "propListHead", null);
        setIntField(term98121, term98121.getClass(), "sourcePosition", 0);
        setField(term98121, term98121.getClass(), "jsType", null);
        setField(term98121, term98121.getClass(), "parent", null);
        setField(term98120, term98120.getClass(), "first", term98121);
        setField(term98120, term98120.getClass(), "last", null);
        setField(term98120, term98120.getClass(), "propListHead", null);
        setIntField(term98120, term98120.getClass(), "sourcePosition", 0);
        setField(term98120, term98120.getClass(), "jsType", null);
        setField(term98120, term98120.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term96467;
        callMethod(klass, "process", argTypes, term96397, args);
        assertTrue(recursiveEquals(term96397, term98119));
        assertTrue(recursiveEquals(term96467, null));
    }

};


