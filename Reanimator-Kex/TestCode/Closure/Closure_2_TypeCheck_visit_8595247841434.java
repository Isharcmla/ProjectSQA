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

public class TypeCheck_visit_8595247841434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term454763;
     Object term454855;
     Object term454871;
     Object term454872;

    public TypeCheck_visit_8595247841434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term454763 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term454855 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term454855, term454855.getClass(), "type", 116);
        term454871 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term454871, term454871.getClass(), "compiler", null);
        setField(term454871, term454871.getClass(), "validator", null);
        setField(term454871, term454871.getClass(), "reverseInterpreter", null);
        setField(term454871, term454871.getClass(), "typeRegistry", null);
        setField(term454871, term454871.getClass(), "topScope", null);
        setField(term454871, term454871.getClass(), "scopeCreator", null);
        setField(term454871, term454871.getClass(), "reportMissingOverride", null);
        setField(term454871, term454871.getClass(), "reportUnknownTypes", null);
        setBooleanField(term454871, term454871.getClass(), "reportMissingProperties", false);
        setField(term454871, term454871.getClass(), "inferJSDocInfo", null);
        setIntField(term454871, term454871.getClass(), "typedCount", 0);
        setIntField(term454871, term454871.getClass(), "nullCount", 0);
        setIntField(term454871, term454871.getClass(), "unknownCount", 0);
        setBooleanField(term454871, term454871.getClass(), "inExterns", false);
        setIntField(term454871, term454871.getClass(), "noTypeCheckSection", 0);
        term454872 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term454872, term454872.getClass(), "str", null);
        setIntField(term454872, term454872.getClass(), "type", 116);
        setField(term454872, term454872.getClass(), "next", null);
        setField(term454872, term454872.getClass(), "first", null);
        setField(term454872, term454872.getClass(), "last", null);
        setField(term454872, term454872.getClass(), "propListHead", null);
        setIntField(term454872, term454872.getClass(), "sourcePosition", 0);
        setField(term454872, term454872.getClass(), "jsType", null);
        setField(term454872, term454872.getClass(), "parent", null);
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
        args[1] = term454855;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term454763, args);
        assertTrue(recursiveEquals(term454763, term454871));
        assertTrue(recursiveEquals(term454855, null));
    }

};


