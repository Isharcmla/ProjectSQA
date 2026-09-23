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

public class TypeCheck_checkPropertyAccessHelper_172922747094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7647;

    public TypeCheck_checkPropertyAccessHelper_172922747094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7647 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term7647, term7647.getClass(), "compiler", null);
        setField(term7647, term7647.getClass(), "validator", null);
        setField(term7647, term7647.getClass(), "reverseInterpreter", null);
        setField(term7647, term7647.getClass(), "typeRegistry", null);
        setField(term7647, term7647.getClass(), "topScope", null);
        setField(term7647, term7647.getClass(), "scopeCreator", null);
        setField(term7647, term7647.getClass(), "reportMissingOverride", null);
        setBooleanField(term7647, term7647.getClass(), "reportUnknownTypes", false);
        setBooleanField(term7647, term7647.getClass(), "reportMissingProperties", false);
        setField(term7647, term7647.getClass(), "inferJSDocInfo", null);
        setIntField(term7647, term7647.getClass(), "typedCount", 0);
        setIntField(term7647, term7647.getClass(), "nullCount", 0);
        setIntField(term7647, term7647.getClass(), "unknownCount", 0);
        setBooleanField(term7647, term7647.getClass(), "inExterns", false);
        setIntField(term7647, term7647.getClass(), "noTypeCheckSection", 0);
        setField(term7647, term7647.getClass(), "editDistance", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        try {
            callMethod(klass, "checkPropertyAccessHelper", argTypes, term7647, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


