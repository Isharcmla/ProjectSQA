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

public class TypeCheck_visit_859524784167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47306;
     Object term47376;
     Object term47392;
     Object term47393;

    public TypeCheck_visit_859524784167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47306 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term47376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47376, term47376.getClass(), "type", 152);
        term47392 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term47392, term47392.getClass(), "compiler", null);
        setField(term47392, term47392.getClass(), "validator", null);
        setField(term47392, term47392.getClass(), "reverseInterpreter", null);
        setField(term47392, term47392.getClass(), "typeRegistry", null);
        setField(term47392, term47392.getClass(), "topScope", null);
        setField(term47392, term47392.getClass(), "scopeCreator", null);
        setField(term47392, term47392.getClass(), "reportMissingOverride", null);
        setField(term47392, term47392.getClass(), "reportUnknownTypes", null);
        setBooleanField(term47392, term47392.getClass(), "reportMissingProperties", false);
        setField(term47392, term47392.getClass(), "inferJSDocInfo", null);
        setIntField(term47392, term47392.getClass(), "typedCount", 0);
        setIntField(term47392, term47392.getClass(), "nullCount", 0);
        setIntField(term47392, term47392.getClass(), "unknownCount", 0);
        setBooleanField(term47392, term47392.getClass(), "inExterns", false);
        setIntField(term47392, term47392.getClass(), "noTypeCheckSection", 0);
        term47393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47393, term47393.getClass(), "type", 152);
        setField(term47393, term47393.getClass(), "next", null);
        setField(term47393, term47393.getClass(), "first", null);
        setField(term47393, term47393.getClass(), "last", null);
        setField(term47393, term47393.getClass(), "propListHead", null);
        setIntField(term47393, term47393.getClass(), "sourcePosition", 0);
        setField(term47393, term47393.getClass(), "jsType", null);
        setField(term47393, term47393.getClass(), "parent", null);
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
        args[1] = term47376;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term47306, args);
        assertTrue(recursiveEquals(term47306, term47392));
        assertTrue(recursiveEquals(term47376, null));
    }

};


