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

public class TypeCheck_visit_8595247841544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term484176;
     Object term484246;
     Object term484262;
     Object term484263;

    public TypeCheck_visit_8595247841544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term484176 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term484246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term484246, term484246.getClass(), "type", 153);
        term484262 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term484262, term484262.getClass(), "compiler", null);
        setField(term484262, term484262.getClass(), "validator", null);
        setField(term484262, term484262.getClass(), "reverseInterpreter", null);
        setField(term484262, term484262.getClass(), "typeRegistry", null);
        setField(term484262, term484262.getClass(), "topScope", null);
        setField(term484262, term484262.getClass(), "scopeCreator", null);
        setField(term484262, term484262.getClass(), "reportMissingOverride", null);
        setField(term484262, term484262.getClass(), "reportUnknownTypes", null);
        setBooleanField(term484262, term484262.getClass(), "reportMissingProperties", false);
        setField(term484262, term484262.getClass(), "inferJSDocInfo", null);
        setIntField(term484262, term484262.getClass(), "typedCount", 0);
        setIntField(term484262, term484262.getClass(), "nullCount", 0);
        setIntField(term484262, term484262.getClass(), "unknownCount", 0);
        setBooleanField(term484262, term484262.getClass(), "inExterns", false);
        setIntField(term484262, term484262.getClass(), "noTypeCheckSection", 0);
        term484263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term484263, term484263.getClass(), "type", 153);
        setField(term484263, term484263.getClass(), "next", null);
        setField(term484263, term484263.getClass(), "first", null);
        setField(term484263, term484263.getClass(), "last", null);
        setField(term484263, term484263.getClass(), "propListHead", null);
        setIntField(term484263, term484263.getClass(), "sourcePosition", 0);
        setField(term484263, term484263.getClass(), "jsType", null);
        setField(term484263, term484263.getClass(), "parent", null);
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
        args[1] = term484246;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term484176, args);
        assertTrue(recursiveEquals(term484176, term484262));
        assertTrue(recursiveEquals(term484246, null));
    }

};


