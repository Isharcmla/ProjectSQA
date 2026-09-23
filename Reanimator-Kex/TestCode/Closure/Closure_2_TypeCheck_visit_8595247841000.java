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

public class TypeCheck_visit_8595247841000 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283935;
     Object term284027;
     Object term284053;
     Object term284054;

    public TypeCheck_visit_8595247841000() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283935 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term284027 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term284027, term284027.getClass(), "type", 115);
        term284053 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term284053, term284053.getClass(), "compiler", null);
        setField(term284053, term284053.getClass(), "validator", null);
        setField(term284053, term284053.getClass(), "reverseInterpreter", null);
        setField(term284053, term284053.getClass(), "typeRegistry", null);
        setField(term284053, term284053.getClass(), "topScope", null);
        setField(term284053, term284053.getClass(), "scopeCreator", null);
        setField(term284053, term284053.getClass(), "reportMissingOverride", null);
        setField(term284053, term284053.getClass(), "reportUnknownTypes", null);
        setBooleanField(term284053, term284053.getClass(), "reportMissingProperties", false);
        setField(term284053, term284053.getClass(), "inferJSDocInfo", null);
        setIntField(term284053, term284053.getClass(), "typedCount", 0);
        setIntField(term284053, term284053.getClass(), "nullCount", 0);
        setIntField(term284053, term284053.getClass(), "unknownCount", 0);
        setBooleanField(term284053, term284053.getClass(), "inExterns", false);
        setIntField(term284053, term284053.getClass(), "noTypeCheckSection", 0);
        term284054 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term284054, term284054.getClass(), "number", 0.0);
        setIntField(term284054, term284054.getClass(), "type", 115);
        setField(term284054, term284054.getClass(), "next", null);
        setField(term284054, term284054.getClass(), "first", null);
        setField(term284054, term284054.getClass(), "last", null);
        setField(term284054, term284054.getClass(), "propListHead", null);
        setIntField(term284054, term284054.getClass(), "sourcePosition", 0);
        setField(term284054, term284054.getClass(), "jsType", null);
        setField(term284054, term284054.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term284027;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term283935, args);
        assertTrue(recursiveEquals(term283935, term284053));
        assertTrue(recursiveEquals(term284027, null));
    }

};


