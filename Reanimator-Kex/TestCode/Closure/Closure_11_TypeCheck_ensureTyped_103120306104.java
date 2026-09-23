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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TypeCheck_ensureTyped_103120306104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12880;

    public TypeCheck_ensureTyped_103120306104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12880 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term12880, term12880.getClass(), "compiler", null);
        setField(term12880, term12880.getClass(), "validator", null);
        setField(term12880, term12880.getClass(), "reverseInterpreter", null);
        setField(term12880, term12880.getClass(), "typeRegistry", null);
        setField(term12880, term12880.getClass(), "topScope", null);
        setField(term12880, term12880.getClass(), "scopeCreator", null);
        setField(term12880, term12880.getClass(), "reportMissingOverride", null);
        setField(term12880, term12880.getClass(), "reportUnknownTypes", null);
        setBooleanField(term12880, term12880.getClass(), "reportMissingProperties", false);
        setField(term12880, term12880.getClass(), "inferJSDocInfo", null);
        setIntField(term12880, term12880.getClass(), "typedCount", 0);
        setIntField(term12880, term12880.getClass(), "nullCount", 0);
        setIntField(term12880, term12880.getClass(), "unknownCount", 0);
        setBooleanField(term12880, term12880.getClass(), "inExterns", false);
        setIntField(term12880, term12880.getClass(), "noTypeCheckSection", 0);
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
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "ensureTyped", argTypes, term12880, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


