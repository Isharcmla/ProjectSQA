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

public class TypeCheck_visit_859524784458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115739;
     Object term115809;
     Object term115826;
     Object term115827;

    public TypeCheck_visit_859524784458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115739 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term115809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term115809, term115809.getClass(), "type", 124);
        term115826 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term115826, term115826.getClass(), "compiler", null);
        setField(term115826, term115826.getClass(), "validator", null);
        setField(term115826, term115826.getClass(), "reverseInterpreter", null);
        setField(term115826, term115826.getClass(), "typeRegistry", null);
        setField(term115826, term115826.getClass(), "topScope", null);
        setField(term115826, term115826.getClass(), "scopeCreator", null);
        setField(term115826, term115826.getClass(), "reportMissingOverride", null);
        setBooleanField(term115826, term115826.getClass(), "reportUnknownTypes", false);
        setBooleanField(term115826, term115826.getClass(), "reportMissingProperties", false);
        setField(term115826, term115826.getClass(), "inferJSDocInfo", null);
        setIntField(term115826, term115826.getClass(), "typedCount", 0);
        setIntField(term115826, term115826.getClass(), "nullCount", 0);
        setIntField(term115826, term115826.getClass(), "unknownCount", 0);
        setBooleanField(term115826, term115826.getClass(), "inExterns", false);
        setIntField(term115826, term115826.getClass(), "noTypeCheckSection", 0);
        setField(term115826, term115826.getClass(), "editDistance", null);
        term115827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term115827, term115827.getClass(), "type", 124);
        setField(term115827, term115827.getClass(), "next", null);
        setField(term115827, term115827.getClass(), "first", null);
        setField(term115827, term115827.getClass(), "last", null);
        setField(term115827, term115827.getClass(), "propListHead", null);
        setIntField(term115827, term115827.getClass(), "sourcePosition", 0);
        setField(term115827, term115827.getClass(), "jsType", null);
        setField(term115827, term115827.getClass(), "parent", null);
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
        args[1] = term115809;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term115739, args);
        assertTrue(recursiveEquals(term115739, term115826));
        assertTrue(recursiveEquals(term115809, null));
    }

};


