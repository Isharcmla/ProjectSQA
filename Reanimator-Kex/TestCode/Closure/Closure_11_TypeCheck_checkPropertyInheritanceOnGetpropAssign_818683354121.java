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

public class TypeCheck_checkPropertyInheritanceOnGetpropAssign_818683354121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27991;
     Object term28061;
     Object term28936;
     Object term28937;

    public TypeCheck_checkPropertyInheritanceOnGetpropAssign_818683354121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27991 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term28061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term28936 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term28936, term28936.getClass(), "compiler", null);
        setField(term28936, term28936.getClass(), "validator", null);
        setField(term28936, term28936.getClass(), "reverseInterpreter", null);
        setField(term28936, term28936.getClass(), "typeRegistry", null);
        setField(term28936, term28936.getClass(), "topScope", null);
        setField(term28936, term28936.getClass(), "scopeCreator", null);
        setField(term28936, term28936.getClass(), "reportMissingOverride", null);
        setField(term28936, term28936.getClass(), "reportUnknownTypes", null);
        setBooleanField(term28936, term28936.getClass(), "reportMissingProperties", false);
        setField(term28936, term28936.getClass(), "inferJSDocInfo", null);
        setIntField(term28936, term28936.getClass(), "typedCount", 0);
        setIntField(term28936, term28936.getClass(), "nullCount", 0);
        setIntField(term28936, term28936.getClass(), "unknownCount", 0);
        setBooleanField(term28936, term28936.getClass(), "inExterns", false);
        setIntField(term28936, term28936.getClass(), "noTypeCheckSection", 0);
        term28937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28937, term28937.getClass(), "type", 0);
        setField(term28937, term28937.getClass(), "next", null);
        setField(term28937, term28937.getClass(), "first", null);
        setField(term28937, term28937.getClass(), "last", null);
        setField(term28937, term28937.getClass(), "propListHead", null);
        setIntField(term28937, term28937.getClass(), "sourcePosition", 0);
        setField(term28937, term28937.getClass(), "jsType", null);
        setField(term28937, term28937.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[5] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = term28061;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        callMethod(klass, "checkPropertyInheritanceOnGetpropAssign", argTypes, term27991, args);
        assertTrue(recursiveEquals(term27991, term28936));
        assertTrue(recursiveEquals(term28061, null));
    }

};


