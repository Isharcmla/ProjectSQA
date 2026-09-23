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
import java.lang.Object;

public class CodeGenerator_getFirstNonEmptyChild_162111751028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2413;

    public CodeGenerator_getFirstNonEmptyChild_162111751028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2426 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2436 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2413, term2413.getClass(), "type", -1896376975);
        setIntField(term2415, term2415.getClass(), "type", 584893196);
        setIntField(term2417, term2417.getClass(), "type", 0);
        setField(term2417, term2417.getClass(), "next", null);
        setField(term2417, term2417.getClass(), "first", null);
        setField(term2417, term2417.getClass(), "last", null);
        setField(term2417, term2417.getClass(), "propListHead", null);
        setIntField(term2417, term2417.getClass(), "sourcePosition", 0);
        setField(term2417, term2417.getClass(), "jsType", null);
        setField(term2417, term2417.getClass(), "parent", null);
        setField(term2415, term2415.getClass(), "next", term2417);
        setIntField(term2420, term2420.getClass(), "type", 0);
        setField(term2420, term2420.getClass(), "next", null);
        setField(term2420, term2420.getClass(), "first", null);
        setField(term2420, term2420.getClass(), "last", null);
        setField(term2420, term2420.getClass(), "propListHead", null);
        setIntField(term2420, term2420.getClass(), "sourcePosition", 0);
        setField(term2420, term2420.getClass(), "jsType", null);
        setField(term2420, term2420.getClass(), "parent", null);
        setField(term2415, term2415.getClass(), "first", term2420);
        setIntField(term2423, term2423.getClass(), "type", 0);
        setField(term2423, term2423.getClass(), "next", null);
        setField(term2423, term2423.getClass(), "first", null);
        setField(term2423, term2423.getClass(), "last", null);
        setField(term2423, term2423.getClass(), "propListHead", null);
        setIntField(term2423, term2423.getClass(), "sourcePosition", 0);
        setField(term2423, term2423.getClass(), "jsType", null);
        setField(term2423, term2423.getClass(), "parent", null);
        setField(term2415, term2415.getClass(), "last", term2423);
        setField(term2426, term2426.getClass(), "next", null);
        setIntField(term2426, term2426.getClass(), "type", 0);
        setIntField(term2426, term2426.getClass(), "intValue", 0);
        setField(term2426, term2426.getClass(), "objectValue", null);
        setField(term2415, term2415.getClass(), "propListHead", term2426);
        setIntField(term2415, term2415.getClass(), "sourcePosition", -1882480155);
        setField(term2415, term2415.getClass(), "jsType", null);
        setField(term2415, term2415.getClass(), "parent", null);
        setField(term2413, term2413.getClass(), "next", term2415);
        setIntField(term2430, term2430.getClass(), "type", 0);
        setField(term2430, term2430.getClass(), "next", null);
        setField(term2430, term2430.getClass(), "first", null);
        setField(term2430, term2430.getClass(), "last", null);
        setField(term2430, term2430.getClass(), "propListHead", null);
        setIntField(term2430, term2430.getClass(), "sourcePosition", 0);
        setField(term2430, term2430.getClass(), "jsType", null);
        setField(term2430, term2430.getClass(), "parent", null);
        setField(term2413, term2413.getClass(), "first", term2430);
        setIntField(term2433, term2433.getClass(), "type", 0);
        setField(term2433, term2433.getClass(), "next", null);
        setField(term2433, term2433.getClass(), "first", null);
        setField(term2433, term2433.getClass(), "last", null);
        setField(term2433, term2433.getClass(), "propListHead", null);
        setIntField(term2433, term2433.getClass(), "sourcePosition", 0);
        setField(term2433, term2433.getClass(), "jsType", null);
        setField(term2433, term2433.getClass(), "parent", null);
        setField(term2413, term2413.getClass(), "last", term2433);
        setField(term2436, term2436.getClass(), "next", null);
        setIntField(term2436, term2436.getClass(), "type", 0);
        setIntField(term2436, term2436.getClass(), "intValue", 0);
        setField(term2436, term2436.getClass(), "objectValue", null);
        setField(term2413, term2413.getClass(), "propListHead", term2436);
        setIntField(term2413, term2413.getClass(), "sourcePosition", -1410220680);
        setField(term2413, term2413.getClass(), "jsType", null);
        setField(term2413, term2413.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2413;
        callMethod(klass, "getFirstNonEmptyChild", argTypes, null, args);
    }

};


