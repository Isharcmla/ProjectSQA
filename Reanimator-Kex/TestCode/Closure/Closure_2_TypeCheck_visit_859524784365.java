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

public class TypeCheck_visit_859524784365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87753;
     Object term87823;
     Object term88013;
     Object term88014;

    public TypeCheck_visit_859524784365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87753 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term87823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term87823, term87823.getClass(), "type", 115);
        term88013 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term88013, term88013.getClass(), "compiler", null);
        setField(term88013, term88013.getClass(), "validator", null);
        setField(term88013, term88013.getClass(), "reverseInterpreter", null);
        setField(term88013, term88013.getClass(), "typeRegistry", null);
        setField(term88013, term88013.getClass(), "topScope", null);
        setField(term88013, term88013.getClass(), "scopeCreator", null);
        setField(term88013, term88013.getClass(), "reportMissingOverride", null);
        setField(term88013, term88013.getClass(), "reportUnknownTypes", null);
        setBooleanField(term88013, term88013.getClass(), "reportMissingProperties", false);
        setField(term88013, term88013.getClass(), "inferJSDocInfo", null);
        setIntField(term88013, term88013.getClass(), "typedCount", 0);
        setIntField(term88013, term88013.getClass(), "nullCount", 0);
        setIntField(term88013, term88013.getClass(), "unknownCount", 0);
        setBooleanField(term88013, term88013.getClass(), "inExterns", false);
        setIntField(term88013, term88013.getClass(), "noTypeCheckSection", 0);
        term88014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term88014, term88014.getClass(), "type", 115);
        setField(term88014, term88014.getClass(), "next", null);
        setField(term88014, term88014.getClass(), "first", null);
        setField(term88014, term88014.getClass(), "last", null);
        setField(term88014, term88014.getClass(), "propListHead", null);
        setIntField(term88014, term88014.getClass(), "sourcePosition", 0);
        setField(term88014, term88014.getClass(), "jsType", null);
        setField(term88014, term88014.getClass(), "parent", null);
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
        args[1] = term87823;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term87753, args);
        assertTrue(recursiveEquals(term87753, term88013));
        assertTrue(recursiveEquals(term87823, null));
    }

};


