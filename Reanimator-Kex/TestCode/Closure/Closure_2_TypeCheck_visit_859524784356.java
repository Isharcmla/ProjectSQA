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

public class TypeCheck_visit_859524784356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85645;
     Object term85715;
     Object term86062;
     Object term86063;

    public TypeCheck_visit_859524784356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85645 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term85715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term85715, term85715.getClass(), "type", 116);
        term86062 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term86062, term86062.getClass(), "compiler", null);
        setField(term86062, term86062.getClass(), "validator", null);
        setField(term86062, term86062.getClass(), "reverseInterpreter", null);
        setField(term86062, term86062.getClass(), "typeRegistry", null);
        setField(term86062, term86062.getClass(), "topScope", null);
        setField(term86062, term86062.getClass(), "scopeCreator", null);
        setField(term86062, term86062.getClass(), "reportMissingOverride", null);
        setField(term86062, term86062.getClass(), "reportUnknownTypes", null);
        setBooleanField(term86062, term86062.getClass(), "reportMissingProperties", false);
        setField(term86062, term86062.getClass(), "inferJSDocInfo", null);
        setIntField(term86062, term86062.getClass(), "typedCount", 0);
        setIntField(term86062, term86062.getClass(), "nullCount", 0);
        setIntField(term86062, term86062.getClass(), "unknownCount", 0);
        setBooleanField(term86062, term86062.getClass(), "inExterns", false);
        setIntField(term86062, term86062.getClass(), "noTypeCheckSection", 0);
        term86063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86063, term86063.getClass(), "type", 116);
        setField(term86063, term86063.getClass(), "next", null);
        setField(term86063, term86063.getClass(), "first", null);
        setField(term86063, term86063.getClass(), "last", null);
        setField(term86063, term86063.getClass(), "propListHead", null);
        setIntField(term86063, term86063.getClass(), "sourcePosition", 0);
        setField(term86063, term86063.getClass(), "jsType", null);
        setField(term86063, term86063.getClass(), "parent", null);
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
        args[1] = term85715;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term85645, args);
        assertTrue(recursiveEquals(term85645, term86062));
        assertTrue(recursiveEquals(term85715, null));
    }

};


