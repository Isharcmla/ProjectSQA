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

public class TypeCheck_visit_859524784411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113477;
     Object term113569;
     Object term113588;
     Object term113589;

    public TypeCheck_visit_859524784411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113477 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term113569 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term113569, term113569.getClass(), "type", 147);
        term113588 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term113588, term113588.getClass(), "compiler", null);
        setField(term113588, term113588.getClass(), "validator", null);
        setField(term113588, term113588.getClass(), "reverseInterpreter", null);
        setField(term113588, term113588.getClass(), "typeRegistry", null);
        setField(term113588, term113588.getClass(), "topScope", null);
        setField(term113588, term113588.getClass(), "scopeCreator", null);
        setField(term113588, term113588.getClass(), "reportMissingOverride", null);
        setField(term113588, term113588.getClass(), "reportUnknownTypes", null);
        setBooleanField(term113588, term113588.getClass(), "reportMissingProperties", false);
        setField(term113588, term113588.getClass(), "inferJSDocInfo", null);
        setIntField(term113588, term113588.getClass(), "typedCount", 0);
        setIntField(term113588, term113588.getClass(), "nullCount", 1);
        setIntField(term113588, term113588.getClass(), "unknownCount", 0);
        setBooleanField(term113588, term113588.getClass(), "inExterns", false);
        setIntField(term113588, term113588.getClass(), "noTypeCheckSection", 0);
        term113589 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term113589, term113589.getClass(), "number", 0.0);
        setIntField(term113589, term113589.getClass(), "type", 147);
        setField(term113589, term113589.getClass(), "next", null);
        setField(term113589, term113589.getClass(), "first", null);
        setField(term113589, term113589.getClass(), "last", null);
        setField(term113589, term113589.getClass(), "propListHead", null);
        setIntField(term113589, term113589.getClass(), "sourcePosition", 0);
        setField(term113589, term113589.getClass(), "jsType", null);
        setField(term113589, term113589.getClass(), "parent", null);
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
        args[1] = term113569;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term113477, args);
        assertTrue(recursiveEquals(term113477, term113588));
        assertTrue(recursiveEquals(term113569, null));
    }

};


