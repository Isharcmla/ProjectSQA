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

public class TypeCheck_visit_859524784214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54554;
     Object term54624;
     Object term54640;
     Object term54641;

    public TypeCheck_visit_859524784214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54554 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term54624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54624, term54624.getClass(), "type", 126);
        term54640 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term54640, term54640.getClass(), "compiler", null);
        setField(term54640, term54640.getClass(), "validator", null);
        setField(term54640, term54640.getClass(), "reverseInterpreter", null);
        setField(term54640, term54640.getClass(), "typeRegistry", null);
        setField(term54640, term54640.getClass(), "topScope", null);
        setField(term54640, term54640.getClass(), "scopeCreator", null);
        setField(term54640, term54640.getClass(), "reportMissingOverride", null);
        setField(term54640, term54640.getClass(), "reportUnknownTypes", null);
        setBooleanField(term54640, term54640.getClass(), "reportMissingProperties", false);
        setField(term54640, term54640.getClass(), "inferJSDocInfo", null);
        setIntField(term54640, term54640.getClass(), "typedCount", 0);
        setIntField(term54640, term54640.getClass(), "nullCount", 0);
        setIntField(term54640, term54640.getClass(), "unknownCount", 0);
        setBooleanField(term54640, term54640.getClass(), "inExterns", false);
        setIntField(term54640, term54640.getClass(), "noTypeCheckSection", 0);
        term54641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54641, term54641.getClass(), "type", 126);
        setField(term54641, term54641.getClass(), "next", null);
        setField(term54641, term54641.getClass(), "first", null);
        setField(term54641, term54641.getClass(), "last", null);
        setField(term54641, term54641.getClass(), "propListHead", null);
        setIntField(term54641, term54641.getClass(), "sourcePosition", 0);
        setField(term54641, term54641.getClass(), "jsType", null);
        setField(term54641, term54641.getClass(), "parent", null);
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
        args[1] = term54624;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term54554, args);
        assertTrue(recursiveEquals(term54554, term54640));
        assertTrue(recursiveEquals(term54624, null));
    }

};


