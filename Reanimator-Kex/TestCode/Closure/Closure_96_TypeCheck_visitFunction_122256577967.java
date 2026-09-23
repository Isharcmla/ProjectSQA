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

public class TypeCheck_visitFunction_122256577967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16742;

    public TypeCheck_visitFunction_122256577967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16742 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term16742, term16742.getClass(), "compiler", null);
        setField(term16742, term16742.getClass(), "validator", null);
        setField(term16742, term16742.getClass(), "reverseInterpreter", null);
        setField(term16742, term16742.getClass(), "typeRegistry", null);
        setField(term16742, term16742.getClass(), "topScope", null);
        setField(term16742, term16742.getClass(), "scopeCreator", null);
        setField(term16742, term16742.getClass(), "reportMissingOverride", null);
        setField(term16742, term16742.getClass(), "reportUnknownTypes", null);
        setBooleanField(term16742, term16742.getClass(), "reportMissingProperties", false);
        setField(term16742, term16742.getClass(), "inferJSDocInfo", null);
        setIntField(term16742, term16742.getClass(), "typedCount", 0);
        setIntField(term16742, term16742.getClass(), "nullCount", 0);
        setIntField(term16742, term16742.getClass(), "unknownCount", 0);
        setBooleanField(term16742, term16742.getClass(), "inExterns", false);
        setIntField(term16742, term16742.getClass(), "noTypeCheckSection", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "visitFunction", argTypes, term16742, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


