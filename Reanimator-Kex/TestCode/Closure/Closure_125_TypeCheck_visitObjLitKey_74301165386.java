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

public class TypeCheck_visitObjLitKey_74301165386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4635;

    public TypeCheck_visitObjLitKey_74301165386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4635 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term4635, term4635.getClass(), "compiler", null);
        setField(term4635, term4635.getClass(), "validator", null);
        setField(term4635, term4635.getClass(), "reverseInterpreter", null);
        setField(term4635, term4635.getClass(), "typeRegistry", null);
        setField(term4635, term4635.getClass(), "topScope", null);
        setField(term4635, term4635.getClass(), "scopeCreator", null);
        setField(term4635, term4635.getClass(), "reportMissingOverride", null);
        setBooleanField(term4635, term4635.getClass(), "reportUnknownTypes", false);
        setBooleanField(term4635, term4635.getClass(), "reportMissingProperties", false);
        setField(term4635, term4635.getClass(), "inferJSDocInfo", null);
        setIntField(term4635, term4635.getClass(), "typedCount", 0);
        setIntField(term4635, term4635.getClass(), "nullCount", 0);
        setIntField(term4635, term4635.getClass(), "unknownCount", 0);
        setBooleanField(term4635, term4635.getClass(), "inExterns", false);
        setIntField(term4635, term4635.getClass(), "noTypeCheckSection", 0);
        setField(term4635, term4635.getClass(), "editDistance", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        try {
            callMethod(klass, "visitObjLitKey", argTypes, term4635, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


