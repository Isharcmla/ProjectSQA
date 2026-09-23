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

public class TypeCheck_visit_8595247841198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346560;
     Object term346652;
     Object term347198;
     Object term347199;

    public TypeCheck_visit_8595247841198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term346560 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term346652 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term346652, term346652.getClass(), "type", 147);
        term347198 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term347198, term347198.getClass(), "compiler", null);
        setField(term347198, term347198.getClass(), "validator", null);
        setField(term347198, term347198.getClass(), "reverseInterpreter", null);
        setField(term347198, term347198.getClass(), "typeRegistry", null);
        setField(term347198, term347198.getClass(), "topScope", null);
        setField(term347198, term347198.getClass(), "scopeCreator", null);
        setField(term347198, term347198.getClass(), "reportMissingOverride", null);
        setField(term347198, term347198.getClass(), "reportUnknownTypes", null);
        setBooleanField(term347198, term347198.getClass(), "reportMissingProperties", false);
        setField(term347198, term347198.getClass(), "inferJSDocInfo", null);
        setIntField(term347198, term347198.getClass(), "typedCount", 0);
        setIntField(term347198, term347198.getClass(), "nullCount", 1);
        setIntField(term347198, term347198.getClass(), "unknownCount", 0);
        setBooleanField(term347198, term347198.getClass(), "inExterns", false);
        setIntField(term347198, term347198.getClass(), "noTypeCheckSection", 0);
        term347199 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term347199, term347199.getClass(), "str", null);
        setIntField(term347199, term347199.getClass(), "type", 147);
        setField(term347199, term347199.getClass(), "next", null);
        setField(term347199, term347199.getClass(), "first", null);
        setField(term347199, term347199.getClass(), "last", null);
        setField(term347199, term347199.getClass(), "propListHead", null);
        setIntField(term347199, term347199.getClass(), "sourcePosition", 0);
        setField(term347199, term347199.getClass(), "jsType", null);
        setField(term347199, term347199.getClass(), "parent", null);
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
        args[1] = term346652;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term346560, args);
        assertTrue(recursiveEquals(term346560, term347198));
        assertTrue(recursiveEquals(term346652, null));
    }

};


