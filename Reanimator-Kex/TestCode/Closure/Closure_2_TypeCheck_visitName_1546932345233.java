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

public class TypeCheck_visitName_1546932345233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57945;
     Object term58015;
     Object term58212;
     Object term58213;

    public TypeCheck_visitName_1546932345233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57945 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term58015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58015, term58015.getClass(), "type", 120);
        term58212 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term58212, term58212.getClass(), "compiler", null);
        setField(term58212, term58212.getClass(), "validator", null);
        setField(term58212, term58212.getClass(), "reverseInterpreter", null);
        setField(term58212, term58212.getClass(), "typeRegistry", null);
        setField(term58212, term58212.getClass(), "topScope", null);
        setField(term58212, term58212.getClass(), "scopeCreator", null);
        setField(term58212, term58212.getClass(), "reportMissingOverride", null);
        setField(term58212, term58212.getClass(), "reportUnknownTypes", null);
        setBooleanField(term58212, term58212.getClass(), "reportMissingProperties", false);
        setField(term58212, term58212.getClass(), "inferJSDocInfo", null);
        setIntField(term58212, term58212.getClass(), "typedCount", 0);
        setIntField(term58212, term58212.getClass(), "nullCount", 0);
        setIntField(term58212, term58212.getClass(), "unknownCount", 0);
        setBooleanField(term58212, term58212.getClass(), "inExterns", false);
        setIntField(term58212, term58212.getClass(), "noTypeCheckSection", 0);
        term58213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58213, term58213.getClass(), "type", 120);
        setField(term58213, term58213.getClass(), "next", null);
        setField(term58213, term58213.getClass(), "first", null);
        setField(term58213, term58213.getClass(), "last", null);
        setField(term58213, term58213.getClass(), "propListHead", null);
        setIntField(term58213, term58213.getClass(), "sourcePosition", 0);
        setField(term58213, term58213.getClass(), "jsType", null);
        setField(term58213, term58213.getClass(), "parent", null);
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
        args[1] = null;
        args[2] = term58015;
        Object retValue = callMethod(klass, "visitName", argTypes, term57945, args);
        assertTrue(recursiveEquals(term57945, term58212));
        assertTrue(recursiveEquals(term58015, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


