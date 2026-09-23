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

public class ProcessCommonJSModules_process_62786604759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20766;
     Object term20836;
     Object term21388;
     Object term21389;

    public ProcessCommonJSModules_process_62786604759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20766 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term20766, term20766.getClass(), "compiler", null);
        term20836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20928 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term21020 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term21090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20836, term20836.getClass(), "type", 0);
        setField(term20836, term20836.getClass(), "parent", null);
        setField(term20928, term20928.getClass(), "next", null);
        setIntField(term20928, term20928.getClass(), "type", 0);
        setField(term21020, term21020.getClass(), "next", term21090);
        setIntField(term21020, term21020.getClass(), "type", 37);
        setField(term21020, term21020.getClass(), "first", null);
        setField(term20928, term20928.getClass(), "first", term21020);
        setField(term20836, term20836.getClass(), "first", term20928);
        term21388 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term21388, term21388.getClass(), "compiler", null);
        setField(term21388, term21388.getClass(), "filenamePrefix", null);
        setBooleanField(term21388, term21388.getClass(), "reportDependencies", false);
        setField(term21388, term21388.getClass(), "module", null);
        term21389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21390 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term21391 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term21392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21389, term21389.getClass(), "type", 0);
        setField(term21389, term21389.getClass(), "next", null);
        setDoubleField(term21390, term21390.getClass(), "number", 0.0);
        setIntField(term21390, term21390.getClass(), "type", 0);
        setField(term21390, term21390.getClass(), "next", null);
        setDoubleField(term21391, term21391.getClass(), "number", 0.0);
        setIntField(term21391, term21391.getClass(), "type", 37);
        setIntField(term21392, term21392.getClass(), "type", 0);
        setField(term21392, term21392.getClass(), "next", null);
        setField(term21392, term21392.getClass(), "first", null);
        setField(term21392, term21392.getClass(), "last", null);
        setField(term21392, term21392.getClass(), "propListHead", null);
        setIntField(term21392, term21392.getClass(), "sourcePosition", 0);
        setField(term21392, term21392.getClass(), "jsType", null);
        setField(term21392, term21392.getClass(), "parent", null);
        setField(term21391, term21391.getClass(), "next", term21392);
        setField(term21391, term21391.getClass(), "first", null);
        setField(term21391, term21391.getClass(), "last", null);
        setField(term21391, term21391.getClass(), "propListHead", null);
        setIntField(term21391, term21391.getClass(), "sourcePosition", 0);
        setField(term21391, term21391.getClass(), "jsType", null);
        setField(term21391, term21391.getClass(), "parent", null);
        setField(term21390, term21390.getClass(), "first", term21391);
        setField(term21390, term21390.getClass(), "last", null);
        setField(term21390, term21390.getClass(), "propListHead", null);
        setIntField(term21390, term21390.getClass(), "sourcePosition", 0);
        setField(term21390, term21390.getClass(), "jsType", null);
        setField(term21390, term21390.getClass(), "parent", null);
        setField(term21389, term21389.getClass(), "first", term21390);
        setField(term21389, term21389.getClass(), "last", null);
        setField(term21389, term21389.getClass(), "propListHead", null);
        setIntField(term21389, term21389.getClass(), "sourcePosition", 0);
        setField(term21389, term21389.getClass(), "jsType", null);
        setField(term21389, term21389.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term20836;
        callMethod(klass, "process", argTypes, term20766, args);
        assertTrue(recursiveEquals(term20766, term21388));
        assertTrue(recursiveEquals(term20836, null));
    }

};


