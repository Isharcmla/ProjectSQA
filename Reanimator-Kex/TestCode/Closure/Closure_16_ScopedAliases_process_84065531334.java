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

public class ScopedAliases_process_84065531334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19259;
     Object term19329;
     Object term20862;
     Object term20863;

    public ScopedAliases_process_84065531334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19259 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term19259, term19259.getClass(), "compiler", null);
        term19329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19329, term19329.getClass(), "type", 0);
        setField(term19329, term19329.getClass(), "parent", null);
        setField(term19469, term19469.getClass(), "next", null);
        setIntField(term19469, term19469.getClass(), "type", 105);
        setField(term19399, term19399.getClass(), "next", term19469);
        setIntField(term19399, term19399.getClass(), "type", 0);
        setField(term19539, term19539.getClass(), "next", null);
        setIntField(term19539, term19539.getClass(), "type", 0);
        setField(term19539, term19539.getClass(), "first", null);
        setField(term19399, term19399.getClass(), "first", term19539);
        setField(term19329, term19329.getClass(), "first", term19399);
        term20862 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term20862, term20862.getClass(), "compiler", null);
        setField(term20862, term20862.getClass(), "preprocessorSymbolTable", null);
        setField(term20862, term20862.getClass(), "transformationHandler", null);
        term20863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20863, term20863.getClass(), "type", 0);
        setField(term20863, term20863.getClass(), "next", null);
        setIntField(term20864, term20864.getClass(), "type", 0);
        setIntField(term20865, term20865.getClass(), "type", 105);
        setField(term20865, term20865.getClass(), "next", null);
        setField(term20865, term20865.getClass(), "first", null);
        setField(term20865, term20865.getClass(), "last", null);
        setField(term20865, term20865.getClass(), "propListHead", null);
        setIntField(term20865, term20865.getClass(), "sourcePosition", 0);
        setField(term20865, term20865.getClass(), "jsType", null);
        setField(term20865, term20865.getClass(), "parent", null);
        setField(term20864, term20864.getClass(), "next", term20865);
        setIntField(term20866, term20866.getClass(), "type", 0);
        setField(term20866, term20866.getClass(), "next", null);
        setField(term20866, term20866.getClass(), "first", null);
        setField(term20866, term20866.getClass(), "last", null);
        setField(term20866, term20866.getClass(), "propListHead", null);
        setIntField(term20866, term20866.getClass(), "sourcePosition", 0);
        setField(term20866, term20866.getClass(), "jsType", null);
        setField(term20866, term20866.getClass(), "parent", null);
        setField(term20864, term20864.getClass(), "first", term20866);
        setField(term20864, term20864.getClass(), "last", null);
        setField(term20864, term20864.getClass(), "propListHead", null);
        setIntField(term20864, term20864.getClass(), "sourcePosition", 0);
        setField(term20864, term20864.getClass(), "jsType", null);
        setField(term20864, term20864.getClass(), "parent", null);
        setField(term20863, term20863.getClass(), "first", term20864);
        setField(term20863, term20863.getClass(), "last", null);
        setField(term20863, term20863.getClass(), "propListHead", null);
        setIntField(term20863, term20863.getClass(), "sourcePosition", 0);
        setField(term20863, term20863.getClass(), "jsType", null);
        setField(term20863, term20863.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term19329;
        callMethod(klass, "process", argTypes, term19259, args);
        assertTrue(recursiveEquals(term19259, term20862));
        assertTrue(recursiveEquals(term19329, null));
    }

};


