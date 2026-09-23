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

public class TypeCheck_visit_859524784690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185533;
     Object term185625;
     Object term185641;
     Object term185642;

    public TypeCheck_visit_859524784690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185533 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term185625 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term185625, term185625.getClass(), "type", 126);
        term185641 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term185641, term185641.getClass(), "compiler", null);
        setField(term185641, term185641.getClass(), "validator", null);
        setField(term185641, term185641.getClass(), "reverseInterpreter", null);
        setField(term185641, term185641.getClass(), "typeRegistry", null);
        setField(term185641, term185641.getClass(), "topScope", null);
        setField(term185641, term185641.getClass(), "scopeCreator", null);
        setField(term185641, term185641.getClass(), "reportMissingOverride", null);
        setField(term185641, term185641.getClass(), "reportUnknownTypes", null);
        setBooleanField(term185641, term185641.getClass(), "reportMissingProperties", false);
        setField(term185641, term185641.getClass(), "inferJSDocInfo", null);
        setIntField(term185641, term185641.getClass(), "typedCount", 0);
        setIntField(term185641, term185641.getClass(), "nullCount", 0);
        setIntField(term185641, term185641.getClass(), "unknownCount", 0);
        setBooleanField(term185641, term185641.getClass(), "inExterns", false);
        setIntField(term185641, term185641.getClass(), "noTypeCheckSection", 0);
        term185642 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term185642, term185642.getClass(), "str", null);
        setIntField(term185642, term185642.getClass(), "type", 126);
        setField(term185642, term185642.getClass(), "next", null);
        setField(term185642, term185642.getClass(), "first", null);
        setField(term185642, term185642.getClass(), "last", null);
        setField(term185642, term185642.getClass(), "propListHead", null);
        setIntField(term185642, term185642.getClass(), "sourcePosition", 0);
        setField(term185642, term185642.getClass(), "jsType", null);
        setField(term185642, term185642.getClass(), "parent", null);
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
        args[1] = term185625;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term185533, args);
        assertTrue(recursiveEquals(term185533, term185641));
        assertTrue(recursiveEquals(term185625, null));
    }

};


