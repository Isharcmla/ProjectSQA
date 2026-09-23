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

public class TypeCheck_visit_859524784562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175410;
     Object term175502;
     Object term175521;
     Object term175522;

    public TypeCheck_visit_859524784562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175410 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term175502 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term175502, term175502.getClass(), "type", 148);
        term175521 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term175521, term175521.getClass(), "compiler", null);
        setField(term175521, term175521.getClass(), "validator", null);
        setField(term175521, term175521.getClass(), "reverseInterpreter", null);
        setField(term175521, term175521.getClass(), "typeRegistry", null);
        setField(term175521, term175521.getClass(), "topScope", null);
        setField(term175521, term175521.getClass(), "scopeCreator", null);
        setField(term175521, term175521.getClass(), "reportMissingOverride", null);
        setField(term175521, term175521.getClass(), "reportUnknownTypes", null);
        setBooleanField(term175521, term175521.getClass(), "reportMissingProperties", false);
        setField(term175521, term175521.getClass(), "inferJSDocInfo", null);
        setIntField(term175521, term175521.getClass(), "typedCount", 0);
        setIntField(term175521, term175521.getClass(), "nullCount", 1);
        setIntField(term175521, term175521.getClass(), "unknownCount", 0);
        setBooleanField(term175521, term175521.getClass(), "inExterns", false);
        setIntField(term175521, term175521.getClass(), "noTypeCheckSection", 0);
        term175522 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term175522, term175522.getClass(), "number", 0.0);
        setIntField(term175522, term175522.getClass(), "type", 148);
        setField(term175522, term175522.getClass(), "next", null);
        setField(term175522, term175522.getClass(), "first", null);
        setField(term175522, term175522.getClass(), "last", null);
        setField(term175522, term175522.getClass(), "propListHead", null);
        setIntField(term175522, term175522.getClass(), "sourcePosition", 0);
        setField(term175522, term175522.getClass(), "jsType", null);
        setField(term175522, term175522.getClass(), "parent", null);
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
        args[1] = term175502;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term175410, args);
        assertTrue(recursiveEquals(term175410, term175521));
        assertTrue(recursiveEquals(term175502, null));
    }

};


