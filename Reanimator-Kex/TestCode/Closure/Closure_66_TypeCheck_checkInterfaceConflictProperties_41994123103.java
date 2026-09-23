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

public class TypeCheck_checkInterfaceConflictProperties_41994123103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29636;
     Object term29730;
     Object term29946;
     Object term29947;

    public TypeCheck_checkInterfaceConflictProperties_41994123103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29636 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term29730 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        term29946 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term29946, term29946.getClass(), "compiler", null);
        setField(term29946, term29946.getClass(), "validator", null);
        setField(term29946, term29946.getClass(), "reverseInterpreter", null);
        setField(term29946, term29946.getClass(), "typeRegistry", null);
        setField(term29946, term29946.getClass(), "topScope", null);
        setField(term29946, term29946.getClass(), "scopeCreator", null);
        setField(term29946, term29946.getClass(), "reportMissingOverride", null);
        setField(term29946, term29946.getClass(), "reportUnknownTypes", null);
        setBooleanField(term29946, term29946.getClass(), "reportMissingProperties", false);
        setField(term29946, term29946.getClass(), "inferJSDocInfo", null);
        setIntField(term29946, term29946.getClass(), "typedCount", 0);
        setIntField(term29946, term29946.getClass(), "nullCount", 0);
        setIntField(term29946, term29946.getClass(), "unknownCount", 0);
        setBooleanField(term29946, term29946.getClass(), "inExterns", false);
        setIntField(term29946, term29946.getClass(), "noTypeCheckSection", 0);
        term29947 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term29947, term29947.getClass(), "reference", null);
        setField(term29947, term29947.getClass(), "sourceName", null);
        setIntField(term29947, term29947.getClass(), "lineno", 0);
        setIntField(term29947, term29947.getClass(), "charno", 0);
        setField(term29947, term29947.getClass(), "validator", null);
        setField(term29947, term29947.getClass(), "propertyContinuations", null);
        setField(term29947, term29947.getClass(), "referencedType", null);
        setField(term29947, term29947.getClass(), "referencedObjType", null);
        setBooleanField(term29947, term29947.getClass(), "visited", false);
        setField(term29947, term29947.getClass(), "docInfo", null);
        setBooleanField(term29947, term29947.getClass(), "unknown", false);
        setBooleanField(term29947, term29947.getClass(), "resolved", false);
        setField(term29947, term29947.getClass(), "resolveResult", null);
        setField(term29947, term29947.getClass(), "registry", null);
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
        args[5] = term29730;
        callMethod(klass, "checkInterfaceConflictProperties", argTypes, term29636, args);
        assertTrue(recursiveEquals(term29636, term29946));
        assertTrue(recursiveEquals(term29730, null));
    }

};


