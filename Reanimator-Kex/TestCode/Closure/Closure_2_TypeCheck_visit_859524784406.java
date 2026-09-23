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

public class TypeCheck_visit_859524784406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96701;
     Object term96771;
     Object term96787;
     Object term96788;

    public TypeCheck_visit_859524784406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96701 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term96771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term96771, term96771.getClass(), "type", 49);
        term96787 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term96787, term96787.getClass(), "compiler", null);
        setField(term96787, term96787.getClass(), "validator", null);
        setField(term96787, term96787.getClass(), "reverseInterpreter", null);
        setField(term96787, term96787.getClass(), "typeRegistry", null);
        setField(term96787, term96787.getClass(), "topScope", null);
        setField(term96787, term96787.getClass(), "scopeCreator", null);
        setField(term96787, term96787.getClass(), "reportMissingOverride", null);
        setField(term96787, term96787.getClass(), "reportUnknownTypes", null);
        setBooleanField(term96787, term96787.getClass(), "reportMissingProperties", false);
        setField(term96787, term96787.getClass(), "inferJSDocInfo", null);
        setIntField(term96787, term96787.getClass(), "typedCount", 0);
        setIntField(term96787, term96787.getClass(), "nullCount", 0);
        setIntField(term96787, term96787.getClass(), "unknownCount", 0);
        setBooleanField(term96787, term96787.getClass(), "inExterns", false);
        setIntField(term96787, term96787.getClass(), "noTypeCheckSection", 0);
        term96788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term96788, term96788.getClass(), "type", 49);
        setField(term96788, term96788.getClass(), "next", null);
        setField(term96788, term96788.getClass(), "first", null);
        setField(term96788, term96788.getClass(), "last", null);
        setField(term96788, term96788.getClass(), "propListHead", null);
        setIntField(term96788, term96788.getClass(), "sourcePosition", 0);
        setField(term96788, term96788.getClass(), "jsType", null);
        setField(term96788, term96788.getClass(), "parent", null);
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
        args[1] = term96771;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term96701, args);
        assertTrue(recursiveEquals(term96701, term96787));
        assertTrue(recursiveEquals(term96771, null));
    }

};


