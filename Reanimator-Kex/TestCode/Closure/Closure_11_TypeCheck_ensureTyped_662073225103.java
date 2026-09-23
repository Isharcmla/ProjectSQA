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

public class TypeCheck_ensureTyped_662073225103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12705;

    public TypeCheck_ensureTyped_662073225103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12705 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term12705, term12705.getClass(), "compiler", null);
        setField(term12705, term12705.getClass(), "validator", null);
        setField(term12705, term12705.getClass(), "reverseInterpreter", null);
        setField(term12705, term12705.getClass(), "typeRegistry", null);
        setField(term12705, term12705.getClass(), "topScope", null);
        setField(term12705, term12705.getClass(), "scopeCreator", null);
        setField(term12705, term12705.getClass(), "reportMissingOverride", null);
        setField(term12705, term12705.getClass(), "reportUnknownTypes", null);
        setBooleanField(term12705, term12705.getClass(), "reportMissingProperties", false);
        setField(term12705, term12705.getClass(), "inferJSDocInfo", null);
        setIntField(term12705, term12705.getClass(), "typedCount", 0);
        setIntField(term12705, term12705.getClass(), "nullCount", 0);
        setIntField(term12705, term12705.getClass(), "unknownCount", 0);
        setBooleanField(term12705, term12705.getClass(), "inExterns", false);
        setIntField(term12705, term12705.getClass(), "noTypeCheckSection", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "ensureTyped", argTypes, term12705, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


