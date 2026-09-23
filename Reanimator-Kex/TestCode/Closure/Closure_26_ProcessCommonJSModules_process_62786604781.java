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

public class ProcessCommonJSModules_process_62786604781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43993;
     Object term44063;
     Object term44518;
     Object term44519;

    public ProcessCommonJSModules_process_62786604781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43993 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term43993, term43993.getClass(), "compiler", null);
        term44063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44063, term44063.getClass(), "type", 37);
        setField(term44063, term44063.getClass(), "parent", null);
        setField(term44203, term44203.getClass(), "next", null);
        setIntField(term44203, term44203.getClass(), "type", 0);
        setField(term44203, term44203.getClass(), "first", null);
        setField(term44133, term44133.getClass(), "next", term44203);
        setIntField(term44133, term44133.getClass(), "type", 0);
        setField(term44273, term44273.getClass(), "next", null);
        setIntField(term44273, term44273.getClass(), "type", 0);
        setField(term44273, term44273.getClass(), "first", null);
        setField(term44133, term44133.getClass(), "first", term44273);
        setField(term44063, term44063.getClass(), "first", term44133);
        term44518 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term44518, term44518.getClass(), "compiler", null);
        setField(term44518, term44518.getClass(), "filenamePrefix", null);
        setBooleanField(term44518, term44518.getClass(), "reportDependencies", false);
        setField(term44518, term44518.getClass(), "module", null);
        term44519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44519, term44519.getClass(), "type", 37);
        setField(term44519, term44519.getClass(), "next", null);
        setIntField(term44520, term44520.getClass(), "type", 0);
        setIntField(term44521, term44521.getClass(), "type", 0);
        setField(term44521, term44521.getClass(), "next", null);
        setField(term44521, term44521.getClass(), "first", null);
        setField(term44521, term44521.getClass(), "last", null);
        setField(term44521, term44521.getClass(), "propListHead", null);
        setIntField(term44521, term44521.getClass(), "sourcePosition", 0);
        setField(term44521, term44521.getClass(), "jsType", null);
        setField(term44521, term44521.getClass(), "parent", null);
        setField(term44520, term44520.getClass(), "next", term44521);
        setIntField(term44522, term44522.getClass(), "type", 0);
        setField(term44522, term44522.getClass(), "next", null);
        setField(term44522, term44522.getClass(), "first", null);
        setField(term44522, term44522.getClass(), "last", null);
        setField(term44522, term44522.getClass(), "propListHead", null);
        setIntField(term44522, term44522.getClass(), "sourcePosition", 0);
        setField(term44522, term44522.getClass(), "jsType", null);
        setField(term44522, term44522.getClass(), "parent", null);
        setField(term44520, term44520.getClass(), "first", term44522);
        setField(term44520, term44520.getClass(), "last", null);
        setField(term44520, term44520.getClass(), "propListHead", null);
        setIntField(term44520, term44520.getClass(), "sourcePosition", 0);
        setField(term44520, term44520.getClass(), "jsType", null);
        setField(term44520, term44520.getClass(), "parent", null);
        setField(term44519, term44519.getClass(), "first", term44520);
        setField(term44519, term44519.getClass(), "last", null);
        setField(term44519, term44519.getClass(), "propListHead", null);
        setIntField(term44519, term44519.getClass(), "sourcePosition", 0);
        setField(term44519, term44519.getClass(), "jsType", null);
        setField(term44519, term44519.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term44063;
        callMethod(klass, "process", argTypes, term43993, args);
        assertTrue(recursiveEquals(term43993, term44518));
        assertTrue(recursiveEquals(term44063, null));
    }

};


