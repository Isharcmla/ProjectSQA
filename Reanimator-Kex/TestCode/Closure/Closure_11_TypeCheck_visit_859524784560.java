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

public class TypeCheck_visit_859524784560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142140;
     Object term142232;
     Object term142513;
     Object term142514;

    public TypeCheck_visit_859524784560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142140 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term142232 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term142232, term142232.getClass(), "type", 108);
        term142513 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term142513, term142513.getClass(), "compiler", null);
        setField(term142513, term142513.getClass(), "validator", null);
        setField(term142513, term142513.getClass(), "reverseInterpreter", null);
        setField(term142513, term142513.getClass(), "typeRegistry", null);
        setField(term142513, term142513.getClass(), "topScope", null);
        setField(term142513, term142513.getClass(), "scopeCreator", null);
        setField(term142513, term142513.getClass(), "reportMissingOverride", null);
        setField(term142513, term142513.getClass(), "reportUnknownTypes", null);
        setBooleanField(term142513, term142513.getClass(), "reportMissingProperties", false);
        setField(term142513, term142513.getClass(), "inferJSDocInfo", null);
        setIntField(term142513, term142513.getClass(), "typedCount", 0);
        setIntField(term142513, term142513.getClass(), "nullCount", 0);
        setIntField(term142513, term142513.getClass(), "unknownCount", 0);
        setBooleanField(term142513, term142513.getClass(), "inExterns", false);
        setIntField(term142513, term142513.getClass(), "noTypeCheckSection", 0);
        term142514 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term142514, term142514.getClass(), "number", 0.0);
        setIntField(term142514, term142514.getClass(), "type", 108);
        setField(term142514, term142514.getClass(), "next", null);
        setField(term142514, term142514.getClass(), "first", null);
        setField(term142514, term142514.getClass(), "last", null);
        setField(term142514, term142514.getClass(), "propListHead", null);
        setIntField(term142514, term142514.getClass(), "sourcePosition", 0);
        setField(term142514, term142514.getClass(), "jsType", null);
        setField(term142514, term142514.getClass(), "parent", null);
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
        args[1] = term142232;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term142140, args);
        assertTrue(recursiveEquals(term142140, term142513));
        assertTrue(recursiveEquals(term142232, null));
    }

};


