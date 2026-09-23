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

public class TypeCheck_checkPropCreation_2142023436658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177957;
     Object term178027;
     Object term178305;
     Object term178306;

    public TypeCheck_checkPropCreation_2142023436658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177957 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term178027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term178305 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term178305, term178305.getClass(), "compiler", null);
        setField(term178305, term178305.getClass(), "validator", null);
        setField(term178305, term178305.getClass(), "reverseInterpreter", null);
        setField(term178305, term178305.getClass(), "typeRegistry", null);
        setField(term178305, term178305.getClass(), "topScope", null);
        setField(term178305, term178305.getClass(), "scopeCreator", null);
        setField(term178305, term178305.getClass(), "reportMissingOverride", null);
        setBooleanField(term178305, term178305.getClass(), "reportUnknownTypes", false);
        setBooleanField(term178305, term178305.getClass(), "reportMissingProperties", false);
        setField(term178305, term178305.getClass(), "inferJSDocInfo", null);
        setIntField(term178305, term178305.getClass(), "typedCount", 0);
        setIntField(term178305, term178305.getClass(), "nullCount", 0);
        setIntField(term178305, term178305.getClass(), "unknownCount", 0);
        setBooleanField(term178305, term178305.getClass(), "inExterns", false);
        setIntField(term178305, term178305.getClass(), "noTypeCheckSection", 0);
        setField(term178305, term178305.getClass(), "editDistance", null);
        term178306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term178306, term178306.getClass(), "type", 0);
        setField(term178306, term178306.getClass(), "next", null);
        setField(term178306, term178306.getClass(), "first", null);
        setField(term178306, term178306.getClass(), "last", null);
        setField(term178306, term178306.getClass(), "propListHead", null);
        setIntField(term178306, term178306.getClass(), "sourcePosition", 0);
        setField(term178306, term178306.getClass(), "jsType", null);
        setField(term178306, term178306.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term178027;
        callMethod(klass, "checkPropCreation", argTypes, term177957, args);
        assertTrue(recursiveEquals(term177957, term178305));
        assertTrue(recursiveEquals(term178027, null));
    }

};


