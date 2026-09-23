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

public class TypeCheck_visit_859524784342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83016;
     Object term83086;
     Object term83103;
     Object term83104;

    public TypeCheck_visit_859524784342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83016 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term83086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83086, term83086.getClass(), "type", 153);
        term83103 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term83103, term83103.getClass(), "compiler", null);
        setField(term83103, term83103.getClass(), "validator", null);
        setField(term83103, term83103.getClass(), "reverseInterpreter", null);
        setField(term83103, term83103.getClass(), "typeRegistry", null);
        setField(term83103, term83103.getClass(), "topScope", null);
        setField(term83103, term83103.getClass(), "scopeCreator", null);
        setField(term83103, term83103.getClass(), "reportMissingOverride", null);
        setBooleanField(term83103, term83103.getClass(), "reportUnknownTypes", false);
        setBooleanField(term83103, term83103.getClass(), "reportMissingProperties", false);
        setField(term83103, term83103.getClass(), "inferJSDocInfo", null);
        setIntField(term83103, term83103.getClass(), "typedCount", 0);
        setIntField(term83103, term83103.getClass(), "nullCount", 0);
        setIntField(term83103, term83103.getClass(), "unknownCount", 0);
        setBooleanField(term83103, term83103.getClass(), "inExterns", false);
        setIntField(term83103, term83103.getClass(), "noTypeCheckSection", 0);
        setField(term83103, term83103.getClass(), "editDistance", null);
        term83104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83104, term83104.getClass(), "type", 153);
        setField(term83104, term83104.getClass(), "next", null);
        setField(term83104, term83104.getClass(), "first", null);
        setField(term83104, term83104.getClass(), "last", null);
        setField(term83104, term83104.getClass(), "propListHead", null);
        setIntField(term83104, term83104.getClass(), "sourcePosition", 0);
        setField(term83104, term83104.getClass(), "jsType", null);
        setField(term83104, term83104.getClass(), "parent", null);
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
        args[1] = term83086;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term83016, args);
        assertTrue(recursiveEquals(term83016, term83103));
        assertTrue(recursiveEquals(term83086, null));
    }

};


