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

public class ProcessCommonJSModules_process_62786604745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24508;
     Object term24578;
     Object term24890;
     Object term24891;

    public ProcessCommonJSModules_process_62786604745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24508 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term24508, term24508.getClass(), "compiler", null);
        term24578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24578, term24578.getClass(), "type", 0);
        setField(term24578, term24578.getClass(), "parent", null);
        setField(term24648, term24648.getClass(), "next", null);
        setIntField(term24648, term24648.getClass(), "type", 0);
        setField(term24718, term24718.getClass(), "next", null);
        setIntField(term24718, term24718.getClass(), "type", 0);
        setField(term24718, term24718.getClass(), "first", null);
        setField(term24648, term24648.getClass(), "first", term24718);
        setField(term24578, term24578.getClass(), "first", term24648);
        term24890 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term24890, term24890.getClass(), "compiler", null);
        setField(term24890, term24890.getClass(), "filenamePrefix", null);
        setBooleanField(term24890, term24890.getClass(), "reportDependencies", false);
        setField(term24890, term24890.getClass(), "module", null);
        term24891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24891, term24891.getClass(), "type", 0);
        setField(term24891, term24891.getClass(), "next", null);
        setIntField(term24892, term24892.getClass(), "type", 0);
        setField(term24892, term24892.getClass(), "next", null);
        setIntField(term24893, term24893.getClass(), "type", 0);
        setField(term24893, term24893.getClass(), "next", null);
        setField(term24893, term24893.getClass(), "first", null);
        setField(term24893, term24893.getClass(), "last", null);
        setField(term24893, term24893.getClass(), "propListHead", null);
        setIntField(term24893, term24893.getClass(), "sourcePosition", 0);
        setField(term24893, term24893.getClass(), "jsType", null);
        setField(term24893, term24893.getClass(), "parent", null);
        setField(term24892, term24892.getClass(), "first", term24893);
        setField(term24892, term24892.getClass(), "last", null);
        setField(term24892, term24892.getClass(), "propListHead", null);
        setIntField(term24892, term24892.getClass(), "sourcePosition", 0);
        setField(term24892, term24892.getClass(), "jsType", null);
        setField(term24892, term24892.getClass(), "parent", null);
        setField(term24891, term24891.getClass(), "first", term24892);
        setField(term24891, term24891.getClass(), "last", null);
        setField(term24891, term24891.getClass(), "propListHead", null);
        setIntField(term24891, term24891.getClass(), "sourcePosition", 0);
        setField(term24891, term24891.getClass(), "jsType", null);
        setField(term24891, term24891.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term24578;
        callMethod(klass, "process", argTypes, term24508, args);
        assertTrue(recursiveEquals(term24508, term24890));
        assertTrue(recursiveEquals(term24578, null));
    }

};


