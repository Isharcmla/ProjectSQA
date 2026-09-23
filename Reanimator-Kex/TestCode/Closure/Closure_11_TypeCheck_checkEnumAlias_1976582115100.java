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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class TypeCheck_checkEnumAlias_1976582115100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10757;
     Object term24209;

    public TypeCheck_checkEnumAlias_1976582115100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10757 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term10757, term10757.getClass(), "compiler", null);
        setField(term10757, term10757.getClass(), "validator", null);
        setField(term10757, term10757.getClass(), "reverseInterpreter", null);
        setField(term10757, term10757.getClass(), "typeRegistry", null);
        setField(term10757, term10757.getClass(), "topScope", null);
        setField(term10757, term10757.getClass(), "scopeCreator", null);
        setField(term10757, term10757.getClass(), "reportMissingOverride", null);
        setField(term10757, term10757.getClass(), "reportUnknownTypes", null);
        setBooleanField(term10757, term10757.getClass(), "reportMissingProperties", false);
        setField(term10757, term10757.getClass(), "inferJSDocInfo", null);
        setIntField(term10757, term10757.getClass(), "typedCount", 0);
        setIntField(term10757, term10757.getClass(), "nullCount", 0);
        setIntField(term10757, term10757.getClass(), "unknownCount", 0);
        setBooleanField(term10757, term10757.getClass(), "inExterns", false);
        setIntField(term10757, term10757.getClass(), "noTypeCheckSection", 0);
        term24209 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term24209, term24209.getClass(), "compiler", null);
        setField(term24209, term24209.getClass(), "validator", null);
        setField(term24209, term24209.getClass(), "reverseInterpreter", null);
        setField(term24209, term24209.getClass(), "typeRegistry", null);
        setField(term24209, term24209.getClass(), "topScope", null);
        setField(term24209, term24209.getClass(), "scopeCreator", null);
        setField(term24209, term24209.getClass(), "reportMissingOverride", null);
        setField(term24209, term24209.getClass(), "reportUnknownTypes", null);
        setBooleanField(term24209, term24209.getClass(), "reportMissingProperties", false);
        setField(term24209, term24209.getClass(), "inferJSDocInfo", null);
        setIntField(term24209, term24209.getClass(), "typedCount", 0);
        setIntField(term24209, term24209.getClass(), "nullCount", 0);
        setIntField(term24209, term24209.getClass(), "unknownCount", 0);
        setBooleanField(term24209, term24209.getClass(), "inExterns", false);
        setIntField(term24209, term24209.getClass(), "noTypeCheckSection", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "checkEnumAlias", argTypes, term10757, args);
        assertTrue(recursiveEquals(term10757, term24209));
    }

};


