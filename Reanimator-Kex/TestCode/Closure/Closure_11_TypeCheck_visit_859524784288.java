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

public class TypeCheck_visit_859524784288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67907;
     Object term67977;
     Object term67993;
     Object term67994;

    public TypeCheck_visit_859524784288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67907 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term67977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67977, term67977.getClass(), "type", 126);
        term67993 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term67993, term67993.getClass(), "compiler", null);
        setField(term67993, term67993.getClass(), "validator", null);
        setField(term67993, term67993.getClass(), "reverseInterpreter", null);
        setField(term67993, term67993.getClass(), "typeRegistry", null);
        setField(term67993, term67993.getClass(), "topScope", null);
        setField(term67993, term67993.getClass(), "scopeCreator", null);
        setField(term67993, term67993.getClass(), "reportMissingOverride", null);
        setField(term67993, term67993.getClass(), "reportUnknownTypes", null);
        setBooleanField(term67993, term67993.getClass(), "reportMissingProperties", false);
        setField(term67993, term67993.getClass(), "inferJSDocInfo", null);
        setIntField(term67993, term67993.getClass(), "typedCount", 0);
        setIntField(term67993, term67993.getClass(), "nullCount", 0);
        setIntField(term67993, term67993.getClass(), "unknownCount", 0);
        setBooleanField(term67993, term67993.getClass(), "inExterns", false);
        setIntField(term67993, term67993.getClass(), "noTypeCheckSection", 0);
        term67994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67994, term67994.getClass(), "type", 126);
        setField(term67994, term67994.getClass(), "next", null);
        setField(term67994, term67994.getClass(), "first", null);
        setField(term67994, term67994.getClass(), "last", null);
        setField(term67994, term67994.getClass(), "propListHead", null);
        setIntField(term67994, term67994.getClass(), "sourcePosition", 0);
        setField(term67994, term67994.getClass(), "jsType", null);
        setField(term67994, term67994.getClass(), "parent", null);
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
        args[1] = term67977;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term67907, args);
        assertTrue(recursiveEquals(term67907, term67993));
        assertTrue(recursiveEquals(term67977, null));
    }

};


