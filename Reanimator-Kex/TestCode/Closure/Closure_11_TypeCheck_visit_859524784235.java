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

public class TypeCheck_visit_859524784235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57299;
     Object term57369;
     Object term57552;
     Object term57553;

    public TypeCheck_visit_859524784235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57299 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term57369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57369, term57369.getClass(), "type", 148);
        term57552 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term57552, term57552.getClass(), "compiler", null);
        setField(term57552, term57552.getClass(), "validator", null);
        setField(term57552, term57552.getClass(), "reverseInterpreter", null);
        setField(term57552, term57552.getClass(), "typeRegistry", null);
        setField(term57552, term57552.getClass(), "topScope", null);
        setField(term57552, term57552.getClass(), "scopeCreator", null);
        setField(term57552, term57552.getClass(), "reportMissingOverride", null);
        setField(term57552, term57552.getClass(), "reportUnknownTypes", null);
        setBooleanField(term57552, term57552.getClass(), "reportMissingProperties", false);
        setField(term57552, term57552.getClass(), "inferJSDocInfo", null);
        setIntField(term57552, term57552.getClass(), "typedCount", 0);
        setIntField(term57552, term57552.getClass(), "nullCount", 1);
        setIntField(term57552, term57552.getClass(), "unknownCount", 0);
        setBooleanField(term57552, term57552.getClass(), "inExterns", false);
        setIntField(term57552, term57552.getClass(), "noTypeCheckSection", 0);
        term57553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57553, term57553.getClass(), "type", 148);
        setField(term57553, term57553.getClass(), "next", null);
        setField(term57553, term57553.getClass(), "first", null);
        setField(term57553, term57553.getClass(), "last", null);
        setField(term57553, term57553.getClass(), "propListHead", null);
        setIntField(term57553, term57553.getClass(), "sourcePosition", 0);
        setField(term57553, term57553.getClass(), "jsType", null);
        setField(term57553, term57553.getClass(), "parent", null);
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
        args[1] = term57369;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term57299, args);
        assertTrue(recursiveEquals(term57299, term57552));
        assertTrue(recursiveEquals(term57369, null));
    }

};


