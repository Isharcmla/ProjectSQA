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

public class TypeCheck_visit_859524784781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212261;
     Object term212353;
     Object term212559;
     Object term212560;

    public TypeCheck_visit_859524784781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212261 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term212353 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term212353, term212353.getClass(), "type", 148);
        term212559 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term212559, term212559.getClass(), "compiler", null);
        setField(term212559, term212559.getClass(), "validator", null);
        setField(term212559, term212559.getClass(), "reverseInterpreter", null);
        setField(term212559, term212559.getClass(), "typeRegistry", null);
        setField(term212559, term212559.getClass(), "topScope", null);
        setField(term212559, term212559.getClass(), "scopeCreator", null);
        setField(term212559, term212559.getClass(), "reportMissingOverride", null);
        setField(term212559, term212559.getClass(), "reportUnknownTypes", null);
        setBooleanField(term212559, term212559.getClass(), "reportMissingProperties", false);
        setField(term212559, term212559.getClass(), "inferJSDocInfo", null);
        setIntField(term212559, term212559.getClass(), "typedCount", 0);
        setIntField(term212559, term212559.getClass(), "nullCount", 1);
        setIntField(term212559, term212559.getClass(), "unknownCount", 0);
        setBooleanField(term212559, term212559.getClass(), "inExterns", false);
        setIntField(term212559, term212559.getClass(), "noTypeCheckSection", 0);
        term212560 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term212560, term212560.getClass(), "str", null);
        setIntField(term212560, term212560.getClass(), "type", 148);
        setField(term212560, term212560.getClass(), "next", null);
        setField(term212560, term212560.getClass(), "first", null);
        setField(term212560, term212560.getClass(), "last", null);
        setField(term212560, term212560.getClass(), "propListHead", null);
        setIntField(term212560, term212560.getClass(), "sourcePosition", 0);
        setField(term212560, term212560.getClass(), "jsType", null);
        setField(term212560, term212560.getClass(), "parent", null);
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
        args[1] = term212353;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term212261, args);
        assertTrue(recursiveEquals(term212261, term212559));
        assertTrue(recursiveEquals(term212353, null));
    }

};


