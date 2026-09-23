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

public class TypeCheck_ensureTyped_103120306154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36615;
     Object term36685;
     Object term36730;
     Object term36731;

    public TypeCheck_ensureTyped_103120306154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36615 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term36685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term36730 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term36730, term36730.getClass(), "compiler", null);
        setField(term36730, term36730.getClass(), "validator", null);
        setField(term36730, term36730.getClass(), "reverseInterpreter", null);
        setField(term36730, term36730.getClass(), "typeRegistry", null);
        setField(term36730, term36730.getClass(), "topScope", null);
        setField(term36730, term36730.getClass(), "scopeCreator", null);
        setField(term36730, term36730.getClass(), "reportMissingOverride", null);
        setBooleanField(term36730, term36730.getClass(), "reportUnknownTypes", false);
        setBooleanField(term36730, term36730.getClass(), "reportMissingProperties", false);
        setField(term36730, term36730.getClass(), "inferJSDocInfo", null);
        setIntField(term36730, term36730.getClass(), "typedCount", 0);
        setIntField(term36730, term36730.getClass(), "nullCount", 0);
        setIntField(term36730, term36730.getClass(), "unknownCount", 0);
        setBooleanField(term36730, term36730.getClass(), "inExterns", false);
        setIntField(term36730, term36730.getClass(), "noTypeCheckSection", 0);
        setField(term36730, term36730.getClass(), "editDistance", null);
        term36731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36731, term36731.getClass(), "type", 0);
        setField(term36731, term36731.getClass(), "next", null);
        setField(term36731, term36731.getClass(), "first", null);
        setField(term36731, term36731.getClass(), "last", null);
        setField(term36731, term36731.getClass(), "propListHead", null);
        setIntField(term36731, term36731.getClass(), "sourcePosition", 0);
        setField(term36731, term36731.getClass(), "jsType", null);
        setField(term36731, term36731.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term36685;
        args[2] = null;
        callMethod(klass, "ensureTyped", argTypes, term36615, args);
        assertTrue(recursiveEquals(term36615, term36730));
        assertTrue(recursiveEquals(term36685, null));
    }

};


