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

public class TypeCheck_visit_859524784540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136774;
     Object term136866;
     Object term136882;
     Object term136883;

    public TypeCheck_visit_859524784540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136774 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term136866 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term136866, term136866.getClass(), "type", 108);
        term136882 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term136882, term136882.getClass(), "compiler", null);
        setField(term136882, term136882.getClass(), "validator", null);
        setField(term136882, term136882.getClass(), "reverseInterpreter", null);
        setField(term136882, term136882.getClass(), "typeRegistry", null);
        setField(term136882, term136882.getClass(), "topScope", null);
        setField(term136882, term136882.getClass(), "scopeCreator", null);
        setField(term136882, term136882.getClass(), "reportMissingOverride", null);
        setField(term136882, term136882.getClass(), "reportUnknownTypes", null);
        setBooleanField(term136882, term136882.getClass(), "reportMissingProperties", false);
        setField(term136882, term136882.getClass(), "inferJSDocInfo", null);
        setIntField(term136882, term136882.getClass(), "typedCount", 0);
        setIntField(term136882, term136882.getClass(), "nullCount", 0);
        setIntField(term136882, term136882.getClass(), "unknownCount", 0);
        setBooleanField(term136882, term136882.getClass(), "inExterns", false);
        setIntField(term136882, term136882.getClass(), "noTypeCheckSection", 0);
        term136883 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term136883, term136883.getClass(), "str", null);
        setIntField(term136883, term136883.getClass(), "type", 108);
        setField(term136883, term136883.getClass(), "next", null);
        setField(term136883, term136883.getClass(), "first", null);
        setField(term136883, term136883.getClass(), "last", null);
        setField(term136883, term136883.getClass(), "propListHead", null);
        setIntField(term136883, term136883.getClass(), "sourcePosition", 0);
        setField(term136883, term136883.getClass(), "jsType", null);
        setField(term136883, term136883.getClass(), "parent", null);
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
        args[1] = term136866;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term136774, args);
        assertTrue(recursiveEquals(term136774, term136882));
        assertTrue(recursiveEquals(term136866, null));
    }

};


