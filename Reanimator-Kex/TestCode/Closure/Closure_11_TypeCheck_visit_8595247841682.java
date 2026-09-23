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

public class TypeCheck_visit_8595247841682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545276;
     Object term545368;
     Object term545522;
     Object term545523;

    public TypeCheck_visit_8595247841682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545276 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setBooleanField(term545276, term545276.getClass(), "inExterns", false);
        term545368 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term545480 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setIntField(term545368, term545368.getClass(), "type", 147);
        setField(term545368, term545368.getClass(), "jsType", term545480);
        term545522 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term545522, term545522.getClass(), "compiler", null);
        setField(term545522, term545522.getClass(), "validator", null);
        setField(term545522, term545522.getClass(), "reverseInterpreter", null);
        setField(term545522, term545522.getClass(), "typeRegistry", null);
        setField(term545522, term545522.getClass(), "topScope", null);
        setField(term545522, term545522.getClass(), "scopeCreator", null);
        setField(term545522, term545522.getClass(), "reportMissingOverride", null);
        setField(term545522, term545522.getClass(), "reportUnknownTypes", null);
        setBooleanField(term545522, term545522.getClass(), "reportMissingProperties", false);
        setField(term545522, term545522.getClass(), "inferJSDocInfo", null);
        setIntField(term545522, term545522.getClass(), "typedCount", 1);
        setIntField(term545522, term545522.getClass(), "nullCount", 0);
        setIntField(term545522, term545522.getClass(), "unknownCount", 0);
        setBooleanField(term545522, term545522.getClass(), "inExterns", false);
        setIntField(term545522, term545522.getClass(), "noTypeCheckSection", 0);
        term545523 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term545524 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term545523, term545523.getClass(), "str", null);
        setIntField(term545523, term545523.getClass(), "type", 147);
        setField(term545523, term545523.getClass(), "next", null);
        setField(term545523, term545523.getClass(), "first", null);
        setField(term545523, term545523.getClass(), "last", null);
        setField(term545523, term545523.getClass(), "propListHead", null);
        setIntField(term545523, term545523.getClass(), "sourcePosition", 0);
        setField(term545524, term545524.getClass(), "constructor", null);
        setField(term545524, term545524.getClass(), "className", null);
        setField(term545524, term545524.getClass(), "properties", null);
        setBooleanField(term545524, term545524.getClass(), "nativeType", false);
        setField(term545524, term545524.getClass(), "implicitPrototypeFallback", null);
        setField(term545524, term545524.getClass(), "ownerFunction", null);
        setBooleanField(term545524, term545524.getClass(), "prettyPrint", false);
        setBooleanField(term545524, term545524.getClass(), "visited", false);
        setField(term545524, term545524.getClass(), "docInfo", null);
        setBooleanField(term545524, term545524.getClass(), "unknown", false);
        setBooleanField(term545524, term545524.getClass(), "resolved", false);
        setField(term545524, term545524.getClass(), "resolveResult", null);
        setBooleanField(term545524, term545524.getClass(), "inTemplatedCheckVisit", false);
        setField(term545524, term545524.getClass(), "registry", null);
        setField(term545523, term545523.getClass(), "jsType", term545524);
        setField(term545523, term545523.getClass(), "parent", null);
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
        args[1] = term545368;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term545276, args);
        assertTrue(recursiveEquals(term545276, term545522));
        assertTrue(recursiveEquals(term545368, null));
    }

};


