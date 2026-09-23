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

public class RenameLabels_process_15092268053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25710;
     Object term25780;
     Object term26204;
     Object term26205;

    public RenameLabels_process_15092268053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25710 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term25710, term25710.getClass(), "compiler", null);
        term25780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25780, term25780.getClass(), "type", 0);
        setField(term25850, term25850.getClass(), "next", term25920);
        setIntField(term25850, term25850.getClass(), "type", 0);
        setField(term25850, term25850.getClass(), "first", null);
        setField(term25780, term25780.getClass(), "first", term25850);
        term26204 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term26204, term26204.getClass(), "compiler", null);
        setField(term26204, term26204.getClass(), "nameSupplier", null);
        setBooleanField(term26204, term26204.getClass(), "removeUnused", false);
        term26205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26205, term26205.getClass(), "type", 0);
        setField(term26205, term26205.getClass(), "next", null);
        setIntField(term26206, term26206.getClass(), "type", 0);
        setIntField(term26207, term26207.getClass(), "type", 0);
        setField(term26207, term26207.getClass(), "next", null);
        setField(term26207, term26207.getClass(), "first", null);
        setField(term26207, term26207.getClass(), "last", null);
        setField(term26207, term26207.getClass(), "propListHead", null);
        setIntField(term26207, term26207.getClass(), "sourcePosition", 0);
        setField(term26207, term26207.getClass(), "jsType", null);
        setField(term26207, term26207.getClass(), "parent", null);
        setField(term26206, term26206.getClass(), "next", term26207);
        setField(term26206, term26206.getClass(), "first", null);
        setField(term26206, term26206.getClass(), "last", null);
        setField(term26206, term26206.getClass(), "propListHead", null);
        setIntField(term26206, term26206.getClass(), "sourcePosition", 0);
        setField(term26206, term26206.getClass(), "jsType", null);
        setField(term26206, term26206.getClass(), "parent", null);
        setField(term26205, term26205.getClass(), "first", term26206);
        setField(term26205, term26205.getClass(), "last", null);
        setField(term26205, term26205.getClass(), "propListHead", null);
        setIntField(term26205, term26205.getClass(), "sourcePosition", 0);
        setField(term26205, term26205.getClass(), "jsType", null);
        setField(term26205, term26205.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term25780;
        callMethod(klass, "process", argTypes, term25710, args);
        assertTrue(recursiveEquals(term25710, term26204));
        assertTrue(recursiveEquals(term25780, null));
    }

};


