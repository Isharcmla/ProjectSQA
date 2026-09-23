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

public class RenameLabels_process_15092268043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20607;
     Object term20699;
     Object term21180;
     Object term21181;

    public RenameLabels_process_15092268043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20607 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term20607, term20607.getClass(), "compiler", null);
        term20699 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term20791 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term20883 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term20699, term20699.getClass(), "type", 0);
        setField(term20791, term20791.getClass(), "next", term20883);
        setIntField(term20791, term20791.getClass(), "type", 116);
        setField(term20791, term20791.getClass(), "first", null);
        setField(term20699, term20699.getClass(), "first", term20791);
        term21180 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term21180, term21180.getClass(), "compiler", null);
        setField(term21180, term21180.getClass(), "nameSupplier", null);
        setBooleanField(term21180, term21180.getClass(), "removeUnused", false);
        term21181 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term21182 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term21183 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term21181, term21181.getClass(), "number", 0.0);
        setIntField(term21181, term21181.getClass(), "type", 0);
        setField(term21181, term21181.getClass(), "next", null);
        setDoubleField(term21182, term21182.getClass(), "number", 0.0);
        setIntField(term21182, term21182.getClass(), "type", 116);
        setDoubleField(term21183, term21183.getClass(), "number", 0.0);
        setIntField(term21183, term21183.getClass(), "type", 0);
        setField(term21183, term21183.getClass(), "next", null);
        setField(term21183, term21183.getClass(), "first", null);
        setField(term21183, term21183.getClass(), "last", null);
        setField(term21183, term21183.getClass(), "propListHead", null);
        setIntField(term21183, term21183.getClass(), "sourcePosition", 0);
        setField(term21183, term21183.getClass(), "jsType", null);
        setField(term21183, term21183.getClass(), "parent", null);
        setField(term21182, term21182.getClass(), "next", term21183);
        setField(term21182, term21182.getClass(), "first", null);
        setField(term21182, term21182.getClass(), "last", null);
        setField(term21182, term21182.getClass(), "propListHead", null);
        setIntField(term21182, term21182.getClass(), "sourcePosition", 0);
        setField(term21182, term21182.getClass(), "jsType", null);
        setField(term21182, term21182.getClass(), "parent", null);
        setField(term21181, term21181.getClass(), "first", term21182);
        setField(term21181, term21181.getClass(), "last", null);
        setField(term21181, term21181.getClass(), "propListHead", null);
        setIntField(term21181, term21181.getClass(), "sourcePosition", 0);
        setField(term21181, term21181.getClass(), "jsType", null);
        setField(term21181, term21181.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term20699;
        callMethod(klass, "process", argTypes, term20607, args);
        assertTrue(recursiveEquals(term20607, term21180));
        assertTrue(recursiveEquals(term20699, null));
    }

};


