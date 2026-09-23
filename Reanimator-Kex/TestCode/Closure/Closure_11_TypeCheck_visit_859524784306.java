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

public class TypeCheck_visit_859524784306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74586;
     Object term74656;
     Object term74672;
     Object term74673;

    public TypeCheck_visit_859524784306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74586 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term74656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74656, term74656.getClass(), "type", 116);
        term74672 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term74672, term74672.getClass(), "compiler", null);
        setField(term74672, term74672.getClass(), "validator", null);
        setField(term74672, term74672.getClass(), "reverseInterpreter", null);
        setField(term74672, term74672.getClass(), "typeRegistry", null);
        setField(term74672, term74672.getClass(), "topScope", null);
        setField(term74672, term74672.getClass(), "scopeCreator", null);
        setField(term74672, term74672.getClass(), "reportMissingOverride", null);
        setField(term74672, term74672.getClass(), "reportUnknownTypes", null);
        setBooleanField(term74672, term74672.getClass(), "reportMissingProperties", false);
        setField(term74672, term74672.getClass(), "inferJSDocInfo", null);
        setIntField(term74672, term74672.getClass(), "typedCount", 0);
        setIntField(term74672, term74672.getClass(), "nullCount", 0);
        setIntField(term74672, term74672.getClass(), "unknownCount", 0);
        setBooleanField(term74672, term74672.getClass(), "inExterns", false);
        setIntField(term74672, term74672.getClass(), "noTypeCheckSection", 0);
        term74673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74673, term74673.getClass(), "type", 116);
        setField(term74673, term74673.getClass(), "next", null);
        setField(term74673, term74673.getClass(), "first", null);
        setField(term74673, term74673.getClass(), "last", null);
        setField(term74673, term74673.getClass(), "propListHead", null);
        setIntField(term74673, term74673.getClass(), "sourcePosition", 0);
        setField(term74673, term74673.getClass(), "jsType", null);
        setField(term74673, term74673.getClass(), "parent", null);
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
        args[1] = term74656;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term74586, args);
        assertTrue(recursiveEquals(term74586, term74672));
        assertTrue(recursiveEquals(term74656, null));
    }

};


