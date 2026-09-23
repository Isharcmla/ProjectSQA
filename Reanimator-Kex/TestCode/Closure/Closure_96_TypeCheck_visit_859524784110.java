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

public class TypeCheck_visit_859524784110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64434;
     Object term64504;
     Object term64520;
     Object term64521;

    public TypeCheck_visit_859524784110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64434 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term64504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term64504, term64504.getClass(), "type", 120);
        term64520 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term64520, term64520.getClass(), "compiler", null);
        setField(term64520, term64520.getClass(), "validator", null);
        setField(term64520, term64520.getClass(), "reverseInterpreter", null);
        setField(term64520, term64520.getClass(), "typeRegistry", null);
        setField(term64520, term64520.getClass(), "topScope", null);
        setField(term64520, term64520.getClass(), "scopeCreator", null);
        setField(term64520, term64520.getClass(), "reportMissingOverride", null);
        setField(term64520, term64520.getClass(), "reportUnknownTypes", null);
        setBooleanField(term64520, term64520.getClass(), "reportMissingProperties", false);
        setField(term64520, term64520.getClass(), "inferJSDocInfo", null);
        setIntField(term64520, term64520.getClass(), "typedCount", 0);
        setIntField(term64520, term64520.getClass(), "nullCount", 0);
        setIntField(term64520, term64520.getClass(), "unknownCount", 0);
        setBooleanField(term64520, term64520.getClass(), "inExterns", false);
        setIntField(term64520, term64520.getClass(), "noTypeCheckSection", 0);
        term64521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term64521, term64521.getClass(), "type", 120);
        setField(term64521, term64521.getClass(), "next", null);
        setField(term64521, term64521.getClass(), "first", null);
        setField(term64521, term64521.getClass(), "last", null);
        setField(term64521, term64521.getClass(), "propListHead", null);
        setIntField(term64521, term64521.getClass(), "sourcePosition", 0);
        setField(term64521, term64521.getClass(), "jsType", null);
        setField(term64521, term64521.getClass(), "parent", null);
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
        args[1] = term64504;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term64434, args);
        assertTrue(recursiveEquals(term64434, term64520));
        assertTrue(recursiveEquals(term64504, null));
    }

};


