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

public class TypeCheck_visit_8595247841592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term503615;
     Object term503707;
     Object term503724;
     Object term503725;

    public TypeCheck_visit_8595247841592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term503615 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term503707 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term503707, term503707.getClass(), "type", 124);
        term503724 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term503724, term503724.getClass(), "compiler", null);
        setField(term503724, term503724.getClass(), "validator", null);
        setField(term503724, term503724.getClass(), "reverseInterpreter", null);
        setField(term503724, term503724.getClass(), "typeRegistry", null);
        setField(term503724, term503724.getClass(), "topScope", null);
        setField(term503724, term503724.getClass(), "scopeCreator", null);
        setField(term503724, term503724.getClass(), "reportMissingOverride", null);
        setField(term503724, term503724.getClass(), "reportUnknownTypes", null);
        setBooleanField(term503724, term503724.getClass(), "reportMissingProperties", false);
        setField(term503724, term503724.getClass(), "inferJSDocInfo", null);
        setIntField(term503724, term503724.getClass(), "typedCount", 0);
        setIntField(term503724, term503724.getClass(), "nullCount", 0);
        setIntField(term503724, term503724.getClass(), "unknownCount", 0);
        setBooleanField(term503724, term503724.getClass(), "inExterns", false);
        setIntField(term503724, term503724.getClass(), "noTypeCheckSection", 0);
        term503725 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term503725, term503725.getClass(), "number", 0.0);
        setIntField(term503725, term503725.getClass(), "type", 124);
        setField(term503725, term503725.getClass(), "next", null);
        setField(term503725, term503725.getClass(), "first", null);
        setField(term503725, term503725.getClass(), "last", null);
        setField(term503725, term503725.getClass(), "propListHead", null);
        setIntField(term503725, term503725.getClass(), "sourcePosition", 0);
        setField(term503725, term503725.getClass(), "jsType", null);
        setField(term503725, term503725.getClass(), "parent", null);
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
        args[1] = term503707;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term503615, args);
        assertTrue(recursiveEquals(term503615, term503724));
        assertTrue(recursiveEquals(term503707, null));
    }

};


