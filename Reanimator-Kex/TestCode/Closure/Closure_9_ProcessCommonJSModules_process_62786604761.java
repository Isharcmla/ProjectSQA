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

public class ProcessCommonJSModules_process_62786604761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21719;
     Object term21811;
     Object term22530;
     Object term22531;

    public ProcessCommonJSModules_process_62786604761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21719 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term21719, term21719.getClass(), "compiler", null);
        term21811 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term21903 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term21995 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term22065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22157 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term21811, term21811.getClass(), "type", 0);
        setField(term21811, term21811.getClass(), "parent", null);
        setField(term21995, term21995.getClass(), "next", term22065);
        setIntField(term21995, term21995.getClass(), "type", 37);
        setField(term21995, term21995.getClass(), "first", null);
        setField(term21903, term21903.getClass(), "next", term21995);
        setIntField(term21903, term21903.getClass(), "type", 0);
        setField(term22157, term22157.getClass(), "next", null);
        setIntField(term22157, term22157.getClass(), "type", 0);
        setField(term22157, term22157.getClass(), "first", null);
        setField(term21903, term21903.getClass(), "first", term22157);
        setField(term21811, term21811.getClass(), "first", term21903);
        term22530 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term22530, term22530.getClass(), "compiler", null);
        setField(term22530, term22530.getClass(), "filenamePrefix", null);
        setBooleanField(term22530, term22530.getClass(), "reportDependencies", false);
        setField(term22530, term22530.getClass(), "module", null);
        term22531 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term22532 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term22533 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term22534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22535 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term22531, term22531.getClass(), "number", 0.0);
        setIntField(term22531, term22531.getClass(), "type", 0);
        setField(term22531, term22531.getClass(), "next", null);
        setDoubleField(term22532, term22532.getClass(), "number", 0.0);
        setIntField(term22532, term22532.getClass(), "type", 0);
        setDoubleField(term22533, term22533.getClass(), "number", 0.0);
        setIntField(term22533, term22533.getClass(), "type", 37);
        setIntField(term22534, term22534.getClass(), "type", 0);
        setField(term22534, term22534.getClass(), "next", null);
        setField(term22534, term22534.getClass(), "first", null);
        setField(term22534, term22534.getClass(), "last", null);
        setField(term22534, term22534.getClass(), "propListHead", null);
        setIntField(term22534, term22534.getClass(), "sourcePosition", 0);
        setField(term22534, term22534.getClass(), "jsType", null);
        setField(term22534, term22534.getClass(), "parent", null);
        setField(term22533, term22533.getClass(), "next", term22534);
        setField(term22533, term22533.getClass(), "first", null);
        setField(term22533, term22533.getClass(), "last", null);
        setField(term22533, term22533.getClass(), "propListHead", null);
        setIntField(term22533, term22533.getClass(), "sourcePosition", 0);
        setField(term22533, term22533.getClass(), "jsType", null);
        setField(term22533, term22533.getClass(), "parent", null);
        setField(term22532, term22532.getClass(), "next", term22533);
        setDoubleField(term22535, term22535.getClass(), "number", 0.0);
        setIntField(term22535, term22535.getClass(), "type", 0);
        setField(term22535, term22535.getClass(), "next", null);
        setField(term22535, term22535.getClass(), "first", null);
        setField(term22535, term22535.getClass(), "last", null);
        setField(term22535, term22535.getClass(), "propListHead", null);
        setIntField(term22535, term22535.getClass(), "sourcePosition", 0);
        setField(term22535, term22535.getClass(), "jsType", null);
        setField(term22535, term22535.getClass(), "parent", null);
        setField(term22532, term22532.getClass(), "first", term22535);
        setField(term22532, term22532.getClass(), "last", null);
        setField(term22532, term22532.getClass(), "propListHead", null);
        setIntField(term22532, term22532.getClass(), "sourcePosition", 0);
        setField(term22532, term22532.getClass(), "jsType", null);
        setField(term22532, term22532.getClass(), "parent", null);
        setField(term22531, term22531.getClass(), "first", term22532);
        setField(term22531, term22531.getClass(), "last", null);
        setField(term22531, term22531.getClass(), "propListHead", null);
        setIntField(term22531, term22531.getClass(), "sourcePosition", 0);
        setField(term22531, term22531.getClass(), "jsType", null);
        setField(term22531, term22531.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term21811;
        callMethod(klass, "process", argTypes, term21719, args);
        assertTrue(recursiveEquals(term21719, term22530));
        assertTrue(recursiveEquals(term21811, null));
    }

};


