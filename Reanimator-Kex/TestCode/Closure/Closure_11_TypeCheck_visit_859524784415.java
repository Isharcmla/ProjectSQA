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

public class TypeCheck_visit_859524784415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99975;
     Object term100045;
     Object term100227;
     Object term100228;

    public TypeCheck_visit_859524784415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99975 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term100045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term100045, term100045.getClass(), "type", 154);
        term100227 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term100227, term100227.getClass(), "compiler", null);
        setField(term100227, term100227.getClass(), "validator", null);
        setField(term100227, term100227.getClass(), "reverseInterpreter", null);
        setField(term100227, term100227.getClass(), "typeRegistry", null);
        setField(term100227, term100227.getClass(), "topScope", null);
        setField(term100227, term100227.getClass(), "scopeCreator", null);
        setField(term100227, term100227.getClass(), "reportMissingOverride", null);
        setField(term100227, term100227.getClass(), "reportUnknownTypes", null);
        setBooleanField(term100227, term100227.getClass(), "reportMissingProperties", false);
        setField(term100227, term100227.getClass(), "inferJSDocInfo", null);
        setIntField(term100227, term100227.getClass(), "typedCount", 0);
        setIntField(term100227, term100227.getClass(), "nullCount", 0);
        setIntField(term100227, term100227.getClass(), "unknownCount", 0);
        setBooleanField(term100227, term100227.getClass(), "inExterns", false);
        setIntField(term100227, term100227.getClass(), "noTypeCheckSection", 0);
        term100228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term100228, term100228.getClass(), "type", 154);
        setField(term100228, term100228.getClass(), "next", null);
        setField(term100228, term100228.getClass(), "first", null);
        setField(term100228, term100228.getClass(), "last", null);
        setField(term100228, term100228.getClass(), "propListHead", null);
        setIntField(term100228, term100228.getClass(), "sourcePosition", 0);
        setField(term100228, term100228.getClass(), "jsType", null);
        setField(term100228, term100228.getClass(), "parent", null);
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
        args[1] = term100045;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term99975, args);
        assertTrue(recursiveEquals(term99975, term100227));
        assertTrue(recursiveEquals(term100045, null));
    }

};


