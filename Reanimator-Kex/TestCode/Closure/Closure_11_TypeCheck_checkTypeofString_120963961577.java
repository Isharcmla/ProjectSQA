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

public class TypeCheck_checkTypeofString_120963961577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3072;

    public TypeCheck_checkTypeofString_120963961577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3072 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term3072, term3072.getClass(), "compiler", null);
        setField(term3072, term3072.getClass(), "validator", null);
        setField(term3072, term3072.getClass(), "reverseInterpreter", null);
        setField(term3072, term3072.getClass(), "typeRegistry", null);
        setField(term3072, term3072.getClass(), "topScope", null);
        setField(term3072, term3072.getClass(), "scopeCreator", null);
        setField(term3072, term3072.getClass(), "reportMissingOverride", null);
        setField(term3072, term3072.getClass(), "reportUnknownTypes", null);
        setBooleanField(term3072, term3072.getClass(), "reportMissingProperties", false);
        setField(term3072, term3072.getClass(), "inferJSDocInfo", null);
        setIntField(term3072, term3072.getClass(), "typedCount", 0);
        setIntField(term3072, term3072.getClass(), "nullCount", 0);
        setIntField(term3072, term3072.getClass(), "unknownCount", 0);
        setBooleanField(term3072, term3072.getClass(), "inExterns", false);
        setIntField(term3072, term3072.getClass(), "noTypeCheckSection", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "checkTypeofString", argTypes, term3072, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


