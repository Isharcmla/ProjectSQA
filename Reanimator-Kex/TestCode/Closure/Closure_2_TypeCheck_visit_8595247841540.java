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

public class TypeCheck_visit_8595247841540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term507301;
     Object term507393;
     Object term507410;
     Object term507411;

    public TypeCheck_visit_8595247841540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term507301 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term507393 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term507393, term507393.getClass(), "type", 114);
        term507410 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term507410, term507410.getClass(), "compiler", null);
        setField(term507410, term507410.getClass(), "validator", null);
        setField(term507410, term507410.getClass(), "reverseInterpreter", null);
        setField(term507410, term507410.getClass(), "typeRegistry", null);
        setField(term507410, term507410.getClass(), "topScope", null);
        setField(term507410, term507410.getClass(), "scopeCreator", null);
        setField(term507410, term507410.getClass(), "reportMissingOverride", null);
        setField(term507410, term507410.getClass(), "reportUnknownTypes", null);
        setBooleanField(term507410, term507410.getClass(), "reportMissingProperties", false);
        setField(term507410, term507410.getClass(), "inferJSDocInfo", null);
        setIntField(term507410, term507410.getClass(), "typedCount", 0);
        setIntField(term507410, term507410.getClass(), "nullCount", 0);
        setIntField(term507410, term507410.getClass(), "unknownCount", 0);
        setBooleanField(term507410, term507410.getClass(), "inExterns", false);
        setIntField(term507410, term507410.getClass(), "noTypeCheckSection", 0);
        term507411 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term507411, term507411.getClass(), "number", 0.0);
        setIntField(term507411, term507411.getClass(), "type", 114);
        setField(term507411, term507411.getClass(), "next", null);
        setField(term507411, term507411.getClass(), "first", null);
        setField(term507411, term507411.getClass(), "last", null);
        setField(term507411, term507411.getClass(), "propListHead", null);
        setIntField(term507411, term507411.getClass(), "sourcePosition", 0);
        setField(term507411, term507411.getClass(), "jsType", null);
        setField(term507411, term507411.getClass(), "parent", null);
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
        args[1] = term507393;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term507301, args);
        assertTrue(recursiveEquals(term507301, term507410));
        assertTrue(recursiveEquals(term507393, null));
    }

};


