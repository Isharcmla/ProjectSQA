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

public class TypeCheck_visit_8595247841066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304380;
     Object term304472;
     Object term304489;
     Object term304490;

    public TypeCheck_visit_8595247841066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term304380 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term304472 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term304472, term304472.getClass(), "type", 116);
        term304489 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term304489, term304489.getClass(), "compiler", null);
        setField(term304489, term304489.getClass(), "validator", null);
        setField(term304489, term304489.getClass(), "reverseInterpreter", null);
        setField(term304489, term304489.getClass(), "typeRegistry", null);
        setField(term304489, term304489.getClass(), "topScope", null);
        setField(term304489, term304489.getClass(), "scopeCreator", null);
        setField(term304489, term304489.getClass(), "reportMissingOverride", null);
        setField(term304489, term304489.getClass(), "reportUnknownTypes", null);
        setBooleanField(term304489, term304489.getClass(), "reportMissingProperties", false);
        setField(term304489, term304489.getClass(), "inferJSDocInfo", null);
        setIntField(term304489, term304489.getClass(), "typedCount", 0);
        setIntField(term304489, term304489.getClass(), "nullCount", 0);
        setIntField(term304489, term304489.getClass(), "unknownCount", 0);
        setBooleanField(term304489, term304489.getClass(), "inExterns", false);
        setIntField(term304489, term304489.getClass(), "noTypeCheckSection", 0);
        term304490 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term304490, term304490.getClass(), "number", 0.0);
        setIntField(term304490, term304490.getClass(), "type", 116);
        setField(term304490, term304490.getClass(), "next", null);
        setField(term304490, term304490.getClass(), "first", null);
        setField(term304490, term304490.getClass(), "last", null);
        setField(term304490, term304490.getClass(), "propListHead", null);
        setIntField(term304490, term304490.getClass(), "sourcePosition", 0);
        setField(term304490, term304490.getClass(), "jsType", null);
        setField(term304490, term304490.getClass(), "parent", null);
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
        args[1] = term304472;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term304380, args);
        assertTrue(recursiveEquals(term304380, term304489));
        assertTrue(recursiveEquals(term304472, null));
    }

};


