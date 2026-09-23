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

public class TypeCheck_checkInterfaceConflictProperties_4199412396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28275;
     Object term28373;
     Object term29466;
     Object term29467;

    public TypeCheck_checkInterfaceConflictProperties_4199412396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28275 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term28373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        term29466 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term29466, term29466.getClass(), "compiler", null);
        setField(term29466, term29466.getClass(), "validator", null);
        setField(term29466, term29466.getClass(), "reverseInterpreter", null);
        setField(term29466, term29466.getClass(), "typeRegistry", null);
        setField(term29466, term29466.getClass(), "topScope", null);
        setField(term29466, term29466.getClass(), "scopeCreator", null);
        setField(term29466, term29466.getClass(), "reportMissingOverride", null);
        setField(term29466, term29466.getClass(), "reportUnknownTypes", null);
        setBooleanField(term29466, term29466.getClass(), "reportMissingProperties", false);
        setField(term29466, term29466.getClass(), "inferJSDocInfo", null);
        setIntField(term29466, term29466.getClass(), "typedCount", 0);
        setIntField(term29466, term29466.getClass(), "nullCount", 0);
        setIntField(term29466, term29466.getClass(), "unknownCount", 0);
        setBooleanField(term29466, term29466.getClass(), "inExterns", false);
        setIntField(term29466, term29466.getClass(), "noTypeCheckSection", 0);
        term29467 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term29467, term29467.getClass(), "indexType", null);
        setField(term29467, term29467.getClass(), "referencedType", null);
        setField(term29467, term29467.getClass(), "referencedObjType", null);
        setBooleanField(term29467, term29467.getClass(), "visited", false);
        setField(term29467, term29467.getClass(), "docInfo", null);
        setBooleanField(term29467, term29467.getClass(), "unknown", false);
        setBooleanField(term29467, term29467.getClass(), "resolved", false);
        setField(term29467, term29467.getClass(), "resolveResult", null);
        setField(term29467, term29467.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.util.HashMap");
        argTypes[4] = Class.forName("java.util.HashMap");
        argTypes[5] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term28373;
        callMethod(klass, "checkInterfaceConflictProperties", argTypes, term28275, args);
        assertTrue(recursiveEquals(term28275, term29466));
        assertTrue(recursiveEquals(term28373, null));
    }

};


