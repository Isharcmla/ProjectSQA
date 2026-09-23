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

public class TypeCheck_visit_85952478497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28990;
     Object term29060;
     Object term29485;
     Object term29486;

    public TypeCheck_visit_85952478497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28990 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term29060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29060, term29060.getClass(), "type", 147);
        term29485 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term29485, term29485.getClass(), "compiler", null);
        setField(term29485, term29485.getClass(), "validator", null);
        setField(term29485, term29485.getClass(), "reverseInterpreter", null);
        setField(term29485, term29485.getClass(), "typeRegistry", null);
        setField(term29485, term29485.getClass(), "topScope", null);
        setField(term29485, term29485.getClass(), "scopeCreator", null);
        setField(term29485, term29485.getClass(), "reportMissingOverride", null);
        setField(term29485, term29485.getClass(), "reportUnknownTypes", null);
        setBooleanField(term29485, term29485.getClass(), "reportMissingProperties", false);
        setField(term29485, term29485.getClass(), "inferJSDocInfo", null);
        setIntField(term29485, term29485.getClass(), "typedCount", 0);
        setIntField(term29485, term29485.getClass(), "nullCount", 1);
        setIntField(term29485, term29485.getClass(), "unknownCount", 0);
        setBooleanField(term29485, term29485.getClass(), "inExterns", false);
        setIntField(term29485, term29485.getClass(), "noTypeCheckSection", 0);
        term29486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29486, term29486.getClass(), "type", 147);
        setField(term29486, term29486.getClass(), "next", null);
        setField(term29486, term29486.getClass(), "first", null);
        setField(term29486, term29486.getClass(), "last", null);
        setField(term29486, term29486.getClass(), "propListHead", null);
        setIntField(term29486, term29486.getClass(), "sourcePosition", 0);
        setField(term29486, term29486.getClass(), "jsType", null);
        setField(term29486, term29486.getClass(), "parent", null);
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
        args[1] = term29060;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term28990, args);
        assertTrue(recursiveEquals(term28990, term29485));
        assertTrue(recursiveEquals(term29060, null));
    }

};


