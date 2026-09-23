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

public class TypeCheck_isPropertyTest_657275882230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66392;
     Object term66462;
     Object term67029;
     Object term67030;

    public TypeCheck_isPropertyTest_657275882230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66392 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term66462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term66462, term66462.getClass(), "parent", term66462);
        setIntField(term66462, term66462.getClass(), "type", 101);
        term67029 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term67029, term67029.getClass(), "compiler", null);
        setField(term67029, term67029.getClass(), "validator", null);
        setField(term67029, term67029.getClass(), "reverseInterpreter", null);
        setField(term67029, term67029.getClass(), "typeRegistry", null);
        setField(term67029, term67029.getClass(), "topScope", null);
        setField(term67029, term67029.getClass(), "scopeCreator", null);
        setField(term67029, term67029.getClass(), "reportMissingOverride", null);
        setField(term67029, term67029.getClass(), "reportUnknownTypes", null);
        setBooleanField(term67029, term67029.getClass(), "reportMissingProperties", false);
        setField(term67029, term67029.getClass(), "inferJSDocInfo", null);
        setIntField(term67029, term67029.getClass(), "typedCount", 0);
        setIntField(term67029, term67029.getClass(), "nullCount", 0);
        setIntField(term67029, term67029.getClass(), "unknownCount", 0);
        setBooleanField(term67029, term67029.getClass(), "inExterns", false);
        setIntField(term67029, term67029.getClass(), "noTypeCheckSection", 0);
        term67030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67030, term67030.getClass(), "type", 101);
        setField(term67030, term67030.getClass(), "next", null);
        setField(term67030, term67030.getClass(), "first", null);
        setField(term67030, term67030.getClass(), "last", null);
        setField(term67030, term67030.getClass(), "propListHead", null);
        setIntField(term67030, term67030.getClass(), "sourcePosition", 0);
        setField(term67030, term67030.getClass(), "jsType", null);
        setField(term67030, term67030.getClass(), "parent", term67030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term66462;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term66392, args);
        assertTrue(recursiveEquals(term66392, term67029));
        assertTrue(recursiveEquals(term66462, term67030));
        assertTrue(recursiveEquals(retValue, false));
    }

};


