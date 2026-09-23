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

public class TypeCheck_visit_859524784666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179776;
     Object term179868;
     Object term180147;
     Object term180148;

    public TypeCheck_visit_859524784666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179776 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term179868 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term179868, term179868.getClass(), "type", 83);
        term180147 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term180147, term180147.getClass(), "compiler", null);
        setField(term180147, term180147.getClass(), "validator", null);
        setField(term180147, term180147.getClass(), "reverseInterpreter", null);
        setField(term180147, term180147.getClass(), "typeRegistry", null);
        setField(term180147, term180147.getClass(), "topScope", null);
        setField(term180147, term180147.getClass(), "scopeCreator", null);
        setField(term180147, term180147.getClass(), "reportMissingOverride", null);
        setField(term180147, term180147.getClass(), "reportUnknownTypes", null);
        setBooleanField(term180147, term180147.getClass(), "reportMissingProperties", false);
        setField(term180147, term180147.getClass(), "inferJSDocInfo", null);
        setIntField(term180147, term180147.getClass(), "typedCount", 0);
        setIntField(term180147, term180147.getClass(), "nullCount", 0);
        setIntField(term180147, term180147.getClass(), "unknownCount", 0);
        setBooleanField(term180147, term180147.getClass(), "inExterns", false);
        setIntField(term180147, term180147.getClass(), "noTypeCheckSection", 0);
        term180148 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term180148, term180148.getClass(), "str", null);
        setIntField(term180148, term180148.getClass(), "type", 83);
        setField(term180148, term180148.getClass(), "next", null);
        setField(term180148, term180148.getClass(), "first", null);
        setField(term180148, term180148.getClass(), "last", null);
        setField(term180148, term180148.getClass(), "propListHead", null);
        setIntField(term180148, term180148.getClass(), "sourcePosition", 0);
        setField(term180148, term180148.getClass(), "jsType", null);
        setField(term180148, term180148.getClass(), "parent", null);
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
        args[1] = term179868;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term179776, args);
        assertTrue(recursiveEquals(term179776, term180147));
        assertTrue(recursiveEquals(term179868, null));
    }

};


