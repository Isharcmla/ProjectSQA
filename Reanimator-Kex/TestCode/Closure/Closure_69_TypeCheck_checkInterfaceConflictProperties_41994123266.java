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

public class TypeCheck_checkInterfaceConflictProperties_41994123266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75281;
     Object term75379;
     Object term75665;
     Object term75666;

    public TypeCheck_checkInterfaceConflictProperties_41994123266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75281 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term75379 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term75379, term75379.getClass(), "referencedObjType", null);
        term75665 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term75665, term75665.getClass(), "compiler", null);
        setField(term75665, term75665.getClass(), "validator", null);
        setField(term75665, term75665.getClass(), "reverseInterpreter", null);
        setField(term75665, term75665.getClass(), "typeRegistry", null);
        setField(term75665, term75665.getClass(), "topScope", null);
        setField(term75665, term75665.getClass(), "scopeCreator", null);
        setField(term75665, term75665.getClass(), "reportMissingOverride", null);
        setField(term75665, term75665.getClass(), "reportUnknownTypes", null);
        setBooleanField(term75665, term75665.getClass(), "reportMissingProperties", false);
        setField(term75665, term75665.getClass(), "inferJSDocInfo", null);
        setIntField(term75665, term75665.getClass(), "typedCount", 0);
        setIntField(term75665, term75665.getClass(), "nullCount", 0);
        setIntField(term75665, term75665.getClass(), "unknownCount", 0);
        setBooleanField(term75665, term75665.getClass(), "inExterns", false);
        setIntField(term75665, term75665.getClass(), "noTypeCheckSection", 0);
        term75666 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term75666, term75666.getClass(), "indexType", null);
        setField(term75666, term75666.getClass(), "referencedType", null);
        setField(term75666, term75666.getClass(), "referencedObjType", null);
        setBooleanField(term75666, term75666.getClass(), "visited", false);
        setField(term75666, term75666.getClass(), "docInfo", null);
        setBooleanField(term75666, term75666.getClass(), "unknown", false);
        setBooleanField(term75666, term75666.getClass(), "resolved", false);
        setField(term75666, term75666.getClass(), "resolveResult", null);
        setField(term75666, term75666.getClass(), "registry", null);
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
        args[5] = term75379;
        callMethod(klass, "checkInterfaceConflictProperties", argTypes, term75281, args);
        assertTrue(recursiveEquals(term75281, term75665));
        assertTrue(recursiveEquals(term75379, null));
    }

};


