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

public class TypeCheck_visit_859524784214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97858;
     Object term97928;
     Object term97984;
     Object term97985;

    public TypeCheck_visit_859524784214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97858 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term97928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term97928, term97928.getClass(), "type", 113);
        term97984 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term97984, term97984.getClass(), "compiler", null);
        setField(term97984, term97984.getClass(), "validator", null);
        setField(term97984, term97984.getClass(), "reverseInterpreter", null);
        setField(term97984, term97984.getClass(), "typeRegistry", null);
        setField(term97984, term97984.getClass(), "topScope", null);
        setField(term97984, term97984.getClass(), "scopeCreator", null);
        setField(term97984, term97984.getClass(), "reportMissingOverride", null);
        setField(term97984, term97984.getClass(), "reportUnknownTypes", null);
        setBooleanField(term97984, term97984.getClass(), "reportMissingProperties", false);
        setField(term97984, term97984.getClass(), "inferJSDocInfo", null);
        setIntField(term97984, term97984.getClass(), "typedCount", 0);
        setIntField(term97984, term97984.getClass(), "nullCount", 0);
        setIntField(term97984, term97984.getClass(), "unknownCount", 0);
        setBooleanField(term97984, term97984.getClass(), "inExterns", false);
        setIntField(term97984, term97984.getClass(), "noTypeCheckSection", 0);
        term97985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term97985, term97985.getClass(), "type", 113);
        setField(term97985, term97985.getClass(), "next", null);
        setField(term97985, term97985.getClass(), "first", null);
        setField(term97985, term97985.getClass(), "last", null);
        setField(term97985, term97985.getClass(), "propListHead", null);
        setIntField(term97985, term97985.getClass(), "sourcePosition", 0);
        setField(term97985, term97985.getClass(), "jsType", null);
        setField(term97985, term97985.getClass(), "parent", null);
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
        args[1] = term97928;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term97858, args);
        assertTrue(recursiveEquals(term97858, term97984));
        assertTrue(recursiveEquals(term97928, null));
    }

};


