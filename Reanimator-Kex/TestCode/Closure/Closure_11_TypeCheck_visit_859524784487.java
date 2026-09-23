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

public class TypeCheck_visit_859524784487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122030;
     Object term122122;
     Object term122482;
     Object term122483;

    public TypeCheck_visit_859524784487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122030 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term122122 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term122122, term122122.getClass(), "type", 153);
        term122482 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term122482, term122482.getClass(), "compiler", null);
        setField(term122482, term122482.getClass(), "validator", null);
        setField(term122482, term122482.getClass(), "reverseInterpreter", null);
        setField(term122482, term122482.getClass(), "typeRegistry", null);
        setField(term122482, term122482.getClass(), "topScope", null);
        setField(term122482, term122482.getClass(), "scopeCreator", null);
        setField(term122482, term122482.getClass(), "reportMissingOverride", null);
        setField(term122482, term122482.getClass(), "reportUnknownTypes", null);
        setBooleanField(term122482, term122482.getClass(), "reportMissingProperties", false);
        setField(term122482, term122482.getClass(), "inferJSDocInfo", null);
        setIntField(term122482, term122482.getClass(), "typedCount", 0);
        setIntField(term122482, term122482.getClass(), "nullCount", 0);
        setIntField(term122482, term122482.getClass(), "unknownCount", 0);
        setBooleanField(term122482, term122482.getClass(), "inExterns", false);
        setIntField(term122482, term122482.getClass(), "noTypeCheckSection", 0);
        term122483 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term122483, term122483.getClass(), "str", null);
        setIntField(term122483, term122483.getClass(), "type", 153);
        setField(term122483, term122483.getClass(), "next", null);
        setField(term122483, term122483.getClass(), "first", null);
        setField(term122483, term122483.getClass(), "last", null);
        setField(term122483, term122483.getClass(), "propListHead", null);
        setIntField(term122483, term122483.getClass(), "sourcePosition", 0);
        setField(term122483, term122483.getClass(), "jsType", null);
        setField(term122483, term122483.getClass(), "parent", null);
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
        args[1] = term122122;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term122030, args);
        assertTrue(recursiveEquals(term122030, term122482));
        assertTrue(recursiveEquals(term122122, null));
    }

};


