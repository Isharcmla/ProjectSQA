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

public class TypeCheck_visit_859524784425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116651;
     Object term116721;
     Object term116739;
     Object term116740;

    public TypeCheck_visit_859524784425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116651 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term116721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term116721, term116721.getClass(), "type", 147);
        term116739 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term116739, term116739.getClass(), "compiler", null);
        setField(term116739, term116739.getClass(), "validator", null);
        setField(term116739, term116739.getClass(), "reverseInterpreter", null);
        setField(term116739, term116739.getClass(), "typeRegistry", null);
        setField(term116739, term116739.getClass(), "topScope", null);
        setField(term116739, term116739.getClass(), "scopeCreator", null);
        setField(term116739, term116739.getClass(), "reportMissingOverride", null);
        setField(term116739, term116739.getClass(), "reportUnknownTypes", null);
        setBooleanField(term116739, term116739.getClass(), "reportMissingProperties", false);
        setField(term116739, term116739.getClass(), "inferJSDocInfo", null);
        setIntField(term116739, term116739.getClass(), "typedCount", 0);
        setIntField(term116739, term116739.getClass(), "nullCount", 1);
        setIntField(term116739, term116739.getClass(), "unknownCount", 0);
        setBooleanField(term116739, term116739.getClass(), "inExterns", false);
        setIntField(term116739, term116739.getClass(), "noTypeCheckSection", 0);
        term116740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term116740, term116740.getClass(), "type", 147);
        setField(term116740, term116740.getClass(), "next", null);
        setField(term116740, term116740.getClass(), "first", null);
        setField(term116740, term116740.getClass(), "last", null);
        setField(term116740, term116740.getClass(), "propListHead", null);
        setIntField(term116740, term116740.getClass(), "sourcePosition", 0);
        setField(term116740, term116740.getClass(), "jsType", null);
        setField(term116740, term116740.getClass(), "parent", null);
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
        args[1] = term116721;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term116651, args);
        assertTrue(recursiveEquals(term116651, term116739));
        assertTrue(recursiveEquals(term116721, null));
    }

};


