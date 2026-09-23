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

public class TypeCheck_visit_8595247841506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490025;
     Object term490095;
     Object term490130;
     Object term490131;

    public TypeCheck_visit_8595247841506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term490025 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setBooleanField(term490025, term490025.getClass(), "inExterns", true);
        term490095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term490095, term490095.getClass(), "type", 148);
        term490130 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term490130, term490130.getClass(), "compiler", null);
        setField(term490130, term490130.getClass(), "validator", null);
        setField(term490130, term490130.getClass(), "reverseInterpreter", null);
        setField(term490130, term490130.getClass(), "typeRegistry", null);
        setField(term490130, term490130.getClass(), "topScope", null);
        setField(term490130, term490130.getClass(), "scopeCreator", null);
        setField(term490130, term490130.getClass(), "reportMissingOverride", null);
        setField(term490130, term490130.getClass(), "reportUnknownTypes", null);
        setBooleanField(term490130, term490130.getClass(), "reportMissingProperties", false);
        setField(term490130, term490130.getClass(), "inferJSDocInfo", null);
        setIntField(term490130, term490130.getClass(), "typedCount", 0);
        setIntField(term490130, term490130.getClass(), "nullCount", 0);
        setIntField(term490130, term490130.getClass(), "unknownCount", 0);
        setBooleanField(term490130, term490130.getClass(), "inExterns", true);
        setIntField(term490130, term490130.getClass(), "noTypeCheckSection", 0);
        term490131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term490131, term490131.getClass(), "type", 148);
        setField(term490131, term490131.getClass(), "next", null);
        setField(term490131, term490131.getClass(), "first", null);
        setField(term490131, term490131.getClass(), "last", null);
        setField(term490131, term490131.getClass(), "propListHead", null);
        setIntField(term490131, term490131.getClass(), "sourcePosition", 0);
        setField(term490131, term490131.getClass(), "jsType", null);
        setField(term490131, term490131.getClass(), "parent", null);
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
        args[1] = term490095;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term490025, args);
        assertTrue(recursiveEquals(term490025, term490130));
        assertTrue(recursiveEquals(term490095, null));
    }

};


