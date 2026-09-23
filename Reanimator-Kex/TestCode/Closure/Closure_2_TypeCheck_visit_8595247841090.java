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

public class TypeCheck_visit_8595247841090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310884;
     Object term310976;
     Object term310993;
     Object term310994;

    public TypeCheck_visit_8595247841090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term310884 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term310976 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term310976, term310976.getClass(), "type", 83);
        term310993 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term310993, term310993.getClass(), "compiler", null);
        setField(term310993, term310993.getClass(), "validator", null);
        setField(term310993, term310993.getClass(), "reverseInterpreter", null);
        setField(term310993, term310993.getClass(), "typeRegistry", null);
        setField(term310993, term310993.getClass(), "topScope", null);
        setField(term310993, term310993.getClass(), "scopeCreator", null);
        setField(term310993, term310993.getClass(), "reportMissingOverride", null);
        setField(term310993, term310993.getClass(), "reportUnknownTypes", null);
        setBooleanField(term310993, term310993.getClass(), "reportMissingProperties", false);
        setField(term310993, term310993.getClass(), "inferJSDocInfo", null);
        setIntField(term310993, term310993.getClass(), "typedCount", 0);
        setIntField(term310993, term310993.getClass(), "nullCount", 0);
        setIntField(term310993, term310993.getClass(), "unknownCount", 0);
        setBooleanField(term310993, term310993.getClass(), "inExterns", false);
        setIntField(term310993, term310993.getClass(), "noTypeCheckSection", 0);
        term310994 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term310994, term310994.getClass(), "number", 0.0);
        setIntField(term310994, term310994.getClass(), "type", 83);
        setField(term310994, term310994.getClass(), "next", null);
        setField(term310994, term310994.getClass(), "first", null);
        setField(term310994, term310994.getClass(), "last", null);
        setField(term310994, term310994.getClass(), "propListHead", null);
        setIntField(term310994, term310994.getClass(), "sourcePosition", 0);
        setField(term310994, term310994.getClass(), "jsType", null);
        setField(term310994, term310994.getClass(), "parent", null);
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
        args[1] = term310976;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term310884, args);
        assertTrue(recursiveEquals(term310884, term310993));
        assertTrue(recursiveEquals(term310976, null));
    }

};


