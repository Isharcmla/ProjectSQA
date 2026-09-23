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

public class TypeCheck_visit_859524784161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80476;
     Object term80546;
     Object term81542;
     Object term81543;

    public TypeCheck_visit_859524784161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80476 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term80546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term80546, term80546.getClass(), "type", 152);
        term81542 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term81542, term81542.getClass(), "compiler", null);
        setField(term81542, term81542.getClass(), "validator", null);
        setField(term81542, term81542.getClass(), "reverseInterpreter", null);
        setField(term81542, term81542.getClass(), "typeRegistry", null);
        setField(term81542, term81542.getClass(), "topScope", null);
        setField(term81542, term81542.getClass(), "scopeCreator", null);
        setField(term81542, term81542.getClass(), "reportMissingOverride", null);
        setField(term81542, term81542.getClass(), "reportUnknownTypes", null);
        setBooleanField(term81542, term81542.getClass(), "reportMissingProperties", false);
        setField(term81542, term81542.getClass(), "inferJSDocInfo", null);
        setIntField(term81542, term81542.getClass(), "typedCount", 0);
        setIntField(term81542, term81542.getClass(), "nullCount", 0);
        setIntField(term81542, term81542.getClass(), "unknownCount", 0);
        setBooleanField(term81542, term81542.getClass(), "inExterns", false);
        setIntField(term81542, term81542.getClass(), "noTypeCheckSection", 0);
        term81543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term81543, term81543.getClass(), "type", 152);
        setField(term81543, term81543.getClass(), "next", null);
        setField(term81543, term81543.getClass(), "first", null);
        setField(term81543, term81543.getClass(), "last", null);
        setField(term81543, term81543.getClass(), "propListHead", null);
        setIntField(term81543, term81543.getClass(), "sourcePosition", 0);
        setField(term81543, term81543.getClass(), "jsType", null);
        setField(term81543, term81543.getClass(), "parent", null);
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
        args[1] = term80546;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term80476, args);
        assertTrue(recursiveEquals(term80476, term81542));
        assertTrue(recursiveEquals(term80546, null));
    }

};


