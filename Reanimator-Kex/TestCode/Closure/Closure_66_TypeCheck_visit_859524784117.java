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

public class TypeCheck_visit_859524784117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32304;
     Object term32374;
     Object term32555;
     Object term32556;

    public TypeCheck_visit_859524784117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32304 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term32374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32374, term32374.getClass(), "type", 124);
        term32555 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term32555, term32555.getClass(), "compiler", null);
        setField(term32555, term32555.getClass(), "validator", null);
        setField(term32555, term32555.getClass(), "reverseInterpreter", null);
        setField(term32555, term32555.getClass(), "typeRegistry", null);
        setField(term32555, term32555.getClass(), "topScope", null);
        setField(term32555, term32555.getClass(), "scopeCreator", null);
        setField(term32555, term32555.getClass(), "reportMissingOverride", null);
        setField(term32555, term32555.getClass(), "reportUnknownTypes", null);
        setBooleanField(term32555, term32555.getClass(), "reportMissingProperties", false);
        setField(term32555, term32555.getClass(), "inferJSDocInfo", null);
        setIntField(term32555, term32555.getClass(), "typedCount", 0);
        setIntField(term32555, term32555.getClass(), "nullCount", 0);
        setIntField(term32555, term32555.getClass(), "unknownCount", 0);
        setBooleanField(term32555, term32555.getClass(), "inExterns", false);
        setIntField(term32555, term32555.getClass(), "noTypeCheckSection", 0);
        term32556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32556, term32556.getClass(), "type", 124);
        setField(term32556, term32556.getClass(), "next", null);
        setField(term32556, term32556.getClass(), "first", null);
        setField(term32556, term32556.getClass(), "last", null);
        setField(term32556, term32556.getClass(), "propListHead", null);
        setIntField(term32556, term32556.getClass(), "sourcePosition", 0);
        setField(term32556, term32556.getClass(), "jsType", null);
        setField(term32556, term32556.getClass(), "parent", null);
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
        args[1] = term32374;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term32304, args);
        assertTrue(recursiveEquals(term32304, term32555));
        assertTrue(recursiveEquals(term32374, null));
    }

};


