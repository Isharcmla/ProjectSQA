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

public class ProcessCommonJSModules_process_62786604785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34038;
     Object term34108;
     Object term35061;
     Object term35062;

    public ProcessCommonJSModules_process_62786604785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34038 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term34038, term34038.getClass(), "compiler", null);
        term34108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34108, term34108.getClass(), "type", 0);
        setField(term34108, term34108.getClass(), "parent", null);
        setField(term34318, term34318.getClass(), "next", null);
        setIntField(term34318, term34318.getClass(), "type", 37);
        setField(term34318, term34318.getClass(), "first", null);
        setField(term34248, term34248.getClass(), "next", term34318);
        setIntField(term34248, term34248.getClass(), "type", 0);
        setField(term34248, term34248.getClass(), "first", null);
        setField(term34178, term34178.getClass(), "next", term34248);
        setIntField(term34178, term34178.getClass(), "type", 0);
        setField(term34388, term34388.getClass(), "next", null);
        setIntField(term34388, term34388.getClass(), "type", 0);
        setField(term34388, term34388.getClass(), "first", null);
        setField(term34178, term34178.getClass(), "first", term34388);
        setField(term34108, term34108.getClass(), "first", term34178);
        term35061 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term35061, term35061.getClass(), "compiler", null);
        setField(term35061, term35061.getClass(), "filenamePrefix", null);
        setBooleanField(term35061, term35061.getClass(), "reportDependencies", false);
        setField(term35061, term35061.getClass(), "module", null);
        term35062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35062, term35062.getClass(), "type", 0);
        setField(term35062, term35062.getClass(), "next", null);
        setIntField(term35063, term35063.getClass(), "type", 0);
        setIntField(term35064, term35064.getClass(), "type", 0);
        setIntField(term35065, term35065.getClass(), "type", 37);
        setField(term35065, term35065.getClass(), "next", null);
        setField(term35065, term35065.getClass(), "first", null);
        setField(term35065, term35065.getClass(), "last", null);
        setField(term35065, term35065.getClass(), "propListHead", null);
        setIntField(term35065, term35065.getClass(), "sourcePosition", 0);
        setField(term35065, term35065.getClass(), "jsType", null);
        setField(term35065, term35065.getClass(), "parent", null);
        setField(term35064, term35064.getClass(), "next", term35065);
        setField(term35064, term35064.getClass(), "first", null);
        setField(term35064, term35064.getClass(), "last", null);
        setField(term35064, term35064.getClass(), "propListHead", null);
        setIntField(term35064, term35064.getClass(), "sourcePosition", 0);
        setField(term35064, term35064.getClass(), "jsType", null);
        setField(term35064, term35064.getClass(), "parent", null);
        setField(term35063, term35063.getClass(), "next", term35064);
        setIntField(term35066, term35066.getClass(), "type", 0);
        setField(term35066, term35066.getClass(), "next", null);
        setField(term35066, term35066.getClass(), "first", null);
        setField(term35066, term35066.getClass(), "last", null);
        setField(term35066, term35066.getClass(), "propListHead", null);
        setIntField(term35066, term35066.getClass(), "sourcePosition", 0);
        setField(term35066, term35066.getClass(), "jsType", null);
        setField(term35066, term35066.getClass(), "parent", null);
        setField(term35063, term35063.getClass(), "first", term35066);
        setField(term35063, term35063.getClass(), "last", null);
        setField(term35063, term35063.getClass(), "propListHead", null);
        setIntField(term35063, term35063.getClass(), "sourcePosition", 0);
        setField(term35063, term35063.getClass(), "jsType", null);
        setField(term35063, term35063.getClass(), "parent", null);
        setField(term35062, term35062.getClass(), "first", term35063);
        setField(term35062, term35062.getClass(), "last", null);
        setField(term35062, term35062.getClass(), "propListHead", null);
        setIntField(term35062, term35062.getClass(), "sourcePosition", 0);
        setField(term35062, term35062.getClass(), "jsType", null);
        setField(term35062, term35062.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term34108;
        callMethod(klass, "process", argTypes, term34038, args);
        assertTrue(recursiveEquals(term34038, term35061));
        assertTrue(recursiveEquals(term34108, null));
    }

};


