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

public class TypeCheck_visitParameterList_209464734599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9969;

    public TypeCheck_visitParameterList_209464734599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9969 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term9969, term9969.getClass(), "compiler", null);
        setField(term9969, term9969.getClass(), "validator", null);
        setField(term9969, term9969.getClass(), "reverseInterpreter", null);
        setField(term9969, term9969.getClass(), "typeRegistry", null);
        setField(term9969, term9969.getClass(), "topScope", null);
        setField(term9969, term9969.getClass(), "scopeCreator", null);
        setField(term9969, term9969.getClass(), "reportMissingOverride", null);
        setField(term9969, term9969.getClass(), "reportUnknownTypes", null);
        setBooleanField(term9969, term9969.getClass(), "reportMissingProperties", false);
        setField(term9969, term9969.getClass(), "inferJSDocInfo", null);
        setIntField(term9969, term9969.getClass(), "typedCount", 0);
        setIntField(term9969, term9969.getClass(), "nullCount", 0);
        setIntField(term9969, term9969.getClass(), "unknownCount", 0);
        setBooleanField(term9969, term9969.getClass(), "inExterns", false);
        setIntField(term9969, term9969.getClass(), "noTypeCheckSection", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "visitParameterList", argTypes, term9969, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


