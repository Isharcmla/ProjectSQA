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
import java.lang.Object;

public class TypeCheck_visit_8595247841117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322268;
     Object term322338;
     Object term322504;
     Object term322985;
     Object term322986;
     Object term322988;

    public TypeCheck_visit_8595247841117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term322268 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term322338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term322434 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setIntField(term322338, term322338.getClass(), "type", 38);
        setField(term322338, term322338.getClass(), "jsType", term322434);
        term322504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term322504, term322504.getClass(), "type", 38);
        term322985 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term322985, term322985.getClass(), "compiler", null);
        setField(term322985, term322985.getClass(), "validator", null);
        setField(term322985, term322985.getClass(), "reverseInterpreter", null);
        setField(term322985, term322985.getClass(), "typeRegistry", null);
        setField(term322985, term322985.getClass(), "topScope", null);
        setField(term322985, term322985.getClass(), "scopeCreator", null);
        setField(term322985, term322985.getClass(), "reportMissingOverride", null);
        setField(term322985, term322985.getClass(), "reportUnknownTypes", null);
        setBooleanField(term322985, term322985.getClass(), "reportMissingProperties", false);
        setField(term322985, term322985.getClass(), "inferJSDocInfo", null);
        setIntField(term322985, term322985.getClass(), "typedCount", 1);
        setIntField(term322985, term322985.getClass(), "nullCount", 0);
        setIntField(term322985, term322985.getClass(), "unknownCount", 0);
        setBooleanField(term322985, term322985.getClass(), "inExterns", false);
        setIntField(term322985, term322985.getClass(), "noTypeCheckSection", 0);
        term322986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term322987 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setIntField(term322986, term322986.getClass(), "type", 38);
        setField(term322986, term322986.getClass(), "next", null);
        setField(term322986, term322986.getClass(), "first", null);
        setField(term322986, term322986.getClass(), "last", null);
        setField(term322986, term322986.getClass(), "propListHead", null);
        setIntField(term322986, term322986.getClass(), "sourcePosition", 0);
        setField(term322987, term322987.getClass(), "properties", null);
        setBooleanField(term322987, term322987.getClass(), "declared", false);
        setBooleanField(term322987, term322987.getClass(), "isFrozen", false);
        setField(term322987, term322987.getClass(), "className", null);
        setField(term322987, term322987.getClass(), "properties", null);
        setBooleanField(term322987, term322987.getClass(), "nativeType", false);
        setField(term322987, term322987.getClass(), "implicitPrototypeFallback", null);
        setField(term322987, term322987.getClass(), "ownerFunction", null);
        setBooleanField(term322987, term322987.getClass(), "prettyPrint", false);
        setBooleanField(term322987, term322987.getClass(), "visited", false);
        setField(term322987, term322987.getClass(), "docInfo", null);
        setBooleanField(term322987, term322987.getClass(), "unknown", false);
        setBooleanField(term322987, term322987.getClass(), "resolved", false);
        setField(term322987, term322987.getClass(), "resolveResult", null);
        setBooleanField(term322987, term322987.getClass(), "inTemplatedCheckVisit", false);
        setField(term322987, term322987.getClass(), "registry", null);
        setField(term322986, term322986.getClass(), "jsType", term322987);
        setField(term322986, term322986.getClass(), "parent", null);
        term322988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term322988, term322988.getClass(), "type", 38);
        setField(term322988, term322988.getClass(), "next", null);
        setField(term322988, term322988.getClass(), "first", null);
        setField(term322988, term322988.getClass(), "last", null);
        setField(term322988, term322988.getClass(), "propListHead", null);
        setIntField(term322988, term322988.getClass(), "sourcePosition", 0);
        setField(term322988, term322988.getClass(), "jsType", null);
        setField(term322988, term322988.getClass(), "parent", null);
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
        args[1] = term322338;
        args[2] = term322504;
        callMethod(klass, "visit", argTypes, term322268, args);
        assertTrue(recursiveEquals(term322268, term322985));
        assertTrue(recursiveEquals(term322338, term322988));
        assertTrue(recursiveEquals(term322504, null));
    }

};


