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

public class RenameLabels_process_15092268016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4019;
     Object term4089;
     Object term4845;
     Object term4846;

    public RenameLabels_process_15092268016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4019 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term4019, term4019.getClass(), "compiler", null);
        term4089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4089, term4089.getClass(), "type", 0);
        setField(term4159, term4159.getClass(), "next", term4229);
        setIntField(term4159, term4159.getClass(), "type", 117);
        setField(term4159, term4159.getClass(), "first", null);
        setField(term4089, term4089.getClass(), "first", term4159);
        term4845 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term4845, term4845.getClass(), "compiler", null);
        setField(term4845, term4845.getClass(), "nameSupplier", null);
        setBooleanField(term4845, term4845.getClass(), "removeUnused", false);
        term4846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4846, term4846.getClass(), "type", 0);
        setField(term4846, term4846.getClass(), "next", null);
        setIntField(term4847, term4847.getClass(), "type", 117);
        setIntField(term4848, term4848.getClass(), "type", 0);
        setField(term4848, term4848.getClass(), "next", null);
        setField(term4848, term4848.getClass(), "first", null);
        setField(term4848, term4848.getClass(), "last", null);
        setField(term4848, term4848.getClass(), "propListHead", null);
        setIntField(term4848, term4848.getClass(), "sourcePosition", 0);
        setField(term4848, term4848.getClass(), "jsType", null);
        setField(term4848, term4848.getClass(), "parent", null);
        setField(term4847, term4847.getClass(), "next", term4848);
        setField(term4847, term4847.getClass(), "first", null);
        setField(term4847, term4847.getClass(), "last", null);
        setField(term4847, term4847.getClass(), "propListHead", null);
        setIntField(term4847, term4847.getClass(), "sourcePosition", 0);
        setField(term4847, term4847.getClass(), "jsType", null);
        setField(term4847, term4847.getClass(), "parent", null);
        setField(term4846, term4846.getClass(), "first", term4847);
        setField(term4846, term4846.getClass(), "last", null);
        setField(term4846, term4846.getClass(), "propListHead", null);
        setIntField(term4846, term4846.getClass(), "sourcePosition", 0);
        setField(term4846, term4846.getClass(), "jsType", null);
        setField(term4846, term4846.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term4089;
        callMethod(klass, "process", argTypes, term4019, args);
        assertTrue(recursiveEquals(term4019, term4845));
        assertTrue(recursiveEquals(term4089, null));
    }

};


