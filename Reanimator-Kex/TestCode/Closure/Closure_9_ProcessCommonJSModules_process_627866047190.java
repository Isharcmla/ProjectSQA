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

public class ProcessCommonJSModules_process_627866047190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94134;
     Object term94204;
     Object term97817;
     Object term97818;

    public ProcessCommonJSModules_process_627866047190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94134 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term94134, term94134.getClass(), "compiler", null);
        term94204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term94204, term94204.getClass(), "type", 0);
        setField(term94204, term94204.getClass(), "parent", null);
        setField(term94274, term94274.getClass(), "next", term94344);
        setIntField(term94274, term94274.getClass(), "type", 0);
        setField(term94484, term94484.getClass(), "next", null);
        setIntField(term94484, term94484.getClass(), "type", 37);
        setField(term94484, term94484.getClass(), "first", null);
        setField(term94414, term94414.getClass(), "next", term94484);
        setIntField(term94414, term94414.getClass(), "type", 37);
        setField(term94414, term94414.getClass(), "first", null);
        setField(term94274, term94274.getClass(), "first", term94414);
        setField(term94204, term94204.getClass(), "first", term94274);
        term97817 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term97817, term97817.getClass(), "compiler", null);
        setField(term97817, term97817.getClass(), "filenamePrefix", null);
        setBooleanField(term97817, term97817.getClass(), "reportDependencies", false);
        setField(term97817, term97817.getClass(), "module", null);
        term97818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term97818, term97818.getClass(), "type", 0);
        setField(term97818, term97818.getClass(), "next", null);
        setIntField(term97819, term97819.getClass(), "type", 0);
        setField(term97819, term97819.getClass(), "next", true);
        setIntField(term97820, term97820.getClass(), "type", 37);
        setField(term97820, term97820.getClass(), "next", true);
        setField(term97820, term97820.getClass(), "first", null);
        setField(term97820, term97820.getClass(), "last", null);
        setField(term97820, term97820.getClass(), "propListHead", null);
        setIntField(term97820, term97820.getClass(), "sourcePosition", 0);
        setField(term97820, term97820.getClass(), "jsType", null);
        setField(term97820, term97820.getClass(), "parent", null);
        setField(term97819, term97819.getClass(), "first", term97820);
        setField(term97819, term97819.getClass(), "last", null);
        setField(term97819, term97819.getClass(), "propListHead", null);
        setIntField(term97819, term97819.getClass(), "sourcePosition", 0);
        setField(term97819, term97819.getClass(), "jsType", null);
        setField(term97819, term97819.getClass(), "parent", null);
        setField(term97818, term97818.getClass(), "first", term97819);
        setField(term97818, term97818.getClass(), "last", null);
        setField(term97818, term97818.getClass(), "propListHead", null);
        setIntField(term97818, term97818.getClass(), "sourcePosition", 0);
        setField(term97818, term97818.getClass(), "jsType", null);
        setField(term97818, term97818.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term94204;
        callMethod(klass, "process", argTypes, term94134, args);
        assertTrue(recursiveEquals(term94134, term97817));
        assertTrue(recursiveEquals(term94204, null));
    }

};


