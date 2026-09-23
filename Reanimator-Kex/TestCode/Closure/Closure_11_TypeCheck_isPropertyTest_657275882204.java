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

public class TypeCheck_isPropertyTest_657275882204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49717;
     Object term49787;
     Object term49806;
     Object term49807;

    public TypeCheck_isPropertyTest_657275882204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49717 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term49787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49787, term49787.getClass(), "parent", term49787);
        term49806 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term49806, term49806.getClass(), "compiler", null);
        setField(term49806, term49806.getClass(), "validator", null);
        setField(term49806, term49806.getClass(), "reverseInterpreter", null);
        setField(term49806, term49806.getClass(), "typeRegistry", null);
        setField(term49806, term49806.getClass(), "topScope", null);
        setField(term49806, term49806.getClass(), "scopeCreator", null);
        setField(term49806, term49806.getClass(), "reportMissingOverride", null);
        setField(term49806, term49806.getClass(), "reportUnknownTypes", null);
        setBooleanField(term49806, term49806.getClass(), "reportMissingProperties", false);
        setField(term49806, term49806.getClass(), "inferJSDocInfo", null);
        setIntField(term49806, term49806.getClass(), "typedCount", 0);
        setIntField(term49806, term49806.getClass(), "nullCount", 0);
        setIntField(term49806, term49806.getClass(), "unknownCount", 0);
        setBooleanField(term49806, term49806.getClass(), "inExterns", false);
        setIntField(term49806, term49806.getClass(), "noTypeCheckSection", 0);
        term49807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49807, term49807.getClass(), "type", 0);
        setField(term49807, term49807.getClass(), "next", null);
        setField(term49807, term49807.getClass(), "first", null);
        setField(term49807, term49807.getClass(), "last", null);
        setField(term49807, term49807.getClass(), "propListHead", null);
        setIntField(term49807, term49807.getClass(), "sourcePosition", 0);
        setField(term49807, term49807.getClass(), "jsType", null);
        setField(term49807, term49807.getClass(), "parent", term49807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term49787;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term49717, args);
        assertTrue(recursiveEquals(term49717, term49806));
        assertTrue(recursiveEquals(term49787, term49807));
        assertTrue(recursiveEquals(retValue, false));
    }

};


