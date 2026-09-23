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

public class TypeCheck_visit_859524784578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154419;
     Object term154489;
     Object term154559;
     Object term154583;
     Object term154584;
     Object term154585;

    public TypeCheck_visit_859524784578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154419 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term154489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term154489, term154489.getClass(), "type", 38);
        term154559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term154559, term154559.getClass(), "type", 120);
        term154583 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term154583, term154583.getClass(), "compiler", null);
        setField(term154583, term154583.getClass(), "validator", null);
        setField(term154583, term154583.getClass(), "reverseInterpreter", null);
        setField(term154583, term154583.getClass(), "typeRegistry", null);
        setField(term154583, term154583.getClass(), "topScope", null);
        setField(term154583, term154583.getClass(), "scopeCreator", null);
        setField(term154583, term154583.getClass(), "reportMissingOverride", null);
        setBooleanField(term154583, term154583.getClass(), "reportUnknownTypes", false);
        setBooleanField(term154583, term154583.getClass(), "reportMissingProperties", false);
        setField(term154583, term154583.getClass(), "inferJSDocInfo", null);
        setIntField(term154583, term154583.getClass(), "typedCount", 0);
        setIntField(term154583, term154583.getClass(), "nullCount", 0);
        setIntField(term154583, term154583.getClass(), "unknownCount", 0);
        setBooleanField(term154583, term154583.getClass(), "inExterns", false);
        setIntField(term154583, term154583.getClass(), "noTypeCheckSection", 0);
        setField(term154583, term154583.getClass(), "editDistance", null);
        term154584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term154584, term154584.getClass(), "type", 38);
        setField(term154584, term154584.getClass(), "next", null);
        setField(term154584, term154584.getClass(), "first", null);
        setField(term154584, term154584.getClass(), "last", null);
        setField(term154584, term154584.getClass(), "propListHead", null);
        setIntField(term154584, term154584.getClass(), "sourcePosition", 0);
        setField(term154584, term154584.getClass(), "jsType", null);
        setField(term154584, term154584.getClass(), "parent", null);
        term154585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term154585, term154585.getClass(), "type", 120);
        setField(term154585, term154585.getClass(), "next", null);
        setField(term154585, term154585.getClass(), "first", null);
        setField(term154585, term154585.getClass(), "last", null);
        setField(term154585, term154585.getClass(), "propListHead", null);
        setIntField(term154585, term154585.getClass(), "sourcePosition", 0);
        setField(term154585, term154585.getClass(), "jsType", null);
        setField(term154585, term154585.getClass(), "parent", null);
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
        args[1] = term154489;
        args[2] = term154559;
        callMethod(klass, "visit", argTypes, term154419, args);
        assertTrue(recursiveEquals(term154419, term154583));
        assertTrue(recursiveEquals(term154489, term154585));
        assertTrue(recursiveEquals(term154559, null));
    }

};


