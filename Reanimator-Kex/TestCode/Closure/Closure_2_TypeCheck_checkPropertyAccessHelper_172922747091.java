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

public class TypeCheck_checkPropertyAccessHelper_172922747091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7857;

    public TypeCheck_checkPropertyAccessHelper_172922747091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7857 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term7857, term7857.getClass(), "compiler", null);
        setField(term7857, term7857.getClass(), "validator", null);
        setField(term7857, term7857.getClass(), "reverseInterpreter", null);
        setField(term7857, term7857.getClass(), "typeRegistry", null);
        setField(term7857, term7857.getClass(), "topScope", null);
        setField(term7857, term7857.getClass(), "scopeCreator", null);
        setField(term7857, term7857.getClass(), "reportMissingOverride", null);
        setField(term7857, term7857.getClass(), "reportUnknownTypes", null);
        setBooleanField(term7857, term7857.getClass(), "reportMissingProperties", false);
        setField(term7857, term7857.getClass(), "inferJSDocInfo", null);
        setIntField(term7857, term7857.getClass(), "typedCount", 0);
        setIntField(term7857, term7857.getClass(), "nullCount", 0);
        setIntField(term7857, term7857.getClass(), "unknownCount", 0);
        setBooleanField(term7857, term7857.getClass(), "inExterns", false);
        setIntField(term7857, term7857.getClass(), "noTypeCheckSection", 0);
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
            callMethod(klass, "checkPropertyAccessHelper", argTypes, term7857, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


