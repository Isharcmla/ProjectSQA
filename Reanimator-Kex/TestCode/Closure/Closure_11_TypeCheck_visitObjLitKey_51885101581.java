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

public class TypeCheck_visitObjLitKey_51885101581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4385;

    public TypeCheck_visitObjLitKey_51885101581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4385 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term4385, term4385.getClass(), "compiler", null);
        setField(term4385, term4385.getClass(), "validator", null);
        setField(term4385, term4385.getClass(), "reverseInterpreter", null);
        setField(term4385, term4385.getClass(), "typeRegistry", null);
        setField(term4385, term4385.getClass(), "topScope", null);
        setField(term4385, term4385.getClass(), "scopeCreator", null);
        setField(term4385, term4385.getClass(), "reportMissingOverride", null);
        setField(term4385, term4385.getClass(), "reportUnknownTypes", null);
        setBooleanField(term4385, term4385.getClass(), "reportMissingProperties", false);
        setField(term4385, term4385.getClass(), "inferJSDocInfo", null);
        setIntField(term4385, term4385.getClass(), "typedCount", 0);
        setIntField(term4385, term4385.getClass(), "nullCount", 0);
        setIntField(term4385, term4385.getClass(), "unknownCount", 0);
        setBooleanField(term4385, term4385.getClass(), "inExterns", false);
        setIntField(term4385, term4385.getClass(), "noTypeCheckSection", 0);
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
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "visitObjLitKey", argTypes, term4385, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


