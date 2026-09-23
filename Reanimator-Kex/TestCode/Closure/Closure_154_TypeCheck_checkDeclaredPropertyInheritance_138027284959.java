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

public class TypeCheck_checkDeclaredPropertyInheritance_138027284959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4690;

    public TypeCheck_checkDeclaredPropertyInheritance_138027284959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4690 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term4690, term4690.getClass(), "compiler", null);
        setField(term4690, term4690.getClass(), "validator", null);
        setField(term4690, term4690.getClass(), "reverseInterpreter", null);
        setField(term4690, term4690.getClass(), "typeRegistry", null);
        setField(term4690, term4690.getClass(), "topScope", null);
        setField(term4690, term4690.getClass(), "scopeCreator", null);
        setField(term4690, term4690.getClass(), "reportMissingOverride", null);
        setField(term4690, term4690.getClass(), "reportUnknownTypes", null);
        setBooleanField(term4690, term4690.getClass(), "reportMissingProperties", false);
        setField(term4690, term4690.getClass(), "inferJSDocInfo", null);
        setIntField(term4690, term4690.getClass(), "typedCount", 0);
        setIntField(term4690, term4690.getClass(), "nullCount", 0);
        setIntField(term4690, term4690.getClass(), "unknownCount", 0);
        setBooleanField(term4690, term4690.getClass(), "inExterns", false);
        setIntField(term4690, term4690.getClass(), "noTypeCheckSection", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[5] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "checkDeclaredPropertyInheritance", argTypes, term4690, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


