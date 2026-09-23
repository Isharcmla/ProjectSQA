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

public class TypeCheck_visit_859524784398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97866;
     Object term97936;
     Object term97953;
     Object term97954;

    public TypeCheck_visit_859524784398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97866 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term97936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term97936, term97936.getClass(), "type", 49);
        term97953 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term97953, term97953.getClass(), "compiler", null);
        setField(term97953, term97953.getClass(), "validator", null);
        setField(term97953, term97953.getClass(), "reverseInterpreter", null);
        setField(term97953, term97953.getClass(), "typeRegistry", null);
        setField(term97953, term97953.getClass(), "topScope", null);
        setField(term97953, term97953.getClass(), "scopeCreator", null);
        setField(term97953, term97953.getClass(), "reportMissingOverride", null);
        setBooleanField(term97953, term97953.getClass(), "reportUnknownTypes", false);
        setBooleanField(term97953, term97953.getClass(), "reportMissingProperties", false);
        setField(term97953, term97953.getClass(), "inferJSDocInfo", null);
        setIntField(term97953, term97953.getClass(), "typedCount", 0);
        setIntField(term97953, term97953.getClass(), "nullCount", 0);
        setIntField(term97953, term97953.getClass(), "unknownCount", 0);
        setBooleanField(term97953, term97953.getClass(), "inExterns", false);
        setIntField(term97953, term97953.getClass(), "noTypeCheckSection", 0);
        setField(term97953, term97953.getClass(), "editDistance", null);
        term97954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term97954, term97954.getClass(), "type", 49);
        setField(term97954, term97954.getClass(), "next", null);
        setField(term97954, term97954.getClass(), "first", null);
        setField(term97954, term97954.getClass(), "last", null);
        setField(term97954, term97954.getClass(), "propListHead", null);
        setIntField(term97954, term97954.getClass(), "sourcePosition", 0);
        setField(term97954, term97954.getClass(), "jsType", null);
        setField(term97954, term97954.getClass(), "parent", null);
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
        args[1] = term97936;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term97866, args);
        assertTrue(recursiveEquals(term97866, term97953));
        assertTrue(recursiveEquals(term97936, null));
    }

};


