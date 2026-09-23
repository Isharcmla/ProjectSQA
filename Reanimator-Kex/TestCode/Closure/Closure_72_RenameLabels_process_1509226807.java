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

public class RenameLabels_process_1509226807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1465;
     Object term1535;
     Object term1862;
     Object term1863;

    public RenameLabels_process_1509226807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1465 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term1465, term1465.getClass(), "compiler", null);
        term1535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1627 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term1535, term1535.getClass(), "type", 0);
        setField(term1535, term1535.getClass(), "first", term1627);
        term1862 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term1862, term1862.getClass(), "compiler", null);
        setField(term1862, term1862.getClass(), "nameSupplier", null);
        setBooleanField(term1862, term1862.getClass(), "removeUnused", false);
        term1863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1864 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term1863, term1863.getClass(), "type", 0);
        setField(term1863, term1863.getClass(), "next", null);
        setDoubleField(term1864, term1864.getClass(), "number", 0.0);
        setIntField(term1864, term1864.getClass(), "type", 0);
        setField(term1864, term1864.getClass(), "next", null);
        setField(term1864, term1864.getClass(), "first", null);
        setField(term1864, term1864.getClass(), "last", null);
        setField(term1864, term1864.getClass(), "propListHead", null);
        setIntField(term1864, term1864.getClass(), "sourcePosition", 0);
        setField(term1864, term1864.getClass(), "jsType", null);
        setField(term1864, term1864.getClass(), "parent", null);
        setField(term1863, term1863.getClass(), "first", term1864);
        setField(term1863, term1863.getClass(), "last", null);
        setField(term1863, term1863.getClass(), "propListHead", null);
        setIntField(term1863, term1863.getClass(), "sourcePosition", 0);
        setField(term1863, term1863.getClass(), "jsType", null);
        setField(term1863, term1863.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1535;
        callMethod(klass, "process", argTypes, term1465, args);
        assertTrue(recursiveEquals(term1465, term1862));
        assertTrue(recursiveEquals(term1535, null));
    }

};


