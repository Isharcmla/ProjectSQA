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

public class TypeCheck_isPropertyTest_657275882188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47299;
     Object term47369;
     Object term47649;
     Object term47650;

    public TypeCheck_isPropertyTest_657275882188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47299 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term47369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47369, term47369.getClass(), "parent", term47369);
        setIntField(term47369, term47369.getClass(), "type", 114);
        term47649 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term47649, term47649.getClass(), "compiler", null);
        setField(term47649, term47649.getClass(), "validator", null);
        setField(term47649, term47649.getClass(), "reverseInterpreter", null);
        setField(term47649, term47649.getClass(), "typeRegistry", null);
        setField(term47649, term47649.getClass(), "topScope", null);
        setField(term47649, term47649.getClass(), "scopeCreator", null);
        setField(term47649, term47649.getClass(), "reportMissingOverride", null);
        setField(term47649, term47649.getClass(), "reportUnknownTypes", null);
        setBooleanField(term47649, term47649.getClass(), "reportMissingProperties", false);
        setField(term47649, term47649.getClass(), "inferJSDocInfo", null);
        setIntField(term47649, term47649.getClass(), "typedCount", 0);
        setIntField(term47649, term47649.getClass(), "nullCount", 0);
        setIntField(term47649, term47649.getClass(), "unknownCount", 0);
        setBooleanField(term47649, term47649.getClass(), "inExterns", false);
        setIntField(term47649, term47649.getClass(), "noTypeCheckSection", 0);
        term47650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47650, term47650.getClass(), "type", 114);
        setField(term47650, term47650.getClass(), "next", null);
        setField(term47650, term47650.getClass(), "first", null);
        setField(term47650, term47650.getClass(), "last", null);
        setField(term47650, term47650.getClass(), "propListHead", null);
        setIntField(term47650, term47650.getClass(), "sourcePosition", 0);
        setField(term47650, term47650.getClass(), "jsType", null);
        setField(term47650, term47650.getClass(), "parent", term47650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term47369;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term47299, args);
        assertTrue(recursiveEquals(term47299, term47649));
        assertTrue(recursiveEquals(term47369, term47650));
        assertTrue(recursiveEquals(retValue, false));
    }

};


