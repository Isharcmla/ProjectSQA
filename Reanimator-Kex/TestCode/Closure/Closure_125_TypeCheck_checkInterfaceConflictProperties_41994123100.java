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

public class TypeCheck_checkInterfaceConflictProperties_41994123100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8418;

    public TypeCheck_checkInterfaceConflictProperties_41994123100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8418 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term8418, term8418.getClass(), "compiler", null);
        setField(term8418, term8418.getClass(), "validator", null);
        setField(term8418, term8418.getClass(), "reverseInterpreter", null);
        setField(term8418, term8418.getClass(), "typeRegistry", null);
        setField(term8418, term8418.getClass(), "topScope", null);
        setField(term8418, term8418.getClass(), "scopeCreator", null);
        setField(term8418, term8418.getClass(), "reportMissingOverride", null);
        setBooleanField(term8418, term8418.getClass(), "reportUnknownTypes", false);
        setBooleanField(term8418, term8418.getClass(), "reportMissingProperties", false);
        setField(term8418, term8418.getClass(), "inferJSDocInfo", null);
        setIntField(term8418, term8418.getClass(), "typedCount", 0);
        setIntField(term8418, term8418.getClass(), "nullCount", 0);
        setIntField(term8418, term8418.getClass(), "unknownCount", 0);
        setBooleanField(term8418, term8418.getClass(), "inExterns", false);
        setIntField(term8418, term8418.getClass(), "noTypeCheckSection", 0);
        setField(term8418, term8418.getClass(), "editDistance", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.util.HashMap");
        argTypes[4] = Class.forName("java.util.HashMap");
        argTypes[5] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "checkInterfaceConflictProperties", argTypes, term8418, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


