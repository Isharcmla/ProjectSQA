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

public class TypeCheck_isPropertyTest_657275882249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66326;
     Object term66396;
     Object term66582;
     Object term66583;

    public TypeCheck_isPropertyTest_657275882249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66326 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term66396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term66396, term66396.getClass(), "parent", term66396);
        setIntField(term66396, term66396.getClass(), "type", 108);
        term66582 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term66582, term66582.getClass(), "compiler", null);
        setField(term66582, term66582.getClass(), "validator", null);
        setField(term66582, term66582.getClass(), "reverseInterpreter", null);
        setField(term66582, term66582.getClass(), "typeRegistry", null);
        setField(term66582, term66582.getClass(), "topScope", null);
        setField(term66582, term66582.getClass(), "scopeCreator", null);
        setField(term66582, term66582.getClass(), "reportMissingOverride", null);
        setField(term66582, term66582.getClass(), "reportUnknownTypes", null);
        setBooleanField(term66582, term66582.getClass(), "reportMissingProperties", false);
        setField(term66582, term66582.getClass(), "inferJSDocInfo", null);
        setIntField(term66582, term66582.getClass(), "typedCount", 0);
        setIntField(term66582, term66582.getClass(), "nullCount", 0);
        setIntField(term66582, term66582.getClass(), "unknownCount", 0);
        setBooleanField(term66582, term66582.getClass(), "inExterns", false);
        setIntField(term66582, term66582.getClass(), "noTypeCheckSection", 0);
        term66583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66583, term66583.getClass(), "type", 108);
        setField(term66583, term66583.getClass(), "next", null);
        setField(term66583, term66583.getClass(), "first", null);
        setField(term66583, term66583.getClass(), "last", null);
        setField(term66583, term66583.getClass(), "propListHead", null);
        setIntField(term66583, term66583.getClass(), "sourcePosition", 0);
        setField(term66583, term66583.getClass(), "jsType", null);
        setField(term66583, term66583.getClass(), "parent", term66583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term66396;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term66326, args);
        assertTrue(recursiveEquals(term66326, term66582));
        assertTrue(recursiveEquals(term66396, term66583));
        assertTrue(recursiveEquals(retValue, false));
    }

};


