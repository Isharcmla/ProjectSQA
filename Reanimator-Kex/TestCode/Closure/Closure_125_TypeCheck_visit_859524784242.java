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

public class TypeCheck_visit_859524784242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58406;
     Object term58476;
     Object term59016;
     Object term59017;

    public TypeCheck_visit_859524784242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58406 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term58476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58476, term58476.getClass(), "type", 112);
        term59016 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term59016, term59016.getClass(), "compiler", null);
        setField(term59016, term59016.getClass(), "validator", null);
        setField(term59016, term59016.getClass(), "reverseInterpreter", null);
        setField(term59016, term59016.getClass(), "typeRegistry", null);
        setField(term59016, term59016.getClass(), "topScope", null);
        setField(term59016, term59016.getClass(), "scopeCreator", null);
        setField(term59016, term59016.getClass(), "reportMissingOverride", null);
        setBooleanField(term59016, term59016.getClass(), "reportUnknownTypes", false);
        setBooleanField(term59016, term59016.getClass(), "reportMissingProperties", false);
        setField(term59016, term59016.getClass(), "inferJSDocInfo", null);
        setIntField(term59016, term59016.getClass(), "typedCount", 0);
        setIntField(term59016, term59016.getClass(), "nullCount", 0);
        setIntField(term59016, term59016.getClass(), "unknownCount", 0);
        setBooleanField(term59016, term59016.getClass(), "inExterns", false);
        setIntField(term59016, term59016.getClass(), "noTypeCheckSection", 0);
        setField(term59016, term59016.getClass(), "editDistance", null);
        term59017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59017, term59017.getClass(), "type", 112);
        setField(term59017, term59017.getClass(), "next", null);
        setField(term59017, term59017.getClass(), "first", null);
        setField(term59017, term59017.getClass(), "last", null);
        setField(term59017, term59017.getClass(), "propListHead", null);
        setIntField(term59017, term59017.getClass(), "sourcePosition", 0);
        setField(term59017, term59017.getClass(), "jsType", null);
        setField(term59017, term59017.getClass(), "parent", null);
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
        args[1] = term58476;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term58406, args);
        assertTrue(recursiveEquals(term58406, term59016));
        assertTrue(recursiveEquals(term58476, null));
    }

};


