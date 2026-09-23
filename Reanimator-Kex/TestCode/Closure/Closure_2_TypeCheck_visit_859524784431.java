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

public class TypeCheck_visit_859524784431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106324;
     Object term106394;
     Object term106929;
     Object term106930;

    public TypeCheck_visit_859524784431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106324 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term106394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106394, term106394.getClass(), "type", 114);
        term106929 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term106929, term106929.getClass(), "compiler", null);
        setField(term106929, term106929.getClass(), "validator", null);
        setField(term106929, term106929.getClass(), "reverseInterpreter", null);
        setField(term106929, term106929.getClass(), "typeRegistry", null);
        setField(term106929, term106929.getClass(), "topScope", null);
        setField(term106929, term106929.getClass(), "scopeCreator", null);
        setField(term106929, term106929.getClass(), "reportMissingOverride", null);
        setField(term106929, term106929.getClass(), "reportUnknownTypes", null);
        setBooleanField(term106929, term106929.getClass(), "reportMissingProperties", false);
        setField(term106929, term106929.getClass(), "inferJSDocInfo", null);
        setIntField(term106929, term106929.getClass(), "typedCount", 0);
        setIntField(term106929, term106929.getClass(), "nullCount", 0);
        setIntField(term106929, term106929.getClass(), "unknownCount", 0);
        setBooleanField(term106929, term106929.getClass(), "inExterns", false);
        setIntField(term106929, term106929.getClass(), "noTypeCheckSection", 0);
        term106930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106930, term106930.getClass(), "type", 114);
        setField(term106930, term106930.getClass(), "next", null);
        setField(term106930, term106930.getClass(), "first", null);
        setField(term106930, term106930.getClass(), "last", null);
        setField(term106930, term106930.getClass(), "propListHead", null);
        setIntField(term106930, term106930.getClass(), "sourcePosition", 0);
        setField(term106930, term106930.getClass(), "jsType", null);
        setField(term106930, term106930.getClass(), "parent", null);
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
        args[1] = term106394;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term106324, args);
        assertTrue(recursiveEquals(term106324, term106929));
        assertTrue(recursiveEquals(term106394, null));
    }

};


