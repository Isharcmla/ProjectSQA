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

public class TypeCheck_doPercentTypedAccounting_337287087190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47742;
     Object term47812;
     Object term47824;
     Object term47825;

    public TypeCheck_doPercentTypedAccounting_337287087190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47742 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term47812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term47824 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term47824, term47824.getClass(), "compiler", null);
        setField(term47824, term47824.getClass(), "validator", null);
        setField(term47824, term47824.getClass(), "reverseInterpreter", null);
        setField(term47824, term47824.getClass(), "typeRegistry", null);
        setField(term47824, term47824.getClass(), "topScope", null);
        setField(term47824, term47824.getClass(), "scopeCreator", null);
        setField(term47824, term47824.getClass(), "reportMissingOverride", null);
        setField(term47824, term47824.getClass(), "reportUnknownTypes", null);
        setBooleanField(term47824, term47824.getClass(), "reportMissingProperties", false);
        setField(term47824, term47824.getClass(), "inferJSDocInfo", null);
        setIntField(term47824, term47824.getClass(), "typedCount", 0);
        setIntField(term47824, term47824.getClass(), "nullCount", 1);
        setIntField(term47824, term47824.getClass(), "unknownCount", 0);
        setBooleanField(term47824, term47824.getClass(), "inExterns", false);
        setIntField(term47824, term47824.getClass(), "noTypeCheckSection", 0);
        term47825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47825, term47825.getClass(), "type", 0);
        setField(term47825, term47825.getClass(), "next", null);
        setField(term47825, term47825.getClass(), "first", null);
        setField(term47825, term47825.getClass(), "last", null);
        setField(term47825, term47825.getClass(), "propListHead", null);
        setIntField(term47825, term47825.getClass(), "sourcePosition", 0);
        setField(term47825, term47825.getClass(), "jsType", null);
        setField(term47825, term47825.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term47812;
        callMethod(klass, "doPercentTypedAccounting", argTypes, term47742, args);
        assertTrue(recursiveEquals(term47742, term47824));
        assertTrue(recursiveEquals(term47812, null));
    }

};


