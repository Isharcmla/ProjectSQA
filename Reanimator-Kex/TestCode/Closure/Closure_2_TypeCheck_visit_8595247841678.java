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

public class TypeCheck_visit_8595247841678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term570752;
     Object term570844;
     Object term570860;
     Object term570861;

    public TypeCheck_visit_8595247841678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term570752 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term570844 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term570844, term570844.getClass(), "type", 108);
        term570860 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term570860, term570860.getClass(), "compiler", null);
        setField(term570860, term570860.getClass(), "validator", null);
        setField(term570860, term570860.getClass(), "reverseInterpreter", null);
        setField(term570860, term570860.getClass(), "typeRegistry", null);
        setField(term570860, term570860.getClass(), "topScope", null);
        setField(term570860, term570860.getClass(), "scopeCreator", null);
        setField(term570860, term570860.getClass(), "reportMissingOverride", null);
        setField(term570860, term570860.getClass(), "reportUnknownTypes", null);
        setBooleanField(term570860, term570860.getClass(), "reportMissingProperties", false);
        setField(term570860, term570860.getClass(), "inferJSDocInfo", null);
        setIntField(term570860, term570860.getClass(), "typedCount", 0);
        setIntField(term570860, term570860.getClass(), "nullCount", 0);
        setIntField(term570860, term570860.getClass(), "unknownCount", 0);
        setBooleanField(term570860, term570860.getClass(), "inExterns", false);
        setIntField(term570860, term570860.getClass(), "noTypeCheckSection", 0);
        term570861 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term570861, term570861.getClass(), "str", null);
        setIntField(term570861, term570861.getClass(), "type", 108);
        setField(term570861, term570861.getClass(), "next", null);
        setField(term570861, term570861.getClass(), "first", null);
        setField(term570861, term570861.getClass(), "last", null);
        setField(term570861, term570861.getClass(), "propListHead", null);
        setIntField(term570861, term570861.getClass(), "sourcePosition", 0);
        setField(term570861, term570861.getClass(), "jsType", null);
        setField(term570861, term570861.getClass(), "parent", null);
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
        args[1] = term570844;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term570752, args);
        assertTrue(recursiveEquals(term570752, term570860));
        assertTrue(recursiveEquals(term570844, null));
    }

};


