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

public class TypeCheck_visit_859524784930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259810;
     Object term259880;
     Object term260217;
     Object term260218;

    public TypeCheck_visit_859524784930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259810 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term259880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term259880, term259880.getClass(), "type", 152);
        term260217 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term260217, term260217.getClass(), "compiler", null);
        setField(term260217, term260217.getClass(), "validator", null);
        setField(term260217, term260217.getClass(), "reverseInterpreter", null);
        setField(term260217, term260217.getClass(), "typeRegistry", null);
        setField(term260217, term260217.getClass(), "topScope", null);
        setField(term260217, term260217.getClass(), "scopeCreator", null);
        setField(term260217, term260217.getClass(), "reportMissingOverride", null);
        setField(term260217, term260217.getClass(), "reportUnknownTypes", null);
        setBooleanField(term260217, term260217.getClass(), "reportMissingProperties", false);
        setField(term260217, term260217.getClass(), "inferJSDocInfo", null);
        setIntField(term260217, term260217.getClass(), "typedCount", 0);
        setIntField(term260217, term260217.getClass(), "nullCount", 0);
        setIntField(term260217, term260217.getClass(), "unknownCount", 0);
        setBooleanField(term260217, term260217.getClass(), "inExterns", false);
        setIntField(term260217, term260217.getClass(), "noTypeCheckSection", 0);
        term260218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term260218, term260218.getClass(), "type", 152);
        setField(term260218, term260218.getClass(), "next", null);
        setField(term260218, term260218.getClass(), "first", null);
        setField(term260218, term260218.getClass(), "last", null);
        setField(term260218, term260218.getClass(), "propListHead", null);
        setIntField(term260218, term260218.getClass(), "sourcePosition", 0);
        setField(term260218, term260218.getClass(), "jsType", null);
        setField(term260218, term260218.getClass(), "parent", null);
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
        args[1] = term259880;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term259810, args);
        assertTrue(recursiveEquals(term259810, term260217));
        assertTrue(recursiveEquals(term259880, null));
    }

};


